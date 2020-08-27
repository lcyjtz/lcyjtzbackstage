package com.example.lcyjtz.Controller;

import com.example.lcyjtz.Service.MyService;
import com.example.lcyjtz.Tools.Tools;
import com.example.lcyjtz.entity.Article;
import com.example.lcyjtz.entity.Picture;
import com.example.lcyjtz.entity.Record;
import com.example.lcyjtz.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class MyController {
    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    private final static String ProjectPath = ClassUtils.getDefaultClassLoader().getResource("").getPath();

    /**
     * Home page query content
     * You need to query different types of files for their different paths=assets/video or assets/picture and assets/Article;
     * Get the suffix name from the field, query the file suffix. TXT for the first 100 words, and then add to the entity class
     * HomePage functions are all realized
     */
    @GetMapping("HomePage")
    public Map<String, Object> HomePage() {
        Map<String, Object> map = new HashMap<>();
        List<Record> SelectRecordAll = myService.SelectRecordAll();
        for (int i = 0; i < SelectRecordAll.size(); i++) {
            String FileName = SelectRecordAll.get(i).getRecordFilename();
            int length = FileName.length();
            if (length > 4) {
                String NameSuffix = FileName.substring(length - 4, length);
                if (NameSuffix.equals(".txt")) {
                    String FileNamePath = SelectRecordAll.get(i).getRecordPath();
                    String Path = ProjectPath + "/static" + FileNamePath + FileName;
                    File file = new File(Path);
                    if (!file.exists()) {
                        SelectRecordAll.get(i).setGeneralContent("没有这个文件或者路径不正确");
                    } else {
                        Tools tools = new Tools();
                        String Content = tools.RoughlyTheContent(Path);
                        Content = Content.substring(0, 120) + "...";
                        SelectRecordAll.get(i).setGeneralContent(Content);
                    }
                } else {
                    SelectRecordAll.get(i).setGeneralContent("不属于txt文件");
                }
            } else {
                System.out.println(FileName + "这个文件名不正确");
            }
        }
        map.put("RecordAll", SelectRecordAll);
        return map;
    }

    @GetMapping("ArticlePage")
    public Map<String, Object> article() {
        Map<String, Object> picture = new HashMap<>();
        List<Article> SelectArticleAll = myService.SelectArticleAll();
        for (int i = 0; i < SelectArticleAll.size(); i++) {
            String ArticlePath = SelectArticleAll.get(i).getArticlePath();
            String ArticleName = SelectArticleAll.get(i).getArticleFilename();
            String Path = ProjectPath + "/static" + ArticlePath + ArticleName;
            File file = new File(Path);
            if (!file.exists()) {
                SelectArticleAll.get(i).setArticleContent("没有这个文件或者路径不正确");
            } else {
                Tools tools = new Tools();
                String Content = tools.RoughlyTheContent(Path);
                Content = Content.substring(0, 120) + "...";
                SelectArticleAll.get(i).setArticleContent(Content);
            }
        }
        picture.put("SelectPictureAll", SelectArticleAll);
        return picture;
    }

    @GetMapping("PicturePage")
    public Map<String, Object> picture() {
        Map<String, Object> picture = new HashMap<>();
        List<Picture> SelectPictureAll = myService.SelectPictureAll();
        picture.put("SelectPictureAll", SelectPictureAll);
        return picture;
    }

    @GetMapping("VideoPage")
    public Map<String, Object> video() {
        Map<String, Object> videoMap = new HashMap<>();
        List<Video> SelectVideoAll = myService.SelectVideoAll();
        videoMap.put("SelectVideoAll", SelectVideoAll);
        return videoMap;
    }
}

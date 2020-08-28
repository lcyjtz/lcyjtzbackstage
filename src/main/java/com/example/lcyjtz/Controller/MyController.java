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

    /**
     * Absolute project path
     */
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
                    String Path = ProjectPath + "/static" + SelectRecordAll.get(i).getRecordPath() + FileName;
                    File file = new File(Path);
                    //There is little chance that the file will be lost
                    if (!file.exists()) {
                        SelectRecordAll.get(i).setGeneralContent("There is no file or the path is incorrect");
                    } else {
                        Tools tools = new Tools();
                        SelectRecordAll.get(i).setGeneralContent(tools.RoughlyTheContent(Path).substring(0, 120) + "...");
                    }
                } else {
                    SelectRecordAll.get(i).setGeneralContent("Not belong to TXT file");
                }
            } else {
                System.out.println(FileName + "This file name is incorrect");
            }
        }
        map.put("RecordAll", SelectRecordAll);
        return map;
    }

    /**
     * @return
     */
    @GetMapping("ArticlePage")
    public Map<String, Object> article() {
        Map<String, Object> articleAll = new HashMap<>();
        List<Article> SelectArticleAll = myService.SelectArticleAll();
        for (int i = 0; i < SelectArticleAll.size(); i++) {
            String Path = ProjectPath + "/static" + SelectArticleAll.get(i).getArticlePath() + SelectArticleAll.get(i).getArticleFilename();
            File file = new File(Path);
            //There is little chance that the file will be lost
            if (!file.exists()) {
                SelectArticleAll.get(i).setArticleContent("There is no file or the path is incorrect");
            } else {
                Tools tools = new Tools();
                SelectArticleAll.get(i).setArticleContent(tools.RoughlyTheContent(Path).substring(0, 120) + "...");
            }
        }
        articleAll.put("SelectArticleAll", SelectArticleAll);
        return articleAll;
    }

    /**
     * @param id
     * @return Implement ID query to query the corresponding article inside all TXT text content
     */
    @GetMapping("ArticleByID")
    public Map<String, Object> ArticleByID(Integer id) {
        Map<String, Object> ArticleByIDMap = new HashMap<>();
        List<Article> SelectArticleByID = myService.SelectArticleAByID(id);
        for (int i = 0; i < SelectArticleByID.size(); i++) {
            String Path = ProjectPath + "/static" + SelectArticleByID.get(i).getArticlePath() + SelectArticleByID.get(i).getArticleFilename();
            File file = new File(Path);
            //There is little chance that the file will be lost
            if (!file.exists()) {
                SelectArticleByID.get(i).setArticleContent("There is no file or the path is incorrect");
            } else {
                Tools tools = new Tools();
                SelectArticleByID.get(i).setArticleContent(tools.RoughlyTheContent(Path));
            }
        }
        ArticleByIDMap.put("ArticleByIDMap", SelectArticleByID);
        return ArticleByIDMap;
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

    @GetMapping("VideoByID")
    public Map<String, Object> videoByID(int id) {
        Map<String, Object> VideoByIDMap = new HashMap<>();
        List<Video> SelectVideoByID = myService.SelectVideoByID(id);
        VideoByIDMap.put("SelectVideoByID", SelectVideoByID);
        return VideoByIDMap;
    }
}

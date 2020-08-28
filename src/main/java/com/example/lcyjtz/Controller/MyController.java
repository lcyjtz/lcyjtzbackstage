package com.example.lcyjtz.Controller;

import com.example.lcyjtz.Service.MyService;
import com.example.lcyjtz.Tools.Tools;
import com.example.lcyjtz.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
    private final String ProjectPath = Objects.requireNonNull(Objects.requireNonNull(ClassUtils.getDefaultClassLoader()).getResource("")).getPath();

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
        for (Record record : SelectRecordAll) {
            String FileName = record.getRecordFilename();
            int length = FileName.length();
            if (length > 4) {
                String NameSuffix = FileName.substring(length - 4, length);
                if (NameSuffix.equals(".txt")) {
                    String Path = ProjectPath + "/static" + record.getRecordPath() + FileName;
                    File file = new File(Path);
                    //There is little chance that the file will be lost
                    if (!file.exists()) {
                        record.setGeneralContent("There is no file or the path is incorrect");
                    } else {
                        Tools tools = new Tools();
                        record.setGeneralContent(tools.RoughlyTheContent(Path).substring(0, 120) + "...");
                    }
                } else {
                    record.setGeneralContent("Not belong to TXT file");
                }
            } else {
                System.out.println(FileName + "This file name is incorrect");
            }
        }
        map.put("RecordAll", SelectRecordAll);
        return map;
    }

    /**
     *
     */
    @GetMapping("ArticlePage")
    public Map<String, Object> article() {
        Map<String, Object> articleAll = new HashMap<>();
        List<Article> SelectArticleAll = myService.SelectArticleAll();
        for (Article article : SelectArticleAll) {
            String Path = ProjectPath + "/static" + article.getArticlePath() + article.getArticleFilename();
            File file = new File(Path);
            //There is little chance that the file will be lost
            if (!file.exists()) {
                article.setArticleContent("There is no file or the path is incorrect");
            } else {
                Tools tools = new Tools();
                article.setArticleContent(tools.RoughlyTheContent(Path).substring(0, 120) + "...");
            }
        }
        articleAll.put("SelectArticleAll", SelectArticleAll);
        return articleAll;
    }

    /**
     * @return Implement ID query to query the corresponding article inside all TXT text content
     */
    @GetMapping("ArticleByID")
    public Map<String, Object> ArticleByID(Integer id) {
        Map<String, Object> ArticleByIDMap = new HashMap<>();
        List<Article> SelectArticleByID = myService.SelectArticleAByID(id);
        for (Article article : SelectArticleByID) {
            String Path = ProjectPath + "/static" + article.getArticlePath() + article.getArticleFilename();
            File file = new File(Path);
            //There is little chance that the file will be lost
            if (!file.exists()) {
                article.setArticleContent("There is no file or the path is incorrect");
            } else {
                Tools tools = new Tools();
                article.setArticleContent(tools.RoughlyTheContent(Path));
            }
        }
        ArticleByIDMap.put("ArticleByIDMap", SelectArticleByID);
        return ArticleByIDMap;
    }

    @GetMapping("ArticleAComment")
    public Map<String, Object> ArticleAComment(Integer ArticleID) {
        Map<String, Object> ArticleACommentMap = new HashMap<>();
        List<Acomment> ACommentList = myService.SelectACommentByIArticleID(ArticleID);
        ArticleACommentMap.put("ArticleACommentMap", ACommentList);
        return ArticleACommentMap;
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
        System.out.println(SelectVideoByID);
        VideoByIDMap.put("SelectVideoByID", SelectVideoByID);
        return VideoByIDMap;
    }

    @GetMapping("VideoVComment")
    public Map<String, Object> VideoVComment(Integer VideoID) {
        Map<String, Object> VideoVCommentMap = new HashMap<>();
        List<Vcomment> VideoVCommentList = myService.SelectVideoVComment(VideoID);
        VideoVCommentMap.put("VideoVCommentMap", VideoVCommentList);
        return VideoVCommentMap;
    }

    @GetMapping("PicturePage")
    public Map<String, Object> picture() {
        Map<String, Object> picture = new HashMap<>();
        List<Picture> SelectPictureAll = myService.SelectPictureAll();
        picture.put("SelectPictureAll", SelectPictureAll);
        return picture;
    }
}

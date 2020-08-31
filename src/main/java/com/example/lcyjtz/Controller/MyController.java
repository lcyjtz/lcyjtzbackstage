package com.example.lcyjtz.Controller;

import com.example.lcyjtz.Service.MyService;
import com.example.lcyjtz.Tools.Tools;
import com.example.lcyjtz.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.*;

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
                    //There is little chance that the file will be lost
                    if (!new File(Path).exists()) {
                        record.setGeneralContent("There is no file or the path is incorrect");
                    } else {
                        String Content = new Tools().RoughlyTheContent(Path);
                        if (Content.length() > 120) {
                            record.setGeneralContent(Content.substring(0, 120) + "...");
                        } else {
                            record.setGeneralContent(Content);
                        }
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

    @GetMapping("ArticlePage")
    public Map<String, Object> article() {
        Map<String, Object> articleAll = new HashMap<>();
        List<Article> SelectArticleAll = myService.SelectArticleAll();
        for (Article article : SelectArticleAll) {
            String Path = ProjectPath + "/static" + article.getArticlePath() + article.getArticleFilename();
            //There is little chance that the file will be lost
            if (!new File(Path).exists()) {
                article.setArticleContent("There is no file or the path is incorrect");
            } else {
                String Content = new Tools().RoughlyTheContent(Path);
                if (Content.length() > 120) {
                    article.setArticleContent(Content.substring(0, 120) + "...");
                } else {
                    article.setArticleContent(Content);
                }
            }
        }
        articleAll.put("SelectArticleAll", SelectArticleAll);
        return articleAll;
    }


    /**
     * @return Implement ID query to query the corresponding article inside all TXT text content
     */
    @GetMapping("ArticleByID")
    public Map<String, Object> ArticleByID(@RequestParam("ArticleID") Integer ArticleID) {
        Map<String, Object> ArticleByIDMap = new HashMap<>();
        List<Article> SelectArticleByID = myService.SelectArticleAByID(ArticleID);
        for (Article article : SelectArticleByID) {
            String Path = ProjectPath + "/static" + article.getArticlePath() + article.getArticleFilename();
            //There is  little chance that the file will be lost
            if (!new File(Path).exists()) {
                article.setArticleContent("There is no file or the path is incorrect");
            } else {
                article.setArticleContent(new Tools().RoughlyTheContent(Path));
            }
        }
        ArticleByIDMap.put("ArticleByIDMap", SelectArticleByID);
        return ArticleByIDMap;
    }

    @GetMapping("ArticleAComment")
    public Map<String, Object> ArticleAComment(@RequestParam("ArticleID") Integer ArticleID) {
        Map<String, Object> ArticleACommentMap = new HashMap<>();
        List<Acomment> ACommentList = myService.SelectACommentByIArticleID(ArticleID);
        ArticleACommentMap.put("ArticleACommentMap", ACommentList);
        return ArticleACommentMap;
    }

    /**
     * It takes four parameters,Article_FileName,Article_Path,Article_Data,Article_Title,Article_Content.
     * The page sends two data,Article_FileName,Article_Title,Article_Content.Java generates two pieces of data.
     * This resolves operations that have directory folders and operations that do not have file directories。
     */
    @PostMapping("AddArticle")
    public Map<String, Object> AddArticle(@RequestBody Article article) {
        boolean flag = false;
        Map<String, Object> AddArticleMap = new HashMap<>();
        String Path = ProjectPath + "/static/assets/Article/";
        File file = new File(Path);
        if (file.exists()) {
            flag = new Tools().CreateAFile(article, Path);
        } else {
            if (file.mkdirs()) {
                flag = new Tools().CreateAFile(article, Path);
            }
        }
        if (flag) {
            AddArticleMap.put("Cord", "200");
            AddArticleMap.put("Result", "Successfully Added");
        } else {
            AddArticleMap.put("Cord", "500");
            AddArticleMap.put("Result", "No folder or failed to create folder, same file name for folder, database with duplicate fields.");
        }
        return AddArticleMap;
    }

    @GetMapping("VideoPage")
    public Map<String, Object> video() {
        Map<String, Object> videoMap = new HashMap<>();
        List<Video> SelectVideoAll = myService.SelectVideoAll();
        videoMap.put("SelectVideoAll", SelectVideoAll);
        return videoMap;
    }

    @GetMapping("VideoByID")
    public Map<String, Object> VideoByID(@RequestParam("VideoID") Integer VideoID) {
        Map<String, Object> VideoByIDMap = new HashMap<>();
        List<Video> SelectVideoByID = myService.SelectVideoByID(VideoID);
        System.out.println(SelectVideoByID);
        VideoByIDMap.put("SelectVideoByID", SelectVideoByID);
        return VideoByIDMap;
    }

    @GetMapping("VideoVComment")
    public Map<String, Object> VideoVComment(@RequestParam("VideoID") Integer VideoID) {
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

    @PostMapping("AddPicture")
    public Map<String, Object> AddPicture(@RequestBody Picture picture) {
        Map<String, Object> AddPictureMap = new HashMap<>();
        String Path = ProjectPath + "/static/assets/Picture/";
        Tools tools = new Tools();
        return AddPictureMap;
    }
}

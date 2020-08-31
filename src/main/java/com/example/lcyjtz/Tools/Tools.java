package com.example.lcyjtz.Tools;

import com.example.lcyjtz.Service.MyService;
import com.example.lcyjtz.entity.Article;
import com.example.lcyjtz.entity.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * This is a utility class that handles the process of reading files and uploading data to the database
 */
@RestController
public class Tools {
    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public String RoughlyTheContent(String path) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String s;
            while ((s = br.readLine()) != null) {
                result.append(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    /**
     * The database being passed to the file is added here, as well as the added status
     */
    public boolean CreateAFile(Article article, String ProjectPath) {
        boolean flag = false;
        article.setArticleData((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
        article.setArticlePath("/assets/Article/");
        ProjectPath = ProjectPath + "/static" + article.getArticleFilename() + ".txt";
        File file = new File(ProjectPath);
        try {
            //The possibility of file creation reporting an error is small
            if (file.createNewFile()) {
                BufferedWriter out = new BufferedWriter(new FileWriter(ProjectPath));
                out.write(article.getArticleContent());
                out.flush();
                out.close();
                int eq = myService.AddArticle(article);
                flag = eq > 0;
            }
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    public boolean CreateAPicture(Picture picture, String ProjectPath) {
        boolean flag = false;
        picture.setPictureData((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
        picture.setPicturePath("/assets/Picture/");
        ProjectPath = ProjectPath + "/static" + picture.getPictureFilename() + ".txt";
        File file = new File(ProjectPath);
        return flag;
    }
}

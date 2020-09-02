package com.example.lcyjtz.Service;

import com.example.lcyjtz.entity.*;

import java.util.List;

public interface MyService {
    boolean login(Visitor visitor);
    List<Record> SelectRecordAll();

    List<Article> SelectArticleAll();

    List<Picture> SelectPictureAll();

    List<Video> SelectVideoAll();

    List<Article> SelectArticleAByID(int id);

    List<Picture> SelectPictureByID(int id);

    List<Video> SelectVideoByID(int id);

    List<Acomment> SelectACommentByIArticleID(int id);

    List<Vcomment> SelectVideoVComment(int VideoID);

    int AddArticle(Article article);

}

package com.example.lcyjtz.Service;

import com.example.lcyjtz.entity.Article;
import com.example.lcyjtz.entity.Picture;
import com.example.lcyjtz.entity.Record;
import com.example.lcyjtz.entity.Video;

import java.util.List;

public interface MyService {
    List<Record> SelectRecordAll();

    List<Article> SelectArticleAll();

    List<Picture> SelectPictureAll();

    List<Video> SelectVideoAll();
}

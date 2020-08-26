package com.example.lcyjtz.Service.Impl;

import com.example.lcyjtz.Service.MyService;
import com.example.lcyjtz.entity.Article;
import com.example.lcyjtz.entity.Picture;
import com.example.lcyjtz.entity.Record;
import com.example.lcyjtz.entity.Video;
import com.example.lcyjtz.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService {
    private ArticleMapper articleMapper;
    private PcommentMapper pcommentMapper;
    private PictureMapper pictureMapper;
    private PowerMapper powerMapper;
    private RecordMapper recordMapper;
    private VcommentMapper vcommentMapper;
    private VideoMapper videoMapper;
    private VisitorMapper visitorMapper;

    @Autowired
    public void setAll(AcommentMapper acommentMapper, ArticleMapper articleMapper,  PcommentMapper pcommentMapper, PictureMapper pictureMapper, PowerMapper powerMapper, RecordMapper recordMapper, VcommentMapper vcommentMapper, VideoMapper videoMapper, VisitorMapper visitorMapper) {
        this.articleMapper = articleMapper;
        this.pcommentMapper = pcommentMapper;
        this.pictureMapper = pictureMapper;
        this.powerMapper = powerMapper;
        this.recordMapper = recordMapper;
        this.vcommentMapper = vcommentMapper;
        this.videoMapper = videoMapper;
        this.visitorMapper = visitorMapper;
    }


    @Override
    public List<Record> SelectRecordAll() {
        return recordMapper.selectByExample(null);
    }

    @Override
    public List<Article> SelectArticleAll() {
        return articleMapper.selectByExample(null);
    }

    @Override
    public List<Picture> SelectPictureAll() {
        return pictureMapper.selectByExample(null);
    }

    @Override
    public List<Video> SelectVideoAll() {
        return videoMapper.selectByExample(null);
    }
}

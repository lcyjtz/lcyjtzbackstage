package com.example.lcyjtz.Service.Impl;

import com.example.lcyjtz.Service.MyService;
import com.example.lcyjtz.entity.*;
import com.example.lcyjtz.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService {
    private ArticleMapper articleMapper;
    private PictureMapper pictureMapper;
    private RecordMapper recordMapper;
    private VideoMapper videoMapper;
    private PowerMapper powerMapper;
    private VcommentMapper vcommentMapper;
    private VisitorMapper visitorMapper;
    private AcommentMapper acommentMapper;
    private PcommentMapper pcommentMapper;

    @Autowired
    public void setAll(AcommentMapper acommentMapper, ArticleMapper articleMapper, PcommentMapper pcommentMapper, PictureMapper pictureMapper, PowerMapper powerMapper, RecordMapper recordMapper, VcommentMapper vcommentMapper, VideoMapper videoMapper, VisitorMapper visitorMapper) {
        this.articleMapper = articleMapper;
        this.pcommentMapper = pcommentMapper;
        this.pictureMapper = pictureMapper;
        this.powerMapper = powerMapper;
        this.recordMapper = recordMapper;
        this.vcommentMapper = vcommentMapper;
        this.videoMapper = videoMapper;
        this.acommentMapper = acommentMapper;
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

    @Override
    public List<Article> SelectArticleAByID(int id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Picture> SelectPictureByID(int id) {
        return pictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Video> SelectVideoByID(int id) {
        return videoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int AddArticle(Article article) {
        return articleMapper.insert(article);
    }

    @Override
    public List<Acomment> SelectAcommentByIArticleID(int id) {
        return acommentMapper.selectByPrimaryKey(id);
    }


}

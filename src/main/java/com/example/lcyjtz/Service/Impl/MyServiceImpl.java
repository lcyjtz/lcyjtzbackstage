package com.example.lcyjtz.Service.Impl;

import com.example.lcyjtz.Service.MyService;
import com.example.lcyjtz.entity.*;
import com.example.lcyjtz.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    private AcommentMapper acommentMapper;
    private ArticleMapper articleMapper;
    private PathMapper pathMapper;
    private PcommentMapper pcommentMapper;
    private PictureMapper pictureMapper;
    private PowerMapper powerMapper;
    private RecordMapper recordMapper;
    private VcommentMapper vcommentMapper;
    private VideoMapper videoMapper;
    private VisitorMapper visitorMapper;

    @Autowired
    public void setAll(AcommentMapper acommentMapper, ArticleMapper articleMapper, PathMapper pathMapper, PcommentMapper pcommentMapper, PictureMapper pictureMapper, PowerMapper powerMapper, RecordMapper recordMapper, VcommentMapper vcommentMapper, VideoMapper videoMapper, VisitorMapper visitorMapper) {
        this.acommentMapper = acommentMapper;
        this.articleMapper = articleMapper;
        this.pathMapper = pathMapper;
        this.pcommentMapper = pcommentMapper;
        this.pictureMapper = pictureMapper;
        this.powerMapper = powerMapper;
        this.recordMapper = recordMapper;
        this.vcommentMapper = vcommentMapper;
        this.videoMapper = videoMapper;
        this.visitorMapper = visitorMapper;
    }
}

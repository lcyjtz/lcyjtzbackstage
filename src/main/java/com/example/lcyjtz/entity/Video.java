package com.example.lcyjtz.entity;

public class Video {
    public Video() {

    }

    private Integer videoId;

    private String videoFilename;

    private String videoPath;

    private String videoData;

    private String videoTitle;

    private Vcomment vcomment;

    public Vcomment getVcomment() {
        return vcomment;
    }

    public void setVcomment(Vcomment vcomment) {
        this.vcomment = vcomment;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoFilename() {
        return videoFilename;
    }

    public void setVideoFilename(String videoFilename) {
        this.videoFilename = videoFilename == null ? null : videoFilename.trim();
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }

    public String getVideoData() {
        return videoData;
    }

    public void setVideoData(String videoData) {
        this.videoData = videoData == null ? null : videoData.trim();
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle == null ? null : videoTitle.trim();
    }
}
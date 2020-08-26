package com.example.lcyjtz.entity;

public class Acomment {
    private Integer acommentId;

    private Integer acommentArticleid;

    private String acommentContent;

    private String acommentUsername;

    private String acommentData;

    public Integer getAcommentId() {
        return acommentId;
    }

    public void setAcommentId(Integer acommentId) {
        this.acommentId = acommentId;
    }

    public Integer getAcommentArticleid() {
        return acommentArticleid;
    }

    public void setAcommentArticleid(Integer acommentArticleid) {
        this.acommentArticleid = acommentArticleid;
    }

    public String getAcommentContent() {
        return acommentContent;
    }

    public void setAcommentContent(String acommentContent) {
        this.acommentContent = acommentContent == null ? null : acommentContent.trim();
    }

    public String getAcommentUsername() {
        return acommentUsername;
    }

    public void setAcommentUsername(String acommentUsername) {
        this.acommentUsername = acommentUsername == null ? null : acommentUsername.trim();
    }

    public String getAcommentData() {
        return acommentData;
    }

    public void setAcommentData(String acommentData) {
        this.acommentData = acommentData == null ? null : acommentData.trim();
    }
}
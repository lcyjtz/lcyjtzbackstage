package com.example.lcyjtz.entity;

public class Vcomment {
    private Integer vcommentId;

    private Integer vcommentVideoid;

    private String vcommentContent;

    private String vcommentUsername;

    private String vcommentData;

    public Integer getVcommentId() {
        return vcommentId;
    }

    public void setVcommentId(Integer vcommentId) {
        this.vcommentId = vcommentId;
    }

    public Integer getVcommentVideoid() {
        return vcommentVideoid;
    }

    public void setVcommentVideoid(Integer vcommentVideoid) {
        this.vcommentVideoid = vcommentVideoid;
    }

    public String getVcommentContent() {
        return vcommentContent;
    }

    public void setVcommentContent(String vcommentContent) {
        this.vcommentContent = vcommentContent == null ? null : vcommentContent.trim();
    }

    public String getVcommentUsername() {
        return vcommentUsername;
    }

    public void setVcommentUsername(String vcommentUsername) {
        this.vcommentUsername = vcommentUsername == null ? null : vcommentUsername.trim();
    }

    public String getVcommentData() {
        return vcommentData;
    }

    public void setVcommentData(String vcommentData) {
        this.vcommentData = vcommentData == null ? null : vcommentData.trim();
    }
}
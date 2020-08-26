package com.example.lcyjtz.entity;

public class Pcomment {
    private Integer pcommentId;

    private String pcommentUsername;

    private Integer pcommentPictureid;

    private String pcommentData;

    private String pcommentContext;

    public Integer getPcommentId() {
        return pcommentId;
    }

    public void setPcommentId(Integer pcommentId) {
        this.pcommentId = pcommentId;
    }

    public String getPcommentUsername() {
        return pcommentUsername;
    }

    public void setPcommentUsername(String pcommentUsername) {
        this.pcommentUsername = pcommentUsername == null ? null : pcommentUsername.trim();
    }

    public Integer getPcommentPictureid() {
        return pcommentPictureid;
    }

    public void setPcommentPictureid(Integer pcommentPictureid) {
        this.pcommentPictureid = pcommentPictureid;
    }

    public String getPcommentData() {
        return pcommentData;
    }

    public void setPcommentData(String pcommentData) {
        this.pcommentData = pcommentData == null ? null : pcommentData.trim();
    }

    public String getPcommentContext() {
        return pcommentContext;
    }

    public void setPcommentContext(String pcommentContext) {
        this.pcommentContext = pcommentContext == null ? null : pcommentContext.trim();
    }
}
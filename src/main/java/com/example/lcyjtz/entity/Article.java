package com.example.lcyjtz.entity;

public class Article {
    private Integer articleId;

    private String articleFilename;

    private String articlePath;

    private String articleData;

    private String articleTitle;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleFilename() {
        return articleFilename;
    }

    public void setArticleFilename(String articleFilename) {
        this.articleFilename = articleFilename == null ? null : articleFilename.trim();
    }

    public String getArticlePath() {
        return articlePath;
    }

    public void setArticlePath(String articlePath) {
        this.articlePath = articlePath == null ? null : articlePath.trim();
    }

    public String getArticleData() {
        return articleData;
    }

    public void setArticleData(String articleData) {
        this.articleData = articleData == null ? null : articleData.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }
}
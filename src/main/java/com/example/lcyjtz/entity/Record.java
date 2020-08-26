package com.example.lcyjtz.entity;

public class Record {
    private Integer recordId;

    private String recordType;

    private String recordFilename;

    private String recordData;

    private String recordPath;

    private String recordTitle;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getRecordFilename() {
        return recordFilename;
    }

    public void setRecordFilename(String recordFilename) {
        this.recordFilename = recordFilename == null ? null : recordFilename.trim();
    }

    public String getRecordData() {
        return recordData;
    }

    public void setRecordData(String recordData) {
        this.recordData = recordData == null ? null : recordData.trim();
    }

    public String getRecordPath() {
        return recordPath;
    }

    public void setRecordPath(String recordPath) {
        this.recordPath = recordPath == null ? null : recordPath.trim();
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle == null ? null : recordTitle.trim();
    }
}
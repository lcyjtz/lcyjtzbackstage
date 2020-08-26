package com.example.lcyjtz.entity;

public class Visitor {
    private Integer visitorid;

    private String visitorname;

    private String visitorpwd;

    private Integer visitorroleid;

    public Integer getVisitorid() {
        return visitorid;
    }

    public void setVisitorid(Integer visitorid) {
        this.visitorid = visitorid;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname == null ? null : visitorname.trim();
    }

    public String getVisitorpwd() {
        return visitorpwd;
    }

    public void setVisitorpwd(String visitorpwd) {
        this.visitorpwd = visitorpwd == null ? null : visitorpwd.trim();
    }

    public Integer getVisitorroleid() {
        return visitorroleid;
    }

    public void setVisitorroleid(Integer visitorroleid) {
        this.visitorroleid = visitorroleid;
    }
}
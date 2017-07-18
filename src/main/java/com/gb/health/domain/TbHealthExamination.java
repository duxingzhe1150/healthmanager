package com.gb.health.domain;

import java.util.Date;

public class TbHealthExamination {
    private Integer id;

    private Date uploadtime;

    private Date examinationtime;

    private String examinationaddr;

    private String bPersonid;

    private String bTel;

    private String bCompany;

    private String bFileurl;

    private String bName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Date getExaminationtime() {
        return examinationtime;
    }

    public void setExaminationtime(Date examinationtime) {
        this.examinationtime = examinationtime;
    }

    public String getExaminationaddr() {
        return examinationaddr;
    }

    public void setExaminationaddr(String examinationaddr) {
        this.examinationaddr = examinationaddr == null ? null : examinationaddr.trim();
    }

    public String getbPersonid() {
        return bPersonid;
    }

    public void setbPersonid(String bPersonid) {
        this.bPersonid = bPersonid == null ? null : bPersonid.trim();
    }

    public String getbTel() {
        return bTel;
    }

    public void setbTel(String bTel) {
        this.bTel = bTel == null ? null : bTel.trim();
    }

    public String getbCompany() {
        return bCompany;
    }

    public void setbCompany(String bCompany) {
        this.bCompany = bCompany == null ? null : bCompany.trim();
    }

    public String getbFileurl() {
        return bFileurl;
    }

    public void setbFileurl(String bFileurl) {
        this.bFileurl = bFileurl == null ? null : bFileurl.trim();
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }
}
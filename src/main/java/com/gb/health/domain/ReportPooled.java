package com.gb.health.domain;

import java.util.Date;

public class ReportPooled {
    private Integer id;

    private Integer pId;

    private String pdType;

    private Date gExaminationTime;

    private Date gImportTime;

    private String pdContent;

    public ReportPooled(Integer id, Integer pId, String pdType, Date gExaminationTime, Date gImportTime, String pdContent) {
        this.id = id;
        this.pId = pId;
        this.pdType = pdType;
        this.gExaminationTime = gExaminationTime;
        this.gImportTime = gImportTime;
        this.pdContent = pdContent;
    }

    public ReportPooled() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getPdType() {
        return pdType;
    }

    public void setPdType(String pdType) {
        this.pdType = pdType == null ? null : pdType.trim();
    }

    public Date getgExaminationTime() {
        return gExaminationTime;
    }

    public void setgExaminationTime(Date gExaminationTime) {
        this.gExaminationTime = gExaminationTime;
    }

    public Date getgImportTime() {
        return gImportTime;
    }

    public void setgImportTime(Date gImportTime) {
        this.gImportTime = gImportTime;
    }

    public String getPdContent() {
        return pdContent;
    }

    public void setPdContent(String pdContent) {
        this.pdContent = pdContent == null ? null : pdContent.trim();
    }
}
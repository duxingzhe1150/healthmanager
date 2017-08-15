package com.gb.health.domain;

import java.util.Date;

public class ReportDepartment {
    private Integer id;

    private Integer pId;

    private String dDepartment;

    private String dItem;

    private String dResult;

    private Date gExaminationTime;

    private Date gImportTime;

    public ReportDepartment(Integer id, Integer pId, String dDepartment, String dItem, String dResult, Date gExaminationTime, Date gImportTime) {
        this.id = id;
        this.pId = pId;
        this.dDepartment = dDepartment;
        this.dItem = dItem;
        this.dResult = dResult;
        this.gExaminationTime = gExaminationTime;
        this.gImportTime = gImportTime;
    }

    public ReportDepartment() {
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

    public String getdDepartment() {
        return dDepartment;
    }

    public void setdDepartment(String dDepartment) {
        this.dDepartment = dDepartment == null ? null : dDepartment.trim();
    }

    public String getdItem() {
        return dItem;
    }

    public void setdItem(String dItem) {
        this.dItem = dItem == null ? null : dItem.trim();
    }

    public String getdResult() {
        return dResult;
    }

    public void setdResult(String dResult) {
        this.dResult = dResult == null ? null : dResult.trim();
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
}
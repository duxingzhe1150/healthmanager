package com.gb.health.domain;

import java.util.Date;

public class ReportGeneral {
    private Integer id;

    private Integer pId;

    private String gType;

    private String gItem;

    private String gResult;

    private String gUnits;

    private String gRange;

    private Date gExaminationTime;

    private Date gImportTime;

    public ReportGeneral(Integer id, Integer pId, String gType, String gItem, String gResult, String gUnits, String gRange, Date gExaminationTime, Date gImportTime) {
        this.id = id;
        this.pId = pId;
        this.gType = gType;
        this.gItem = gItem;
        this.gResult = gResult;
        this.gUnits = gUnits;
        this.gRange = gRange;
        this.gExaminationTime = gExaminationTime;
        this.gImportTime = gImportTime;
    }

    public ReportGeneral() {
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

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType == null ? null : gType.trim();
    }

    public String getgItem() {
        return gItem;
    }

    public void setgItem(String gItem) {
        this.gItem = gItem == null ? null : gItem.trim();
    }

    public String getgResult() {
        return gResult;
    }

    public void setgResult(String gResult) {
        this.gResult = gResult == null ? null : gResult.trim();
    }

    public String getgUnits() {
        return gUnits;
    }

    public void setgUnits(String gUnits) {
        this.gUnits = gUnits == null ? null : gUnits.trim();
    }

    public String getgRange() {
        return gRange;
    }

    public void setgRange(String gRange) {
        this.gRange = gRange == null ? null : gRange.trim();
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
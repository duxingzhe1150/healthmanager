package com.gb.health.domain;

import java.util.Date;

public class ReportPersonnel {
    private Integer id;

    private String pName;

    private String pSex;

    private Date pBirth;

    private Integer pAge;

    private String pNationality;

    private String pNation;

    private String pIdcard;

    private String pMarriage;

    private String pCompany;

    private String pTel;

    private String pAddr;

    private String pOfficeTel;

    private String pEmail;

    private String pHomeTel;

    public ReportPersonnel(Integer id, String pName, String pSex, Date pBirth, Integer pAge, String pNationality, String pNation, String pIdcard, String pMarriage, String pCompany, String pTel, String pAddr, String pOfficeTel, String pEmail, String pHomeTel) {
        this.id = id;
        this.pName = pName;
        this.pSex = pSex;
        this.pBirth = pBirth;
        this.pAge = pAge;
        this.pNationality = pNationality;
        this.pNation = pNation;
        this.pIdcard = pIdcard;
        this.pMarriage = pMarriage;
        this.pCompany = pCompany;
        this.pTel = pTel;
        this.pAddr = pAddr;
        this.pOfficeTel = pOfficeTel;
        this.pEmail = pEmail;
        this.pHomeTel = pHomeTel;
    }

    public ReportPersonnel() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex == null ? null : pSex.trim();
    }

    public Date getpBirth() {
        return pBirth;
    }

    public void setpBirth(Date pBirth) {
        this.pBirth = pBirth;
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    public String getpNationality() {
        return pNationality;
    }

    public void setpNationality(String pNationality) {
        this.pNationality = pNationality == null ? null : pNationality.trim();
    }

    public String getpNation() {
        return pNation;
    }

    public void setpNation(String pNation) {
        this.pNation = pNation == null ? null : pNation.trim();
    }

    public String getpIdcard() {
        return pIdcard;
    }

    public void setpIdcard(String pIdcard) {
        this.pIdcard = pIdcard == null ? null : pIdcard.trim();
    }

    public String getpMarriage() {
        return pMarriage;
    }

    public void setpMarriage(String pMarriage) {
        this.pMarriage = pMarriage == null ? null : pMarriage.trim();
    }

    public String getpCompany() {
        return pCompany;
    }

    public void setpCompany(String pCompany) {
        this.pCompany = pCompany == null ? null : pCompany.trim();
    }

    public String getpTel() {
        return pTel;
    }

    public void setpTel(String pTel) {
        this.pTel = pTel == null ? null : pTel.trim();
    }

    public String getpAddr() {
        return pAddr;
    }

    public void setpAddr(String pAddr) {
        this.pAddr = pAddr == null ? null : pAddr.trim();
    }

    public String getpOfficeTel() {
        return pOfficeTel;
    }

    public void setpOfficeTel(String pOfficeTel) {
        this.pOfficeTel = pOfficeTel == null ? null : pOfficeTel.trim();
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail == null ? null : pEmail.trim();
    }

    public String getpHomeTel() {
        return pHomeTel;
    }

    public void setpHomeTel(String pHomeTel) {
        this.pHomeTel = pHomeTel == null ? null : pHomeTel.trim();
    }
}
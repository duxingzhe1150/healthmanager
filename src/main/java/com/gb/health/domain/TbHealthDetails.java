package com.gb.health.domain;

import java.util.Date;

public class TbHealthDetails {
    private Integer id;

    private Integer healthArchiveId;

    private String hMedicineAllergy;

    private String hFoodAllergy;

    private String hOtherAllergy;

    private String hConact;

    private String hMedicationHistory;

    private String hHistoryCycle;

    private String hHistoryMetabolism;

    private String hHistoryBreathe;

    private String hHistoryDigestive;

    private String hHistoryUrinary;

    private String hHistoryBlood;

    private String hHistoryEndocrine;

    private String hHistoryNervous;

    private String hHistoryImmune;

    private String hHistorySports;

    private String hHistoryRheumatism;

    private String hTrauma;

    private Date hTime;

    private String hFamilialDisease;

    private String bPersonid;
    
    private String source;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHealthArchiveId() {
        return healthArchiveId;
    }

    public void setHealthArchiveId(Integer healthArchiveId) {
        this.healthArchiveId = healthArchiveId;
    }

    public String gethMedicineAllergy() {
        return hMedicineAllergy;
    }

    public void sethMedicineAllergy(String hMedicineAllergy) {
        this.hMedicineAllergy = hMedicineAllergy == null ? null : hMedicineAllergy.trim();
    }

    public String gethFoodAllergy() {
        return hFoodAllergy;
    }

    public void sethFoodAllergy(String hFoodAllergy) {
        this.hFoodAllergy = hFoodAllergy == null ? null : hFoodAllergy.trim();
    }

    public String gethOtherAllergy() {
        return hOtherAllergy;
    }

    public void sethOtherAllergy(String hOtherAllergy) {
        this.hOtherAllergy = hOtherAllergy == null ? null : hOtherAllergy.trim();
    }

    public String gethConact() {
        return hConact;
    }

    public void sethConact(String hConact) {
        this.hConact = hConact == null ? null : hConact.trim();
    }

    public String gethMedicationHistory() {
        return hMedicationHistory;
    }

    public void sethMedicationHistory(String hMedicationHistory) {
        this.hMedicationHistory = hMedicationHistory == null ? null : hMedicationHistory.trim();
    }

    public String gethHistoryCycle() {
        return hHistoryCycle;
    }

    public void sethHistoryCycle(String hHistoryCycle) {
        this.hHistoryCycle = hHistoryCycle == null ? null : hHistoryCycle.trim();
    }

    public String gethHistoryMetabolism() {
        return hHistoryMetabolism;
    }

    public void sethHistoryMetabolism(String hHistoryMetabolism) {
        this.hHistoryMetabolism = hHistoryMetabolism == null ? null : hHistoryMetabolism.trim();
    }

    public String gethHistoryBreathe() {
        return hHistoryBreathe;
    }

    public void sethHistoryBreathe(String hHistoryBreathe) {
        this.hHistoryBreathe = hHistoryBreathe == null ? null : hHistoryBreathe.trim();
    }

    public String gethHistoryDigestive() {
        return hHistoryDigestive;
    }

    public void sethHistoryDigestive(String hHistoryDigestive) {
        this.hHistoryDigestive = hHistoryDigestive == null ? null : hHistoryDigestive.trim();
    }

    public String gethHistoryUrinary() {
        return hHistoryUrinary;
    }

    public void sethHistoryUrinary(String hHistoryUrinary) {
        this.hHistoryUrinary = hHistoryUrinary == null ? null : hHistoryUrinary.trim();
    }

    public String gethHistoryBlood() {
        return hHistoryBlood;
    }

    public void sethHistoryBlood(String hHistoryBlood) {
        this.hHistoryBlood = hHistoryBlood == null ? null : hHistoryBlood.trim();
    }

    public String gethHistoryEndocrine() {
        return hHistoryEndocrine;
    }

    public void sethHistoryEndocrine(String hHistoryEndocrine) {
        this.hHistoryEndocrine = hHistoryEndocrine == null ? null : hHistoryEndocrine.trim();
    }

    public String gethHistoryNervous() {
        return hHistoryNervous;
    }

    public void sethHistoryNervous(String hHistoryNervous) {
        this.hHistoryNervous = hHistoryNervous == null ? null : hHistoryNervous.trim();
    }

    public String gethHistoryImmune() {
        return hHistoryImmune;
    }

    public void sethHistoryImmune(String hHistoryImmune) {
        this.hHistoryImmune = hHistoryImmune == null ? null : hHistoryImmune.trim();
    }

    public String gethHistorySports() {
        return hHistorySports;
    }

    public void sethHistorySports(String hHistorySports) {
        this.hHistorySports = hHistorySports == null ? null : hHistorySports.trim();
    }

    public String gethHistoryRheumatism() {
        return hHistoryRheumatism;
    }

    public void sethHistoryRheumatism(String hHistoryRheumatism) {
        this.hHistoryRheumatism = hHistoryRheumatism == null ? null : hHistoryRheumatism.trim();
    }

    public String gethTrauma() {
        return hTrauma;
    }

    public void sethTrauma(String hTrauma) {
        this.hTrauma = hTrauma == null ? null : hTrauma.trim();
    }

    public Date gethTime() {
        return hTime;
    }

    public void sethTime(Date hTime) {
        this.hTime = hTime;
    }

    public String gethFamilialDisease() {
        return hFamilialDisease;
    }

    public void sethFamilialDisease(String hFamilialDisease) {
        this.hFamilialDisease = hFamilialDisease == null ? null : hFamilialDisease.trim();
    }

    public String getbPersonid() {
        return bPersonid;
    }

    public void setbPersonid(String bPersonid) {
        this.bPersonid = bPersonid == null ? null : bPersonid.trim();
    }

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
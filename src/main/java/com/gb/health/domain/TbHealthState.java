package com.gb.health.domain;

import java.util.Date;

public class TbHealthState {
    private Integer bId;

    private String bName;

    private String bSex;

    private String bNation;

    private Date bBirthday;

    private String bBloodType;

    private Float bWeight;

    private Float bHeght;

    private Float bWaistline;

    private Integer bAge;

    private String bTel;

    private String bRelationName;

    private String bRelationTel;

    private String bAddress;

    private Integer bEducation;

    private String bJobs;

    private String bPersonid;

    private Integer bInsurance;

    private Integer bMarriage;

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

    private Integer lLivesportCount;

    private Integer lLivesportMinute;

    private Integer lLivesportYear;

    private String lLivesportWay;

    private Integer lLivesportStep;

    private Integer lLivefoodStructure;

    private Integer lLivefoodDaykind;

    private Integer lLivefoodWeekkind;

    private Integer lLivefoodPrimary;

    private Integer lLivefoodPotato;

    private Integer lLivefoodBean;

    private Integer lLivefoodVegetable;

    private Integer lLivefoodFruit;

    private Integer lLivefoodMilk;

    private Integer lLivefoodNut;

    private Integer lLivefoodSalt;

    private Integer lLivefoodMeat;

    private Integer lLivefoodFish;

    private Integer lLivefoodEgg;

    private Integer lLivefoodOil;

    private Integer lLivefoodSugar;

    private Integer lLivefoodWater;

    private Integer lSmokeCondition;

    private Integer lSmokeBeginage;

    private Integer lSmokeNumber;

    private Integer lSmokeEndage;

    private Integer lSmokeEnv;

    private Integer lWineHz;

    private Integer lWineKind;

    private Integer lWineBeer;

    private Integer lWineWhite;

    private Integer lWineRed;

    private Integer lWineYellow;

    private Integer lWineBeginage;

    private Integer lWineEndage;

    private Integer lWineYear;

    private Integer lWineDrunk;

    private Integer lSleepTime;

    private Integer lSleepWakenumber;

    private Integer lSleepInsomnia;

    private Boolean lPerceiveNearmemory;

    private Boolean lPerceiveFarmemory;

    private Boolean lPerceiveCalc;

    private Boolean lPerceiveDirection;

    private Boolean lPsyLive;

    private Boolean lPsyJob;

    private Boolean lPsyWorkpress;

    private Boolean lPsyFeellow;

    private Boolean lPsyAnxiety;

    private Float lScore;

    private String lScoreDesc;

    private Boolean lPersonalityWorry;

    private Boolean lPersonalityCalm;

    private Boolean lPersonalityUnhappy;

    private Integer lLivesportDayweek;

    private Date bTime;
    
    private String province;
    
    private String city;
    
    private String county;
    
    private String original_address;

    /**
	 * province    
	 *    
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * city    
	 *    
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * county    
	 *    
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * original_address    
	 *    
	 * @return the original_address
	 */
	public String getOriginal_address() {
		return original_address;
	}

	/**
	 * @param original_address the original_address to set
	 */
	public void setOriginal_address(String original_address) {
		this.original_address = original_address;
	}

	public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbSex() {
        return bSex;
    }

    public void setbSex(String bSex) {
        this.bSex = bSex == null ? null : bSex.trim();
    }

    public String getbNation() {
        return bNation;
    }

    public void setbNation(String bNation) {
        this.bNation = bNation == null ? null : bNation.trim();
    }

    public Date getbBirthday() {
        return bBirthday;
    }

    public void setbBirthday(Date bBirthday) {
        this.bBirthday = bBirthday;
    }

    public String getbBloodType() {
        return bBloodType;
    }

    public void setbBloodType(String bBloodType) {
        this.bBloodType = bBloodType == null ? null : bBloodType.trim();
    }

    public Float getbWeight() {
        return bWeight;
    }

    public void setbWeight(Float bWeight) {
        this.bWeight = bWeight;
    }

    public Float getbHeght() {
        return bHeght;
    }

    public void setbHeght(Float bHeght) {
        this.bHeght = bHeght;
    }

    public Float getbWaistline() {
        return bWaistline;
    }

    public void setbWaistline(Float bWaistline) {
        this.bWaistline = bWaistline;
    }

    public Integer getbAge() {
        return bAge;
    }

    public void setbAge(Integer bAge) {
        this.bAge = bAge;
    }

    public String getbTel() {
        return bTel;
    }

    public void setbTel(String bTel) {
        this.bTel = bTel == null ? null : bTel.trim();
    }

    public String getbRelationName() {
        return bRelationName;
    }

    public void setbRelationName(String bRelationName) {
        this.bRelationName = bRelationName == null ? null : bRelationName.trim();
    }

    public String getbRelationTel() {
        return bRelationTel;
    }

    public void setbRelationTel(String bRelationTel) {
        this.bRelationTel = bRelationTel == null ? null : bRelationTel.trim();
    }

    public String getbAddress() {
        return bAddress;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress == null ? null : bAddress.trim();
    }

    public Integer getbEducation() {
        return bEducation;
    }

    public void setbEducation(Integer bEducation) {
        this.bEducation = bEducation;
    }

    public String getbJobs() {
        return bJobs;
    }

    public void setbJobs(String bJobs) {
        this.bJobs = bJobs == null ? null : bJobs.trim();
    }

    public String getbPersonid() {
        return bPersonid;
    }

    public void setbPersonid(String bPersonid) {
        this.bPersonid = bPersonid == null ? null : bPersonid.trim();
    }

    public Integer getbInsurance() {
        return bInsurance;
    }

    public void setbInsurance(Integer bInsurance) {
        this.bInsurance = bInsurance;
    }

    public Integer getbMarriage() {
        return bMarriage;
    }

    public void setbMarriage(Integer bMarriage) {
        this.bMarriage = bMarriage;
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

    public Integer getlLivesportCount() {
        return lLivesportCount;
    }

    public void setlLivesportCount(Integer lLivesportCount) {
        this.lLivesportCount = lLivesportCount;
    }

    public Integer getlLivesportMinute() {
        return lLivesportMinute;
    }

    public void setlLivesportMinute(Integer lLivesportMinute) {
        this.lLivesportMinute = lLivesportMinute;
    }

    public Integer getlLivesportYear() {
        return lLivesportYear;
    }

    public void setlLivesportYear(Integer lLivesportYear) {
        this.lLivesportYear = lLivesportYear;
    }

    public String getlLivesportWay() {
        return lLivesportWay;
    }

    public void setlLivesportWay(String lLivesportWay) {
        this.lLivesportWay = lLivesportWay == null ? null : lLivesportWay.trim();
    }

    public Integer getlLivesportStep() {
        return lLivesportStep;
    }

    public void setlLivesportStep(Integer lLivesportStep) {
        this.lLivesportStep = lLivesportStep;
    }

    public Integer getlLivefoodStructure() {
        return lLivefoodStructure;
    }

    public void setlLivefoodStructure(Integer lLivefoodStructure) {
        this.lLivefoodStructure = lLivefoodStructure;
    }

    public Integer getlLivefoodDaykind() {
        return lLivefoodDaykind;
    }

    public void setlLivefoodDaykind(Integer lLivefoodDaykind) {
        this.lLivefoodDaykind = lLivefoodDaykind;
    }

    public Integer getlLivefoodWeekkind() {
        return lLivefoodWeekkind;
    }

    public void setlLivefoodWeekkind(Integer lLivefoodWeekkind) {
        this.lLivefoodWeekkind = lLivefoodWeekkind;
    }

    public Integer getlLivefoodPrimary() {
        return lLivefoodPrimary;
    }

    public void setlLivefoodPrimary(Integer lLivefoodPrimary) {
        this.lLivefoodPrimary = lLivefoodPrimary;
    }

    public Integer getlLivefoodPotato() {
        return lLivefoodPotato;
    }

    public void setlLivefoodPotato(Integer lLivefoodPotato) {
        this.lLivefoodPotato = lLivefoodPotato;
    }

    public Integer getlLivefoodBean() {
        return lLivefoodBean;
    }

    public void setlLivefoodBean(Integer lLivefoodBean) {
        this.lLivefoodBean = lLivefoodBean;
    }

    public Integer getlLivefoodVegetable() {
        return lLivefoodVegetable;
    }

    public void setlLivefoodVegetable(Integer lLivefoodVegetable) {
        this.lLivefoodVegetable = lLivefoodVegetable;
    }

    public Integer getlLivefoodFruit() {
        return lLivefoodFruit;
    }

    public void setlLivefoodFruit(Integer lLivefoodFruit) {
        this.lLivefoodFruit = lLivefoodFruit;
    }

    public Integer getlLivefoodMilk() {
        return lLivefoodMilk;
    }

    public void setlLivefoodMilk(Integer lLivefoodMilk) {
        this.lLivefoodMilk = lLivefoodMilk;
    }

    public Integer getlLivefoodNut() {
        return lLivefoodNut;
    }

    public void setlLivefoodNut(Integer lLivefoodNut) {
        this.lLivefoodNut = lLivefoodNut;
    }

    public Integer getlLivefoodSalt() {
        return lLivefoodSalt;
    }

    public void setlLivefoodSalt(Integer lLivefoodSalt) {
        this.lLivefoodSalt = lLivefoodSalt;
    }

    public Integer getlLivefoodMeat() {
        return lLivefoodMeat;
    }

    public void setlLivefoodMeat(Integer lLivefoodMeat) {
        this.lLivefoodMeat = lLivefoodMeat;
    }

    public Integer getlLivefoodFish() {
        return lLivefoodFish;
    }

    public void setlLivefoodFish(Integer lLivefoodFish) {
        this.lLivefoodFish = lLivefoodFish;
    }

    public Integer getlLivefoodEgg() {
        return lLivefoodEgg;
    }

    public void setlLivefoodEgg(Integer lLivefoodEgg) {
        this.lLivefoodEgg = lLivefoodEgg;
    }

    public Integer getlLivefoodOil() {
        return lLivefoodOil;
    }

    public void setlLivefoodOil(Integer lLivefoodOil) {
        this.lLivefoodOil = lLivefoodOil;
    }

    public Integer getlLivefoodSugar() {
        return lLivefoodSugar;
    }

    public void setlLivefoodSugar(Integer lLivefoodSugar) {
        this.lLivefoodSugar = lLivefoodSugar;
    }

    public Integer getlLivefoodWater() {
        return lLivefoodWater;
    }

    public void setlLivefoodWater(Integer lLivefoodWater) {
        this.lLivefoodWater = lLivefoodWater;
    }

    public Integer getlSmokeCondition() {
        return lSmokeCondition;
    }

    public void setlSmokeCondition(Integer lSmokeCondition) {
        this.lSmokeCondition = lSmokeCondition;
    }

    public Integer getlSmokeBeginage() {
        return lSmokeBeginage;
    }

    public void setlSmokeBeginage(Integer lSmokeBeginage) {
        this.lSmokeBeginage = lSmokeBeginage;
    }

    public Integer getlSmokeNumber() {
        return lSmokeNumber;
    }

    public void setlSmokeNumber(Integer lSmokeNumber) {
        this.lSmokeNumber = lSmokeNumber;
    }

    public Integer getlSmokeEndage() {
        return lSmokeEndage;
    }

    public void setlSmokeEndage(Integer lSmokeEndage) {
        this.lSmokeEndage = lSmokeEndage;
    }

    public Integer getlSmokeEnv() {
        return lSmokeEnv;
    }

    public void setlSmokeEnv(Integer lSmokeEnv) {
        this.lSmokeEnv = lSmokeEnv;
    }

    public Integer getlWineHz() {
        return lWineHz;
    }

    public void setlWineHz(Integer lWineHz) {
        this.lWineHz = lWineHz;
    }

    public Integer getlWineKind() {
        return lWineKind;
    }

    public void setlWineKind(Integer lWineKind) {
        this.lWineKind = lWineKind;
    }

    public Integer getlWineBeer() {
        return lWineBeer;
    }

    public void setlWineBeer(Integer lWineBeer) {
        this.lWineBeer = lWineBeer;
    }

    public Integer getlWineWhite() {
        return lWineWhite;
    }

    public void setlWineWhite(Integer lWineWhite) {
        this.lWineWhite = lWineWhite;
    }

    public Integer getlWineRed() {
        return lWineRed;
    }

    public void setlWineRed(Integer lWineRed) {
        this.lWineRed = lWineRed;
    }

    public Integer getlWineYellow() {
        return lWineYellow;
    }

    public void setlWineYellow(Integer lWineYellow) {
        this.lWineYellow = lWineYellow;
    }

    public Integer getlWineBeginage() {
        return lWineBeginage;
    }

    public void setlWineBeginage(Integer lWineBeginage) {
        this.lWineBeginage = lWineBeginage;
    }

    public Integer getlWineEndage() {
        return lWineEndage;
    }

    public void setlWineEndage(Integer lWineEndage) {
        this.lWineEndage = lWineEndage;
    }

    public Integer getlWineYear() {
        return lWineYear;
    }

    public void setlWineYear(Integer lWineYear) {
        this.lWineYear = lWineYear;
    }

    public Integer getlWineDrunk() {
        return lWineDrunk;
    }

    public void setlWineDrunk(Integer lWineDrunk) {
        this.lWineDrunk = lWineDrunk;
    }

    public Integer getlSleepTime() {
        return lSleepTime;
    }

    public void setlSleepTime(Integer lSleepTime) {
        this.lSleepTime = lSleepTime;
    }

    public Integer getlSleepWakenumber() {
        return lSleepWakenumber;
    }

    public void setlSleepWakenumber(Integer lSleepWakenumber) {
        this.lSleepWakenumber = lSleepWakenumber;
    }

    public Integer getlSleepInsomnia() {
        return lSleepInsomnia;
    }

    public void setlSleepInsomnia(Integer lSleepInsomnia) {
        this.lSleepInsomnia = lSleepInsomnia;
    }

    public Boolean getlPerceiveNearmemory() {
        return lPerceiveNearmemory;
    }

    public void setlPerceiveNearmemory(Boolean lPerceiveNearmemory) {
        this.lPerceiveNearmemory = lPerceiveNearmemory;
    }

    public Boolean getlPerceiveFarmemory() {
        return lPerceiveFarmemory;
    }

    public void setlPerceiveFarmemory(Boolean lPerceiveFarmemory) {
        this.lPerceiveFarmemory = lPerceiveFarmemory;
    }

    public Boolean getlPerceiveCalc() {
        return lPerceiveCalc;
    }

    public void setlPerceiveCalc(Boolean lPerceiveCalc) {
        this.lPerceiveCalc = lPerceiveCalc;
    }

    public Boolean getlPerceiveDirection() {
        return lPerceiveDirection;
    }

    public void setlPerceiveDirection(Boolean lPerceiveDirection) {
        this.lPerceiveDirection = lPerceiveDirection;
    }

    public Boolean getlPsyLive() {
        return lPsyLive;
    }

    public void setlPsyLive(Boolean lPsyLive) {
        this.lPsyLive = lPsyLive;
    }

    public Boolean getlPsyJob() {
        return lPsyJob;
    }

    public void setlPsyJob(Boolean lPsyJob) {
        this.lPsyJob = lPsyJob;
    }

    public Boolean getlPsyWorkpress() {
        return lPsyWorkpress;
    }

    public void setlPsyWorkpress(Boolean lPsyWorkpress) {
        this.lPsyWorkpress = lPsyWorkpress;
    }

    public Boolean getlPsyFeellow() {
        return lPsyFeellow;
    }

    public void setlPsyFeellow(Boolean lPsyFeellow) {
        this.lPsyFeellow = lPsyFeellow;
    }

    public Boolean getlPsyAnxiety() {
        return lPsyAnxiety;
    }

    public void setlPsyAnxiety(Boolean lPsyAnxiety) {
        this.lPsyAnxiety = lPsyAnxiety;
    }

    public Float getlScore() {
        return lScore;
    }

    public void setlScore(Float lScore) {
        this.lScore = lScore;
    }

    public String getlScoreDesc() {
        return lScoreDesc;
    }

    public void setlScoreDesc(String lScoreDesc) {
        this.lScoreDesc = lScoreDesc == null ? null : lScoreDesc.trim();
    }

    public Boolean getlPersonalityWorry() {
        return lPersonalityWorry;
    }

    public void setlPersonalityWorry(Boolean lPersonalityWorry) {
        this.lPersonalityWorry = lPersonalityWorry;
    }

    public Boolean getlPersonalityCalm() {
        return lPersonalityCalm;
    }

    public void setlPersonalityCalm(Boolean lPersonalityCalm) {
        this.lPersonalityCalm = lPersonalityCalm;
    }

    public Boolean getlPersonalityUnhappy() {
        return lPersonalityUnhappy;
    }

    public void setlPersonalityUnhappy(Boolean lPersonalityUnhappy) {
        this.lPersonalityUnhappy = lPersonalityUnhappy;
    }

    public Integer getlLivesportDayweek() {
        return lLivesportDayweek;
    }

    public void setlLivesportDayweek(Integer lLivesportDayweek) {
        this.lLivesportDayweek = lLivesportDayweek;
    }

    public Date getbTime() {
        return bTime;
    }

    public void setbTime(Date bTime) {
        this.bTime = bTime;
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
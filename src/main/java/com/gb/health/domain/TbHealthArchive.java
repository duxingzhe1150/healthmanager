package com.gb.health.domain;

import java.util.Date;

public class TbHealthArchive {
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
    
    private Integer hId;

    private Date bTime;
    
    private String source;
    
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

    public Date getbTime() {
        return bTime;
    }

    public void setbTime(Date bTime) {
        this.bTime = bTime;
    }

	public Integer gethId() {
		return hId;
	}

	public void sethId(Integer hId) {
		this.hId = hId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
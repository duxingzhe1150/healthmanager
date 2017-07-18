package com.gb.health.domain;

/**
 * 
 *
 * 症状实体
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年2月9日
 */
public class Disease {
	
	private Integer id;
	
	private String diseaseName;
	
	private String diseaseNumber;
	
	private String diseaseFlag;

	/**
	 * id    
	 *    
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * diseaseName    
	 *    
	 * @return the diseaseName
	 */
	public String getDiseaseName() {
		return diseaseName;
	}

	/**
	 * @param diseaseName the diseaseName to set
	 */
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	/**
	 * diseaseNumber    
	 *    
	 * @return the diseaseNumber
	 */
	public String getDiseaseNumber() {
		return diseaseNumber;
	}

	/**
	 * @param diseaseNumber the diseaseNumber to set
	 */
	public void setDiseaseNumber(String diseaseNumber) {
		this.diseaseNumber = diseaseNumber;
	}

	/**
	 * diseaseFlag    
	 *    
	 * @return the diseaseFlag
	 */
	public String getDiseaseFlag() {
		return diseaseFlag;
	}

	/**
	 * @param diseaseFlag the diseaseFlag to set
	 */
	public void setDiseaseFlag(String diseaseFlag) {
		this.diseaseFlag = diseaseFlag;
	}
	
	@Override
	public String toString() {
		
		return "{id:"+this.getId()+", diseaseName:"+this.diseaseName+", diseaseNumber:"+this.diseaseNumber+", diseaseFlag:"+this.diseaseFlag+"}";
	}

}

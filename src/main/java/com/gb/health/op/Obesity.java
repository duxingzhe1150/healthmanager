package com.gb.health.op;

/**
 * 
 *
 * 肥胖症临时对象
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年4月25日
 */
public class Obesity {
	
	//体质指数
	private Float BMI;
	
	//是否为肥胖症
//	private Boolean isObesity;
	
	//风险等级
	private String risk;
	
	//肥胖症级别
	private String level;

	/**
	 * bMI    
	 *    
	 * @return the bMI
	 */
	public Float getBMI() {
		return BMI;
	}

	/**
	 * @param bMI the bMI to set
	 */
	public void setBMI(Float bMI) {
		BMI = bMI;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}

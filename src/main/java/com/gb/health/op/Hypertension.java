package com.gb.health.op;

/**
 * 
 *
 * 高血压评估模型
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年5月22日
 */
public class Hypertension {
	
	//年龄
	private Integer age;
	
	//收缩压
	private Integer systolic;
	
	//舒张压
	private Integer diastolic ;
	
	//身高
	private Float height;
	
	//体重
	private Float weight;
	
	//父母是否有高血压
	private Integer parent;

	/**
	 * age    
	 *    
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * systolic    
	 *    
	 * @return the systolic
	 */
	public Integer getSystolic() {
		return systolic;
	}

	/**
	 * @param systolic the systolic to set
	 */
	public void setSystolic(Integer systolic) {
		this.systolic = systolic;
	}

	/**
	 * diastolic    
	 *    
	 * @return the diastolic
	 */
	public Integer getDiastolic() {
		return diastolic;
	}

	/**
	 * @param diastolic the diastolic to set
	 */
	public void setDiastolic(Integer diastolic) {
		this.diastolic = diastolic;
	}

	/**
	 * height    
	 *    
	 * @return the height
	 */
	public Float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Float height) {
		this.height = height;
	}

	/**
	 * weight    
	 *    
	 * @return the weight
	 */
	public Float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Float weight) {
		this.weight = weight;
	}

	/**
	 * parent    
	 *    
	 * @return the parent
	 */
	public Integer getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	

}

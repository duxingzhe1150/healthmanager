package com.gb.health.op;

/**
 * 
 *
 * 脑卒中模型
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年5月22日
 */
public class Stroke {
	
	//曾经患有脑卒中吗
	private Integer stroke;
	
	//曾经患有短暂性脑缺血发作吗
	private Integer TIA;
	
	//患有高血压病吗？（血压≥140/90mmHg或者正在服用降压药）
	private Integer hypertension;
	
	//患有房颤或瓣膜性心肌炎吗
	private Integer myocarditis;
	
	//吸烟吗
	private Integer smoking;
	
	//血脂异常吗？（甘油三酯≥2.26mmol/L，或总胆固醇≥6.22mmol/L，或低密度脂蛋白胆固醇≥4.14mmol/L，或高密度脂蛋白胆固醇＜1.04mmol/L）
	private Integer bloodFat;
	
	//患有糖尿病吗
	private Integer diabetes;
	
	//属于体力锻炼很少或轻体力劳动者吗？（次数＜3次/周，且＜30分钟/次；经常参与工农业劳动视为有体育锻炼）
	private Integer exercise;
	
	//身高
	private Float height;
	
	//体重
	private Float weight;
	
	//是否有脑卒中家族史
	private Integer family;

	/**
	 * stroke    
	 *    
	 * @return the stroke
	 */
	public Integer getStroke() {
		return stroke;
	}

	/**
	 * @param stroke the stroke to set
	 */
	public void setStroke(Integer stroke) {
		this.stroke = stroke;
	}

	/**
	 * tIA    
	 *    
	 * @return the tIA
	 */
	public Integer getTIA() {
		return TIA;
	}

	/**
	 * @param tIA the tIA to set
	 */
	public void setTIA(Integer tIA) {
		TIA = tIA;
	}

	/**
	 * hypertension    
	 *    
	 * @return the hypertension
	 */
	public Integer getHypertension() {
		return hypertension;
	}

	/**
	 * @param hypertension the hypertension to set
	 */
	public void setHypertension(Integer hypertension) {
		this.hypertension = hypertension;
	}

	/**
	 * myocarditis    
	 *    
	 * @return the myocarditis
	 */
	public Integer getMyocarditis() {
		return myocarditis;
	}

	/**
	 * @param myocarditis the myocarditis to set
	 */
	public void setMyocarditis(Integer myocarditis) {
		this.myocarditis = myocarditis;
	}

	/**
	 * smoking    
	 *    
	 * @return the smoking
	 */
	public Integer getSmoking() {
		return smoking;
	}

	/**
	 * @param smoking the smoking to set
	 */
	public void setSmoking(Integer smoking) {
		this.smoking = smoking;
	}

	/**
	 * bloodFat    
	 *    
	 * @return the bloodFat
	 */
	public Integer getBloodFat() {
		return bloodFat;
	}

	/**
	 * @param bloodFat the bloodFat to set
	 */
	public void setBloodFat(Integer bloodFat) {
		this.bloodFat = bloodFat;
	}

	/**
	 * diabetes    
	 *    
	 * @return the diabetes
	 */
	public Integer getDiabetes() {
		return diabetes;
	}

	/**
	 * @param diabetes the diabetes to set
	 */
	public void setDiabetes(Integer diabetes) {
		this.diabetes = diabetes;
	}

	/**
	 * exercise    
	 *    
	 * @return the exercise
	 */
	public Integer getExercise() {
		return exercise;
	}

	/**
	 * @param exercise the exercise to set
	 */
	public void setExercise(Integer exercise) {
		this.exercise = exercise;
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
	 * family    
	 *    
	 * @return the family
	 */
	public Integer getFamily() {
		return family;
	}

	/**
	 * @param family the family to set
	 */
	public void setFamily(Integer family) {
		this.family = family;
	}
	
	

}

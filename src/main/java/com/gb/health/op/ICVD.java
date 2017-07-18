package com.gb.health.op;
/**
 * 
 *
 * 缺血型心血管病的模型实体
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年4月27日
 */
public class ICVD {
	
	//性别
	private Integer b_sex;
	
	//年龄
	private Integer b_age;
	
	//收缩压
	private Integer generl_systolic;
	
	//体质指数（BMI）
	private Float generl_bmi;
	
	//身高（BMI）
	private Float b_heght;
	
	//体重（BMI）
	private Float b_weight;
	
	//总胆固醇
	private Integer biochemical_tc;
	
	//吸烟
	private Integer l_smoke_condition;
	
	//糖尿病
	private Integer diabetes;

	/**
	 * b_sex    
	 *    
	 * @return the b_sex
	 */
	public Integer getB_sex() {
		return b_sex;
	}

	/**
	 * @param b_sex the b_sex to set
	 */
	public void setB_sex(Integer b_sex) {
		this.b_sex = b_sex;
	}

	/**
	 * b_age    
	 *    
	 * @return the b_age
	 */
	public Integer getB_age() {
		return b_age;
	}

	/**
	 * @param b_age the b_age to set
	 */
	public void setB_age(Integer b_age) {
		this.b_age = b_age;
	}

	/**
	 * generl_systolic    
	 *    
	 * @return the generl_systolic
	 */
	public Integer getGenerl_systolic() {
		return generl_systolic;
	}

	/**
	 * @param generl_systolic the generl_systolic to set
	 */
	public void setGenerl_systolic(Integer generl_systolic) {
		this.generl_systolic = generl_systolic;
	}

	/**
	 * generl_bmi    
	 *    
	 * @return the generl_bmi
	 */
	public Float getGenerl_bmi() {
		return generl_bmi;
	}

	/**
	 * @param generl_bmi the generl_bmi to set
	 */
	public void setGenerl_bmi(Float generl_bmi) {
		this.generl_bmi = generl_bmi;
	}

	/**
	 * b_heght    
	 *    
	 * @return the b_heght
	 */
	public Float getB_heght() {
		return b_heght;
	}

	/**
	 * @param b_heght the b_heght to set
	 */
	public void setB_heght(Float b_heght) {
		this.b_heght = b_heght;
	}

	/**
	 * b_weight    
	 *    
	 * @return the b_weight
	 */
	public Float getB_weight() {
		return b_weight;
	}

	/**
	 * @param b_weight the b_weight to set
	 */
	public void setB_weight(Float b_weight) {
		this.b_weight = b_weight;
	}

	/**
	 * biochemical_tc    
	 *    
	 * @return the biochemical_tc
	 */
	public Integer getBiochemical_tc() {
		return biochemical_tc;
	}

	/**
	 * @param biochemical_tc the biochemical_tc to set
	 */
	public void setBiochemical_tc(Integer biochemical_tc) {
		this.biochemical_tc = biochemical_tc;
	}

	/**
	 * l_smoke_condition    
	 *    
	 * @return the l_smoke_condition
	 */
	public Integer getL_smoke_condition() {
		return l_smoke_condition;
	}

	/**
	 * @param l_smoke_condition the l_smoke_condition to set
	 */
	public void setL_smoke_condition(Integer l_smoke_condition) {
		this.l_smoke_condition = l_smoke_condition;
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

	

}

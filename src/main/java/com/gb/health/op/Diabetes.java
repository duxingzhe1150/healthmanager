package com.gb.health.op;

/**
 * 
 *
 * 糖尿病参数模型
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年5月5日
 */
public class Diabetes {
	
	//性别
	private Integer b_sex;
	
	//年龄
	private Integer b_age;
	
	//身高(单位cm)
	private Float b_heght;
	
	//体重
	private Float b_weight;
	
	//腰围
	private Integer b_waistline;
	
	//您每天锻炼30分钟以上吗？
	private Integer l_liveSport_minuteCount;
	
	//您每天吃水果？
	private Integer l_liveFood_fruit;
	
	//您每天吃蔬菜？
	private Integer l_liveFood_vegetable;
	
	//您长期服用过降压药吗？
	private Integer hypotensor;
	
	//您是否发现有高血糖（比如体检时、生病时、怀孕期、）
	private Integer hyperglycemia;
	
	//直系或旁系亲属中有被确诊为糖尿病
	private Integer famaly;

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
	 * b_waistline    
	 *    
	 * @return the b_waistline
	 */
	public Integer getB_waistline() {
		return b_waistline;
	}

	/**
	 * @param b_waistline the b_waistline to set
	 */
	public void setB_waistline(Integer b_waistline) {
		this.b_waistline = b_waistline;
	}

	/**
	 * l_liveSport_minuteCount    
	 *    
	 * @return the l_liveSport_minuteCount
	 */
	public Integer getL_liveSport_minuteCount() {
		return l_liveSport_minuteCount;
	}

	/**
	 * @param l_liveSport_minuteCount the l_liveSport_minuteCount to set
	 */
	public void setL_liveSport_minuteCount(Integer l_liveSport_minuteCount) {
		this.l_liveSport_minuteCount = l_liveSport_minuteCount;
	}

	/**
	 * l_liveFood_fruit    
	 *    
	 * @return the l_liveFood_fruit
	 */
	public Integer getL_liveFood_fruit() {
		return l_liveFood_fruit;
	}

	/**
	 * @param l_liveFood_fruit the l_liveFood_fruit to set
	 */
	public void setL_liveFood_fruit(Integer l_liveFood_fruit) {
		this.l_liveFood_fruit = l_liveFood_fruit;
	}

	/**
	 * l_liveFood_vegetable    
	 *    
	 * @return the l_liveFood_vegetable
	 */
	public Integer getL_liveFood_vegetable() {
		return l_liveFood_vegetable;
	}

	/**
	 * @param l_liveFood_vegetable the l_liveFood_vegetable to set
	 */
	public void setL_liveFood_vegetable(Integer l_liveFood_vegetable) {
		this.l_liveFood_vegetable = l_liveFood_vegetable;
	}

	/**
	 * hypotensor    
	 *    
	 * @return the hypotensor
	 */
	public Integer getHypotensor() {
		return hypotensor;
	}

	/**
	 * @param hypotensor the hypotensor to set
	 */
	public void setHypotensor(Integer hypotensor) {
		this.hypotensor = hypotensor;
	}

	/**
	 * hyperglycemia    
	 *    
	 * @return the hyperglycemia
	 */
	public Integer getHyperglycemia() {
		return hyperglycemia;
	}

	/**
	 * @param hyperglycemia the hyperglycemia to set
	 */
	public void setHyperglycemia(Integer hyperglycemia) {
		this.hyperglycemia = hyperglycemia;
	}

	/**
	 * famaly    
	 *    
	 * @return the famaly
	 */
	public Integer getFamaly() {
		return famaly;
	}

	/**
	 * @param famaly the famaly to set
	 */
	public void setFamaly(Integer famaly) {
		this.famaly = famaly;
	}
	
	

}

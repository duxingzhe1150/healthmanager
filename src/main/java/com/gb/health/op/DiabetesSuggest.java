package com.gb.health.op;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * 糖尿病评估返回结果
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年5月16日
 */
public class DiabetesSuggest {
	
	//得分
	private Integer score;
	
	//风险等级
	private String level;
	
	//风险指数
	private Float riskIndex;

	/**
	 * score    
	 *    
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * level    
	 *    
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * riskIndex    
	 *    
	 * @return the riskIndex
	 */
	public Float getRiskIndex() {
		return riskIndex;
	}

	/**
	 * @param riskIndex the riskIndex to set
	 */
	public void setRiskIndex(Float riskIndex) {
		this.riskIndex = riskIndex;
	}
	
	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		
		list.add("a");
		list.add("s");
		list.add("d");
		list.add("f");
		list.add("ff");
		list.add("ss");
		list.add("gg");
		
		System.out.println(list.indexOf("ff"));
		
	}

}

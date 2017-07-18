package com.gb.health.op;

/**
 * 
 *
 * 哈佛医书症状查询结果类
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年6月5日
 */
public class ResultDisease {
	
	//症状描述
	 private String description;
	 
	 //选项“是”的编号
	 private String child_yes;
	 
	//选项“否”的编号
	 private String child_no;
	 
	 //是否有选项的标记 ，有：1，无：0
	 private String d_flag;

	/**
	 * description    
	 *    
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * child_yes    
	 *    
	 * @return the child_yes
	 */
	public String getChild_yes() {
		return child_yes;
	}

	/**
	 * @param child_yes the child_yes to set
	 */
	public void setChild_yes(String child_yes) {
		this.child_yes = child_yes;
	}

	/**
	 * child_no    
	 *    
	 * @return the child_no
	 */
	public String getChild_no() {
		return child_no;
	}

	/**
	 * @param child_no the child_no to set
	 */
	public void setChild_no(String child_no) {
		this.child_no = child_no;
	}

	/**
	 * d_flag    
	 *    
	 * @return the d_flag
	 */
	public String getD_flag() {
		return d_flag;
	}

	/**
	 * @param d_flag the d_flag to set
	 */
	public void setD_flag(String d_flag) {
		this.d_flag = d_flag;
	}
	 
	 

}

package com.gb.health.op;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * 分页返回类
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年7月7日
 */
public class Page<E> {
	
	private List<E> dataList;
	
	private Integer countPage;
	
	private Integer nowPage;
	
	private Integer count;
	
	private Integer size=1;

	/**
	 * count    
	 *    
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * size    
	 *    
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * countPage    
	 *    
	 * @return the countPage
	 */
	public Integer getCountPage() {
		
		if (this.size<=0) {
			throw new RuntimeException("page size is illegal");
		}
		int temp=this.count/this.size;
		
		return this.count%this.size>0 ? temp+1 : temp;
	}

	/**
	 * nowPage    
	 *    
	 * @return the nowPage
	 */
	public Integer getNowPage() {
		return nowPage;
	}

	/**
	 * @param nowPage the nowPage to set
	 */
	public void setNowPage(Integer nowPage) {
		
		if (nowPage<=0) {
			this.nowPage = 1;
		}else{
			this.nowPage = nowPage;	
		}
		
		
	}

	public List<E> getDataList() {
		
		if (this.nowPage>getCountPage()) {
			return new ArrayList<>();
		}
		
		if (this.nowPage*this.size<=(this.dataList.size()-1)) {
			this.dataList=this.dataList.subList((this.nowPage-1)*this.size, this.nowPage*this.size);
		}else {
			this.dataList=this.dataList.subList((this.nowPage-1)*this.size, this.dataList.size()-1);
		}
		
		return dataList;
	}

	public void setDataList(List<E> dataList) {
		this.dataList = dataList;
	}
	
	
	

}

/**
 * FileName:     DefaultFeture.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年3月27日 下午4:33:45
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年3月27日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.algorithm;


/**
 * @ClassName:     DefaultFeture.java
 * @Description:   TODO
 * 
 * @author         Administrator
 * @version        V1.0  
 * @param <K>
 * @Date           2017年3月27日 下午4:33:45 

 */
public class DefaultFeture<K> implements FetureInter<K>{


	
	private K k;

	@Override
	public K getParam() {
		// TODO Auto-generated method stub
		return k;
	}

	@Override
	public FetureInter<K> setParam(K k) {
		// TODO Auto-generated method stub
		this.k = k;
		return this;
	}
	
	
}

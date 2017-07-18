/**
a * FileName:     AbsFactory.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年3月27日 下午5:00:41
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年3月27日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.algorithm;

import java.util.Map;


/**
 * @ClassName:     AbsFactory.java
 * @Description:   TODO
 * 
 * @author         Administrator
 * @version        V1.0  
 * @param <R>
 * @param <R>
 * @Date           2017年3月27日 下午5:00:41 

 */
public abstract class AbsFactory<K,R> implements AsnyFactory<K,R> {
	
	
	private FetureInter<K> fi ;
	
	protected Map<String, R> suggest;


@Override
public void createAsyn(FetureInter<K> fetureInter) {
	// TODO Auto-generated method stub
	this.fi= fetureInter;
	
}

	
	
	public abstract R result(FetureInter<K> fi);
	
	/**
	 * <p>Title: getResult</p>
	 * <p>Description: </p>
	 * @return
	 */
	@Override
	public R getResult() {
		return (R)result(fi);
	}

	



}

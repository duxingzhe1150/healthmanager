package com.gb.health.service;

import net.sf.json.JSONObject;

/**
 * 
 *
 * 数据发送服务接口
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年5月16日
 */
public interface DataSentService<T> {
	
	/**
	 * 
	 * Description: 装配发送数据的json  
	     * Create at:   2017年5月17日
		 * @param t
		 * @return
	 */
	JSONObject getSentJSON(T t);
	
	/**
	 * 解析返回的json
	 * Description:  
	     * Create at:   2017年5月17日
		 * @param jsonObject
		 * @return
	 */
	String getReturnMassage(JSONObject jsonObject);
	
	String sent();
	
	String saveToMysql();

}

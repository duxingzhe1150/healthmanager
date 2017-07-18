/**
 * FileName:     FetureInter.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年3月27日 下午2:34:58
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年3月27日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.algorithm;


/**
 * @ClassName:     FetureInter.java
 * @Description:   TODO
 * 
 * @author         Administrator
 * @version        V1.0  
 * @Date           2017年3月27日 下午2:34:58 

 */
public interface FetureInter<K> {
	
	
	K getParam();
	

	FetureInter<K> setParam(K k);
	
	
	

}

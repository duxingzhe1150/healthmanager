/**
 * FileName:     EneuTool.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年3月22日 上午9:35:10
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年3月22日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.utils;

import java.lang.reflect.Method;
import org.apache.poi.ss.formula.functions.T;


/**
 * 
 *
 * 简要描述一下这个类
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年7月26日
 */
public class EneuTool {

	public static  <T extends Enum>T getEByText1(Class<T> t, String value){
	try {
		Method me =t.getDeclaredMethod("values", null);
		return ((T[])me.invoke(t))[3];
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
		
	}

     
 /*    public static void main(String[] args) {
		EneuTool et = new EneuTool();
		education e =et.getEByText1(education.class, "1");
		System.out.println(e.name);
		liveFood_egg e1 =et.getEByText1(liveFood_egg.class, "1");
		System.out.println(e1.name());
		
		
	}*/
     

}

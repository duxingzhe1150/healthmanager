/**
 * FileName:     Ttb.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年3月27日 下午5:14:55
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年3月27日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.algorithm;

/**
 * @ClassName:     Ttb.java
 * @Description:   TODO
 * 
 * @author         Administrator 
 * @version        V1.0  
 * @Date           2017年3月27日 下午5:14:55 

 */
public class Ttb extends AbsFactory<String,String> {


	
	public static void main(String[] args) {
		
		AsnyFactory<String, String> fa =new  Ttb();
		fa.createAsyn(new DefaultFeture<String>().setParam("dfs"));
		
	
		//System.out.println(fa.getResult());
	}

	
	
	
	@Override
	public String result(FetureInter<String> fi) {
		// TODO Auto-generated method stub
	System.out.println(fi.getParam());
		
		return null;
	}




	@Override
	public Object suggest() {
		// TODO Auto-generated method stub
		return null;
	}








	










}

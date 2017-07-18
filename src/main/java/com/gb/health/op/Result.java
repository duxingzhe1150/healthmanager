/**
 * FileName:     Result.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年4月12日 下午4:24:41
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年4月12日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.op;


import com.gb.health.init.ErrerInterface;


/**
 * @ClassName:     Result.java
 * @Description:   TODO
 * 
 * @author         Administrator
 * @version        V1.0  
 * @Date           2017年4月12日 下午4:24:41 

 */
public class Result<T> implements ErrerInterface {
	
	ErrerInterface errer;
	T result;
	
	
	
   public boolean isSucess(){
	   return this.getCode()==200?true:false;
	   
   }

	@Override
	public int getCode() {
		// TODO Auto-generated method stub
		return errer == null?200:errer.getCode();
	}

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return errer == null?"success":errer.getMsg();
	}
	

	/** 
	 * @Title:  setErrer <BR> 
	 * @Description: please write your description <BR> 
	 * @return: ErrerInterface <BR> 
	 */
	public void setErrer(ErrerInterface errer) {
		this.errer = errer;
	}

	/**
	 * @Title:        getResult <BR>
	 * @Description: please write your description <BR>
	 * @return:     T <BR>
	 */
	public T getResult() {
		return result;
	}

	/** 
	 * @Title:  setResult <BR> 
	 * @Description: please write your description <BR> 
	 * @return: T <BR> 
	 */
	public void setResult(T result) {
		this.result = result;
	}

	
	
	public static Result newResult(){
		return new Result();
		
	}



}

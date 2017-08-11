/**
 * FileName:     ErrerCode.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年4月11日 上午10:02:52
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年4月11日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.init;


/**
 * 
 * 
 * @author         Administrator
 * @version        V1.0  
 *           2017年4月11日 上午10:02:52 

 */
public class ErrerCode  {
	public static final int SUCCESS = 200;
	
	

	public  enum ServerErrer implements ErrerInterface{
		SERVER_CURRENT_API_SUCCESS(SUCCESS,"当前服务运行正常"),
		
		SERVER_CURRENT_API_FAULT(500,"当前服务api错误"),
		
		SERVER_CURRENT_API_DATE(501,"数据参数有误"),
		
		SERVER_CURRENT_API_OTHER(503,"数据存储错误");
		
		
		
		private int code;
		private String msg;
		ServerErrer(int code ,String msg){
			this.code = code;
			this.msg = msg;
		}
		
		@Override
		public int getCode() {
			// TODO Auto-generated method stub
			return code;
		}
		
		@Override
		public String getMsg() {
			// TODO Auto-generated method stub
			return msg;
		}
	}
	public  enum ClientErrer implements ErrerInterface {
	     CLIENT_ERRER(600,"客户端错误"),

	     CLIENT_DATATYPE_ERRER(601,"请求数据格式错误"),
		 CLIENT_DISEASEID_ERRER(604,"病症编号不存在"),
		 CLIENT_PERSONID_ERRER(602,"无本人信息"),
		 CLIENT_LESS_ERRER(603,"信息不完善！");
         
		
		private int code;
		private String msg;
		ClientErrer(int code ,String msg){
			this.code = code;
			this.msg = msg;
			
		}
	
		@Override
		public int getCode() {
			// TODO Auto-generated method stub
			return this.code;
		}
		
		@Override
		public String getMsg() {
			// TODO Auto-generated method stub
			return this.msg;
		}
		
	}
	public  enum Resouce implements ErrerInterface {
		RESOURCE_ERRER(400,"资源错误");
		
		
		
		
		
		private int code;
		private String msg;
		Resouce(int code ,String msg){
			this.code = code;
			this.msg = msg;
			
		}
		
		@Override
		public int getCode() {
			// TODO Auto-generated method stub
			return this.getCode();
		}
		
		@Override
		public String getMsg() {
			// TODO Auto-generated method stub
			return this.getMsg();
		}
		
	}
	
	
	

}

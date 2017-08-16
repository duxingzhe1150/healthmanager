package com.gb.health.init;

import com.gb.health.config.DebugConfig;


/**
 * 接口校验码（h_code）
 * @author lx
 *
 */
public class Const{
//	/**
//	 * 定义身份证输入方式
//	 */
//	public static final int CARD_TYPE_ID = 59;
	
	public static String version ="realse_1";
	
	
	public static int SERVER_ONLINE = 1;
	public static int SERVER_OFFLINE = 2;
	public static int SERVER_LOCAL = 3;
	
	//开关
//	public static final int debug = SERVER_LOCAL;


	private final static int debug;

	public static final String REDIS_SERVER;
	
	//上传体检报告文件存储目录
	public static final String FILE_PATH;
	
	public static final int REDIS_PORT;
	
	//paid 发送   php    url
	public static final String PAID_URL;
	
	//数据来源 发送 php  url
	public static final String SOURCE_URL;
	
	/**
	 * 下载地址  
	 */
	public static final String DOWN_URL;
	
	/**
	 *  发送慈铭体检数据路径
	 */
	public static final String CI_URL;
	
   static{
   		DebugConfig debugConfig=MyContextListener.applicationContext.getBean(DebugConfig.class);

	   debug=debugConfig.getDebug();

	 if(debug == SERVER_OFFLINE){

		    FILE_PATH = "/data/medReportFile/";
			REDIS_SERVER = "127.0.0.1";
			REDIS_PORT =6380;
			CI_URL = "http://api.aikezd.com/v3/huis/set-report";
			DOWN_URL ="https://health.aikeyl.com/downHtml?fileName=";
			
			PAID_URL="http://api.aikezd.com/v3/huis/set-redis";
			SOURCE_URL="http://api.aikezd.com/v3/huis/get-hospital";
		
	 }else if(debug == SERVER_OFFLINE){
		 
			FILE_PATH = "/data/medReportFile/";
			REDIS_SERVER ="127.0.0.1";
			REDIS_PORT =6380;
			DOWN_URL = "https://offline.health.aikeyl.com/HealthManger/downHtml?fileName=";
			CI_URL = "http://api.test.aikezd.com/v3/huis/set-report";
			
		//	https://offline.health.aikeyl.com/api
			PAID_URL="http://api.test.aikezd.com/v3/huis/set-redis";
			SOURCE_URL="http://api.test.aikezd.com/v3/huis/get-hospital";
		 
	 }else if(debug == SERVER_LOCAL){
		 
			FILE_PATH = "E:\\ABCD\\";
			REDIS_SERVER ="192.168.3.114";
			REDIS_PORT =6379;
			DOWN_URL = "http://192.168.3.64:8080/HealthManger/downHtml?fileName=";
			CI_URL = "http://api.test.aikezd.com/v3/huis/set-report";
			
			PAID_URL="http://api.test.aikezd.com/v3/huis/set-redis";
			SOURCE_URL="http://api.test.aikezd.com/v3/huis/get-hospital";
		 
	 }else {
		    FILE_PATH = "E:\\ABCD\\";
			REDIS_SERVER ="health.aikeyl.com";
			REDIS_PORT =6380;
			DOWN_URL = "http://192.168.3.61:8080/HealthManger/downHtml?fileName=";
			CI_URL = "http://api.test.aikezd.com/v3/huis/set-report";
			
			
			PAID_URL="http://api.test.aikezd.com/v3/huis/set-redis";
			SOURCE_URL="http://api.test.aikezd.com/v3/huis/get-hospital";
	 }
   }
}
	
	
  




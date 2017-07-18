package com.gb.health.init;

import java.util.HashMap;
import java.util.Map;

public class Concat {

	public final class ResultType {
		public static final int SUCCESS = 200;
		public static final int LOGIC_AUTH = 400;
		public static final int SERVER_CURRENT_API_FAULT = 500;
		public static final int CLIENT_TREATY_FORMAT_ERROR = 600;

	}

	public final class RedisKey{

		public static final String REDIS_PROJECT_PREFIX="HealthDiagnosis_"; 

		public static final String REDIS_KEY_TYPE_ARCHIVE=REDIS_PROJECT_PREFIX+"archive_";

		public static final String REDIS_KEY_TYPE_DETAILS=REDIS_PROJECT_PREFIX+"details_";

		public static final String REDIS_KEY_TYPE_LIVE=REDIS_PROJECT_PREFIX+"live_";

		public static final String REDIS_KEY_TYPE_ARCHIVE_FLAG=REDIS_PROJECT_PREFIX+"archive_flag_";

		public static final String REDIS_KEY_TYPE_DETAILS_FLAG=REDIS_PROJECT_PREFIX+"details_flag_";

		public static final String REDIS_KEY_TYPE_LIVE_FLAG=REDIS_PROJECT_PREFIX+"live_flag_";

	}

	public final static  class Suggest{

		public static final Object[] IMPROVE_IMMEDIATELY ={1,"立即改善"};

		public static final Object[] KEEP_UP ={2,"继续保持"};
	}

	/**
	 * 
	 *
	 * web接口校验码
	 * Copyright:   Copyright (c)2017  
	 * Company:     光宝联合   
	 *
	 * Create at: 2017年4月5日
	 */
	public final class H_Code{

		/**
		 * 健康陈述中全部数据
		 */
		public static final String HID_HEALTHY_STATE= "10000";
		/**
		 * 健康陈述中用户基本信息校验码
		 */
		public static final String HID_BASE_INFORMATION= "10001";
		/**
		 *  健康陈述中用户健康史校验码
		 */
		public static final String  HID_HISTORY = "10002";
		/**
		 * 健康陈述中用户生活方式校验码
		 */
		public static final String HID_LIFE_STYLE = "10003";

	}
	/**
	 * 
	 *
	 * 慈铭体检报告下载路径配置
	 * Copyright:   Copyright (c)2017  
	 * Company:     光宝联合   
	 *
	 * 
	 */


	public final class DownUrl{

	/*	*//**
		 * 下载地址  
		 *//*
		public static final String DOWN_URL= "http://192.168.3.61:8080/HealthManger/downHtml?fileName=";


		*//**
		 *  下载具体下载该文件的盘符，文件夹地址 
		 *//*
		public static final String DOWN_FILE = "E:/ABCD/";
		
		*//**
		 *  发送慈铭体检数据路径
		 *//*
		public static final String CI_URL = "http://api.test.aikezd.com/v3/huis/set-report";*/


	}


	/**
	 * 
	 *
	 * 风险等级
	 * Copyright:   Copyright (c)2017  
	 * Company:     光宝联合   
	 *
	 * Create at: 2017年5月4日
	 */
	public final static class RiskIndex{

		public static  Map<Integer, Float> RISKINDEX_M=new HashMap<>();

		public static final Integer RISKINDEX_M_MAX=17;
		public static final Integer RISKINDEX_M_MIN=-1;

		public static  Map<Integer, Float> RISKINDEX_W=new HashMap<>();

		public static final Integer RISKINDEX_W_MAX=13;
		public static final Integer RISKINDEX_W_MIN=-2;

		static{
			RISKINDEX_M.put(-1, 0.3f);
			RISKINDEX_M.put(0, 0.5f);
			RISKINDEX_M.put(1, 0.6f);
			RISKINDEX_M.put(2, 0.8f);
			RISKINDEX_M.put(3, 1.1f);
			RISKINDEX_M.put(4, 1.5f);
			RISKINDEX_M.put(5, 2.1f);
			RISKINDEX_M.put(6, 2.9f);
			RISKINDEX_M.put(7, 3.9f);
			RISKINDEX_M.put(8, 5.4f);
			RISKINDEX_M.put(9, 7.3f);
			RISKINDEX_M.put(10, 9.7f);
			RISKINDEX_M.put(11, 12.8f);
			RISKINDEX_M.put(12, 16.8f);
			RISKINDEX_M.put(13, 21.7f);
			RISKINDEX_M.put(14, 21.7f);
			RISKINDEX_M.put(15, 35.3f);
			RISKINDEX_M.put(16, 44.3f);
			RISKINDEX_M.put(17, 52.6f);
		}

		static{
			RISKINDEX_W.put(-2, 0.1f);
			RISKINDEX_W.put(-1, 0.2f);
			RISKINDEX_W.put(0, 0.2f);
			RISKINDEX_W.put(1, 0.2f);
			RISKINDEX_W.put(2, 0.3f);
			RISKINDEX_W.put(3, 0.5f);
			RISKINDEX_W.put(4, 1.5f);
			RISKINDEX_W.put(5, 2.1f);
			RISKINDEX_W.put(6, 2.9f);
			RISKINDEX_W.put(7, 3.9f);
			RISKINDEX_W.put(8, 5.4f);
			RISKINDEX_W.put(9, 7.3f);
			RISKINDEX_W.put(10, 9.7f);
			RISKINDEX_W.put(11, 12.8f);
			RISKINDEX_W.put(12, 16.8f);
			RISKINDEX_W.put(13, 21.7f);
		}

	}







}




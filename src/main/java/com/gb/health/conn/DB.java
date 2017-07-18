 package com.gb.health.conn;

 import com.gb.health.init.Const;
 import redis.clients.jedis.Jedis;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Set;

/**
 * 
 *
 * redis的初始化类
 * 
 * @author kevin
 * 
 * Company: 光宝联合  
 * 
 * Create at: 
 */
public class DB {
	
	private static Jedis jedis;
	
	/**
	 * jedis    
	 *    
	 * @return the jedis
	 */
	protected static Jedis getJedis() {
		return jedis;
	}

	/**
	 * 使用默认数据连接
	 */
	public DB(){

		jedis=new Jedis(Const.REDIS_SERVER, Const.REDIS_PORT, 0);
	
		
	};
	
	/**
	 * 自定义参数初始化连接
	 * @param ip 数据库ip
	 * @param port 通信端口
	 * @param timeout 超时时间
	 */
	public DB(String ip,int port,int timeout){
		
		jedis=new Jedis(ip, port, timeout);
		
	};
	
	/**
	 * 
	 * Description: 创建缓存数据对象
	     * Copyright:   Copyright (c)2016   
	     * @author:     Kevin    
	     * Create at:   
		 * @param cacheKey 
		 * @return
	 */
	public CacheData creatCacheData(String cacheKey){
		
		CacheData cacheData=new CacheData(cacheKey);
		
		return cacheData;
	}
	
	/**
	 * 
	 * Description: 根据指定key值获取缓存数据  
	     * Copyright:   Copyright (c)2016   
	     * @author:     Kevin    
	     * Create at:  
		 * @param cacheKey
		 * @return
	 */
	public CacheData getCacheDataByKey(String cacheKey){
		
		return creatCacheData(cacheKey);
	} 
	
	/**
	 * 
	 * Description: 判断是否存在指定key的缓存
	     * Create at:   2017年7月13日
		 * @param cacheKey
		 * @return
	 */
	public Boolean isCached(String cacheKey){
		
		Set<String> keys=jedis.keys("*"+cacheKey+"*");
		
		return !keys.isEmpty();
	}
	
	/**
	 * 
	 * Description: 根据指定key值获取缓存
	     * Copyright:   Copyright (c)2016   
	     * @author:     Kevin    
	     * Create at:   
		 * @param type
		 * @return
	 */
	public List<CacheData> getCacheDataByType(String type){
		
		Set<String> keys=jedis.keys("*"+type+"*");
		
		List<CacheData> cacheDatas=new ArrayList<CacheData>();
		
		for (String key:keys) {
			
			cacheDatas.add(new CacheData().setCacheKey(key).setProperties(jedis.hgetAll(key)));
			
		}
		return cacheDatas;
	}

}

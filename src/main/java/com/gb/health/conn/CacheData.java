package com.gb.health.conn;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 *
 * 缓存类，提供对缓存操作的各种方法
 * @author kevin
 * 
 * Company: 光宝联合  
 * 
 * Create at: 2016
 */
public class CacheData {
	
	private String cacheKey;
	
	private Map<String, String> properties=new HashMap<String, String>();
	
	//默认过期时间
	private int defaut_out_time=1200;
	
	protected CacheData(String cacheKey){
		this.cacheKey=cacheKey;
		
		if (DB.getJedis().exists(this.cacheKey)) {
			this.properties=DB.getJedis().hgetAll(this.cacheKey);
		}
		
	}
	
	protected CacheData(){
		
	}
	
	/**
	 * 
	 * Description: 以默认的过期时间缓存数据到redis   
	     * Create at:   2017年3月17日
		 * @return
	 */
	public boolean save(){
		
		return save(defaut_out_time);
	}
	
	public boolean saveWithoutTime(){
		
		DB.getJedis().hmset(this.cacheKey, properties);
		
		return true;
	}
	
	/**
	 * 
	 * Description: 缓存数据到redis，并指定过期时间
	     * Create at:   2017年3月17日
		 * @param seconds 单位为秒
		 * @return
	 */
	public boolean save(int seconds){
		
		DB.getJedis().hmset(this.cacheKey, properties);
		
		DB.getJedis().expire(this.cacheKey, seconds);
		
		return true;
	}
	
	/**
	 * 
	 * Description: 刷新缓存数据，获取最新的数据  
	     * Create at:   2017年3月17日
		 * @return
	 */
	public CacheData refresh(){
		
		return new CacheData(this.cacheKey);
	}
	
	/**
	 * 
	 * Description: 立即清空该条数据的缓存
	     * Create at:   2017年3月17日
		 * @return
	 */
	public Long clear(){
		
		return DB.getJedis().del(this.cacheKey);
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public CacheData setProperty(String properties,String value) {
		this.properties.put(properties, value);
		
		return this;
	}
	
	public CacheData setProperties(Map<String, String> properties) {
		this.properties=properties;
		
		return this;
	}

	public String getCacheKey() {
		return cacheKey;
	}

	public CacheData setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
		
		return this;
	}

}

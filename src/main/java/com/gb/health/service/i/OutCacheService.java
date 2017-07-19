package com.gb.health.service.i;

import com.gb.health.conn.CacheData;
import com.gb.health.conn.DB;
import com.gb.health.dao.TbHealthArchiveMapper;
import com.gb.health.dao.TbHealthDetailsMapper;
import com.gb.health.dao.TbHealthLiveMapper;
import com.gb.health.domain.TbHealthArchive;
import com.gb.health.domain.TbHealthDetails;
import com.gb.health.domain.TbHealthLive;
import com.gb.health.init.Concat;
import com.gb.health.utils.BeanToMapUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;



/**
 * 
 *
 * 缓存操作的服务类
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年4月6日
 */
@Deprecated
@Service("outCacheService")
public class OutCacheService {
	
	private static Logger logger = Logger.getLogger(OutCacheService.class);
	
	@Autowired
	TbHealthArchiveMapper tbHealthArchiveMapper;
	
	@Autowired
	TbHealthDetailsMapper tbHealthDetailsMapper;
	
	@Autowired
	TbHealthLiveMapper tbHealthLiveMapper;
	
	public Map<String, String> getCacheData(String type,String ID){
		
		//获取数据总共分三步进行
		//1、先从缓存中读取该数据
		DB db=new DB();
		
		if(!db.isCached(type+ID)){
			return null;
		}
		
		Map<String, String> cache=db.getCacheDataByKey(type+ID).getProperties();
		
		logger.info("cache data:"+cache);
		logger.debug("cache data:"+cache);
		logger.error("cache data:"+cache);
		
		//2、判断数据集合是否是空的，若为空，则从mysql数据库中读取，并缓存该数据
		if (cache.isEmpty()) {
			
			TbHealthArchive healthArchive= tbHealthArchiveMapper.selectByPrimaryKey(null);
			
			
			
			cache=BeanToMapUtil.getCommonBeanMap(healthArchive);
			
			logger.info("mysql data:"+cache);
			logger.debug("mysql data:"+cache);
			logger.error("mysql data:"+cache);
			
			if (healthArchive!=null) {
				
				/*TbHealthDetails details2=tbHealthDetailsMapper.selectByArchiveKey(healthArchive.getbId());
				TbHealthLive live2=tbHealthLiveMapper.selectByArchiveKey(healthArchive.gethId());*/
				
				//缓存该条数据
//				db.creatCacheData(Concat.RedisKey.REDIS_KEY_TYPE_ARCHIVE+ID).setProperties(cache).save();
//				db.creatCacheData(Concat.RedisKey.REDIS_KEY_TYPE_DETAILS+ID).setProperties(BeanToMapUtil.getCommonBeanMap(details2)).save();
//				db.creatCacheData(Concat.RedisKey.REDIS_KEY_TYPE_LIVE+ID).setProperties(BeanToMapUtil.getCommonBeanMap(live2)).save();
			}
		}
		
		//3、如果mysql数据库中还是没查到，则直接返回空集合
		if (cache==null || cache.isEmpty()) {
			cache=new HashMap<String, String>();
		}
		
		return cache;
	}
	
	/**
	 * 
	 * Description: 同步Archive数据到mysql数据库
	     * Create at:   2017年4月6日
		 * @return
	 */
	public String syncDataToMysqlArchive(Map<String, String> map){
		
//		TbHealthArchive archive2=tbHealthArchiveMapper.selectByID(map.get("personid"));
		
		try {
			TbHealthArchive archive=(TbHealthArchive) BeanToMapUtil.mapToObject(map, TbHealthArchive.class);
			
			/*if (archive2==null) {
				tbHealthArchiveMapper.insert(archive);
			}else {
				archive.sethId(archive2.gethId());
				
				tbHealthArchiveMapper.updateByPrimaryKey(archive);
			}*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	/**
	 * 
	 * Description: 同步Details数据到mysql数据库
	     * Create at:   2017年4月6日
		 * @return
	 */
	public String syncDataToMysqlDetails(Map<String, String> map){
		
//		TbHealthArchive archive=tbHealthArchiveMapper.selectByID(map.get("personid"));
		
		/*if (archive==null) {
			return null;
		}*/
		
		try {
			TbHealthDetails details=(TbHealthDetails) BeanToMapUtil.mapToObject(map, TbHealthDetails.class);
//			details.setHealthArchiveId(archive.gethId());
//			
//			TbHealthDetails details2=tbHealthDetailsMapper.selectByArchiveKey(archive.gethId());
//			
//			if (details2==null) {
//				tbHealthDetailsMapper.insert(details);
//			}else {
//				details.setId(details2.getId());
//				tbHealthDetailsMapper.updateByPrimaryKey(details);
//				
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	/**
	 * 
	 * Description: 同步Live数据到mysql数据库
	     * Create at:   2017年4月6日
		 * @return
	 */
	public String syncDataToMysqlLive(Map<String, String> map){
		
		/*TbHealthArchive archive=tbHealthArchiveMapper.selectByID(map.get("personid"));
		
		if (archive==null) {
			return null;
		}
		
		try {
			TbHealthLive live=(TbHealthLive) BeanToMapUtil.mapToObject(map, TbHealthLive.class);
			
			live.setHealthArchiveId(archive.gethId());
			
			TbHealthLive live2=tbHealthLiveMapper.selectByArchiveKey(archive.gethId());
			
			if (live2==null) {
				tbHealthLiveMapper.insert(live);
			}else {
				live.setId(live2.getId());
				tbHealthLiveMapper.updateByPrimaryKey(live);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		return null;
	}
	
	/**
	 * 
	 * Description:   将指定的对象保存入缓存 
	     * Create at:   2017年4月7日
		 * @return
	 */
	public int saveToCache(TbHealthArchive tbHealthArchive, TbHealthDetails tbHealthDetails, TbHealthLive tbHealthLive){
		
		/*if (tbHealthArchive==null || tbHealthArchive.gethPersonid()==null) {
			return Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR;
		}
		
		saveObjectToCache(tbHealthArchive, Concat.RedisKey.REDIS_KEY_TYPE_ARCHIVE,tbHealthArchive.gethPersonid());
		saveObjectToCache(tbHealthDetails, Concat.RedisKey.REDIS_KEY_TYPE_DETAILS,tbHealthArchive.gethPersonid());
		saveObjectToCache(tbHealthLive, Concat.RedisKey.REDIS_KEY_TYPE_LIVE,tbHealthArchive.gethPersonid());*/
		
		return Concat.ResultType.SUCCESS;
	}
	
	
	

	/**
	 * 
	 * Description: 保存单个对象
	     * Create at:   2017年4月7日
		 * @param obj
		 * @param type
		 * @return
	 */
	private String saveObjectToCache(Object obj,String type,String ID){
		
		if (obj!=null) {
			
			Map<String, String> objMap=BeanToMapUtil.getCommonBeanMap(obj);
			
			if (!objMap.isEmpty()) {
				DB db=new DB();
				
				Map<String, String> flags=new HashMap<>();
				
				//需要先判断是否已存在缓存，若有则取出并更新，若没有则直接缓存进redis
				if (db.isCached(type+ID)) {
					
					CacheData cache=db.getCacheDataByKey(type+ID);
					
					Map<String, String> old_map=cache.getProperties();
					old_map.putAll(objMap);
					cache.setProperties(old_map).save(60*60*4);
					
					CacheData cacheFlags=db.getCacheDataByKey(type+"flag_"+ID);
					
					flags=cacheFlags.getProperties();
					flags.put("updateFlag", "1");
					flags.put("personid", ID);
					cacheFlags.setProperties(flags).save(60*60*4);
					
				}else {
					db.creatCacheData(type+ID).setProperties(objMap).save(60*60*4);
					
					flags.put("updateFlag", "1");
					flags.put("personid", ID);
					
					db.creatCacheData(type+"flag_"+ID).setProperties(flags).save(60*60*4);
				}
			}
			
		}
		
		return null;
	}

}

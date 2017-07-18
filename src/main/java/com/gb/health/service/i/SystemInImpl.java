/**
 * FileName:     SystemInImpl.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年4月6日 下午2:04:30
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年4月6日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.service.i;

import com.gb.health.dao.ChatHistoryMapper;
import com.gb.health.dao.TbHealthExaminationMapper;
import com.gb.health.domain.*;
import com.gb.health.init.ErrerCode.ServerErrer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


/**
 * @ClassName:     SystemInImpl.java
 * @Description:   TODO
 * 
 * @author         Administrator
 * @version        V1.0  
 * @Date           2017年4月6日 下午2:04:30 

 */
@Component("systemInImpl")
public class SystemInImpl implements SystemIn{

	@Autowired
	OutCacheService outGetDataService;
	
	private Logger logger=Logger.getLogger(SystemInImpl.class);
	
	@Autowired 
	TbHealthExaminationMapper tbHealthExaminationMapper;
	
	@Autowired
	OutNoCacheService outNoCacheService;
	
	@Autowired
	ChatHistoryMapper chatHistoryMapper;

	@Override
	public ServerErrer synData(TbHealthArchive tbHealthArchive, TbHealthDetails tbHealthDetails, TbHealthLive tbHealthLive) {
		
		ServerErrer result= ServerErrer.SERVER_CURRENT_API_DATE;
		logger.info("tbHealthArchive:"+tbHealthArchive+"");
		logger.info("tbHealthDetails:"+tbHealthDetails+"");
		logger.info("tbHealthLive:"+tbHealthLive+"");
		
		if (tbHealthArchive==null && tbHealthDetails==null && tbHealthLive==null) {
			
			logger.error("参数有误，全部为空");
			
			return result;
		}
		
		try {
			result=outNoCacheService.saveToDB(tbHealthArchive, tbHealthDetails, tbHealthLive);
		} catch (Exception e) {
			
			logger.error("数据存储时出现异常");
			
			e.printStackTrace();
			
			return ServerErrer.SERVER_CURRENT_API_OTHER;
		}
		
		return result;
		
	}

	@Override
	public int saveHealthExamination(TbHealthExamination examination) {
		
		logger.info("saveHealthExamination:"+examination+"");
		
		int result=tbHealthExaminationMapper.insert(examination);
		
		return result;
	}

	@Override
	public Boolean selectCheck(String tel, Date date) {
		
		logger.info("selectCheck:"+tel+date);
		
		TbHealthExamination examination=new TbHealthExamination();
		examination.setbTel(tel);
		examination.setExaminationtime(date);
		
		List<TbHealthExamination> result=tbHealthExaminationMapper.selectCheck(examination);
		
		if (result==null || result.size()==0) {
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean saveChatHistory(ChatHistory history) {
		
		int r=chatHistoryMapper.insert(history);
		
		if (r<=0)
			return false;
		
		return true;
	}
	
}

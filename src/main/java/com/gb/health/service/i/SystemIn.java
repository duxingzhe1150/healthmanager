/**
 * FileName:     SystemIn.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年4月6日 上午11:46:02
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年4月6日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.service.i;

import java.util.Date;

import com.gb.health.domain.ChatHistory;
import com.gb.health.domain.TbHealthArchive;
import com.gb.health.domain.TbHealthDetails;
import com.gb.health.domain.TbHealthExamination;
import com.gb.health.domain.TbHealthLive;
import com.gb.health.init.ErrerCode.ServerErrer;

/**
 *  获取信息 。由刘翔做实现
 *           2017年4月6日 上午11:46:02 

 */

public interface SystemIn {
	
	/**
	 * 
	 * Description: 保存健康陈述的数据对象   
	     * Create at:   2017年4月6日
		 * @param tbHealthArchive
		 * @param tbHealthDetails
		 * @param tbHealthLive
	 */
    public ServerErrer synData(TbHealthArchive tbHealthArchive, TbHealthDetails tbHealthDetails, TbHealthLive tbHealthLive);
    
    /**
     * 
     * Description: 保存体检报告的相关信息
         * Create at:   2017年5月8日
    	 * @param examination
    	 * @return
     */
    int saveHealthExamination(TbHealthExamination examination);
    
    /**
     * 
     * Description: 查询是否存在指定条件的信息 
         * Create at:   2017年5月9日
    	 * @param tel
    	 * @param date
    	 * @return
     */
    Boolean selectCheck(String tel, Date date);
    
    /**
     * 
     * Description: 保存哈弗医书询问记录的信息   
         * Create at:   2017年7月3日
    	 * @param history
    	 * @return
     */
    Boolean saveChatHistory(ChatHistory history);

}

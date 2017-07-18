/**
 * FileName:     SystemOut.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年4月6日 上午11:44:02
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年4月6日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.service.i;

import com.gb.health.domain.ChatHistory;
import com.gb.health.domain.TbHealthArchive;
import com.gb.health.domain.TbHealthExamination;
import com.gb.health.op.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;


/**
 * @ClassName:     SystemOut.java
 * @Description:   TODO 输出接口 由超杰做实现
 * 
 * @author         Administrator
 * @version        V1.0  
 * @Date           2017年4月6日 上午11:44:02 

 */
public interface SystemOut {
	
/**
 * 
 * Title: getDataByID
 * Description: TODO 获取健康陈述
 * param: @param type
 * param: @param ID
 * param: @return   
 * return: Map<String,String>   
 * throws
 */
	Map<String, String> getDataByID(String type, String ID);
	
	
/**
 * 
 * Title: getLiveScore
 * Description: TODO 获取生活方式积分
 * param: @param idcard
 * param: @return   
 * return: int   
 * throws
 */
	int getLiveScore(String idcard); 
	
	
	
	
	Result<LiveSuggestDetail> getLiveSuggestDetail(String idcard);
	
	
	/**
	 * 
	 * Description: 获取心血管的建议
	     * Create at:   2017年5月4日
		 * @param icvd
		 * @return
	 */
	Result<ICVDsuggest> getICVDresult(ICVD icvd);
	
	/**
	 * 
	 * Description: 获取中心性肥胖的建议
	     * Create at:   2017年5月4日
		 * @param icvd
		 * @return
	 */
	Result<Obesity> getObesityResult(TbHealthArchive healthArchive);
	
	/**
	 * 
	 * Description: 获取指定条件的体检报告信息 
	     * Create at:   2017年5月8日
		 * @param examination
		 * @return
	 */
	List<TbHealthExamination> getHealthExamination(TbHealthExamination examination);
	
	/**
	 * 
	 * Description: 获取指定条件的体检报告信息 
	     * Create at:   2017年5月8日
		 * @param examination	
		 * @return
	 */
	TbHealthExamination getHealthExaminationOne(TbHealthExamination examination);
	
	/**
	 * 
	 * Description:    生成指定公司的Excel表格
	     * Create at:   2017年5月9日
		 * @param comPanyCode
		 * @param response
	 */
	void writeEXCEL(String comPanyCode, HttpServletResponse response)  throws IOException;
	
	/**
	 * 
	 * Description: 获取糖尿病评估的建议   
	     * Create at:   2017年5月16日
		 * @param diabetes
		 * @return
	 */
	Result<DiabetesSuggest> getDiabetesSuggest(Diabetes diabetes);
	
	/**
	 * 
	 * Description:获取脑卒中评估的建议
	     * Create at:   2017年5月22日
		 * @param stroke
		 * @return
	 */
	Result<String> getStrokeSuggest(Stroke stroke);
	
	/**
	 * 
	 * Description: 获取高血压评估的建议 
	     * Create at:   2017年5月22日
		 * @param hypertension
		 * @return
	 */
	Result<HypertensionSuggest> getHypertensionSuggest(Hypertension hypertension);
	
	/**
	 * 
	 * Description: 获取中医体质结果 
	     * Create at:   2017年5月23日
		 * @param personId
		 * @param map
		 * @return
	 */
	Result<String> getChin(String personId, Map<String, Integer> map);
	
	/**
	 * 
	 * Description: 初始化病症查询  
	     * Create at:   2017年6月5日
		 * @return 返回病症名及id
	 */
	List<Map<String, String>> initDisease(String content, int page);
	
	/**
	 * 
	 * Description: 查询下一个症状信息结果 
	     * Create at:   2017年6月5日
		 * @param childNumber
		 * @return
	 */
	Result<ResultDisease> getNextDisease(String childNumber);
	
	/**
	 * 
	 * Description: 查询哈佛医书问询记录列表
	     * Create at:   2017年7月3日
		 * @param personid
		 * @return
	 */
	Page<ChatHistory> getChatHistoryList(String personid, int page);
	
	/**
	 * 
	 * Description: 查询指定一条哈佛医书问询记录的全部信息 
	     * Create at:   2017年7月3日
		 * @param id
		 * @return
	 */
	List<String> getChatHistoryDetail(Integer id);
	
	

}

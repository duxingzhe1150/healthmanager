/**
 * FileName:     SystemOutImpl.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年4月6日 下午2:05:14
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年4月6日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.service.i;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.gb.health.utils.BeanToMapUtil;
import com.gb.health.utils.BuidExcelUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gb.health.algorithm.QuestionCalculate;
import com.gb.health.algorithm.QuestionCalculate.Tzenum;
import com.gb.health.dao.ChatHistoryMapper;
import com.gb.health.dao.TbHealthExaminationMapper;
import com.gb.health.domain.Analysis;
import com.gb.health.domain.ChatHistory;
import com.gb.health.domain.ChatHistoryExample;
import com.gb.health.domain.ChatHistoryExample.Criteria;
import com.gb.health.domain.CiMing;
import com.gb.health.domain.TbHealthArchive;
import com.gb.health.domain.TbHealthExamination;
import com.gb.health.init.ErrerCode;
import com.gb.health.op.Diabetes;
import com.gb.health.op.DiabetesSuggest;
import com.gb.health.op.Hypertension;
import com.gb.health.op.HypertensionSuggest;
import com.gb.health.op.ICVD;
import com.gb.health.op.ICVDsuggest;
import com.gb.health.op.LiveSuggestDetail;
import com.gb.health.op.Obesity;
import com.gb.health.op.Page;
import com.gb.health.op.Result;
import com.gb.health.op.ResultDisease;
import com.gb.health.op.Stroke;
import com.gb.health.service.CiMingService;
import com.gb.health.service.DiseaseService;
import com.gb.health.service.SymptomService;


/**
 * 
 *
 * 简要描述一下这个类
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年7月26日
 */
@Component("systemOutImpl")
public class SystemOutImpl implements SystemOut{
	@Autowired
	OutCacheService outGetDataService;

	private Logger logger=Logger.getLogger(SystemOutImpl.class);

	@Autowired
	OutNoCacheService outNoCacheService;

	@Autowired 
	TbHealthExaminationMapper tbHealthExaminationMapper;

	@Autowired 
	CiMingService ciMingService;

	@Autowired
	private SymptomService symptomService;

	@Autowired
	private DiseaseService diseaseService;

	@Autowired
	ChatHistoryMapper chatHistoryMapper;

	
	@Override
	public Map<String, String> getDataByID(String type, String ID) {
		// TODO Auto-generated method stub
		return outGetDataService.getCacheData(type, ID);
	}

	
	@Override
	public int getLiveScore(String idcard) {

		int score=outNoCacheService.getLiveScore_byCondition(idcard);

		logger.debug("获取健康陈述分数："+score);

		return score;
	}



	
	@Override
	public Result<LiveSuggestDetail> getLiveSuggestDetail(String idcard) {

		Result<LiveSuggestDetail> result=outNoCacheService.getLiveSuggestDetail_byCondition(idcard);

		logger.debug("获取健康陈述建议："+BeanToMapUtil.getCommonBeanMap(result.getResult()));
		//
		return result;

	}

	@Override
	public Result<ICVDsuggest> getICVDresult(ICVD icvd) {

		Result<ICVDsuggest> result=outNoCacheService.getICVDresult(icvd);

		logger.debug(" 获取心血管的建议："+ BeanToMapUtil.getCommonBeanMap(result.getResult()));

		return result;
	}

	@Override
	public Result<Obesity> getObesityResult(TbHealthArchive healthArchive) {

		Result<Obesity> result=outNoCacheService.getObesityResult(healthArchive);

		logger.debug(" 获取中心性肥胖的建议："+BeanToMapUtil.getCommonBeanMap(result.getResult()));

		return result;
	}

	@Override
	public List<TbHealthExamination> getHealthExamination(TbHealthExamination examination) {

		List<TbHealthExamination> result=tbHealthExaminationMapper.selectByCondition(examination);

		logger.debug(" 获取指定条件的体检报告信息：共"+(result==null ? 0 :result.size())+"条结果");

		return result;
	}

	@Override
	public void writeEXCEL(String comPanyCode, HttpServletResponse response) throws IOException {

		OutputStream out=response.getOutputStream();

		List<CiMing> result=ciMingService.getCimingByCompany(comPanyCode);
		System.out.println(result);

		List<LinkedHashMap<String, String>> valueMap=new ArrayList<>();

		for (CiMing ciMing : result) {

			LinkedHashMap<String, String> thisMap=new LinkedHashMap<>();

			thisMap.put("姓名", ciMing.baseinfo.getB_name());
			thisMap.put("性别", ciMing.baseinfo.getB_sex());
			thisMap.put("年龄", ciMing.baseinfo.getB_age());
			thisMap.put("身高", ciMing.generalInspection.getGenerl_height());
			thisMap.put("体重", ciMing.generalInspection.getGenerl_weight());
			thisMap.put("BMI", ciMing.generalInspection.getGenerl_bmi());
			thisMap.put("血压(收）", ciMing.generalInspection.getGenerl_systolic());
			thisMap.put("血压(舒）", ciMing.generalInspection.getGenerl_diastolic());
			thisMap.put("血压(收）复测1", ciMing.generalInspection.getGenerl_systolic1());
			thisMap.put("血压(舒）复测1", ciMing.generalInspection.getGenerl_diastolic1());
			thisMap.put("血压(收）复测2", ciMing.generalInspection.getGenerl_systolic2());
			thisMap.put("血压(舒）复测2", ciMing.generalInspection.getGenerl_diastolic2());
			thisMap.put("心率", ciMing.medical.getMedical_heartrate());
			thisMap.put("空腹血糖", ciMing.biochemicalDetection.getBiochemical_fpg());
			thisMap.put("甘油三脂", ciMing.biochemicalDetection.getBiochemical_tg());
			thisMap.put("总胆固醇", ciMing.biochemicalDetection.getBiochemical_tc());
			thisMap.put("低密度", ciMing.biochemicalDetection.getBiochemical_ldl_cho());
			thisMap.put("高密度", ciMing.biochemicalDetection.getBiochemical_hdl_cho());
			thisMap.put("血尿酸", ciMing.biochemicalDetection.getBiochemical_ua());

			valueMap.add(thisMap);
			System.out.println(thisMap+"ww");

		}

		BuidExcelUtil be=new BuidExcelUtil();

		be.write(valueMap, "体检统计", out);

	}

	@Override
	public TbHealthExamination getHealthExaminationOne(TbHealthExamination examination) {

		List<TbHealthExamination> result=tbHealthExaminationMapper.selectByCondition(examination);

		logger.debug(" 获取指定条件的体检报告信息（单条）：共"+(result==null ? 0 :result.size())+"条结果");

		return result==null ? null :result.get(0);
	}

	@Override
	public Result<DiabetesSuggest> getDiabetesSuggest(Diabetes diabetes) {

		Result<DiabetesSuggest> result=outNoCacheService.getDiabetesResult(diabetes);

		logger.debug(" 获取糖尿病评估的建议："+BeanToMapUtil.getCommonBeanMap(result.getResult()));

		return result;
	}

	@Override
	public Result<String> getStrokeSuggest(Stroke stroke) {
		Result<String> result=outNoCacheService.getStrokeSuggest(stroke);

		logger.debug("获取脑卒中评估的建议 ："+result.getResult());

		return result;
	}

	@Override
	public Result<HypertensionSuggest> getHypertensionSuggest(Hypertension hypertension) {
		Result<HypertensionSuggest> result=outNoCacheService.getHypertensionSuggest(hypertension);

		logger.debug("获取高血压评估的建议："+BeanToMapUtil.getCommonBeanMap(result.getResult()));

		return result;
	}

	@Override
	public Result<String> getChin(String personId, Map<String, Integer> map) {

		Result<String> result=new Result<>();

		if (personId == null) {
			result.setErrer(ErrerCode.ServerErrer.SERVER_CURRENT_API_DATE);

			logger.error("中医体质评估:"+result.getMsg());
			return result;
		}

		int sex=Integer.parseInt(personId.substring(personId.length()-2, personId.length()-1));

		map.put("sex", sex%2);

		QuestionCalculate calculate=new QuestionCalculate(map);



		ArrayList<Tzenum> rList=calculate.getResult();

		if (rList==null || rList.size()<=0) {

			result.setErrer(ErrerCode.ServerErrer.SERVER_CURRENT_API_DATE);

			logger.error("中医体质评估:"+result.getMsg());

			return result;
		}

		result.setErrer(ErrerCode.ServerErrer.SERVER_CURRENT_API_SUCCESS);

		result.setResult(rList.get(0).text);

		logger.debug("获取中医体质结果:"+result.getResult());

		return result;
	}

	@Override
	public List<Map<String, String>> initDisease(String content,int page) {

		List<Map<String, String>> result=diseaseService.selectAll(content , page);

		logger.debug("初始化病症查询 ");

		return result;
	}

	@Override
	public Result<ResultDisease> getNextDisease(String childNumber) {

		Result<ResultDisease> result=new Result<>();

		Analysis resultA=symptomService.selectByNumber(childNumber);

		if (resultA==null) {
			result.setErrer(ErrerCode.ClientErrer.CLIENT_DISEASEID_ERRER);
			logger.error("病症编号不存在："+childNumber);

			return result;
		}

		String child_yes=symptomService.getChildNumId(resultA.getNumber(), true);
		String child_no=symptomService.getChildNumId(resultA.getNumber(), false);

		ResultDisease resultDisease=new ResultDisease();

		if (symptomService.selectByNumber(child_yes)!=null) {

			resultDisease.setChild_yes(child_yes);
			resultDisease.setChild_no(child_no);
			resultDisease.setD_flag("1");
		}else {

			/*String type="00000101"+resultA.getType();

			Disease disease=diseaseService.selectByDisease_number(type);*/

			resultDisease.setChild_yes("0");
			resultDisease.setChild_no("0");
			resultDisease.setD_flag("0");			

		}

		resultDisease.setDescription(resultA.getDescription());

		try {
			logger.error("获取病症信息："+BeanUtils.describe(resultDisease));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		result.setErrer(ErrerCode.ServerErrer.SERVER_CURRENT_API_SUCCESS);
		result.setResult(resultDisease);

		return result;
	}

	@Override
	public Page<ChatHistory> getChatHistoryList(String personid ,int page) {

		ChatHistoryExample example=new ChatHistoryExample();

		Criteria criteria= example.createCriteria();

		example.setOrderByClause("TIME DESC");

		criteria.andPersonidEqualTo(personid);

		List<ChatHistory> list=chatHistoryMapper.selectByExample(example);

		Page<ChatHistory> pageData=new Page<>();

		pageData.setCount(list.size());
		pageData.setNowPage(page);
		pageData.setSize(20);
		pageData.setDataList(list);

		return pageData;
	}

	@Override
	public List<String> getChatHistoryDetail(Integer id) {


		ChatHistory chatHistory=chatHistoryMapper.selectByPrimaryKey(id);

		String content=chatHistory.getChatContent();

		content=content.replace("[", "");
		content=content.replace("]", "");
		content=content.replace("\"", "");

		String[] rr=content.split(",");

		List<String> result=new ArrayList<>();

		result=Arrays.asList(rr);

		return result;
	}

}

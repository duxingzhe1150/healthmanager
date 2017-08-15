package com.gb.health.service.i;

import java.util.Map;

import com.gb.health.utils.BeanToMapUtil;
import com.gb.health.utils.DateTransfer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.health.domain.TbHealthArchive;
import com.gb.health.domain.TbHealthDetails;
import com.gb.health.domain.TbHealthLive;
import com.gb.health.domain.TbHealthState;
import com.gb.health.init.Concat;
import com.gb.health.init.ErrerCode;
import com.gb.health.init.ErrerCode.ServerErrer;
import com.gb.health.op.Diabetes;
import com.gb.health.op.DiabetesSuggest;
import com.gb.health.op.Hypertension;
import com.gb.health.op.HypertensionSuggest;
import com.gb.health.op.ICVD;
import com.gb.health.op.ICVDsuggest;
import com.gb.health.op.LiveSuggestDetail;
import com.gb.health.op.Obesity;
import com.gb.health.op.Result;
import com.gb.health.op.Stroke;
import com.gb.health.algorithm.AbsFactory;
import com.gb.health.algorithm.AsnyFactory;
import com.gb.health.algorithm.DefaultFeture;
import com.gb.health.algorithm.DiabetesQuesAlgorithmAq;
import com.gb.health.algorithm.HypertensionQuesAlgorithmAq;
import com.gb.health.algorithm.ICVDQuesAlgorithmAq;
import com.gb.health.algorithm.LiveQuesAlgorithmAq;
import com.gb.health.algorithm.ObesityQuesAlgorithmAq;
import com.gb.health.algorithm.StrokeQuesAlgorithmAq;
import com.gb.health.dao.TbHealthArchiveMapper;
import com.gb.health.dao.TbHealthDetailsMapper;
import com.gb.health.dao.TbHealthLiveMapper;
import com.gb.health.dao.TbHealthStateMapper;

/**
 * 
 *
 * 不是用缓存服务的数据操作服务层
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年4月18日
 */
@Service("outNoCacheService")
public class OutNoCacheService {
	
	private Logger logger=Logger.getLogger(OutNoCacheService.class);
	
	@Autowired
	TbHealthArchiveMapper tbHealthArchiveMapper;
	
	@Autowired
	TbHealthDetailsMapper tbHealthDetailsMapper;
	
	@Autowired
	TbHealthLiveMapper tbHealthLiveMapper;
	
	@Autowired
	TbHealthStateMapper tbHealthStateMapper;
	
	/**
	 * 
	 * Description:   将指定的对象保存入数据库 
	     * Create at:   2017年4月7日
		 * @return

	 */
	public ServerErrer saveToDB(TbHealthArchive tbHealthArchive, TbHealthDetails tbHealthDetails, TbHealthLive tbHealthLive){
		Map<String, String> map1= BeanToMapUtil.getCommonBeanMap(tbHealthArchive);
		Map<String, String> map2=BeanToMapUtil.getCommonBeanMap(tbHealthDetails);
		Map<String, String> map3=BeanToMapUtil.getCommonBeanMap(tbHealthLive);
		
		map1.putAll(map2);
		map1.putAll(map3);
		System.out.println(map1);
		TbHealthState healthState=new TbHealthState();
		try {
			healthState = (TbHealthState) BeanToMapUtil.mapToObject(map1, TbHealthState.class);
			
			//判断体育锻炼是否为空并设置相应的值
			if (healthState.getlLivesportWay()!=null && "无".equals(healthState.getlLivesportWay())) {
				healthState.setlLivesportCount(0);
				healthState.setlLivesportMinute(0);
				healthState.setlLivesportDayweek(0);
			}
			
		} catch (Exception e) {
			
			logger.error("map转对象是发生错误"+map1);
			
			e.printStackTrace();
		}
		
		System.out.println("bTime:"+healthState.getbTime());
		
		tbHealthStateMapper.updateOrInBycard(healthState);
		
		healthState=tbHealthStateMapper.selectByPersonId(healthState.getbPersonid());
		
		logger.debug("insert:"+BeanToMapUtil.getCommonBeanMap(healthState));
		if (healthState==null) {
			
			
			logger.debug("数据存储错误");
			return  ServerErrer.SERVER_CURRENT_API_OTHER;
		}
		
		if (tbHealthArchive!=null ) {
			
			tbHealthArchive.sethId(healthState.getbId());
			tbHealthArchiveMapper.insert(tbHealthArchive);
			
			logger.debug("insert:"+BeanToMapUtil.getCommonBeanMap(tbHealthArchive));
		}
		
		
		if (tbHealthDetails!=null) {
			tbHealthDetails.setHealthArchiveId(healthState.getbId());
			tbHealthDetailsMapper.insert(tbHealthDetails);
			
			logger.debug("insert:"+BeanToMapUtil.getCommonBeanMap(tbHealthDetails));
		}
		
		if (tbHealthLive!=null) {
			tbHealthLive.setHealthArchiveId(healthState.getbId());
			tbHealthLiveMapper.insert(tbHealthLive);
			
			logger.debug("insert:"+BeanToMapUtil.getCommonBeanMap(tbHealthLive));
		}
		
		return ServerErrer.SERVER_CURRENT_API_SUCCESS;
	}
	
	/**
	 * 
	 * Description: 获取健康陈述分数
	     * Create at:  
		 * @param idcard
		 * update 更改了数据来源表，废弃该方法----2017年6月19日
		 * @return
	 */
	@Deprecated
	public int getLiveScore(String idcard){
		
		TbHealthState healthState=tbHealthStateMapper.selectByPersonId(idcard);
		
		Map<String, String> map=BeanToMapUtil.getCommonBeanMap(healthState);
		
		logger.debug("select:"+map);
		
		if (healthState==null) {
			return -1;
		}
		
		AsnyFactory<TbHealthLive, Integer> fa =new  LiveQuesAlgorithmAq();
		TbHealthLive live=null;
		
		try {
			live=(TbHealthLive) BeanToMapUtil.mapToObject(map, TbHealthLive.class);
		} catch (Exception e) {
			logger.error("map转对象是发生错误"+map);
		}
		
		fa.createAsyn(new DefaultFeture<TbHealthLive>().setParam(live));
		
		return fa.getResult();
		
		
		
	}
	
	/**
	 * 
	 * Description: 获取健康陈述分数-----更改数据来源表   
	     * Create at:   2017年6月19日
		 * @param idcard
		 * @return
	 */
	public int getLiveScore_byCondition(String idcard){
		
		TbHealthLive live=tbHealthLiveMapper.selectByPersonID(idcard);
		
		if (live==null) {
			return -1;
		}
		
		Map<String, String> map=BeanToMapUtil.getCommonBeanMap(live);
		
		logger.debug("select:"+map);
		

		
		AsnyFactory<TbHealthLive, Integer> fa =new  LiveQuesAlgorithmAq();

		
		fa.createAsyn(new DefaultFeture<TbHealthLive>().setParam(live));
		
		return fa.getResult();
		
		
		
	}
	
	/**
	 * 
	 * Description: 获取健康陈述分项建议  
	     * Create at:   2017年4月21日
		 * @param idcard
		 * update 废弃原因：更改了数据来源表
		 * @return
	 */
	@Deprecated
	public Result<LiveSuggestDetail> getLiveSuggestDetail(String idcard) {
		AsnyFactory<TbHealthLive, Integer> fa =new  LiveQuesAlgorithmAq();
		TbHealthState healthState=tbHealthStateMapper.selectByPersonId(idcard);
		
		Result<LiveSuggestDetail> result=Result.newResult();
		
		if (healthState==null) {
			
			logger.error("数据为空");
			result.setErrer(ServerErrer.SERVER_CURRENT_API_FAULT);
			
			return result;
			
		}
		
		Map<String, String> map=BeanToMapUtil.getCommonBeanMap(healthState);
		
		logger.debug("select:"+map);
		
		TbHealthLive live=null;
		
		try {
			live=(TbHealthLive) BeanToMapUtil.mapToObject(map, TbHealthLive.class);
		} catch (Exception e) {
			logger.error("map转对象是发生错误"+map);
		}
		
		fa.createAsyn(new DefaultFeture<TbHealthLive>().setParam(live));
		
		fa.getResult();
		
		LiveSuggestDetail detail=(LiveSuggestDetail) fa.suggest();
		
		if (detail==null) {
			
			logger.error("数据为空");
			result.setErrer(ServerErrer.SERVER_CURRENT_API_FAULT);
		}else{
			result.setResult(detail);
			
		}
		
		return result;
		
	}

	/**
	 * 
	 * Description: 获取健康陈述分项建议-----更改数据来源表     
	     * Create at:   2017年6月19日
		 * @param idcard
		 * @return
	 */
	public Result<LiveSuggestDetail> getLiveSuggestDetail_byCondition(String idcard) {
		AsnyFactory<TbHealthLive, Integer> fa =new  LiveQuesAlgorithmAq();
		//TbHealthState healthState=tbHealthStateMapper.selectByPersonId(idcard);
		
		Result<LiveSuggestDetail> result=Result.newResult();
		
		TbHealthLive live=tbHealthLiveMapper.selectByPersonID(idcard);
		
		if (live==null) {
			
			logger.error("数据为空");
			result.setErrer(ServerErrer.SERVER_CURRENT_API_FAULT);
			
			return result;
			
		}
		
		Map<String, String> map=BeanToMapUtil.getCommonBeanMap(live);
		
		logger.debug("select:"+map);
		
		fa.createAsyn(new DefaultFeture<TbHealthLive>().setParam(live));
		
		fa.getResult();
		
		LiveSuggestDetail detail=(LiveSuggestDetail) fa.suggest();
		
		if (detail==null) {
			
			logger.error("数据为空");
			result.setErrer(ServerErrer.SERVER_CURRENT_API_FAULT);
		}else{
			
			detail.setTime(DateTransfer.dateToString(live.getlTime()));
			
			result.setResult(detail);
			
		}
		
		return result;
		
	}

	/**
	 * 
	 * Description: 心血管建议结果
	     * Create at:   2017年5月4日
		 * @param icvd
		 * @return
	 */
	public Result<ICVDsuggest> getICVDresult(ICVD icvd) {
		
		Result<ICVDsuggest> result=new Result<ICVDsuggest>();
		
		AbsFactory<ICVD, Integer> fa=new ICVDQuesAlgorithmAq();
		
		fa.createAsyn(new DefaultFeture<ICVD>().setParam(icvd));
		
		int r=fa.getResult();
		
		if (r==-10) {
			result.setErrer(ErrerCode.ClientErrer.CLIENT_DATATYPE_ERRER);
			
			return result;
		}else {
			ICVDsuggest dsuggest=new ICVDsuggest();
			dsuggest.setScore(r);
			
			if (icvd.getB_sex()==0) {
				
				//男  判断风险等级，
				if (r<=4) {
					dsuggest.setLevel("低风险");
				}else if (r<=8) {
					dsuggest.setLevel("较低风险");
				}else if (r<=12) {
					dsuggest.setLevel("中度风险");
				}else if (r<=16) {
					dsuggest.setLevel("较高风险");
				}else {
					dsuggest.setLevel("高风险");
				}
				
				//得出风险指数
				if (r<=Concat.RiskIndex.RISKINDEX_M_MIN) {
					dsuggest.setRiskIndex(Concat.RiskIndex.RISKINDEX_M.get(Concat.RiskIndex.RISKINDEX_M_MIN));
				}else if (r>=Concat.RiskIndex.RISKINDEX_M_MAX) {
					dsuggest.setRiskIndex(Concat.RiskIndex.RISKINDEX_M.get(Concat.RiskIndex.RISKINDEX_M_MAX));
				}else {
					dsuggest.setRiskIndex(Concat.RiskIndex.RISKINDEX_M.get(r));
				}
				
			}else {
				//女   判断风险等级，
				if (r<=3) {
					dsuggest.setLevel("低风险");
				}else if (r<=8) {
					dsuggest.setLevel("较低风险");
				}else if (r<=10) {
					dsuggest.setLevel("中度风险");
				}else if (r<=12) {
					dsuggest.setLevel("较高风险");
				}else {
					dsuggest.setLevel("高风险");
				}
				
				//得出风险指数
				if (r<=Concat.RiskIndex.RISKINDEX_W_MIN) {
					dsuggest.setRiskIndex(Concat.RiskIndex.RISKINDEX_W.get(Concat.RiskIndex.RISKINDEX_W_MIN));
				}else if (r>=Concat.RiskIndex.RISKINDEX_W_MAX) {
					dsuggest.setRiskIndex(Concat.RiskIndex.RISKINDEX_W.get(Concat.RiskIndex.RISKINDEX_W_MAX));
				}else {
					dsuggest.setRiskIndex(Concat.RiskIndex.RISKINDEX_W.get(r));
				}
			}
			result.setResult(dsuggest);
			result.setErrer(ServerErrer.SERVER_CURRENT_API_SUCCESS);
			
		}
		
		
		return result;
	}
	
/*	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		OutNoCacheService cacheService=new OutNoCacheService();
		
		ICVD icvd=new ICVD();
		
		icvd.setB_age(3);
		
		icvd.setB_heght(160f);
		
		icvd.setB_weight(130f);
		
		icvd.setB_sex(1);
		
		icvd.setBiochemical_tc(1);
		
		icvd.setDiabetes(0);
		
		icvd.setGenerl_systolic(2);
		
		icvd.setL_smoke_condition(1);
		
		Result<ICVDsuggest> re=cacheService.getICVDresult(icvd);
		
		System.out.println(BeanUtils.describe(re.getResult()));
		
	}*/

	public Result<Obesity> getObesityResult(TbHealthArchive health) {
		
		AbsFactory<TbHealthArchive, Obesity> absFactory=new ObesityQuesAlgorithmAq();
		
		absFactory.createAsyn(new DefaultFeture<TbHealthArchive>().setParam(health));
		
		Obesity obesity=absFactory.getResult();
		
		 Result<Obesity> result=new Result<>();
		
		if (obesity==null) {
			result.setErrer(ErrerCode.ClientErrer.CLIENT_DATATYPE_ERRER);
			logger.error(result.getMsg());
			
			return result;
		}
		
		result.setErrer(ServerErrer.SERVER_CURRENT_API_SUCCESS);
		result.setResult(obesity);
		
		return result;
	}

	/**
	 * 
	 * Description:获取糖尿病评估的建议      
	     * Create at:   2017年5月16日
		 * @param diabetes
		 * @return
	 */
	public Result<DiabetesSuggest> getDiabetesResult(Diabetes diabetes) {
		
		AbsFactory<Diabetes, DiabetesSuggest> absFactory=new DiabetesQuesAlgorithmAq();
		absFactory.createAsyn(new DefaultFeture<Diabetes>().setParam(diabetes));
		
		DiabetesSuggest diabetesSuggest=absFactory.getResult();
		
		Result<DiabetesSuggest> result=new Result<>();
		
		if (diabetesSuggest==null) {
			result.setErrer(ServerErrer.SERVER_CURRENT_API_DATE);
			
			logger.error("糖尿病评估:"+result.getMsg());
			
			return result;
		}
		
		result.setErrer(ServerErrer.SERVER_CURRENT_API_SUCCESS);
		result.setResult(diabetesSuggest);
		
		return result;
	}

	public Result<String> getStrokeSuggest(Stroke stroke) {
		AbsFactory<Stroke, String> absFactory=new StrokeQuesAlgorithmAq();
		absFactory.createAsyn(new DefaultFeture<Stroke>().setParam(stroke));
		
		String strokeResult=absFactory.getResult();
		
		Result<String> result=new Result<>();
		
		if (strokeResult==null) {
			result.setErrer(ServerErrer.SERVER_CURRENT_API_DATE);
			
			logger.error("脑卒中评估:"+result.getMsg());
			
			return result;
		}
		
		result.setErrer(ServerErrer.SERVER_CURRENT_API_SUCCESS);
		result.setResult(strokeResult);
		
		return result;
	}

	public Result<HypertensionSuggest> getHypertensionSuggest(Hypertension hypertension) {
		AbsFactory<Hypertension, HypertensionSuggest> absFactory=new HypertensionQuesAlgorithmAq();
		absFactory.createAsyn(new DefaultFeture<Hypertension>().setParam(hypertension));
		
		HypertensionSuggest hypertensionSuggest=absFactory.getResult();
		
		Result<HypertensionSuggest> result=new Result<>();
		
		if (hypertensionSuggest==null) {
			result.setErrer(ServerErrer.SERVER_CURRENT_API_DATE);
			
			logger.error("高血压评估:"+result.getMsg());
			
			return result;
		}
		
		result.setErrer(ServerErrer.SERVER_CURRENT_API_SUCCESS);
		result.setResult(hypertensionSuggest);
		
		return result;
	}
	
}

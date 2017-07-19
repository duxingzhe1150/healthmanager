package com.gb.health.commend;

import com.gb.health.domain.ChatHistory;
import com.gb.health.domain.TbHealthExamination;
import com.gb.health.init.Const;
import com.gb.health.init.ErrerInterface;
import com.gb.health.op.*;
import com.gb.health.utils.JsonDateValueProcessor;
import com.gb.health.utils.LogRecordInf;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.http.util.TextUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 处理内部输出数据
 * @author lx
 *
 */
public class InterfProcessor {
	LogRecordInf lr =new LogRecordInf(InterfProcessor.class);
	/**
	 * 获取paid版 健康陈述请求结果
	 * @param js
	 * @param result
	 * @return
	 */
	public JSONObject returnPaidData(JSONObject js, int result) {
		JSONObject rep = new JSONObject();
		if (js != null) {
			JSONObject objs=new JSONObject();
			if(result==200){
				objs.accumulate("statu", 0);	
			}else{
				objs.accumulate("statu", 1);	
			}

			rep.accumulate("data", objs);

		}

		rep.accumulate("result", result);
		return rep;
	}

	/**
	 * 获取数据来源结果
	 * @param js
	 * @param result
	 * @param data
	 * @return
	 */
	public JSONObject returnDataSource(JSONObject js, int result,String data) {

		JSONObject rep = new JSONObject();

		JSONObject objs=new JSONObject();

		JSONArray data_json=JSONArray.fromObject(data);

		rep.accumulate("result", 200);	
		rep.accumulate("data", data_json);



		return rep;
	}

	/**
	 * 获取得分
	 * @param js
	 * @param result
	 * @param Score
	 * @param liveSuggestDetail
	 * @return
	 */
	public JSONObject getRespJsonByPersonid(JSONObject js, int result,int Score,LiveSuggestDetail liveSuggestDetail) {
		JSONObject rep=null;
		try {


			 rep = new JSONObject();
			
			lr.interfaceDebug("rep", rep.toString());
			rep.accumulate("result", result);

			if (js != null) {
				js.put("total", Score);
				JSONObject liveSuggest_json=JSONObject.fromObject(liveSuggestDetail);
				liveSuggest_json.remove("l_physical_sport");

				liveSuggest_json.remove("l_physical_sport");
				liveSuggest_json.remove("l_smoke_condition");
				liveSuggest_json.remove("l_drinking_situation");
				liveSuggest_json.remove("l_cognitive_situation");
				liveSuggest_json.remove("l_sleep_situation");
				liveSuggest_json.remove("l_psy_situation");
				liveSuggest_json.remove("l_Personality_test");

				js.accumulate("l_dietary_status", liveSuggest_json);

				JSONObject liveSuggestOther_json=new JSONObject();
				Object[] l_physical_sport =liveSuggestDetail.getL_physical_sport();
				Object[] l_smoke_condition=liveSuggestDetail.getL_smoke_condition();
				Object[] l_drinking_situation=liveSuggestDetail.getL_drinking_situation();
				Object[] l_cognitive_situation=liveSuggestDetail.getL_cognitive_situation();
				Object[] l_psy_situation=liveSuggestDetail.getL_psy_situation();
				Object[] l_Personality_test=liveSuggestDetail.getL_Personality_test();
				Object[] l_sleep_situation=liveSuggestDetail.getL_sleep_situation();
				String liveSuggestDetail_time=liveSuggestDetail.getTime();
				rep.accumulate("time", liveSuggestDetail_time);
				liveSuggestOther_json.accumulate("l_physical_sport", l_physical_sport);
				liveSuggestOther_json.accumulate("l_smoke_condition", l_smoke_condition);
				liveSuggestOther_json.accumulate("l_drinking_situation", l_drinking_situation);
				liveSuggestOther_json.accumulate("l_cognitive_situation", l_cognitive_situation);
				liveSuggestOther_json.accumulate("l_sleep_situation", l_sleep_situation);
				liveSuggestOther_json.accumulate("l_psy_situation", l_psy_situation);
				liveSuggestOther_json.accumulate("l_Personality_test", l_Personality_test);


				js.accumulate("other", liveSuggestOther_json);

				rep.accumulate("data", js);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	//	log.debug("获取分数返回值信息："+rep.toString());
		
		lr.interfaceDebug("获取分数返回值信息", rep.toString());
		
		return rep;
	}
	/**
	 * 返回请求结果
	 * @param errer
	 * @param result
	 * @return
	 */
	public JSONObject getRespJsonByData(String  errer, int result) {
		JSONObject rep = new JSONObject();

		if (!TextUtils.isEmpty(errer)) {
			rep.accumulate("errerMsg", errer);
		}
		rep.accumulate("result", result);
		return rep;
	}

	/**
	 * 返回请求结果
	 * @param errer
	 * @param result
	 * @return
	 */
	public JSONObject getRespJsonByData(ErrerInterface errinterface){

		JSONObject rep = new JSONObject();

		if (errinterface != null) {
			rep.accumulate("errerMsg", errinterface.getMsg());
		}
		rep.accumulate("result", errinterface.getCode());
		return rep;

	}

	/**
	 * 获取 心血管疾病结果
	 * @param status
	 * @param re
	 * @return
	 */
	public JSONObject getResCVD( int status,Result<ICVDsuggest> re){
		JSONObject js=new JSONObject();

		if(re.isSucess()){
			js.accumulate("result", status);
			JSONObject json=new JSONObject();
			json.accumulate("total", re.getResult().getScore());
			json.accumulate("level",re.getResult().getLevel());
			json.accumulate("index", re.getResult().getRiskIndex());
			js.accumulate("data", json);

		}

		return js ;

	}

	/**
	 * 获取肥胖信息结果
	 * @param status
	 * @param re
	 * @return
	 */
	public JSONObject getResFat( int status,Result<Obesity> re){
		JSONObject js=new JSONObject();

		if(re.isSucess()){
			js.accumulate("result", status);
			JSONObject json=new JSONObject();
			json.accumulate("BMI", re.getResult().getBMI());
			json.accumulate("risk",re.getResult().getRisk());
			json.accumulate("level", re.getResult().getLevel());
			js.accumulate("data", json);

		}

		return js ;

	}

	/**
	 * 此方法暂无用途
	 * @param tbHealthExamination
	 * @return
	 */
	public JSONObject getUserInfo( TbHealthExamination tbHealthExamination){
		JSONObject json=new JSONObject();

		String downurl=Const.DOWN_URL+tbHealthExamination.getbFileurl();
		tbHealthExamination.setbFileurl(downurl);		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());
		json = JSONObject.fromObject(tbHealthExamination,jsonConfig);

		//String examinationtime=DateTransfer.dateToStringDate(DateTransfer.stringToDateNoTime((String)job.get("examinationtime")));
		//json.put("examinationtime",examinationtime );
		json.accumulate("data", json);

		System.out.println(json.toString()+"+++++++");

		return json ;


	}

	/**
	 * 获取 糖尿病结果
	 * @param status
	 * @param re
	 * @return
	 */
	public JSONObject	getDiabetesSuggest  ( int status,Result<DiabetesSuggest> re){

		JSONObject js=new JSONObject();

		if(re.isSucess()){
			js.accumulate("result", status);
			JSONObject json=new JSONObject();
			json.accumulate("total", re.getResult().getScore());
			json.accumulate("level",re.getResult().getLevel());
			json.accumulate("index", re.getResult().getRiskIndex());
			js.accumulate("data", json);
		}

		return js ;

	}

	/**
	 * 获取 脑卒中结果
	 * @param status
	 * @param re
	 * @return
	 */
	public JSONObject getStroke(int status, Result<String> re){
		JSONObject js=new JSONObject();
		if(re.isSucess()){
			js.accumulate("result", status);
			JSONObject json=new JSONObject();
			String content=re.getResult();
			json.accumulate("content", content);
			js.accumulate("data", json);
		}

		return js ;
	}

	/**
	 * 获取 高血压结果
	 * @param status
	 * @param result
	 * @param data
	 * @return
	 */
	public JSONObject getHypertension(int status, Result<HypertensionSuggest> re){
		JSONObject js=new JSONObject();

		if(re.isSucess()){
			js.accumulate("result", status);
			JSONObject json=new JSONObject();
			json.accumulate("total", re.getResult().getScore());
			json.accumulate("level",re.getResult().getLevel());
			json.accumulate("index", re.getResult().getRiskIndex());
			js.accumulate("data", json);
		}


		return js ;
	}

	/**
	 * 获取 中医体质结果
	 * @param status
	 * @param result
	 * @param data
	 * @return
	 */
	public JSONObject getChineseMedcine(int status, Result<String> re){
		JSONObject js=new JSONObject();
		if(re.isSucess()){
			js.accumulate("result", status);
			JSONObject json=new JSONObject();
			String content=re.getResult();
			json.accumulate("content", content);
			js.accumulate("data", json);
		}

		return js ;
	}

	/**
	 * 获取 分词 症状 
	 * @param status
	 * @param result
	 * @param data
	 * @return
	 */
	public JSONObject getSymptomWord(int status,List<Map<String, String>> result,JSONObject data){
		JSONObject js=new JSONObject();
		if(data !=null){
			js.accumulate("result", status);
			JSONArray jarr=JSONArray.fromObject(result);
			js.accumulate("data", jarr);

		}

		return js ;
	}	

	/**
	 * 获取 分词 症状 结果
	 * @param status
	 * @param result
	 * @param data
	 * @return
	 */
	public JSONObject getSymptomResult(int status,Result<ResultDisease> result,JSONObject data){
		JSONObject js=new JSONObject();
		if(result.isSucess() && data!=null){
			js.accumulate("result", status);
			JSONObject json=new JSONObject();
			json.accumulate("description", result.getResult().getDescription());
			json.accumulate("child_yes", result.getResult().getChild_yes());
			json.accumulate("child_no", result.getResult().getChild_no());
			json.accumulate("flag", result.getResult().getD_flag());
			js.accumulate("data", json);

		}

		return js ;
	}
	/**
	 * 获取问答记录列表，单条记录结果
	 * @param result
	 * @param li
	 * @return
	 */
	public JSONObject getHarvardAskRecord(int result, Page<ChatHistory> li){
		JSONObject js=new JSONObject();
			js.accumulate("result", result);
			JSONArray json=null;
			
				//json=JSONArray.fromObject(li);
				
				JsonConfig jsonConfig = new JsonConfig();
				jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());
				json = JSONArray.fromObject(li.getDataList(),jsonConfig);
				
			js.accumulate("pagetotal", li.getCountPage());
			js.accumulate("data", json);
		return js ;
		
	}
	
	/**
	 * 获取问答单条记录结果
	 * @param result
	 * @param li
	 * @return
	 */
	public JSONObject getHarvardAskDialog(int result, List<String> li){
		JSONObject js=new JSONObject();
			js.accumulate("result", result);
			JSONArray json=null;
			if(li.size()>0){
				json=JSONArray.fromObject(li);
			}
			js.accumulate("data", json);
		return js ;
		
	}

}

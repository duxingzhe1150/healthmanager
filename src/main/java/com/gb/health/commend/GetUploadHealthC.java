/**
 * FileName:     GetUploadHealthC.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年4月10日 下午2:50:03
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年4月10日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.commend;

import com.gb.health.domain.TbHealthArchive;
import com.gb.health.domain.TbHealthDetails;
import com.gb.health.domain.TbHealthLive;
import com.gb.health.init.Concat;
import com.gb.health.init.Concat.H_Code;
import com.gb.health.init.ErrerCode;
import com.gb.health.init.ErrerCode.ClientErrer;
import com.gb.health.init.HealthEnum.*;
import com.gb.health.service.i.SystemIn;

import com.gb.health.service.i.SystemInImpl;

import com.gb.health.utils.DateTransfer;
import com.gb.health.utils.EnumUtil;
import com.gb.health.utils.JsonUtil;
import com.gb.health.utils.LogRecordInf;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Date;
import java.util.Set;

/**
 * 获取健康陈述请求数据
 * @ClassName:     GetUploadHealthC.java
 * @Description:   TODO
 * 
 * @author         Administrator
 * @version        V1.0  
 * @Date           2017年4月10日 下午2:50:03 

 */
public class GetUploadHealthC extends Commend{
	LogRecordInf lr = new LogRecordInf (GetUploadHealthC.class);
	//private static Logger log = Logger.getLogger(GetUploadHealthC.class);

	private SystemIn systemIn=applicationContext.getBean(SystemInImpl.class);

	public  int index;

	/**
	 * @Title:        GetUploadHealthC
	 * @Description:    TODO
	 * @param:    @param reqDate
	 * @throws

	 */
	public GetUploadHealthC(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
		//systemIn = (SystemIn)mContext.getBean("systemInImpl");
	}

	/**
	 * <p>Title: execut</p>
	 * <p>Description: </p>
	 * @return																											
	 * @throws Exception
	 * @see com.gb.diagnosis.commend.Commend#execut()
	 */
	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub


		return api();

	}

	/**
	 * 分析健康陈述请求数据
	 * @return
	 */
	private JSONObject api(){
		JSONObject json = new JSONObject();
		InterfProcessor inf= new InterfProcessor();
		//判断信息是否万完善标识  index=1    全      index=0  不全
		index=1;
		try{
			//TbHealthArchive  tb1 = getTbHealthArchive();


			JSONObject json2=requestDate;
			String h_code="";
			if(json2.has("h_code")){
				h_code=json2.getString("h_code");
				System.out.println(h_code);
				//log.debug("cmd命令码h_code:"+h_code);
				lr.interfaceInfo("cmd命令码h_code", h_code+"");
			}
			TbHealthArchive  tb1 =null;
			TbHealthDetails  tb2 =null;
			TbHealthLive     tb3 =null;

			//				if(h_code.equals(H_Code.HID_HEALTHY_STATE)){
			//					tb1 = getTbHealthArchive();
			//					tb2 = getTbHealthDetails();
			//					tb3 = getTbHealthLive();
			//				}
			//				else
			if(h_code.equals(H_Code.HID_BASE_INFORMATION)){
				tb1 = getTbHealthArchive();

			}	
			else if(h_code.equals(H_Code.HID_HISTORY)){
				tb2 = getTbHealthDetails();

			}else if(h_code.equals(H_Code.HID_LIFE_STYLE)){

				tb3 = getTbHealthLive();
			}else{
				JSONObject getRespJsonByData_js=inf.getRespJsonByData( "H_Code不存在！", ClientErrer.CLIENT_ERRER.getCode());
				//log.error(getRespJsonByData_js.toString());
				lr.interfaceInfo("健康陈述", getRespJsonByData_js.toString());
				return getRespJsonByData_js;
			}

			ErrerCode.ServerErrer res =systemIn.synData(tb1, tb2, tb3);

			//log.debug("返回值res:"+res.getCode());
			lr.interfaceInfo("健康陈述返回值res", res.getCode()+"");

			if(res.getCode() == Concat.ResultType.SUCCESS&&1==index){
				JSONObject js=getRespJsonByData(json, Concat.ResultType.SUCCESS);
				//log.debug(js);
				lr.interfaceInfo("健康陈述返回", js.toString());
				return	js;
			}else if(0==index&&res.getCode() == Concat.ResultType.SUCCESS){
				JSONObject js=inf.getRespJsonByData("信息不完善",  ClientErrer.CLIENT_LESS_ERRER.getCode());
				//log.debug(js);
				lr.interfaceInfo("健康陈述返回", js.toString());
				return js;
			}else {
				JSONObject js=inf.getRespJsonByData("验证失败", res.getCode());
				lr.interfaceInfo("健康陈述返回", js.toString());
				//log.debug(js);
				return	js;

			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.toString());
			//log.error(e.getMessage(), e);
			lr.interfaceError("健康陈述报错", e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			//log.debug(js.toString());
			lr.interfaceError("健康陈述报错", js.toString());
			return js;

		}	
	}


/**
 * 分析健康陈述中的基本信息请求数据
 * @return
 */

	private TbHealthArchive getTbHealthArchive(){
		TbHealthArchive tbHealthArchive= new TbHealthArchive();

		//requestDate
		JSONObject json2 = JSONObject.fromObject(requestDate);
		try {
			if(json2.has("BaseMessage")==false){
				return tbHealthArchive=null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<String> data_keys=json2.keySet();

		if(json2.has("b_personid")){
			String b_personid=json2.getString("b_personid");
			System.out.println(b_personid);
			tbHealthArchive.setbPersonid(b_personid);;
		}else{
			index=0;
		}
		//				else{
		//					log.debug(ClientErrer.CLIENT_ERRER1.getMsg()+":  "+ClientErrer.CLIENT_ERRER1.getCode());
		//					return null;
		//				}

		JSONObject json=null;
		if(json2.has("BaseMessage")){
			json=(JSONObject) json2.get("BaseMessage");
			System.out.println(json.toString());
			//姓名
			if(json.has("b_name")){
				String b_name=	json.getString("b_name");
				System.out.println(b_name);
				tbHealthArchive.setbName(b_name);
			}else{
				index=0;
			}
			//性别
			if(json.has("b_sex")){
				String b_sex=json.getString("b_sex");
				System.out.println(b_sex);
				tbHealthArchive.setbSex(b_sex);
			}else{
				index=0;
			}
			//民族
			if(json.has("b_nation")){
				String b_nation=json.getString("b_nation");
				System.out.println(b_nation);
				tbHealthArchive.setbNation(b_nation);
			}else{
				index=0;
			}
			//生日	
			if(json.has("b_birthday")){
				String b_birthday=	json.getString("b_birthday");
				System.out.println(b_birthday);
				tbHealthArchive.setbBirthday(DateTransfer.stringToDateNoTime((b_birthday)));
			}else{
				index=0;
			}

			//血型
			if(json.has("b_blood_type")){
				String b_blood_type=json.getString("b_blood_type");
				System.out.println(b_blood_type);
				tbHealthArchive.setbBloodType(b_blood_type);
			}else{
				index=0;
			}

			//身高
			if(json.has("b_height")){        
				String b_heght=json.getString("b_height");
				if(b_heght!=null&&!b_heght.equals("")){
					System.out.println(b_heght);
					tbHealthArchive.setbHeght(Float.valueOf(b_heght));
				}
			}else{
				index=0;
			}
			//体重
			if(json.has("b_weight")){
				String b_weight=json.getString("b_weight");
				if(b_weight!=null&&!b_weight.equals("")){
					System.out.println(b_weight);
					tbHealthArchive.setbWeight(Float.valueOf(b_weight));
				}
			}
			//腰围
			if(json.has("b_waistline")){
				String b_waistline=json.getString("b_waistline");
				if(b_waistline!=null&&!b_waistline.equals("")){
					System.out.println(b_waistline);
					tbHealthArchive.setbWaistline(Float.valueOf(b_waistline));
				}

			}else{
				index=0;
			}


			//电话号
			if(json.has("b_tel")){
				String b_tel=json.getString("b_tel");
				System.out.println(b_tel);
				tbHealthArchive.setbTel(b_tel);
			}

			//身份证号	
			//String b_personid	=	json.getString("b_personid");
			//家属姓名	
			if(json.has("b_relation_name")){
				String b_relation_name=	json.getString("b_relation_name");
				System.out.println(b_relation_name);
				tbHealthArchive.setbRelationName(b_relation_name);
			}

			//家属电话	
			if(json.has("b_relation_tel")){
				String b_relation_tel=	json.getString("b_relation_tel");
				System.out.println(b_relation_tel);
				tbHealthArchive.setbRelationTel(b_relation_tel);
			}else{
				index=0;
			}
			//年龄	
			if(json.has("b_age")){
				int age=	json.getInt("b_age");
				System.out.println(age);
				tbHealthArchive.setbAge(age);
			}else{
				index=0;
			}

			
			//原住址
			if(json.has("b_ago_address")){
				String b_ago_address=json.getString("b_ago_address");
				System.out.println(b_ago_address);
				tbHealthArchive.setOriginal_address(b_ago_address);
			}else{
				index=0;
			}
			//住址
			if(json.has("b_address")){
				String b_address=json.getString("b_address");
				System.out.println(b_address);
				tbHealthArchive.setbAddress(b_address);
			}else{
				index=0;
			}

			//文化程度	
			if(json.has("b_education")){
				String b_education=	json.getString("b_education");
				System.out.println(b_education);
				int b_education1=(int)EnumUtil.getEnumObject(b_education, Education.class).getValueCode();
				//int b_education1=  (int) EnumUtil.getEnumObject(b_education,Education.class).getValueCode();
				System.out.println(b_education1);
				tbHealthArchive.setbEducation(b_education1);
			}else{
				index=0;
			}


			//职业
			if(json.has("b_jobs")){

				//多选改成单选   2017.05.02 11:23
				String b_jobs=	json.getString("b_jobs");
				//JsonUtil.forJson(b_jobs);
				System.out.println(b_jobs);
				tbHealthArchive.setbJobs(b_jobs);
			}else{
				index=0;
			}

			//医保类型	
			if(json.has("b_insurance")){

				//多选改成单选   2017.05.02 11:23            
				String b_insurance_Array=json.getString("b_insurance");
				int b_insurance1= (Integer) EnumUtil.getEnumObject(b_insurance_Array,Insurance.class).getValueCode();
				tbHealthArchive.setbInsurance(b_insurance1);
			}else{
				index=0;
			}

			//婚姻史
			if(json.has("b_marriage")){
				String b_marriage=	json.getString("b_marriage");
				System.out.println(b_marriage);
				int b_marriage1= (Integer) EnumUtil.getEnumObject(b_marriage,Marriage.class).getValueCode();
				System.out.println(b_marriage1);
				tbHealthArchive.setbMarriage(b_marriage1);
			}else{
				index=0;
			}
		}else{
			index=0;
		}



		tbHealthArchive.setbTime(new Date());


		return tbHealthArchive;
	}

/**
 * 分析健康陈述中的健康史请求数据
 * @return
 */
	public  TbHealthDetails getTbHealthDetails() {
		TbHealthDetails tbHealthDetails=new TbHealthDetails();

		JSONObject json2 = JSONObject.fromObject(requestDate);
		try {
			if(json2.has("HealthHistory")==false){
				return tbHealthDetails=null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set< String > set=json2.keySet();
		//长期用药史
		String h_medication="";
		//其它过敏源过敏	
		String h_oth_allergy="";
		//家族病史	
		String h_disease="";
		//接触史	
		String h_conact="";
		//手术和外伤史	
		String h__trauma="";
		for (String data_key : set) {
			JSONObject json=null;
			if(data_key.equals("b_personid")){
				String	b_personid= json2.getString("b_personid");
				tbHealthDetails.setbPersonid(b_personid);
			}
			//				else{
			//					log.debug(ClientErrer.CLIENT_ERRER1.getMsg()+":  "+ClientErrer.CLIENT_ERRER1.getCode());
			//					return null;
			//				}

			if(data_key.equals("HealthHistory")){
				json=(JSONObject) json2.get("HealthHistory");
				System.out.println(json.toString());
				Set<String> HealthHistory_set=json.keySet();
				for (String HealthHistory_key : HealthHistory_set) {
					//过敏史	
					//String h_history_allergic=json.getString("h_history_allergic");	
					//药物过敏史

					if(HealthHistory_key.equals("h_medicine_allergy")){
						JSONArray h_medicine_allergy=json.getJSONArray("h_medicine_allergy");
						JsonUtil.forJson(h_medicine_allergy);
						System.out.println(JsonUtil.forJson(h_medicine_allergy));
						tbHealthDetails.sethMedicineAllergy(JsonUtil.forJson(h_medicine_allergy));
					}


					//食物过敏	
					//String h_food_allergy=	json.getString("h_food_allergy");
					if(HealthHistory_key.equals("h_food_allergy")){
						JSONArray h_food_allergy=json.getJSONArray("h_food_allergy");
						JsonUtil.forJson(h_food_allergy);
						System.out.println(JsonUtil.forJson(h_food_allergy));
						tbHealthDetails.sethFoodAllergy(JsonUtil.forJson(h_food_allergy)); 
					}


					//其它过敏源过敏	
					//String h_oth_allergy="";
					//String h_other_allergy=	json.getString("h_other_allergy");	
					if(HealthHistory_key.equals("h_other_allergy")){
						JSONArray h_other_allergy=	json.getJSONArray("h_other_allergy");
						JsonUtil.forJson(h_other_allergy);
						System.out.println(JsonUtil.forJson(h_other_allergy));
						h_oth_allergy=JsonUtil.forJson(h_other_allergy);
						//tbHealthDetails.sethOtherAllergy(JsonUtil.forJson(h_other_allergy)); 

					}
					//其他
					String h_other_allergy_other="";
					if(HealthHistory_key.equals("h_other_allergy_other")){
						h_other_allergy_other=	json.getString("h_other_allergy_other");

					}
					tbHealthDetails.sethOtherAllergy(h_oth_allergy+h_other_allergy_other);
					//家族病史--------------------------------


					//家族病史	
					//String h_disease="";
					if(HealthHistory_key.equals("h_familial_disease")){
						JSONArray h_familial_disease=	json.getJSONArray("h_familial_disease");
						JsonUtil.forJson(h_familial_disease);
						System.out.println(JsonUtil.forJson(h_familial_disease));
						h_disease=JsonUtil.forJson(h_familial_disease);
						System.out.println(h_disease+"ww");
						//对象1+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
						//tbHealthArchive.sethFamilyHistory(JsonUtil.forJson(h_familial_disease)); 


					}
					//其他
					String h_disease_other="";
					if(HealthHistory_key.equals("h_family_history_other")){
						h_disease_other=	json.getString("h_family_history_other");
					}
					tbHealthDetails.sethFamilialDisease(h_disease+h_disease_other);



					//既往病史--------------------------------

					//既往病史
					//String h_history_past=json.getString("h_history_past");

					//循环系统	
					//String h_history_cycle=	json.getString("h_history_cycle");
					if(HealthHistory_key.equals("h_history_cycle")){
						JSONArray h_history_cycle=	json.getJSONArray("h_history_cycle");
						JsonUtil.forJson(h_history_cycle);
						System.out.println(JsonUtil.forJson(h_history_cycle));
						tbHealthDetails.sethHistoryCycle(JsonUtil.forJson(h_history_cycle));  

					}



					//代谢系统
					//String h_history_metabolism=json.getString("h_history_metabolism");
					if(HealthHistory_key.equals("h_history_metabolism")){
						JSONArray h_history_metabolism=	json.getJSONArray("h_history_metabolism");
						JsonUtil.forJson(h_history_metabolism);
						System.out.println(JsonUtil.forJson(h_history_metabolism));
						tbHealthDetails.sethHistoryMetabolism(JsonUtil.forJson(h_history_metabolism)); 

					}

					//呼吸系统	
					//String h_history_breathe=	json.getString("h_history_breathe");
					if(HealthHistory_key.equals("h_history_breathe")){
						JSONArray h_history_breathe=	json.getJSONArray("h_history_breathe");
						JsonUtil.forJson(h_history_breathe);
						System.out.println(JsonUtil.forJson(h_history_breathe));
						tbHealthDetails.sethHistoryBreathe(JsonUtil.forJson(h_history_breathe)); 
					}

					//消化系统	
					//String h_history_digestive=	json.getString("h_history_digestive");
					if(HealthHistory_key.equals("h_history_digestive")){
						JSONArray h_history_digestive=	json.getJSONArray("h_history_digestive");
						JsonUtil.forJson(h_history_digestive);
						System.out.println(JsonUtil.forJson(h_history_digestive));
						tbHealthDetails.sethHistoryDigestive(JsonUtil.forJson(h_history_digestive)); 
					}


					//泌尿系统	
					//String h_history_urinary=	json.getString("h_history_urinary");
					if(HealthHistory_key.equals("h_history_urinary")){
						JSONArray h_history_urinary=	json.getJSONArray("h_history_urinary");
						JsonUtil.forJson(h_history_urinary);
						System.out.println(JsonUtil.forJson(h_history_urinary));
						tbHealthDetails.sethHistoryUrinary(JsonUtil.forJson(h_history_urinary));
					}

					//血液系统	
					//String h_history_blood=	json.getString("h_history_blood");	
					if(HealthHistory_key.equals("h_history_blood")){
						JSONArray h_history_blood=json.getJSONArray("h_history_blood");
						JsonUtil.forJson(h_history_blood);
						System.out.println(JsonUtil.forJson(h_history_blood));
						tbHealthDetails.sethHistoryBlood(JsonUtil.forJson(h_history_blood));
					}

					//内分泌系统	
					//String h_history_endocrine=	json.getString("h_history_endocrine");
					if(HealthHistory_key.equals("h_history_endocrine")){
						JSONArray h_history_endocrine=json.getJSONArray("h_history_endocrine");
						JsonUtil.forJson(h_history_endocrine);
						System.out.println(JsonUtil.forJson(h_history_endocrine));
						tbHealthDetails.sethHistoryEndocrine(JsonUtil.forJson(h_history_endocrine));
					}

					//神经系统	
					//String h_history_nervous=	json.getString("h_history_nervous");
					if(HealthHistory_key.equals("h_history_nervous")){
						JSONArray h_history_nervous=json.getJSONArray("h_history_nervous");
						JsonUtil.forJson(h_history_nervous);
						System.out.println(JsonUtil.forJson(h_history_nervous));
						tbHealthDetails.sethHistoryNervous(JsonUtil.forJson(h_history_nervous));
					}

					//免疫系统	
					//String h_history_immune=	json.getString("h_history_immune");	

					if(HealthHistory_key.equals("h_history_immune")){
						JSONArray h_history_immune=json.getJSONArray("h_history_immune");
						JsonUtil.forJson(h_history_immune);
						System.out.println(JsonUtil.forJson(h_history_immune));
						tbHealthDetails.sethHistoryImmune(JsonUtil.forJson(h_history_immune));
					}


					//运动系统	
					//String h_history_sports=	json.getString("h_history_sports");	

					if(HealthHistory_key.equals("h_history_sports")){
						JSONArray h_history_sports=json.getJSONArray("h_history_sports");
						JsonUtil.forJson(h_history_sports);
						System.out.println(JsonUtil.forJson(h_history_sports));
						tbHealthDetails.sethHistorySports(JsonUtil.forJson(h_history_sports));
					}

					//风湿类	
					//String h_history_rheumatism=json.getString("h_history_rheumatism");
					if(HealthHistory_key.equals("h_history_rheumatism")){
						JSONArray h_history_rheumatism1=json.getJSONArray("h_history_rheumatism");
						JsonUtil.forJson(h_history_rheumatism1);
						System.out.println(JsonUtil.forJson(h_history_rheumatism1));
						tbHealthDetails.sethHistoryRheumatism(JsonUtil.forJson(h_history_rheumatism1));
					}


					//手术和外伤史-----------------------------------------------

					//手术和外伤史	
					//String h_history_trauma=	json.getString("h_history_trauma");
					//String h__trauma="";
					if(HealthHistory_key.equals("h_history_trauma")){
						JSONArray h_history_trauma=json.getJSONArray("h_history_trauma");
						JsonUtil.forJson(h_history_trauma);
						System.out.println(JsonUtil.forJson(h_history_trauma));
						h__trauma=JsonUtil.forJson(h_history_trauma);
						//	tbHealthDetails.sethTrauma(JsonUtil.forJson(h_history_trauma));
					}
					//其他
					String h__trauma_other="";
					if(HealthHistory_key.equals("h_trauma_other")){
						h__trauma_other=json.getString("h_trauma_other");
					}
					tbHealthDetails.sethTrauma(h__trauma+h__trauma_other);
					//接触史-------------------------------------

					//接触史	
					//String h_conact="";    h_history_conact
					//String h_history_conact=	json.getString("h_history_conact");
					if(HealthHistory_key.equals("h_history_conact")){
						JSONArray h_history_conact=json.getJSONArray("h_history_conact");
						JsonUtil.forJson(h_history_conact);
						System.out.println(JsonUtil.forJson(h_history_conact));
						//tbHealthDetails.sethConact(JsonUtil.forJson(h_history_conact));
						h_conact=JsonUtil.forJson(h_history_conact);
					}
					//其他
					String h_cona_other="";
					if(HealthHistory_key.equals("h_conact_other")){
						h_cona_other=json.getString("h_conact_other");
					}
					tbHealthDetails.sethConact(h_conact+h_cona_other);

					//长期用药史-----------------------------------

					//长期用药史
					//String h_medication="";
					//String h_history_medication=	json.getString("h_history_medication");
					if(HealthHistory_key.equals("h_history_medication")){
						JSONArray h_history_medication=json.getJSONArray("h_history_medication");
						JsonUtil.forJson(h_history_medication);
						System.out.println(JsonUtil.forJson(h_history_medication));
						h_medication=JsonUtil.forJson(h_history_medication);
						//tbHealthDetails.sethMedicationHistory(JsonUtil.forJson(h_history_medication));
					}

					//其他
					String h_medication__other="";
					if(HealthHistory_key.equals("h_medication_history_other")){
						h_medication__other=json.getString("h_medication_history_other");

						//tbHealthDetails.sethTrauma(JsonUtil.forJson(h_history_trauma));
					}
					tbHealthDetails.sethMedicationHistory(h_medication+h_medication__other);
				}
			}

		}

		tbHealthDetails.sethTime(new Date());

		return tbHealthDetails;
	}

/**
 * 分析健康陈述中的生活方式请求数据
 * @return
 */
	public  TbHealthLive getTbHealthLive() {
		TbHealthLive tbHealthLive=new TbHealthLive();

		JSONObject json2 = JSONObject.fromObject(requestDate);
		try {
			if(json2.has("LifeStyle")==false){
				return tbHealthLive=null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JSONObject json=null;
		if(json2.has("b_personid")){
			String b_personid=json2.getString("b_personid");
			tbHealthLive.setbPersonid(b_personid);
		}else{
			index=0;
		}
		//				else{
		//					log.debug(ClientErrer.CLIENT_ERRER1.getMsg()+":  "+ClientErrer.CLIENT_ERRER1.getCode());
		//					return null;
		//				}
		if(json2.has("LifeStyle")){
			json=(JSONObject) json2.get("LifeStyle");
			System.out.println(json.toString());

			String l_liveSport_way="无";


			//				if(json.has("l_physical_exercise")){
			//					String l_physical_exercise=json.getString("l_physical_exercise");	
			//					if("有".equals(l_physical_exercise)){
			//						index=1;
			//锻炼方式

			if(json.has("l_liveSport_way")){
				l_liveSport_way=json.getString("l_liveSport_way");
			}else{
				index=0;
			}

			System.out.println(l_liveSport_way+"---------------------------");
			tbHealthLive.setlLivesportWay(l_liveSport_way);
			System.out.println(l_liveSport_way);

			//每天锻炼次数（次/天）
			if(json.has("l_liveSport_count")){
				int l_liveSport_count=(int)EnumUtil.getEnumObject(json.getString("l_liveSport_count"), L_liveSport_count.class).getValueCode();
				tbHealthLive.setlLivesportCount(l_liveSport_count);
				System.out.println(l_liveSport_count);
			}else{
				index=0;
			}

			//每次锻炼时间（分钟/次）
			if(json.has("l_liveSport_minute")){
				int l_liveSport_minute=(int)EnumUtil.getEnumObject(json.getString("l_liveSport_minute"), L_liveSport_minute.class).getValueCode();
				tbHealthLive.setlLivesportMinute(l_liveSport_minute);

			}else{
				index=0;
			}

			//每周锻炼天数
			if(json.has("l_liveSport_dayWeek")){
				int l_liveSport_dayWeek=Integer.valueOf(json.getString("l_liveSport_dayWeek"));
				tbHealthLive.setlLivesportDayweek(l_liveSport_dayWeek);
				System.out.println(l_liveSport_dayWeek);
			}else{
				index=0;
			}
			//					}
			//				}else{
			//					index=0;
			//				}

			//		//每日活动步数 "步/天"
			if(json.has("l_liveSport_step")){
				int l_liveSport_step=json.getInt("l_liveSport_step");
				tbHealthLive.setlLivesportStep(l_liveSport_step);
				System.out.println(l_liveSport_step);
			}else{
				index=0;
			}


			//
			//		//饮食情况-------------------------------------------
			//		//饮食情况
			//		String l_dietary_status=json.getString("l_dietary_status");

			//		//饮食结构
			if(json.has("l_liveFood_structure")){
				String l_liveFood_structure=json.getString("l_liveFood_structure").trim();
				System.out.println(l_liveFood_structure);
				tbHealthLive.setlLivefoodStructure((Integer) EnumUtil.getEnumObject(l_liveFood_structure, LiveFood_structure.class).getValueCode());

			}else{
				index=0;
			}

			//每日平均摄入食物种类
			if(json.has("l_liveFood_dayKind")){
				String l_liveFood_dayKind=json.getString("l_liveFood_dayKind").trim();
				System.out.println(l_liveFood_dayKind);
				int l_liveFood_dayKind1=(Integer) EnumUtil.getEnumObject(l_liveFood_dayKind,LiveFood_dayKind.class).getValueCode();
				System.out.println(l_liveFood_dayKind1);
				tbHealthLive.setlLivefoodDaykind(l_liveFood_dayKind1);

			}else{
				index=0;
			}

			//		//每周平均摄入食物种类
			if(json.has("l_liveFood_weekKind")){
				String l_liveFood_weekKind=json.getString("l_liveFood_weekKind").trim();
				int l_liveFood_weekKind1=(Integer) EnumUtil.getEnumObject(l_liveFood_weekKind,LiveFood_weekKind.class).getValueCode();
				System.out.println(l_liveFood_weekKind1);
				tbHealthLive.setlLivefoodWeekkind(l_liveFood_weekKind1);

			}else{
				index=0;
			}
			//		//每日平均摄入主食的量
			if(json.has("l_liveFood_primary")){
				String l_liveFood_primary=json.getString("l_liveFood_primary");
				int l_liveFood_primary1=(Integer) EnumUtil.getEnumObject(l_liveFood_primary,LiveFood_primary.class).getValueCode();
				System.out.println(l_liveFood_primary1);
				tbHealthLive.setlLivefoodPrimary(l_liveFood_primary1);
			}else{
				index=0;
			}
			//		//每日平均摄入薯类的量
			if(json.has("l_liveFood_potato")){
				String l_liveFood_potato=json.getString("l_liveFood_potato");
				int l_liveFood_potato1=(Integer) EnumUtil.getEnumObject(l_liveFood_potato,LiveFood_potato.class).getValueCode();
				System.out.println(l_liveFood_potato1);
				tbHealthLive.setlLivefoodPotato(l_liveFood_potato1);
			}else{
				index=0;
			}

			//		//每日平均摄入谷物和杂豆类的量
			if(json.has("l_liveFood_bean")){
				String l_liveFood_bean=json.getString("l_liveFood_bean");
				int l_liveFood_bean1=(Integer) EnumUtil.getEnumObject(l_liveFood_bean,LiveFood_bean.class).getValueCode();
				System.out.println(l_liveFood_bean1);
				tbHealthLive.setlLivefoodBean(l_liveFood_bean1);

			}else{
				index=0;
			}

			//		//每日平均摄入蔬菜的量
			if(json.has("l_liveFood_vegetable")){
				String l_liveFood_vegetable=json.getString("l_liveFood_vegetable");
				int l_liveFood_vegetable1=(Integer) EnumUtil.getEnumObject(l_liveFood_vegetable,LiveFood_vegetable.class).getValueCode();
				System.out.println(l_liveFood_vegetable1);
				tbHealthLive.setlLivefoodVegetable(l_liveFood_vegetable1);
			}else{
				index=0;
			}

			//		//每日平均摄入水果的量
			if(json.has("l_liveFood_fruit")){
				String l_liveFood_fruit=json.getString("l_liveFood_fruit");
				int l_liveFood_fruit1=(Integer) EnumUtil.getEnumObject(l_liveFood_fruit,LiveFood_fruit.class).getValueCode();
				System.out.println(l_liveFood_fruit1);
				tbHealthLive.setlLivefoodFruit(l_liveFood_fruit1);
			}else{
				index=0;
			}

			//		//每日平均摄入奶以及奶制品的量
			if(json.has("l_liveFood_milk")){
				String l_liveFood_milk=json.getString("l_liveFood_milk");
				int l_liveFood_milk1=(Integer) EnumUtil.getEnumObject(l_liveFood_milk,LiveFood_milk.class).getValueCode();
				System.out.println(l_liveFood_milk1);
				tbHealthLive.setlLivefoodMilk(l_liveFood_milk1);
			}else{
				index=0;
			}

			//		//每日平均摄入的大豆及坚果的量
			if(json.has("l_liveFood_nut")){
				String l_liveFood_nut=json.getString("l_liveFood_nut");
				int l_liveFood_nut1=(Integer) EnumUtil.getEnumObject(l_liveFood_nut,LiveFood_nut.class).getValueCode();
				System.out.println(l_liveFood_nut1);
				tbHealthLive.setlLivefoodNut(l_liveFood_nut1);
			}else{
				index=0;
			}

			//		//每日平均摄入的盐的量
			if(json.has("l_liveFood_salt")){
				String l_liveFood_salt=json.getString("l_liveFood_salt");
				int l_liveFood_salt1=(Integer) EnumUtil.getEnumObject(l_liveFood_salt,LiveFood_salt.class).getValueCode();
				System.out.println(l_liveFood_salt1);
				tbHealthLive.setlLivefoodSalt(l_liveFood_salt1);
			}else{
				index=0;
			}

			//		//每日平均摄入的畜禽肉的量
			if(json.has("l_liveFood_meat")){
				String l_liveFood_meat=json.getString("l_liveFood_meat");
				int l_liveFood_meat1=(Integer) EnumUtil.getEnumObject(l_liveFood_meat,LiveFood_meat.class).getValueCode();
				System.out.println(l_liveFood_meat1);
				tbHealthLive.setlLivefoodMeat(l_liveFood_meat1);
			}else{
				index=0;
			}

			//		//每日平均摄入鱼虾的量
			if(json.has("l_liveFood_fish")){
				String l_liveFood_fish=json.getString("l_liveFood_fish");
				int l_liveFood_fish1=(Integer) EnumUtil.getEnumObject(l_liveFood_fish,LiveFood_fish.class).getValueCode();
				System.out.println(l_liveFood_fish1);
				tbHealthLive.setlLivefoodFish(l_liveFood_fish1);
			}else{
				index=0;
			}

			//		//每日平均摄入蛋的量
			if(json.has("l_liveFood_egg")){
				String l_liveFood_egg=json.getString("l_liveFood_egg");
				int l_liveFood_egg1=(Integer) EnumUtil.getEnumObject(l_liveFood_egg,LiveFood_egg.class).getValueCode();
				System.out.println(l_liveFood_egg1);
				tbHealthLive.setlLivefoodEgg(l_liveFood_egg1);
			}else{
				index=0;
			}

			//		//每日平均摄入的油的量

			if(json.has("l_liveFood_oil")){
				String l_liveFood_oil=json.getString("l_liveFood_oil");
				int l_liveFood_oil1=(Integer) EnumUtil.getEnumObject(l_liveFood_oil,LiveFood_oil.class).getValueCode();
				System.out.println(l_liveFood_oil1);
				tbHealthLive.setlLivefoodOil(l_liveFood_oil1);
			}else{
				index=0;
			}

			//		//每日平均摄入的单糖的量
			if(json.has("l_liveFood_sugar")){
				String l_liveFood_sugar=json.getString("l_liveFood_sugar");
				int l_liveFood_sugar1=(Integer) EnumUtil.getEnumObject(l_liveFood_sugar,LiveFood_sugar.class).getValueCode();
				System.out.println(l_liveFood_sugar1);
				tbHealthLive.setlLivefoodSugar(l_liveFood_sugar1);
			}else{
				index=0;
			}

			//		//每日平均饮水量
			if(json.has("l_liveFood_water")){

				String l_liveFood_water=json.getString("l_liveFood_water");
				int l_liveFood_water1=(Integer) EnumUtil.getEnumObject(l_liveFood_water,LiveFood_water.class).getValueCode();
				System.out.println(l_liveFood_water1);
				tbHealthLive.setlLivefoodWater(l_liveFood_water1);
			}

			//
			//		//吸烟情况--------------------------------------------
			//		//吸烟情况
			//String l_smoke_situation=json.getString("l_smoke_situation");
			//		//吸烟状况
			if(json.has("l_smoke_condition")){

				String l_smoke_condition=json.getString("l_smoke_condition").trim();
				int l_smoke_condition1=(Integer) EnumUtil.getEnumObject(l_smoke_condition,Smoke_condition.class).getValueCode();
				System.out.println(l_smoke_condition1);
				tbHealthLive.setlSmokeCondition(l_smoke_condition1);

				if("从不吸烟".equals(l_smoke_condition)){

					//							//工作或者居住的环境有吸烟的吗
					if(json.has("l_smoke_env")){
						String l_smoke_env=json.getString("l_smoke_env");
						int l_smoke_env1=(Integer) EnumUtil.getEnumObject(l_smoke_env,Smoke_env.class).getValueCode();
						System.out.println(l_smoke_env1);
						tbHealthLive.setlSmokeEnv(l_smoke_env1);
					}else{
						index=0;
					}

				}else if("已戒烟".equals(l_smoke_condition)) {
					//		//开始吸烟的年龄
					if(json.has("l_smoke_beginAge")){
						String l_smoke_beginAge=json.getString("l_smoke_beginAge").trim();
						int l_smoke_beginAge1=(Integer) EnumUtil.getEnumObject(l_smoke_beginAge,Smoke_beginAge.class).getValueCode();
						System.out.println(l_smoke_beginAge1);
						tbHealthLive.setlSmokeBeginage(l_smoke_beginAge1);
					}else{
						index=0;
					}

					//		//每天吸烟的支数
					if(json.has("l_smoke_number")){
						String l_smoke_number=json.getString("l_smoke_number");
						int l_smoke_number1=(Integer) EnumUtil.getEnumObject(l_smoke_number,Smoke_number.class).getValueCode();
						System.out.println(l_smoke_number1);
						tbHealthLive.setlSmokeNumber(l_smoke_number1);
						//tbHealthLive.sethso(l_smoke_number1);==============================
					}else{
						index=0;
					}

					//		//如果已经戒烟，开始戒烟的年龄是
					if(json.has("l_smoke_endAge")){
						String l_smoke_endAge=json.getString("l_smoke_endAge");
						int l_smoke_endAge1=(Integer) EnumUtil.getEnumObject(l_smoke_endAge,Smoke_endAge.class).getValueCode();
						System.out.println(l_smoke_endAge1);
						tbHealthLive.setlSmokeEndage(l_smoke_endAge1);
					}else{
						index=0;
					}
					//工作或者居住的环境有吸烟的吗
					if(json.has("l_smoke_env")){
						String l_smoke_env=json.getString("l_smoke_env");
						int l_smoke_env1=(Integer) EnumUtil.getEnumObject(l_smoke_env,Smoke_env.class).getValueCode();
						System.out.println(l_smoke_env1);
						tbHealthLive.setlSmokeEnv(l_smoke_env1);
					}else{
						index=0;
					}

				}else if("吸烟".equals(l_smoke_condition)) {
					if(json.has("l_smoke_beginAge")){
						String l_smoke_beginAge=json.getString("l_smoke_beginAge").trim();
						int l_smoke_beginAge1=(Integer) EnumUtil.getEnumObject(l_smoke_beginAge,Smoke_beginAge.class).getValueCode();
						System.out.println(l_smoke_beginAge1);
						tbHealthLive.setlSmokeBeginage(l_smoke_beginAge1);
					}else{
						index=0;
					}

					//					//每天吸烟的支数
					if(json.has("l_smoke_number")){
						String l_smoke_number=json.getString("l_smoke_number");
						int l_smoke_number1=(Integer) EnumUtil.getEnumObject(l_smoke_number,Smoke_number.class).getValueCode();
						System.out.println(l_smoke_number1);
						tbHealthLive.setlSmokeNumber(l_smoke_number1);
						//tbHealthLive.sethso(l_smoke_number1);==============================
					}else{
						index=0;
					}
					//工作或者居住的环境有吸烟的吗
					if(json.has("l_smoke_env")){
						String l_smoke_env=json.getString("l_smoke_env");
						int l_smoke_env1=(Integer) EnumUtil.getEnumObject(l_smoke_env,Smoke_env.class).getValueCode();
						System.out.println(l_smoke_env1);
						tbHealthLive.setlSmokeEnv(l_smoke_env1);
					}else{
						index=0;
					}
				}else{
					index=0;
				}
			}


			//
			//
			//		//饮酒情况----------------------------------------
			//		//饮酒情况
			//		String l_drinking_situation=json.getString("l_drinking_situation");
			//		//饮酒频率
			if(json.has("l_wine_Hz")){
				String l_wine_Hz=json.getString("l_wine_Hz").trim();
				int l_wine_Hz1=(Integer) EnumUtil.getEnumObject(l_wine_Hz,Wine_Hz.class).getValueCode();
				System.out.println(l_wine_Hz1);
				tbHealthLive.setlWineHz(l_wine_Hz1);

				if("从不".equals(l_wine_Hz)){

					index=1;
				}else if("已戒酒".equals(l_wine_Hz)){

					//							//开始饮酒年龄
					if(json.has("l_wine_beginAge")){

						String l_wine_beginAge=json.getString("l_wine_beginAge").trim();
						int l_wine_beginAge1=(Integer) EnumUtil.getEnumObject(l_wine_beginAge,Wine_beginAge.class).getValueCode();
						System.out.println(l_wine_beginAge1);
						tbHealthLive.setlWineBeginage(l_wine_beginAge1);
					}else{
						index=0;
					}

				}else{
					//							//饮酒种类
					if(json.has("l_wine_kind")){
						String l_wine_kind=json.getString("l_wine_kind");
						int l_wine_kind1=(Integer) EnumUtil.getEnumObject(l_wine_kind,Wine_kind.class).getValueCode();
						System.out.println(l_wine_kind1);
						tbHealthLive.setlWineKind(l_wine_kind1);
					}else{
						index=0;
					}
					//							

					//啤酒
					if(json.has("l_wine_beer")){

						String l_wine_beer=json.getString("l_wine_beer").trim();
						int l_wine_beer1=(Integer) EnumUtil.getEnumObject(l_wine_beer,Wine_beer.class).getValueCode();
						System.out.println(l_wine_beer1);
						tbHealthLive.setlWineBeer(l_wine_beer1);
					}
					//		//白酒
					if(json.has("l_wine_white")){

						String l_wine_white=json.getString("l_wine_white").trim();
						int l_wine_white1=(Integer) EnumUtil.getEnumObject(l_wine_white,Wine_white.class).getValueCode();
						System.out.println(l_wine_white1);
						tbHealthLive.setlWineWhite(l_wine_white1);
					}

					//		//红酒
					if(json.has("l_wine_red")){

						String l_wine_red=json.getString("l_wine_red").trim();
						int l_wine_red1=(Integer) EnumUtil.getEnumObject(l_wine_red,Wine_red.class).getValueCode();
						System.out.println(l_wine_red1);
						tbHealthLive.setlWineRed(l_wine_red1);
					}

					//		//黄酒
					if(json.has("l_wine_yellow")){

						String l_wine_yellow=json.getString("l_wine_yellow").trim();
						int l_wine_yellow1=(Integer) EnumUtil.getEnumObject(l_wine_yellow,Wine_yellow.class).getValueCode();
						System.out.println(l_wine_yellow1);
						tbHealthLive.setlWineYellow(l_wine_yellow1);
					}


					//开始饮酒年龄
					if(json.has("l_wine_beginAge")){

						String l_wine_beginAge=json.getString("l_wine_beginAge").trim();
						int l_wine_beginAge1=(Integer) EnumUtil.getEnumObject(l_wine_beginAge,Wine_beginAge.class).getValueCode();
						System.out.println(l_wine_beginAge1);
						tbHealthLive.setlWineBeginage(l_wine_beginAge1);
					}else{
						index=0;
					}
					//							//饮酒年数
					if(json.has("l_wine_year")){

						String l_wine_year=json.getString("l_wine_year").trim();
						int l_wine_year1=(Integer) EnumUtil.getEnumObject(l_wine_year,Wine_year.class).getValueCode();
						System.out.println(l_wine_year1);
						tbHealthLive.setlWineYear(l_wine_year1);
					}else{
						index=0;
					}	


				}

			}else{
				index=0;
			}



			//
			//		//睡眠状况--------------------------------------------------
			//		//睡眠状况
			//		String l_sleep_situation=json.getString("l_sleep_situation");
			//您每天的睡眠时间是
			if(json.has("l_sleep_time")){

				String l_sleep_time=json.getString("l_sleep_time").trim();
				int l_sleep_time1=(Integer) EnumUtil.getEnumObject(l_sleep_time,Sleep_time.class).getValueCode();
				System.out.println(l_sleep_time1);
				tbHealthLive.setlSleepTime(l_sleep_time1);
			}else{
				index=0;
			}

			//		//每天夜里是否会醒来
			if(json.has("l_sleep_wakeNumber")){

				String l_sleep_wakeNumber=json.getString("l_sleep_wakeNumber").trim();
				int l_sleep_wakeNumber1=(Integer) EnumUtil.getEnumObject(l_sleep_wakeNumber,Sleep_wakeNumber.class).getValueCode();
				System.out.println(l_sleep_wakeNumber1);
				tbHealthLive.setlSleepWakenumber(l_sleep_wakeNumber1);
			}else{
				index=0;
			}
			//		//失眠
			if(json.has("l_sleep_insomnia")){

				String l_sleep_insomnia=json.getString("l_sleep_insomnia");
				int l_sleep_insomnia1=(Integer) EnumUtil.getEnumObject(l_sleep_insomnia,Sleep_insomnia.class).getValueCode();
				System.out.println(l_sleep_insomnia1);
				tbHealthLive.setlSleepInsomnia(l_sleep_insomnia1);
			}else{
				index=0;
			}
			//
			//		//认知情况------------------------------------------------------
			//		//认知情况
			//		String l_cognitive_situation=json.getString("l_cognitive_situation");
			//您的近期记忆有减轻吗
			if(json.has("l_perceive_nearMemory")){

				String l_perceive_nearMemory=json.getString("l_perceive_nearMemory");
				if(l_perceive_nearMemory.equals("有")){
					System.out.println(l_perceive_nearMemory);
					tbHealthLive.setlPerceiveNearmemory(true);
				} else{
					tbHealthLive.setlPerceiveNearmemory(false);
				}
			}else{
				index=0;
			}

			//您的远期记忆有减轻吗
			if(json.has("l_perceive_farMemory")){

				String l_perceive_farMemory=json.getString("l_perceive_farMemory");
				if(l_perceive_farMemory.equals("有")){
					System.out.println(l_perceive_farMemory);
					tbHealthLive.setlPerceiveFarmemory(true);
				} else{
					tbHealthLive.setlPerceiveFarmemory(false);
				}
			}else{
				index=0;
			}


			//		//您的计算能力有下降吗
			if(json.has("l_perceive_calc")){

				String l_perceive_calc=json.getString("l_perceive_calc");
				if(l_perceive_calc.equals("有")){
					System.out.println(l_perceive_calc);
					tbHealthLive.setlPerceiveCalc(true);
				} else{
					tbHealthLive.setlPerceiveCalc(false);
				}
			}else{
				index=0;
			}

			//		//您的定向力（方向感）有下降吗
			if(json.has("l_perceive_direction")){

				String l_perceive_direction=json.getString("l_perceive_direction");
				if(l_perceive_direction.equals("有")){
					System.out.println(l_perceive_direction);
					tbHealthLive.setlPerceiveDirection(true);
				} else{
					tbHealthLive.setlPerceiveDirection(false);
				}
			}else{
				index=0;
			}

			//
			//		//心里情况-------------------------------------------------
			//		//心里情况
			//		String l_psy_situation=json.getString("l_psy_situation");
			//您是否对目前的生活满意吗
			if(json.has("l_psy_live")){
				String l_psy_live=json.getString("l_psy_live");
				if(l_psy_live.equals("是")){
					System.out.println(l_psy_live);
					tbHealthLive.setlPsyLive(true);
				} else{
					tbHealthLive.setlPsyLive(false);
				}
			}else{
				index=0;
			}

			//		//您是否对目前的工作满意
			if(json.has("l_psy_job")){

				String l_psy_job=json.getString("l_psy_job");
				if(l_psy_job.equals("是")){
					System.out.println(l_psy_job);
					tbHealthLive.setlPsyJob(true);
				} else{
					tbHealthLive.setlPsyJob(false);
				}
			}else{
				index=0;
			}


			//		//您是否认为过去一年中自己的工作压力很大
			if(json.has("l_psy_workPress")){

				String l_psy_workPress=json.getString("l_psy_workPress");
				if(l_psy_workPress.equals("是")){
					System.out.println(l_psy_workPress);
					tbHealthLive.setlPsyWorkpress(true);
				} else{
					tbHealthLive.setlPsyWorkpress(false);
				}
			}else{
				index=0;
			}

			//		//您是否认为过去一年中自己的情绪低落或者沮丧
			if(json.has("l_psy_feelLow")){

				String l_psy_feelLow=json.getString("l_psy_feelLow");
				if(l_psy_feelLow.equals("是")){
					System.out.println(l_psy_feelLow);
					tbHealthLive.setlPsyFeellow(true);
				} else{
					tbHealthLive.setlPsyFeellow(false);
				}
			}else{
				index=0;
			}

			//		//您是否认为过去一年中自己的心情烦躁或者焦虑
			if(json.has("l_psy_anxiety")){
				String l_psy_anxiety=json.getString("l_psy_anxiety");
				if(l_psy_anxiety.equals("是")){
					System.out.println(l_psy_anxiety);
					tbHealthLive.setlPsyAnxiety(true);
				} else{
					tbHealthLive.setlPsyAnxiety(false);
				}
			}else{
				index=0;
			}

			//
			//		//性格测试-------------------------------------------------------
			//		//性格测试
			//		String l_Personality_test=json.getString("l_Personality_test");
			//您是属于爱发脾气，遇事着急的吗
			if(json.has("l_Personality_worry")){
				String l_Personality_worry=json.getString("l_Personality_worry");
				if(l_Personality_worry.equals("是")){
					System.out.println(l_Personality_worry);
					tbHealthLive.setlPersonalityWorry(true);
				} else{
					tbHealthLive.setlPersonalityWorry(false);
				}
			}else{
				index=0;
			}

			//		//您是属于不慌不忙，遇事淡定的吗
			if(json.has("l_Personality_calm")){
				String l_Personality_calm=json.getString("l_Personality_calm");
				if(l_Personality_calm.equals("是")){
					System.out.println(l_Personality_calm);
					tbHealthLive.setlPersonalityCalm(true);
				} else{
					tbHealthLive.setlPersonalityCalm(false);
				}
			}else{
				index=0;
			}

			//		//您是属于郁郁寡欢，经常不开心的吗
			if(json.has("l_Personality_unhappy")){
				String l_Personality_unhappy=json.getString("l_Personality_unhappy");
				if(l_Personality_unhappy.equals("是")){
					System.out.println(l_Personality_unhappy);
					tbHealthLive.setlPersonalityUnhappy(true);
				} else{
					tbHealthLive.setlPersonalityUnhappy(false);
				}

			}else{
				index=0;
			}
		}




		tbHealthLive.setlTime(new Date());


		return tbHealthLive;		
	}
	public   JSONObject returnPhp(JSONObject js){
		return  js	;
	}

}

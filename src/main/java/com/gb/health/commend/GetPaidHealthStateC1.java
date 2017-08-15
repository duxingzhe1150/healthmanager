package com.gb.health.commend;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.gb.health.domain.TbHealthArchive;
import com.gb.health.domain.TbHealthDetails;
import com.gb.health.domain.TbHealthLive;
import com.gb.health.domain.TbHealthRecord;
import com.gb.health.init.Concat;
import com.gb.health.init.ErrerCode;
import com.gb.health.init.Concat.H_Code;
import com.gb.health.init.Const;
import com.gb.health.init.HealthEnum.Education;
import com.gb.health.init.HealthEnum.Insurance;
import com.gb.health.init.HealthEnum.L_liveSport_count;
import com.gb.health.init.HealthEnum.L_liveSport_minute;
import com.gb.health.init.HealthEnum.LiveFood_bean;
import com.gb.health.init.HealthEnum.LiveFood_dayKind;
import com.gb.health.init.HealthEnum.LiveFood_egg;
import com.gb.health.init.HealthEnum.LiveFood_fish;
import com.gb.health.init.HealthEnum.LiveFood_fruit;
import com.gb.health.init.HealthEnum.LiveFood_meat;
import com.gb.health.init.HealthEnum.LiveFood_milk;
import com.gb.health.init.HealthEnum.LiveFood_nut;
import com.gb.health.init.HealthEnum.LiveFood_oil;
import com.gb.health.init.HealthEnum.LiveFood_potato;
import com.gb.health.init.HealthEnum.LiveFood_primary;
import com.gb.health.init.HealthEnum.LiveFood_salt;
import com.gb.health.init.HealthEnum.LiveFood_structure;
import com.gb.health.init.HealthEnum.LiveFood_sugar;
import com.gb.health.init.HealthEnum.LiveFood_vegetable;
import com.gb.health.init.HealthEnum.LiveFood_water;
import com.gb.health.init.HealthEnum.LiveFood_weekKind;
import com.gb.health.init.HealthEnum.Marriage;
import com.gb.health.init.HealthEnum.Sleep_insomnia;
import com.gb.health.init.HealthEnum.Sleep_time;
import com.gb.health.init.HealthEnum.Sleep_wakeNumber;
import com.gb.health.init.HealthEnum.Smoke_beginAge;
import com.gb.health.init.HealthEnum.Smoke_condition;
import com.gb.health.init.HealthEnum.Smoke_endAge;
import com.gb.health.init.HealthEnum.Smoke_env;
import com.gb.health.init.HealthEnum.Smoke_number;
import com.gb.health.init.HealthEnum.Wine_Hz;
import com.gb.health.init.HealthEnum.Wine_beer;
import com.gb.health.init.HealthEnum.Wine_beginAge;
import com.gb.health.init.HealthEnum.Wine_drunk;
import com.gb.health.init.HealthEnum.Wine_endAge;
import com.gb.health.init.HealthEnum.Wine_kind;
import com.gb.health.init.HealthEnum.Wine_red;
import com.gb.health.init.HealthEnum.Wine_white;
import com.gb.health.init.HealthEnum.Wine_year;
import com.gb.health.init.HealthEnum.Wine_yellow;
import com.gb.health.service.TbHealthRecoedService;
import com.gb.health.service.i.SystemIn;

import com.gb.health.service.i.SystemInImpl;
import com.gb.health.utils.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 获取健康陈述请求数据（paid版）
 * @author lx
 *
 */
public class GetPaidHealthStateC1  extends Commend {


	LogRecordInf lr = new LogRecordInf (GetPaidHealthStateC1.class);
	//private static Logger log = Logger.getLogger(GetPaidHealthStateC.class);

	private SystemIn systemIn;
	private TbHealthRecoedService tbHealthRecordm;


	public GetPaidHealthStateC1(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
//		systemIn = (SystemIn)mContext.getBean("systemInImpl");
//		tbHealthRecordm = (TbHealthRecoedService)mContext.getBean("tbHealthRecoedService");
		systemIn=applicationContext.getBean(SystemInImpl.class);
		tbHealthRecordm=applicationContext.getBean(TbHealthRecoedService.class);
	}



	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub

		return api();

	}

	/**
	 * 对健康陈述请求数据分析处理（paid版）
	 * @return
	 */
	private JSONObject api(){
		JSONObject json = new JSONObject();
		InterfProcessor inf= new InterfProcessor();
		try{
			String b_personid="";
			JSONObject all_json =new JSONObject();
			LinkedHashMap<Object, String> map= ReadXml.getLifeStyle();
			//
			//			for (Object ma : map.keySet()) {
			//
			//				System.out.println("key:"+ma +"      value:"+map.get(ma));
			//			}

			JSONObject datajson=new JSONObject();

			String h_code="";
			if(requestDate.has("h_code")){
				h_code=requestDate.getString("h_code");
				System.out.println(h_code);
				datajson.put("h_code", h_code);
				//	log.debug("cmd命令码h_code:"+h_code);
				lr.interfaceDebug("cmd命令码h_code", h_code+"");
			}
			TbHealthArchive  tb1 =null;
			TbHealthDetails  tb2 =null;
			TbHealthLive     tb3 =null;

			if(h_code.equals(H_Code.HID_HEALTHY_STATE)){
				if(requestDate.has("b_personid")){
					datajson.put("b_personid", requestDate.get("b_personid"));
					b_personid=(String) requestDate.get("b_personid");
				}
				if(requestDate.has("longitude")){
					datajson.put("longitude", requestDate.get("longitude"));
				}
				if(requestDate.has("latitude")){

					datajson.put("latitude", requestDate.get("latitude"));
				}
				if(requestDate.has("sep_persionid")){
					datajson.put("sep_persionid", requestDate.get("sep_persionid"));

				}
				if(requestDate.has("sep_name")){
					datajson.put("sep_name", requestDate.get("sep_name"));

				}

				if(requestDate.has("channelNo")){
					datajson.put("channelNo", requestDate.get("channelNo"));

				}

				tb1 = getTbHealthArchive(datajson,map);
				tb2 = getTbHealthDetails(datajson,map);
				tb3 = getTbHealthLive(datajson,map);

				tb1.setbPersonid(b_personid);
				tb2.setbPersonid(b_personid);
				tb3.setbPersonid(b_personid);

				requestDate.remove("BaseMessage");
				requestDate.remove("HealthHistory");
				requestDate.remove("LifeStyle");

				JSONObject head_json =new JSONObject();

				head_json.put("vercode", 1);

				all_json.put("cmd","uploadHealth_Paid");

				all_json.put("head", head_json);

				all_json.put("data", datajson);

				System.out.println("all_json++++++::::"+all_json.toString());

			}else{
				JSONObject getRespJsonByData_js=inf.getRespJsonByData( "H_Code不存在！",ErrerCode.ClientErrer.CLIENT_ERRER.getCode());
				//	log.error(getRespJsonByData_js.toString());

				lr.interfaceInfo("paid端", getRespJsonByData_js.toString());
				return getRespJsonByData_js;
			}


			ErrerCode.ServerErrer res =systemIn.synData(tb1, tb2, tb3);

			String back= PostJson.sendCiMingData(all_json,Const.PAID_URL );
			lr.interfaceInfo("paid_rdis_back", back);

			TbHealthRecord tbHealthRecord =new TbHealthRecord();
			tbHealthRecord.setSendData(all_json.toString());
			tbHealthRecord.setSendReturn(back);
			tbHealthRecord.setSendTime(new Date());
			tbHealthRecord.setSendUrl(Const.PAID_URL);
			tbHealthRecord.setTypeName("PaidHealthData");

			if(back!=null&&!back.equals("")){


				JSONObject jso=JSONObject.fromObject(back);

				int errmsg=0;
				if(jso.has("errmsg")){
					if("success".equals(jso.get("errmsg"))){
						errmsg=1;
					}else{
						errmsg=0;
					}
				}

				tbHealthRecord.setSendStatus(errmsg);
			}
			tbHealthRecordm.insert(tbHealthRecord);

			//log.debug("返回值res:"+res.getCode());
			lr.interfaceInfo("返回值res", res.getCode()+"");
			lr.interfaceInfo("Paid_phpBack", back);
		//	log.debug("Paid_phpBack:"+back);


			if(res.getCode() == Concat.ResultType.SUCCESS){
				JSONObject js=inf.returnPaidData(json, Concat.ResultType.SUCCESS);
				//log.debug(js);
				lr.interfaceInfo("paid端", js.toString());
				return	js;
			}else {
				JSONObject js=inf.returnPaidData(json, res.getCode());
				lr.interfaceInfo("paid端", js.toString());
				//log.debug(js);
				return	js;

			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.toString());
			//log.error(e.getMessage(), e);
			lr.interfaceInfo("paid端报错", e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			//log.debug(js.toString());
			lr.interfaceInfo("paid端报错", js.toString());
			return js;

		}	
	}



	/**
	 * 分析健康陈述中的基本信息
	 * @param js
	 * @param map
	 * @return
	 */
	private TbHealthArchive getTbHealthArchive(JSONObject js, Map map){
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

		JSONObject json_BaseMessage=new JSONObject();
		Set<String> data_keys=json2.keySet();
		for (String data_key : data_keys) {
			if(data_key.equals("b_personid")){
				String b_personid=json2.getString("b_personid");
				System.out.println(b_personid);
				//	tbHealthArchive.setbPersonid(b_personid);
				json_BaseMessage.put("b_personid", b_personid);
			}

			JSONObject json=null;

			if(data_key.equals("BaseMessage")){
				json=(JSONObject) json2.get("BaseMessage");
				System.out.println(json.toString());

				Set <String>BaseMessage_keys=json.keySet();	
				for (String key : BaseMessage_keys) {
					//姓名
					if(key.equals("b_name")){
						String b_name=	json.getString("b_name");
						System.out.println(b_name);
						tbHealthArchive.setbName(b_name);
						json_BaseMessage.put("b_name", b_name);
					}
					//性别
					if(key.equals("b_sex")){
						String b_sex=json.getString("b_sex");
						System.out.println(b_sex);
						tbHealthArchive.setbSex(b_sex);
						json_BaseMessage.put("b_sex", b_sex);
					}
					//民族
					if(key.equals("b_nation")){
						String b_nation=json.getString("b_nation");
						System.out.println(b_nation);
						tbHealthArchive.setbNation(b_nation);
						json_BaseMessage.put("b_nation", b_nation);
					}
					//生日	
					if(key.equals("b_birthday")){
						String b_birthday=	json.getString("b_birthday");
						System.out.println(b_birthday);
						tbHealthArchive.setbBirthday(DateTransfer.stringToDateNoTime((b_birthday)));
						json_BaseMessage.put("b_birthday", b_birthday);
					}

					//血型
					if(key.equals("b_blood_type")){
						String b_blood_type=json.getString("b_blood_type");
						System.out.println(b_blood_type);
						tbHealthArchive.setbBloodType(b_blood_type);
						//json_BaseMessage.put("b_blood_type", map.get("b_blood_type"+b_blood_type));
						json_BaseMessage.put("b_blood_type", b_blood_type);
					}

					//身高
					if(key.equals("b_height")){        
						String b_heght=json.getString("b_height");
						if(b_heght!=null&&!b_heght.equals("")){
							System.out.println(b_heght);
							tbHealthArchive.setbHeght(Float.valueOf(b_heght));
							json_BaseMessage.put("b_height", b_heght);
						}
					}
					//体重
					if(key.equals("b_weight")){
						String b_weight=json.getString("b_weight");
						if(b_weight!=null&&!b_weight.equals("")){
							System.out.println(b_weight);
							tbHealthArchive.setbWeight(Float.valueOf(b_weight));
							json_BaseMessage.put("b_weight", b_weight);
						}
					}
					//腰围
					if(key.equals("b_waistline")){
						String b_waistline=json.getString("b_waistline");
						if(b_waistline!=null&&!b_waistline.equals("")){
							System.out.println(b_waistline);
							tbHealthArchive.setbWaistline(Float.valueOf(b_waistline));
							json_BaseMessage.put("b_waistline", b_waistline);
						}

					}


					//电话号
					if(key.equals("b_tel")){
						String b_tel=json.getString("b_tel");
						System.out.println(b_tel);
						tbHealthArchive.setbTel(b_tel);
						json_BaseMessage.put("b_tel", b_tel);
					}

					//身份证号	
					//String b_personid	=	json.getString("b_personid");
					//家属姓名	
					if(key.equals("b_relation_name")){
						String b_relation_name=	json.getString("b_relation_name");
						System.out.println(b_relation_name);
						tbHealthArchive.setbRelationName(b_relation_name);
						json_BaseMessage.put("b_relation_name", b_relation_name);
					}

					//家属电话	
					if(key.equals("b_relation_tel")){
						String b_relation_tel=	json.getString("b_relation_tel");
						System.out.println(b_relation_tel);
						tbHealthArchive.setbRelationTel(b_relation_tel);
						json_BaseMessage.put("b_relation_tel",b_relation_tel);
					}
					//年龄	
					if(key.equals("b_age")){
						int age=json.getInt("b_age");
						System.out.println(age);
						tbHealthArchive.setbAge(age);
						json_BaseMessage.put("b_age", age);
					}

					//住址
					if(key.equals("b_address")){
						String b_address=json.getString("b_address");
						System.out.println(b_address);
						tbHealthArchive.setbAddress(b_address);
						json_BaseMessage.put("b_address", map.get("b_address"+b_address));
					}

					//文化程度	
					if(key.equals("b_education")){
						String b_education=	json.getString("b_education");
						System.out.println(b_education);
						int b_education1=(int)EnumUtil.getEnumObject(b_education, Education.class).getValueCode();
						System.out.println(b_education1);
						tbHealthArchive.setbEducation(b_education1);
						json_BaseMessage.put("b_education", map.get("b_education"+b_education));
					}


					//职业
					if(key.equals("b_jobs")){

						String b_jobs=	json.getString("b_jobs");
						System.out.println(b_jobs);
						tbHealthArchive.setbJobs(b_jobs);
						json_BaseMessage.put("b_jobs", map.get("b_jobs"+b_jobs));
					}

					//医保类型	
					if(key.equals("b_insurance")){

						String b_insurance_Array=json.getString("b_insurance");
						int b_insurance1= (Integer) EnumUtil.getEnumObject(b_insurance_Array,Insurance.class).getValueCode();
						tbHealthArchive.setbInsurance(b_insurance1);
						json_BaseMessage.put("b_insurance", map.get("b_insurance"+b_insurance_Array));	
					}

					//省

					if(key.equals("b_province")){

						String b_province=json.getString("b_province");
						//						int b_insurance1= (Integer) EnumUtil.getEnumObject(b_insurance_Array,Insurance.class).getValueCode();
						//						tbHealthArchive.setbInsurance(b_insurance1);
						//						json_BaseMessage.put("b_insurance", map.get("b_insurance"+b_insurance_Array));	
						tbHealthArchive.setProvince(b_province);
					}

					//市
					if(key.equals("b_city")){

						String b_city=json.getString("b_city");
						//						int b_insurance1= (Integer) EnumUtil.getEnumObject(b_insurance_Array,Insurance.class).getValueCode();
						//						tbHealthArchive.setbInsurance(b_insurance1);
						//						json_BaseMessage.put("b_insurance", map.get("b_insurance"+b_insurance_Array));	
						tbHealthArchive.setCity(b_city);
					}

					//县
					if(key.equals("b_county")){

						String b_county=json.getString("b_county");
						//						int b_insurance1= (Integer) EnumUtil.getEnumObject(b_insurance_Array,Insurance.class).getValueCode();
						//						tbHealthArchive.setbInsurance(b_insurance1);
						//						json_BaseMessage.put("b_insurance", map.get("b_insurance"+b_insurance_Array));	

						tbHealthArchive.setCounty(b_county);
					}

					//原住址
					if(key.equals("b_original_address")){

						String b_original_address=json.getString("b_original_address");
						//						int b_insurance1= (Integer) EnumUtil.getEnumObject(b_insurance_Array,Insurance.class).getValueCode();
						//						tbHealthArchive.setbInsurance(b_insurance1);
						//						json_BaseMessage.put("b_insurance", map.get("b_insurance"+b_insurance_Array));	
						tbHealthArchive.setOriginal_address(b_original_address);
					}


					//婚姻史
					if(key.equals("b_marriage")){
						String b_marriage=	json.getString("b_marriage");
						System.out.println(b_marriage);
						int b_marriage1= (Integer) EnumUtil.getEnumObject(b_marriage,Marriage.class).getValueCode();
						System.out.println(b_marriage1);
						tbHealthArchive.setbMarriage(b_marriage1);
						json_BaseMessage.put("b_marriage", map.get("b_marriage"+b_marriage));
					}
				}
			}
		}

		tbHealthArchive.setbTime(new Date());

		js.put("BaseMessage", json_BaseMessage);

		return tbHealthArchive;
	}

	/**
	 * 分析健康陈述中的健康史
	 * @param js
	 * @param map
	 * @return
	 */
	public  TbHealthDetails getTbHealthDetails(JSONObject js, Map map) {
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


		//既往病史    有  无
		String h_history_past="false";
		//长期用药史    有  无
		String h_medication_title="false";
		//过敏史  有  无
		String h_allergy="false";
		//家族病史	   有  无
		String h_familial="false";
		//接触史	 有  无
		String h_history_conact_title="false";
		//手术和外伤史	 有  无
		String h_trauma_title="false";


		JSONObject json_HealthHistory=new JSONObject();
		for (String data_key : set) {
			JSONObject json=null;
			//			if(data_key.equals("b_personid")){
			//				String	b_personid= json2.getString("b_personid");
			//				tbHealthDetails.setbPersonid(b_personid);
			//				js.put("b_personid", b_personid);
			//			}
			if(data_key.equals("HealthHistory")){

				json=(JSONObject) json2.get("HealthHistory");
				System.out.println(json.toString());
				Set<String> HealthHistory_set=json.keySet();
				for (String HealthHistory_key : HealthHistory_set) {
					//过敏史	
					h_allergy=json.getString("h_allergy");
					if("有".equals(h_allergy)){
						json_HealthHistory.put("h_allergy", "true");
						//药物过敏史
						if(HealthHistory_key.equals("h_medicine_allergy")){
							JSONArray h_medicine_allergy=JsonUtil.forPaidJson(json.getJSONArray("h_medicine_allergy"), map,"h_medicine_allergy");
							json_HealthHistory.put("h_medicine_allergy", h_medicine_allergy);
							tbHealthDetails.sethMedicineAllergy(JsonUtil.forJson(json.getJSONArray("h_medicine_allergy")));
						}

						//食物过敏	
						//String h_food_allergy=	json.getString("h_food_allergy");
						if(HealthHistory_key.equals("h_food_allergy")){
							JSONArray h_food_allergy=JsonUtil.forPaidJson(json.getJSONArray("h_food_allergy"), map,"h_food_allergy");
							json_HealthHistory.put("h_food_allergy", h_food_allergy);
							tbHealthDetails.sethFoodAllergy(JsonUtil.forJson(json.getJSONArray("h_food_allergy"))); 
						}


						//其它过敏源过敏	
						//String h_oth_allergy="";
						//String h_other_allergy=	json.getString("h_other_allergy");	
						if(HealthHistory_key.equals("h_other_allergy")){
							JSONArray h_other_allergy=JsonUtil.forPaidJson(json.getJSONArray("h_other_allergy"), map,"h_other_allergy");
							json_HealthHistory.put("h_other_allergy", h_other_allergy);
							h_oth_allergy=JsonUtil.forJson(json.getJSONArray("h_other_allergy"));
						}
						//其他
						String h_other_allergy_other="";
						if(HealthHistory_key.equals("h_other_allergy_other")){
							h_other_allergy_other=	json.getString("h_other_allergy_other");
							json_HealthHistory.put("h_other_allergy_other", h_other_allergy_other);
							tbHealthDetails.sethOtherAllergy(h_oth_allergy+h_other_allergy_other);
						}

					}else{
						json_HealthHistory.put("h_allergy", "false");
					}


					//家族病史--------------------------------
					//家族病史	
					h_familial=json.getString("h_familial");

					if("有".equals(h_familial)){

						json_HealthHistory.put("h_familial", "true");
						if(HealthHistory_key.equals("h_familial_disease")){
							JSONArray h_familial_disease=JsonUtil.forPaidJson(json.getJSONArray("h_familial_disease"), map,"h_familial_disease");
							json_HealthHistory.put("h_familial_disease", h_familial_disease);
							h_disease=JsonUtil.forJson(json.getJSONArray("h_familial_disease"));
							System.out.println(h_disease+"ww");
						}
						//其他
						String h_disease_other="";
						if(HealthHistory_key.equals("h_family_history_other")){
							h_disease_other=json.getString("h_family_history_other");
							json_HealthHistory.put("h_family_history_other", h_disease_other);
						}
						tbHealthDetails.sethFamilialDisease(h_disease+h_disease_other);
					}else{
						json_HealthHistory.put("h_familial", "false");
					}


					//既往病史--------------------------------
					//既往病史
					h_history_past=json.getString("h_history_past");
					if("有".equals(h_history_past)){
						//循环系统	
						//String h_history_cycle=	json.getString("h_history_cycle");

						json_HealthHistory.put("h_history_past", "true");
						if(HealthHistory_key.equals("h_history_cycle")){
							JSONArray h_history_cycle=JsonUtil.forPaidJson(json.getJSONArray("h_history_cycle"), map,"h_history_cycle");
							json_HealthHistory.put("h_history_cycle", h_history_cycle);
							tbHealthDetails.sethHistoryCycle(JsonUtil.forJson(json.getJSONArray("h_history_cycle")));  

						}

						//代谢系统
						//String h_history_metabolism=json.getString("h_history_metabolism");
						if(HealthHistory_key.equals("h_history_metabolism")){

							JSONArray h_history_metabolism=JsonUtil.forPaidJson(json.getJSONArray("h_history_metabolism"), map,"h_history_metabolism");
							json_HealthHistory.put("h_history_metabolism", h_history_metabolism);
							tbHealthDetails.sethHistoryMetabolism(JsonUtil.forJson(json.getJSONArray("h_history_metabolism"))); 

						}

						//呼吸系统	
						//String h_history_breathe=	json.getString("h_history_breathe");
						if(HealthHistory_key.equals("h_history_breathe")){
							JSONArray h_history_breathe=JsonUtil.forPaidJson(json.getJSONArray("h_history_breathe"), map,"h_history_breathe");
							json_HealthHistory.put("h_history_breathe", h_history_breathe);
							tbHealthDetails.sethHistoryBreathe(JsonUtil.forJson(json.getJSONArray("h_history_breathe"))); 
						}

						//消化系统	
						//String h_history_digestive=	json.getString("h_history_digestive");
						if(HealthHistory_key.equals("h_history_digestive")){
							JSONArray h_history_digestive= JsonUtil.forPaidJson(json.getJSONArray("h_history_digestive"), map,"h_history_digestive");
							json_HealthHistory.put("h_history_digestive", h_history_digestive);
							tbHealthDetails.sethHistoryDigestive(JsonUtil.forJson(json.getJSONArray("h_history_digestive"))); 
						}
						//泌尿系统	
						//String h_history_urinary=	json.getString("h_history_urinary");
						if(HealthHistory_key.equals("h_history_urinary")){
							JSONArray h_history_urinary=JsonUtil.forPaidJson(json.getJSONArray("h_history_urinary"), map,"h_history_urinary");
							json_HealthHistory.put("h_history_urinary", h_history_urinary);
							tbHealthDetails.sethHistoryUrinary(JsonUtil.forJson(json.getJSONArray("h_history_urinary")));
						}
						//血液系统	
						//String h_history_blood=	json.getString("h_history_blood");	
						if(HealthHistory_key.equals("h_history_blood")){
							JSONArray h_history_blood=JsonUtil.forPaidJson(json.getJSONArray("h_history_blood"), map,"h_history_blood");
							json_HealthHistory.put("h_history_blood", h_history_blood);
							tbHealthDetails.sethHistoryBlood(JsonUtil.forJson(json.getJSONArray("h_history_blood")));
						}

						//内分泌系统	
						//String h_history_endocrine=	json.getString("h_history_endocrine");
						if(HealthHistory_key.equals("h_history_endocrine")){
							JSONArray h_history_endocrine=json.getJSONArray("h_history_endocrine");
							JSONArray h_history_endocrine1=JsonUtil.forPaidJson(json.getJSONArray("h_history_endocrine"), map,"h_history_endocrine");

							json_HealthHistory.put("h_history_endocrine", h_history_endocrine1);
							JsonUtil.forJson(h_history_endocrine);
							System.out.println(JsonUtil.forJson(h_history_endocrine));
							tbHealthDetails.sethHistoryEndocrine(JsonUtil.forJson(h_history_endocrine));
						}

						//神经系统	
						//String h_history_nervous=	json.getString("h_history_nervous");
						if(HealthHistory_key.equals("h_history_nervous")){
							JSONArray h_history_nervous=json.getJSONArray("h_history_nervous");
							JSONArray h_history_nervous1=JsonUtil.forPaidJson(json.getJSONArray("h_history_nervous"), map,"h_history_nervous");
							json_HealthHistory.put("h_history_nervous", h_history_nervous1);
							JsonUtil.forJson(h_history_nervous);
							System.out.println(JsonUtil.forJson(h_history_nervous));
							tbHealthDetails.sethHistoryNervous(JsonUtil.forJson(h_history_nervous));
						}

						//免疫系统	
						//String h_history_immune=	json.getString("h_history_immune");	

						if(HealthHistory_key.equals("h_history_immune")){
							JSONArray h_history_immune=json.getJSONArray("h_history_immune");
							JSONArray h_history_immune1=JsonUtil.forPaidJson(json.getJSONArray("h_history_immune"), map,"h_history_immune");
							json_HealthHistory.put("h_history_immune", h_history_immune1);
							JsonUtil.forJson(h_history_immune);
							System.out.println(JsonUtil.forJson(h_history_immune));
							tbHealthDetails.sethHistoryImmune(JsonUtil.forJson(h_history_immune));
						}


						//运动系统	
						//String h_history_sports=	json.getString("h_history_sports");	

						if(HealthHistory_key.equals("h_history_sports")){
							JSONArray h_history_sports=json.getJSONArray("h_history_sports");
							JSONArray h_history_sports1=JsonUtil.forPaidJson(json.getJSONArray("h_history_sports"), map,"h_history_sports");
							json_HealthHistory.put("h_history_sports", h_history_sports1);
							JsonUtil.forJson(h_history_sports);
							System.out.println(JsonUtil.forJson(h_history_sports));
							tbHealthDetails.sethHistorySports(JsonUtil.forJson(h_history_sports));
						}

						//风湿类	
						//String h_history_rheumatism=json.getString("h_history_rheumatism");
						if(HealthHistory_key.equals("h_history_rheumatism")){
							JSONArray h_history_rheumatism1=json.getJSONArray("h_history_rheumatism");
							JSONArray h_history_rheumatism=JsonUtil.forPaidJson(json.getJSONArray("h_history_rheumatism"), map,"h_history_rheumatism");
							json_HealthHistory.put("h_history_rheumatism", h_history_rheumatism);
							JsonUtil.forJson(h_history_rheumatism1);
							System.out.println(JsonUtil.forJson(h_history_rheumatism1));
							tbHealthDetails.sethHistoryRheumatism(JsonUtil.forJson(h_history_rheumatism1));
						}

						//既往病史   其他
						if(HealthHistory_key.equals("h_history_otherdisease")){
							String h_history_otherdisease=json.getString("h_history_otherdisease");

							json_HealthHistory.put("h_history_otherdisease", h_history_otherdisease);


							//tbHealthDetails.sethHistoryRheumatism(JsonUtil.forJson(h_history_rheumatism1));
						}

					}else{
						json_HealthHistory.put("h_history_past", "false");
					}


					//手术和外伤史-----------------------------------------------

					//手术和外伤史	
					h_trauma_title= json.getString("h_trauma_title");

					if("有".equals(h_trauma_title)){

						json_HealthHistory.put("h_trauma_title", "true");
						//String h__trauma="";
						if(HealthHistory_key.equals("h_history_trauma")){
							JSONArray h_history_trauma=json.getJSONArray("h_history_trauma");
							JSONArray h_history_trauma1=JsonUtil.forPaidJson(h_history_trauma, map,"h_trauma");
							json_HealthHistory.put("h_history_trauma", h_history_trauma1);
							JsonUtil.forJson(h_history_trauma);
							System.out.println(JsonUtil.forJson(h_history_trauma));
							h__trauma=JsonUtil.forJson(h_history_trauma);
							//	tbHealthDetails.sethTrauma(JsonUtil.forJson(h_history_trauma));
						}
						//其他
						String h__trauma_other="";
						if(HealthHistory_key.equals("h_trauma_other")){
							h__trauma_other=json.getString("h_trauma_other");
							json_HealthHistory.put("h_trauma_other", h__trauma_other);
						}
						tbHealthDetails.sethTrauma(h__trauma+h__trauma_other);

					}else{
						json_HealthHistory.put("h_trauma_title", "false");	
					}



					//接触史-------------------------------------

					//接触史	

					h_history_conact_title=	json.getString("h_history_conact_title");
					if("有".equals(h_history_conact_title)){

						json_HealthHistory.put("h_history_conact_title", "true");
						if(HealthHistory_key.equals("h_history_conact")){

							JSONArray h_history_conact=json.getJSONArray("h_history_conact");
							JSONArray h_history_conact1=JsonUtil.forPaidJson(h_history_conact, map,"h_conact");
							json_HealthHistory.put("h_history_conact", h_history_conact1);
							JsonUtil.forJson(h_history_conact);
							System.out.println(JsonUtil.forJson(h_history_conact));
							//tbHealthDetails.sethConact(JsonUtil.forJson(h_history_conact));
							h_conact=JsonUtil.forJson(h_history_conact);
						}
						//其他
						String h_cona_other="";
						if(HealthHistory_key.equals("h_conact_other")){
							h_cona_other=json.getString("h_conact_other");
							json_HealthHistory.put("h_conact_other", h_cona_other);
						}
						tbHealthDetails.sethConact(h_conact+h_cona_other);	
					}else{
						json_HealthHistory.put("h_history_conact_title", "false");	
					}


					//长期用药史-----------------------------------

					//长期用药史
					//String h_medication="";
					//String h_history_medication=	json.getString("h_history_medication");
					h_medication_title=json.getString("h_medication_title");
					if("有".equals(h_medication_title)){
						json_HealthHistory.put("h_medication_title", "true");
						if(HealthHistory_key.equals("h_history_medication")){
							JSONArray h_history_medication=json.getJSONArray("h_history_medication");
							JSONArray h_history_medication1=JsonUtil.forPaidJson(json.getJSONArray("h_history_medication"), map,"h_history_medication");
							json_HealthHistory.put("h_history_medication", h_history_medication1);
							JsonUtil.forJson(h_history_medication);
							System.out.println(JsonUtil.forJson(h_history_medication));
							h_medication=JsonUtil.forJson(h_history_medication);
							//tbHealthDetails.sethMedicationHistory(JsonUtil.forJson(h_history_medication));
						}

						//其他
						String h_medication_other="";
						if(HealthHistory_key.equals("h_medication_history_other")){
							h_medication_other=json.getString("h_medication_history_other");
							json_HealthHistory.put("h_medication_history_other", h_medication_other);
							//tbHealthDetails.sethTrauma(JsonUtil.forJson(h_history_trauma));
						}
						tbHealthDetails.sethMedicationHistory(h_medication+h_medication_other);
					}else{
						json_HealthHistory.put("h_medication_title", "false");
					}

				}
			}

		}

		tbHealthDetails.sethTime(new Date());

		js.put("HealthHistory", json_HealthHistory);

		return tbHealthDetails;
	}

	/**
	 * 分析健康陈述中的生活方式
	 * @param js
	 * @param map
	 * @return
	 */

	public  TbHealthLive getTbHealthLive(JSONObject js, Map map) {
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
		Set<String> json2_set=json2.keySet();

		String 	l_physical_exercise="false";
		JSONObject json_LifeStyle=new JSONObject();
		for (String key : json2_set) {
			JSONObject json=null;
			//			if(key.equals("b_personid")){
			//				String b_personid=json2.getString("b_personid");
			//				tbHealthLive.setbPersonid(b_personid);
			//				js.put("b_personid", map.get("b_personid"+b_personid));
			//			}
			//				else{
			//					log.debug(ClientErrer.CLIENT_ERRER1.getMsg()+":  "+ClientErrer.CLIENT_ERRER1.getCode());
			//					return null;
			//				}
			if(key.equals("LifeStyle")){

				json=(JSONObject) json2.get("LifeStyle");
				System.out.println(json.toString());
				Set< String>json_set=json.keySet();
				String l_liveSport_way="无";
				for (String LifeStyle_key : json_set) {
					//体育锻炼                                                l_physical_exercise
					l_physical_exercise=json.getString("l_physical_exercise");

					if("有".equals(l_physical_exercise)){

						json_LifeStyle.put("l_physical_exercise", "true");

						//每天锻炼次数（次/天）
						if(LifeStyle_key.equals("l_liveSport_count")){
							int l_liveSport_count=(int)EnumUtil.getEnumObject(json.getString("l_liveSport_count"), L_liveSport_count.class).getValueCode();
							tbHealthLive.setlLivesportCount(l_liveSport_count);
							System.out.println(l_liveSport_count);
							json_LifeStyle.put("l_liveSport_count", map.get("l_liveSport_count"+json.getString("l_liveSport_count")));
						}

						//每次锻炼时间（分钟/次）
						if(LifeStyle_key.equals("l_liveSport_minute")){
							int l_liveSport_minute=(int)EnumUtil.getEnumObject(json.getString("l_liveSport_minute"), L_liveSport_minute.class).getValueCode();
							tbHealthLive.setlLivesportMinute(l_liveSport_minute);
							json_LifeStyle.put("l_liveSport_minute", map.get("l_liveSport_minute"+json.getString("l_liveSport_minute")));

						}
						//每周锻炼天数
						if(LifeStyle_key.equals("l_liveSport_dayWeek")){
							int l_liveSport_dayWeek=Integer.valueOf(json.getString("l_liveSport_dayWeek"));
							tbHealthLive.setlLivesportDayweek(l_liveSport_dayWeek);
							System.out.println(l_liveSport_dayWeek);
							json_LifeStyle.put("l_liveSport_dayWeek", map.get("l_liveSport_dayWeek"+json.getString("l_liveSport_dayWeek")));
						}
						//坚持锻炼时间（年）
						if(LifeStyle_key.equals("l_liveSport_year")){
							String l_liveSport_year=json.getString("l_liveSport_year");
							tbHealthLive.setlLivesportYear(Integer.valueOf(l_liveSport_year));	
							json_LifeStyle.put("l_liveSport_year", map.get("l_liveSport_year"+json.getString("l_liveSport_year")));
						}
						//锻炼方式

						if(LifeStyle_key.equals("l_liveSport_way")){
							l_liveSport_way=json.getString("l_liveSport_way");
							tbHealthLive.setlLivesportWay(l_liveSport_way);
							json_LifeStyle.put("l_liveSport_way", map.get("l_liveSport_way"+l_liveSport_way));
						}



						//		//每日活动步数 "步/天"
						if(LifeStyle_key.equals("l_liveSport_step")){
							int l_liveSport_step=json.getInt("l_liveSport_step");
							tbHealthLive.setlLivesportStep(l_liveSport_step);
							json_LifeStyle.put("l_liveSport_step", map.get("l_liveSport_step"+l_liveSport_step));
							System.out.println(l_liveSport_step);
						}

					}else{
						json_LifeStyle.put("l_physical_exercise", "false");
					}


					//
					//		//饮食情况-------------------------------------------
					//		//饮食情况
					//		String l_dietary_status=json.getString("l_dietary_status");
					//		//饮食结构
					if(LifeStyle_key.equals("l_liveFood_structure")){
						String l_liveFood_structure=json.getString("l_liveFood_structure").trim();
						System.out.println(l_liveFood_structure);
						tbHealthLive.setlLivefoodStructure((Integer) EnumUtil.getEnumObject(l_liveFood_structure, LiveFood_structure.class).getValueCode());
						json_LifeStyle.put("l_liveFood_structure", map.get("l_liveFood_structure"+l_liveFood_structure));
					}

					//每日平均摄入食物种类
					if(LifeStyle_key.equals("l_liveFood_dayKind")){
						String l_liveFood_dayKind=json.getString("l_liveFood_dayKind").trim();
						System.out.println(l_liveFood_dayKind);
						int l_liveFood_dayKind1=(Integer) EnumUtil.getEnumObject(l_liveFood_dayKind,LiveFood_dayKind.class).getValueCode();
						System.out.println(l_liveFood_dayKind1);
						tbHealthLive.setlLivefoodDaykind(l_liveFood_dayKind1);
						json_LifeStyle.put("l_liveFood_dayKind", map.get("l_liveFood_dayKind"+json.getString("l_liveFood_dayKind")));

					}

					//		//每周平均摄入食物种类
					if(LifeStyle_key.equals("l_liveFood_weekKind")){
						String l_liveFood_weekKind=json.getString("l_liveFood_weekKind").trim();
						int l_liveFood_weekKind1=(Integer) EnumUtil.getEnumObject(l_liveFood_weekKind,LiveFood_weekKind.class).getValueCode();
						System.out.println(l_liveFood_weekKind1);
						tbHealthLive.setlLivefoodWeekkind(l_liveFood_weekKind1);
						json_LifeStyle.put("l_liveFood_weekKind", map.get("l_liveFood_weekKind"+json.getString("l_liveFood_weekKind")));

					}
					//		//每日平均摄入主食的量
					if(LifeStyle_key.equals("l_liveFood_primary")){
						String l_liveFood_primary=json.getString("l_liveFood_primary");
						int l_liveFood_primary1=(Integer) EnumUtil.getEnumObject(l_liveFood_primary,LiveFood_primary.class).getValueCode();
						System.out.println(l_liveFood_primary1);
						tbHealthLive.setlLivefoodPrimary(l_liveFood_primary1);
						json_LifeStyle.put("l_liveFood_primary", map.get("l_liveFood_primary"+l_liveFood_primary));

					}
					//		//每日平均摄入薯类的量
					if(LifeStyle_key.equals("l_liveFood_potato")){
						String l_liveFood_potato=json.getString("l_liveFood_potato");
						int l_liveFood_potato1=(Integer) EnumUtil.getEnumObject(l_liveFood_potato,LiveFood_potato.class).getValueCode();
						System.out.println(l_liveFood_potato1);
						tbHealthLive.setlLivefoodPotato(l_liveFood_potato1);
						json_LifeStyle.put("l_liveFood_potato", map.get("l_liveFood_potato"+l_liveFood_potato));
					}

					//		//每日平均摄入谷物和杂豆类的量
					if(LifeStyle_key.equals("l_liveFood_bean")){
						String l_liveFood_bean=json.getString("l_liveFood_bean");
						int l_liveFood_bean1=(Integer) EnumUtil.getEnumObject(l_liveFood_bean,LiveFood_bean.class).getValueCode();
						System.out.println(l_liveFood_bean1);
						tbHealthLive.setlLivefoodBean(l_liveFood_bean1);
						json_LifeStyle.put("l_liveFood_bean", map.get("l_liveFood_bean"+l_liveFood_bean));

					}

					//		//每日平均摄入蔬菜的量
					if(LifeStyle_key.equals("l_liveFood_vegetable")){
						String l_liveFood_vegetable=json.getString("l_liveFood_vegetable");
						int l_liveFood_vegetable1=(Integer) EnumUtil.getEnumObject(l_liveFood_vegetable,LiveFood_vegetable.class).getValueCode();
						System.out.println(l_liveFood_vegetable1);
						tbHealthLive.setlLivefoodVegetable(l_liveFood_vegetable1);
						json_LifeStyle.put("l_liveFood_vegetable", map.get("l_liveFood_vegetable"+l_liveFood_vegetable));
					}

					//		//每日平均摄入水果的量
					if(LifeStyle_key.equals("l_liveFood_fruit")){
						String l_liveFood_fruit=json.getString("l_liveFood_fruit");
						int l_liveFood_fruit1=(Integer) EnumUtil.getEnumObject(l_liveFood_fruit,LiveFood_fruit.class).getValueCode();
						System.out.println(l_liveFood_fruit1);
						tbHealthLive.setlLivefoodFruit(l_liveFood_fruit1);
						json_LifeStyle.put("l_liveFood_fruit", map.get("l_liveFood_fruit"+l_liveFood_fruit));
					}

					//		//每日平均摄入奶以及奶制品的量
					if(LifeStyle_key.equals("l_liveFood_milk")){
						String l_liveFood_milk=json.getString("l_liveFood_milk");
						int l_liveFood_milk1=(Integer) EnumUtil.getEnumObject(l_liveFood_milk,LiveFood_milk.class).getValueCode();
						System.out.println(l_liveFood_milk1);
						tbHealthLive.setlLivefoodMilk(l_liveFood_milk1);
						json_LifeStyle.put("l_liveFood_fruit", map.get("l_liveFood_fruit"+l_liveFood_milk));
					}

					//		//每日平均摄入的大豆及坚果的量
					if(LifeStyle_key.equals("l_liveFood_nut")){
						String l_liveFood_nut=json.getString("l_liveFood_nut");
						int l_liveFood_nut1=(Integer) EnumUtil.getEnumObject(l_liveFood_nut,LiveFood_nut.class).getValueCode();
						System.out.println(l_liveFood_nut1);
						tbHealthLive.setlLivefoodNut(l_liveFood_nut1);
						json_LifeStyle.put("l_liveFood_nut", map.get("l_liveFood_nut"+l_liveFood_nut));

					}

					//		//每日平均摄入的盐的量
					if(LifeStyle_key.equals("l_liveFood_salt")){
						String l_liveFood_salt=json.getString("l_liveFood_salt");
						int l_liveFood_salt1=(Integer) EnumUtil.getEnumObject(l_liveFood_salt,LiveFood_salt.class).getValueCode();
						System.out.println(l_liveFood_salt1);
						tbHealthLive.setlLivefoodSalt(l_liveFood_salt1);
						json_LifeStyle.put("l_liveFood_salt", map.get("l_liveFood_salt"+l_liveFood_salt));
					}

					//		//每日平均摄入的畜禽肉的量
					if(LifeStyle_key.equals("l_liveFood_meat")){
						String l_liveFood_meat=json.getString("l_liveFood_meat");
						int l_liveFood_meat1=(Integer) EnumUtil.getEnumObject(l_liveFood_meat,LiveFood_meat.class).getValueCode();
						System.out.println(l_liveFood_meat1);
						tbHealthLive.setlLivefoodMeat(l_liveFood_meat1);
						json_LifeStyle.put("l_liveFood_meat", map.get("l_liveFood_meat"+l_liveFood_meat));
					}

					//		//每日平均摄入鱼虾的量
					if(LifeStyle_key.equals("l_liveFood_fish")){
						String l_liveFood_fish=json.getString("l_liveFood_fish");
						int l_liveFood_fish1=(Integer) EnumUtil.getEnumObject(l_liveFood_fish,LiveFood_fish.class).getValueCode();
						System.out.println(l_liveFood_fish1);
						tbHealthLive.setlLivefoodFish(l_liveFood_fish1);
						json_LifeStyle.put("l_liveFood_fish", map.get("l_liveFood_fish"+l_liveFood_fish));
					}

					//		//每日平均摄入蛋的量
					if(LifeStyle_key.equals("l_liveFood_egg")){
						String l_liveFood_egg=json.getString("l_liveFood_egg");
						int l_liveFood_egg1=(Integer) EnumUtil.getEnumObject(l_liveFood_egg,LiveFood_egg.class).getValueCode();
						System.out.println(l_liveFood_egg1);
						tbHealthLive.setlLivefoodEgg(l_liveFood_egg1);
						json_LifeStyle.put("l_liveFood_egg", map.get("l_liveFood_egg"+l_liveFood_egg));
					}

					//		//每日平均摄入的油的量

					if(LifeStyle_key.equals("l_liveFood_oil")){
						String l_liveFood_oil=json.getString("l_liveFood_oil");
						int l_liveFood_oil1=(Integer) EnumUtil.getEnumObject(l_liveFood_oil,LiveFood_oil.class).getValueCode();
						System.out.println(l_liveFood_oil1);
						tbHealthLive.setlLivefoodOil(l_liveFood_oil1);
						json_LifeStyle.put("l_liveFood_oil", map.get("l_liveFood_oil"+l_liveFood_oil));
					}

					//		//每日平均摄入的单糖的量
					if(LifeStyle_key.equals("l_liveFood_sugar")){
						String l_liveFood_sugar=json.getString("l_liveFood_sugar");
						int l_liveFood_sugar1=(Integer) EnumUtil.getEnumObject(l_liveFood_sugar,LiveFood_sugar.class).getValueCode();
						System.out.println(l_liveFood_sugar1);
						tbHealthLive.setlLivefoodSugar(l_liveFood_sugar1);
						json_LifeStyle.put("l_liveFood_sugar", map.get("l_liveFood_sugar"+l_liveFood_sugar));
					}

					//		//每日平均饮水量
					if(LifeStyle_key.equals("l_liveFood_water")){

						String l_liveFood_water=json.getString("l_liveFood_water");
						int l_liveFood_water1=(Integer) EnumUtil.getEnumObject(l_liveFood_water,LiveFood_water.class).getValueCode();
						System.out.println(l_liveFood_water1);
						tbHealthLive.setlLivefoodWater(l_liveFood_water1);
						json_LifeStyle.put("l_liveFood_water", map.get("l_liveFood_water"+l_liveFood_water));
					}

					//
					//		//吸烟情况--------------------------------------------
					//		//吸烟情况
					//String l_smoke_situation=json.getString("l_smoke_situation");
					//		//吸烟状况
					if(LifeStyle_key.equals("l_smoke_condition")){

						String l_smoke_condition=json.getString("l_smoke_condition").trim();
						int l_smoke_condition1=(Integer) EnumUtil.getEnumObject(l_smoke_condition,Smoke_condition.class).getValueCode();
						System.out.println(l_smoke_condition1);
						tbHealthLive.setlSmokeCondition(l_smoke_condition1);
						json_LifeStyle.put("l_smoke_condition", map.get("l_smoke_condition"+l_smoke_condition));
					}

					//		//开始吸烟的年龄
					if(LifeStyle_key.equals("l_smoke_beginAge")){
						String l_smoke_beginAge=json.getString("l_smoke_beginAge").trim();
						int l_smoke_beginAge1=(Integer) EnumUtil.getEnumObject(l_smoke_beginAge,Smoke_beginAge.class).getValueCode();
						System.out.println(l_smoke_beginAge1);
						tbHealthLive.setlSmokeBeginage(l_smoke_beginAge1);
						json_LifeStyle.put("l_smoke_beginAge", map.get("l_smoke_beginAge"+l_smoke_beginAge));
					}

					//		//每天吸烟的支数
					if(LifeStyle_key.equals("l_smoke_number")){
						String l_smoke_number=json.getString("l_smoke_number");
						int l_smoke_number1=(Integer) EnumUtil.getEnumObject(l_smoke_number,Smoke_number.class).getValueCode();
						System.out.println(l_smoke_number1);
						tbHealthLive.setlSmokeNumber(l_smoke_number1);
						json_LifeStyle.put("l_smoke_number", map.get("l_smoke_number"+l_smoke_number));

					}

					//		//如果已经戒烟，开始戒烟的年龄是
					if(LifeStyle_key.equals("l_smoke_endAge")){
						String l_smoke_endAge=json.getString("l_smoke_endAge");
						int l_smoke_endAge1=(Integer) EnumUtil.getEnumObject(l_smoke_endAge,Smoke_endAge.class).getValueCode();
						System.out.println(l_smoke_endAge1);
						tbHealthLive.setlSmokeEndage(l_smoke_endAge1);
						json_LifeStyle.put("l_smoke_endAge", map.get("l_smoke_endAge"+l_smoke_endAge));
					}

					//		//工作或者居住的环境有吸烟的吗
					if(LifeStyle_key.equals("l_smoke_env")){
						String l_smoke_env=json.getString("l_smoke_env");
						int l_smoke_env1=(Integer) EnumUtil.getEnumObject(l_smoke_env,Smoke_env.class).getValueCode();
						System.out.println(l_smoke_env1);
						tbHealthLive.setlSmokeEnv(l_smoke_env1);
						json_LifeStyle.put("l_smoke_env", map.get("l_smoke_env"+l_smoke_env));
					}

					//
					//
					//		//饮酒情况----------------------------------------
					//		//饮酒情况
					//		String l_drinking_situation=json.getString("l_drinking_situation");
					//		//饮酒频率
					if(LifeStyle_key.equals("l_wine_Hz")){
						String l_wine_Hz=json.getString("l_wine_Hz").trim();
						int l_wine_Hz1=(Integer) EnumUtil.getEnumObject(l_wine_Hz,Wine_Hz.class).getValueCode();
						System.out.println(l_wine_Hz1);
						tbHealthLive.setlWineHz(l_wine_Hz1);
						json_LifeStyle.put("l_wine_Hz", map.get("l_wine_Hz"+l_wine_Hz));
					}


					//		//饮酒种类
					if(LifeStyle_key.equals("l_wine_kind")){
						String l_wine_kind=json.getString("l_wine_kind");
						int l_wine_kind1=(Integer) EnumUtil.getEnumObject(l_wine_kind,Wine_kind.class).getValueCode();
						System.out.println(l_wine_kind1);
						tbHealthLive.setlWineKind(l_wine_kind1);
						json_LifeStyle.put("l_wine_kind", map.get("l_wine_kind"+l_wine_kind));
					}

					//		//日饮酒量
					/*String l_wine_amount=json.getString("l_wine_amount");
						int l_wine_amount1=(Integer) EnumUtil.getEnumObject(l_wine_amount,Wine_kind.class).getValueCode();
						System.out.println(l_wine_amount1);
						tbHealthLive.sethWineKind(l_wine_amount1);*/
					//啤酒
					if(LifeStyle_key.equals("l_wine_beer")){

						String l_wine_beer=json.getString("l_wine_beer").trim();
						int l_wine_beer1=(Integer) EnumUtil.getEnumObject(l_wine_beer,Wine_beer.class).getValueCode();
						System.out.println(l_wine_beer1);
						tbHealthLive.setlWineBeer(l_wine_beer1);
						json_LifeStyle.put("l_wine_beer", map.get("l_wine_beer"+l_wine_beer));
					}
					//		//白酒
					if(LifeStyle_key.equals("l_wine_white")){
						String l_wine_white=json.getString("l_wine_white").trim();
						int l_wine_white1=(Integer) EnumUtil.getEnumObject(l_wine_white,Wine_white.class).getValueCode();
						System.out.println(l_wine_white1);
						tbHealthLive.setlWineWhite(l_wine_white1);
						json_LifeStyle.put("l_wine_white", map.get("l_wine_white"+l_wine_white));
					}

					//		//红酒
					if(LifeStyle_key.equals("l_wine_red")){

						String l_wine_red=json.getString("l_wine_red").trim();
						int l_wine_red1=(Integer) EnumUtil.getEnumObject(l_wine_red,Wine_red.class).getValueCode();
						System.out.println(l_wine_red1);
						tbHealthLive.setlWineRed(l_wine_red1);
						json_LifeStyle.put("l_wine_red", map.get("l_wine_red"+l_wine_red));
					}

					//		//黄酒
					if(LifeStyle_key.equals("l_wine_yellow")){

						String l_wine_yellow=json.getString("l_wine_yellow").trim();
						int l_wine_yellow1=(Integer) EnumUtil.getEnumObject(l_wine_yellow,Wine_yellow.class).getValueCode();
						System.out.println(l_wine_yellow1);
						tbHealthLive.setlWineYellow(l_wine_yellow1);
						json_LifeStyle.put("l_wine_yellow", map.get("l_wine_yellow"+l_wine_yellow));
					}

					//		//开始饮酒年龄
					if(LifeStyle_key.equals("l_wine_beginAge")){

						String l_wine_beginAge=json.getString("l_wine_beginAge").trim();
						int l_wine_beginAge1=(Integer) EnumUtil.getEnumObject(l_wine_beginAge,Wine_beginAge.class).getValueCode();
						System.out.println(l_wine_beginAge1+"-=========================");
						tbHealthLive.setlWineBeginage(l_wine_beginAge1);
						json_LifeStyle.put("l_wine_beginAge", map.get("l_wine_beginAge"+l_wine_beginAge));
					}

					//		//开始戒酒年龄
					if(LifeStyle_key.equals("l_wine_endAge")){
						String l_wine_endAge=json.getString("l_wine_endAge").trim();
						int l_wine_endAge1=(Integer) EnumUtil.getEnumObject(l_wine_endAge,Wine_endAge.class).getValueCode();
						System.out.println(l_wine_endAge1);
						tbHealthLive.setlWineEndage(l_wine_endAge1);
						json_LifeStyle.put("l_wine_endAge", map.get("l_wine_endAge"+l_wine_endAge));
					}

					//		//饮酒年数
					if(LifeStyle_key.equals("l_wine_year")){

						String l_wine_year=json.getString("l_wine_year").trim();
						int l_wine_year1=(Integer) EnumUtil.getEnumObject(l_wine_year,Wine_year.class).getValueCode();
						System.out.println(l_wine_year1);
						tbHealthLive.setlWineYear(l_wine_year1);
						json_LifeStyle.put("l_wine_year", map.get("l_wine_year"+l_wine_year));
					}

					//		//最近一年是否有醉酒
					if(LifeStyle_key.equals("l_wine_drunk")){

						String l_wine_drunk=json.getString("l_wine_drunk").trim();
						int l_wine_drunk1=(Integer) EnumUtil.getEnumObject(l_wine_drunk,Wine_drunk.class).getValueCode();
						System.out.println(l_wine_drunk1);
						tbHealthLive.setlWineDrunk(l_wine_drunk1);
						json_LifeStyle.put("l_wine_drunk", map.get("l_wine_drunk"+l_wine_drunk));
					}


					//
					//		//睡眠状况--------------------------------------------------
					//		//睡眠状况
					//		String l_sleep_situation=json.getString("l_sleep_situation");
					//您每天的睡眠时间是
					if(LifeStyle_key.equals("l_sleep_time")){

						String l_sleep_time=json.getString("l_sleep_time").trim();
						int l_sleep_time1=(Integer) EnumUtil.getEnumObject(l_sleep_time,Sleep_time.class).getValueCode();
						System.out.println(l_sleep_time1);
						tbHealthLive.setlSleepTime(l_sleep_time1);
						json_LifeStyle.put("l_sleep_time", map.get("l_sleep_time"+l_sleep_time));
					}

					//		//每天夜里是否会醒来
					if(LifeStyle_key.equals("l_sleep_wakeNumber")){

						String l_sleep_wakeNumber=json.getString("l_sleep_wakeNumber").trim();
						int l_sleep_wakeNumber1=(Integer) EnumUtil.getEnumObject(l_sleep_wakeNumber,Sleep_wakeNumber.class).getValueCode();
						System.out.println(l_sleep_wakeNumber1);
						tbHealthLive.setlSleepWakenumber(l_sleep_wakeNumber1);
						json_LifeStyle.put("l_sleep_wakeNumber", map.get("l_sleep_wakeNumber"+l_sleep_wakeNumber));
					}

					//		//失眠
					if(LifeStyle_key.equals("l_sleep_insomnia")){

						String l_sleep_insomnia=json.getString("l_sleep_insomnia");
						int l_sleep_insomnia1=(Integer) EnumUtil.getEnumObject(l_sleep_insomnia,Sleep_insomnia.class).getValueCode();
						System.out.println(l_sleep_insomnia1);
						tbHealthLive.setlSleepInsomnia(l_sleep_insomnia1);
						json_LifeStyle.put("l_sleep_insomnia", map.get("l_sleep_insomnia"+l_sleep_insomnia));
					}
					//
					//		//认知情况------------------------------------------------------
					//		//认知情况
					//		String l_cognitive_situation=json.getString("l_cognitive_situation");
					//您的近期记忆有减轻吗
					if(LifeStyle_key.equals("l_perceive_nearMemory")){

						String l_perceive_nearMemory=json.getString("l_perceive_nearMemory");
						if(l_perceive_nearMemory.equals("有")){
							System.out.println(l_perceive_nearMemory);
							tbHealthLive.setlPerceiveNearmemory(true);
						} else{
							tbHealthLive.setlPerceiveNearmemory(false);
						}
						json_LifeStyle.put("l_perceive_nearMemory", map.get("l_perceive_nearMemory"+l_perceive_nearMemory));
					}

					//您的远期记忆有减轻吗
					if(LifeStyle_key.equals("l_perceive_farMemory")){

						String l_perceive_farMemory=json.getString("l_perceive_farMemory");
						if(l_perceive_farMemory.equals("有")){
							System.out.println(l_perceive_farMemory);
							tbHealthLive.setlPerceiveFarmemory(true);
						} else{
							tbHealthLive.setlPerceiveFarmemory(false);
						}
						json_LifeStyle.put("l_perceive_farMemory", map.get("l_perceive_farMemory"+l_perceive_farMemory));	
					}

					//		//您的计算能力有下降吗
					if(LifeStyle_key.equals("l_perceive_calc")){
						String l_perceive_calc=json.getString("l_perceive_calc");
						if(l_perceive_calc.equals("有")){
							System.out.println(l_perceive_calc);
							tbHealthLive.setlPerceiveCalc(true);
						} else{
							tbHealthLive.setlPerceiveCalc(false);
						}
						json_LifeStyle.put("l_perceive_calc", map.get("l_perceive_calc"+l_perceive_calc));		
					}

					//		//您的定向力（方向感）有下降吗
					if(LifeStyle_key.equals("l_perceive_direction")){

						String l_perceive_direction=json.getString("l_perceive_direction");
						if(l_perceive_direction.equals("有")){
							System.out.println(l_perceive_direction);
							tbHealthLive.setlPerceiveDirection(true);
						} else{
							tbHealthLive.setlPerceiveDirection(false);
						}
						json_LifeStyle.put("l_perceive_direction", map.get("l_perceive_direction"+l_perceive_direction));
					}

					//
					//		//心里情况-------------------------------------------------
					//		//心里情况
					//		String l_psy_situation=json.getString("l_psy_situation");
					//您是否对目前的生活满意吗
					if(LifeStyle_key.equals("l_psy_live")){
						String l_psy_live=json.getString("l_psy_live");
						if(l_psy_live.equals("是")){
							System.out.println(l_psy_live);
							tbHealthLive.setlPsyLive(true);
						} else{
							tbHealthLive.setlPsyLive(false);
						}
						json_LifeStyle.put("l_psy_live", map.get("l_psy_live"+l_psy_live));
					}

					//		//您是否对目前的工作满意
					if(LifeStyle_key.equals("l_psy_job")){

						String l_psy_job=json.getString("l_psy_job");
						if(l_psy_job.equals("是")){
							System.out.println(l_psy_job);
							tbHealthLive.setlPsyJob(true);
						} else{
							tbHealthLive.setlPsyJob(false);
						}
						json_LifeStyle.put("l_psy_job", map.get("l_psy_job"+l_psy_job));
					}


					//		//您是否认为过去一年中自己的工作压力很大
					if(LifeStyle_key.equals("l_psy_workPress")){

						String l_psy_workPress=json.getString("l_psy_workPress");
						if(l_psy_workPress.equals("是")){
							System.out.println(l_psy_workPress);
							tbHealthLive.setlPsyWorkpress(true);
						} else{
							tbHealthLive.setlPsyWorkpress(false);
						}
						json_LifeStyle.put("l_psy_workPress", map.get("l_psy_workPress"+l_psy_workPress));
					}

					//		//您是否认为过去一年中自己的情绪低落或者沮丧
					if(LifeStyle_key.equals("l_psy_feelLow")){

						String l_psy_feelLow=json.getString("l_psy_feelLow");
						if(l_psy_feelLow.equals("是")){
							System.out.println(l_psy_feelLow);
							tbHealthLive.setlPsyFeellow(true);
						} else{
							tbHealthLive.setlPsyFeellow(false);
						}
						json_LifeStyle.put("l_psy_feelLow", map.get("l_psy_feelLow"+l_psy_feelLow));
					}

					//		//您是否认为过去一年中自己的心情烦躁或者焦虑
					if(LifeStyle_key.equals("l_psy_anxiety")){
						String l_psy_anxiety=json.getString("l_psy_anxiety");
						if(l_psy_anxiety.equals("是")){
							System.out.println(l_psy_anxiety);
							tbHealthLive.setlPsyAnxiety(true);
						} else{
							tbHealthLive.setlPsyAnxiety(false);
						}
						json_LifeStyle.put("l_psy_anxiety", map.get("l_psy_anxiety"+l_psy_anxiety));
					}

					//
					//		//性格测试-------------------------------------------------------
					//		//性格测试
					//		String l_Personality_test=json.getString("l_Personality_test");
					//您是属于爱发脾气，遇事着急的吗
					if(LifeStyle_key.equals("l_Personality_worry")){
						String l_Personality_worry=json.getString("l_Personality_worry");
						if(l_Personality_worry.equals("是")){
							System.out.println(l_Personality_worry);
							tbHealthLive.setlPersonalityWorry(true);
						} else{
							tbHealthLive.setlPersonalityWorry(false);
						}
						json_LifeStyle.put("l_Personality_worry", map.get("l_Personality_worry"+l_Personality_worry));
					}

					//		//您是属于不慌不忙，遇事淡定的吗
					if(LifeStyle_key.equals("l_Personality_calm")){
						String l_Personality_calm=json.getString("l_Personality_calm");
						if(l_Personality_calm.equals("是")){
							System.out.println(l_Personality_calm);
							tbHealthLive.setlPersonalityCalm(true);
						} else{
							tbHealthLive.setlPersonalityCalm(false);
						}
						json_LifeStyle.put("l_Personality_calm", map.get("l_Personality_calm"+l_Personality_calm));
					}

					//		//您是属于郁郁寡欢，经常不开心的吗
					if(LifeStyle_key.equals("l_Personality_unhappy")){
						String l_Personality_unhappy=json.getString("l_Personality_unhappy");
						if(l_Personality_unhappy.equals("是")){
							System.out.println(l_Personality_unhappy);
							tbHealthLive.setlPersonalityUnhappy(true);
						} else{
							tbHealthLive.setlPersonalityUnhappy(false);
						}
						json_LifeStyle.put("l_Personality_unhappy", map.get("l_Personality_unhappy"+l_Personality_unhappy));
					}
				}
			}
		}

		tbHealthLive.setlTime(new Date());

		js.put("LifeStyle", json_LifeStyle);
		return tbHealthLive;		
	}
}

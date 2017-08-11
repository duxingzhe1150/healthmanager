package com.gb.health.commend;

import java.util.HashMap;
import java.util.Map;

import com.gb.health.init.Concat;

import com.gb.health.init.HealthEnum.ChineseMedcine;

import com.gb.health.op.Result;
import com.gb.health.service.i.SystemOut;

import com.gb.health.service.i.SystemOutImpl;
import com.gb.health.utils.EnumUtil;
import com.gb.health.utils.LogRecordInf;
import net.sf.json.JSONObject;
/**
 * 中医体质数据接收处理
 * @author lx
 *
 */
public class GetChineseMedcineC  extends Commend{
//	private static Logger log = Logger.getLogger(GetChineseMedcineC.class);   
	
	LogRecordInf lr =new LogRecordInf(GetChineseMedcineC.class);
	private SystemOut systemOut;


	public GetChineseMedcineC(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
//		systemOut = (SystemOut)mContext.getBean("systemOutImpl");
		systemOut=applicationContext.getBean(SystemOutImpl.class);
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();
	}

	/**
	 * 分析中医体质数据
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;
			Map<String, Integer> ma= new HashMap<String, Integer>();
			String  chin_personid="";
			if(json.has("chin_personid")){
				chin_personid =(String) json.get("chin_personid");
			}
			if(json.has("chin_energetic")){
				int chin_energetic=(int) EnumUtil.getEnumObject(json.getString("chin_energetic"), ChineseMedcine.class).getValueCode();
				ma.put("chin_energetic", chin_energetic);

			} 
			if(json.has("chin_weary")){
				int chin_weary=(int)EnumUtil.getEnumObject(json.getString("chin_weary"), ChineseMedcine.class).getValueCode();
				ma.put("chin_weary", chin_weary);

			}
			if(json.has("chin_dame-zumari")){
				int chin_dame_zumari=(int)EnumUtil.getEnumObject(json.getString("chin_dame-zumari"), ChineseMedcine.class).getValueCode();
				ma.put("chin_dame-zumari", chin_dame_zumari);
			}
			if(json.has("chin_flustered")){
				int chin_flustered=(int)EnumUtil.getEnumObject(json.getString("chin_flustered"), ChineseMedcine.class).getValueCode();
				ma.put("chin_flustered", chin_flustered);

			}
			if(json.has("chin_dizziness")){
				int chin_dizziness=(int)EnumUtil.getEnumObject(json.getString("chin_dizziness"), ChineseMedcine.class).getValueCode();
				ma.put("chin_dizziness", chin_dizziness);
			}
			if(json.has("chin_quiet")){
				int chin_quiet=(int)EnumUtil.getEnumObject(json.getString("chin_quiet"), ChineseMedcine.class).getValueCode();
				ma.put("chin_quiet", chin_quiet);

			}if(json.has("chin_leise")){
				int chin_leise=(int)EnumUtil.getEnumObject(json.getString("chin_leise"), ChineseMedcine.class).getValueCode();
				ma.put("chin_leise", chin_leise);

			}if(json.has("chin_forget")){
				int chin_forget=(int)EnumUtil.getEnumObject(json.getString("chin_forget"), ChineseMedcine.class).getValueCode();
				ma.put("chin_forget", chin_forget);


			}if(json.has("chin_low")){
				int chin_low=(int)EnumUtil.getEnumObject(json.getString("chin_low"), ChineseMedcine.class).getValueCode();
				ma.put("chin_low", chin_low);


			}if(json.has("chin_sentimentality")){
				int chin_sentimentality=(int)EnumUtil.getEnumObject(json.getString("chin_sentimentality"), ChineseMedcine.class).getValueCode();
				ma.put("chin_sentimentality", chin_sentimentality);

			}if(json.has("chin_willies")){
				int chin_willies=(int)EnumUtil.getEnumObject(json.getString("chin_willies"), ChineseMedcine.class).getValueCode();
				ma.put("chin_willies", chin_willies);

			}if(json.has("chin_afraid")){
				int chin_afraid=(int)EnumUtil.getEnumObject(json.getString("chin_afraid"), ChineseMedcine.class).getValueCode();
				ma.put("chin_afraid", chin_afraid);

			}if(json.has("chin_swollen")){
				int chin_swollen=(int)EnumUtil.getEnumObject(json.getString("chin_swollen"), ChineseMedcine.class).getValueCode();
				ma.put("chin_swollen", chin_swollen);

			}if(json.has("chin_turgor")){
				int chin_turgor=(int)EnumUtil.getEnumObject(json.getString("chin_turgor"), ChineseMedcine.class).getValueCode();
				ma.put("chin_turgor", chin_turgor);

			}if(json.has("chin_sigh")){
				int chin_sigh=(int)EnumUtil.getEnumObject(json.getString("chin_sigh"), ChineseMedcine.class).getValueCode();
				ma.put("chin_sigh", chin_sigh);

			}if(json.has("chin_no_easy")){
				int chin_no_easy=(int)EnumUtil.getEnumObject(json.getString("chin_no_easy"), ChineseMedcine.class).getValueCode();
				ma.put("chin_no_easy", chin_no_easy);

			}
			if(json.has("chin_feetfever")){
				int chin_feetfever=(int)EnumUtil.getEnumObject(json.getString("chin_feetfever"), ChineseMedcine.class).getValueCode();
				ma.put("chin_feetfever", chin_feetfever);

			}if(json.has("chin_bodyfever")){
				int chin_bodyfever=(int)EnumUtil.getEnumObject(json.getString("chin_bodyfever"), ChineseMedcine.class).getValueCode();
				ma.put("chin_bodyfever", chin_bodyfever);

			}if(json.has("chin_ecchymosis")){
				int chin_ecchymosis=(int)EnumUtil.getEnumObject(json.getString("chin_ecchymosis"), ChineseMedcine.class).getValueCode();
				ma.put("chin_ecchymosis", chin_ecchymosis);

			}if(json.has("chin_fearcold")){
				int chin_fearcold=(int)EnumUtil.getEnumObject(json.getString("chin_fearcold"), ChineseMedcine.class).getValueCode();
				ma.put("chin_fearcold", chin_fearcold);

			}if(json.has("chin_feelcold")){
				int chin_feelcold=(int)EnumUtil.getEnumObject(json.getString("chin_feelcold"), ChineseMedcine.class).getValueCode();
				ma.put("chin_feelcold", chin_feelcold);

			}if(json.has("chin_clothes")){
				int chin_clothes=(int)EnumUtil.getEnumObject(json.getString("chin_clothes"), ChineseMedcine.class).getValueCode();
				ma.put("chin_clothes", chin_clothes);

			}if(json.has("chin_havecold")){
				int chin_havecold=(int)EnumUtil.getEnumObject(json.getString("chin_havecold"), ChineseMedcine.class).getValueCode();
				ma.put("chin_havecold", chin_havecold);

			}if(json.has("chin_sneezing")){
				int chin_sneezing=(int)EnumUtil.getEnumObject(json.getString("chin_sneezing"), ChineseMedcine.class).getValueCode();
				ma.put("chin_sneezing", chin_sneezing);

			}if(json.has("chin_snot")){
				int chin_snot=(int)EnumUtil.getEnumObject(json.getString("chin_snot"), ChineseMedcine.class).getValueCode();
				ma.put("chin_snot", chin_snot);

			}if(json.has("chin_sweating")){
				int chin_sweating=(int)EnumUtil.getEnumObject(json.getString("chin_sweating"), ChineseMedcine.class).getValueCode();
				ma.put("chin_sweating", chin_sweating);

			}if(json.has("chin_irritability")){
				int chin_irritability=(int)EnumUtil.getEnumObject(json.getString("chin_irritability"), ChineseMedcine.class).getValueCode();
				ma.put("chin_irritability", chin_irritability);

			}if(json.has("chin_measles")){
				int chin_measles=(int)EnumUtil.getEnumObject(json.getString("chin_measles"), ChineseMedcine.class).getValueCode();
				ma.put("chin_measles", chin_measles);

			}if(json.has("chin_cough")){
				int chin_cough=(int)EnumUtil.getEnumObject(json.getString("chin_cough"), ChineseMedcine.class).getValueCode();
				ma.put("chin_cough", chin_cough);

			}if(json.has("chin_purpura")){
				int chin_purpura=(int)EnumUtil.getEnumObject(json.getString("chin_purpura"), ChineseMedcine.class).getValueCode();
				ma.put("chin_purpura", chin_purpura);

			}if(json.has("chin_scratch")){
				int chin_scratch=(int)EnumUtil.getEnumObject(json.getString("chin_scratch"), ChineseMedcine.class).getValueCode();
				ma.put("chin_scratch", chin_scratch);

			}if(json.has("chin_bruises")){
				int chin_bruises=(int)EnumUtil.getEnumObject(json.getString("chin_bruises"), ChineseMedcine.class).getValueCode();
				ma.put("chin_bruises", chin_bruises);

			}if(json.has("chin_dry")){
				int chin_dry=(int)EnumUtil.getEnumObject(json.getString("chin_dry"), ChineseMedcine.class).getValueCode();
				ma.put("chin_dry", chin_dry);

			}if(json.has("chin_pain")){
				int chin_pain=(int)EnumUtil.getEnumObject(json.getString("chin_pain"), ChineseMedcine.class).getValueCode();
				ma.put("chin_pain", chin_pain);

			}if(json.has("chin_red")){
				int chin_red=(int)EnumUtil.getEnumObject(json.getString("chin_red"), ChineseMedcine.class).getValueCode();
				ma.put("chin_red", chin_red);

			}if(json.has("chin_redsilk")){
				int chin_redsilk=(int)EnumUtil.getEnumObject(json.getString("chin_redsilk"), ChineseMedcine.class).getValueCode();
				ma.put("chin_redsilk", chin_redsilk);

			}if(json.has("chin_lipcolor")){
				int chin_lipcolor=(int)EnumUtil.getEnumObject(json.getString("chin_lipcolor"), ChineseMedcine.class).getValueCode();
				ma.put("chin_lipcolor", chin_lipcolor);

			}if(json.has("chin_oil_head")){
				int chin_oil_head=(int)EnumUtil.getEnumObject(json.getString("chin_oil_head"), ChineseMedcine.class).getValueCode();
				ma.put("chin_oil_head", chin_oil_head);

			}if(json.has("chin_oil_face")){
				int chin_oil_face=(int)EnumUtil.getEnumObject(json.getString("chin_oil_face"), ChineseMedcine.class).getValueCode();
				ma.put("chin_oil_face", chin_oil_face);

			}if(json.has("chin_foxiness_face")){
				int chin_foxiness_face=(int)EnumUtil.getEnumObject(json.getString("chin_foxiness_face"), ChineseMedcine.class).getValueCode();
				ma.put("chin_foxiness_face", chin_foxiness_face);

			}if(json.has("chin_acne")){
				int chin_acne=(int)EnumUtil.getEnumObject(json.getString("chin_acne"), ChineseMedcine.class).getValueCode();
				ma.put("chin_acne", chin_acne);

			}if(json.has("chin_eyelid")){
				int chin_eyelid=(int)EnumUtil.getEnumObject(json.getString("chin_eyelid"), ChineseMedcine.class).getValueCode();
				ma.put("chin_eyelid", chin_eyelid);

			}if(json.has("chin_black_eye")){
				int chin_eyelid=(int)EnumUtil.getEnumObject(json.getString("chin_black_eye"), ChineseMedcine.class).getValueCode();
				ma.put("chin_black_eye", chin_eyelid);

			}
			if(json.has("chin_try_eye")){
				int chin_try_eye=(int)EnumUtil.getEnumObject(json.getString("chin_try_eye"), ChineseMedcine.class).getValueCode();
				ma.put("chin_try_eye", chin_try_eye);

			}if(json.has("chin_dead_lip")){
				int chin_dead_lip=(int)EnumUtil.getEnumObject(json.getString("chin_dead_lip"), ChineseMedcine.class).getValueCode();
				ma.put("chin_dead_lip", chin_dead_lip);

			}if(json.has("chin_drinking")){
				int chin_drinking=(int)EnumUtil.getEnumObject(json.getString("chin_drinking"), ChineseMedcine.class).getValueCode();
				ma.put("chin_drinking", chin_drinking);

			}if(json.has("chin_throat_something")){
				int chin_throat_something=(int)EnumUtil.getEnumObject(json.getString("chin_throat_something"), ChineseMedcine.class).getValueCode();
				ma.put("chin_throat_something", chin_throat_something);

			}if(json.has("chin_excessive_phlegm")){
				int chin_excessive_phlegm=(int)EnumUtil.getEnumObject(json.getString("chin_excessive_phlegm"), ChineseMedcine.class).getValueCode();
				ma.put("chin_excessive_phlegm", chin_excessive_phlegm);

			}if(json.has("chin_bitter_taste")){
				int chin_bitter_taste=(int)EnumUtil.getEnumObject(json.getString("chin_bitter_taste"), ChineseMedcine.class).getValueCode();
				ma.put("chin_bitter_taste", chin_bitter_taste);

			}if(json.has("chin_sticky_mouth")){
				int chin_sticky_mouth=(int)EnumUtil.getEnumObject(json.getString("chin_sticky_mouth"), ChineseMedcine.class).getValueCode();
				ma.put("chin_sticky_mouth", chin_sticky_mouth);

			}if(json.has("chin_furred_tongue")){
				int chin_furred_tongue=(int)EnumUtil.getEnumObject(json.getString("chin_furred_tongue"), ChineseMedcine.class).getValueCode();
				ma.put("chin_furred_tongue", chin_furred_tongue);

			}if(json.has("chin_mellow_tummy")){
				int chin_mellow_tummy=(int)EnumUtil.getEnumObject(json.getString("chin_mellow_tummy"), ChineseMedcine.class).getValueCode();
				ma.put("chin_mellow_tummy", chin_mellow_tummy);

			}if(json.has("chin_diarrhea")){
				int chin_diarrhea=(int)EnumUtil.getEnumObject(json.getString("chin_diarrhea"), ChineseMedcine.class).getValueCode();
				ma.put("chin_diarrhea", chin_diarrhea);

			}if(json.has("chin_cold_something")){
				int chin_cold_something=(int)EnumUtil.getEnumObject(json.getString("chin_cold_something"), ChineseMedcine.class).getValueCode();
				ma.put("chin_cold_something", chin_cold_something);

			}if(json.has("chin_sleeplessness")){
				int chin_sleeplessness=(int)EnumUtil.getEnumObject(json.getString("chin_sleeplessness"), ChineseMedcine.class).getValueCode();
				ma.put("chin_sleeplessness", chin_sleeplessness);

			}if(json.has("chin_shit_viscous")){
				int chin_shit_viscous=(int)EnumUtil.getEnumObject(json.getString("chin_shit_viscous"), ChineseMedcine.class).getValueCode();
				ma.put("chin_shit_viscous", chin_shit_viscous);

			}if(json.has("chin_shit_dry")){
				int chin_shit_dry=(int)EnumUtil.getEnumObject(json.getString("chin_shit_dry"), ChineseMedcine.class).getValueCode();
				ma.put("chin_shit_dry", chin_shit_dry);

			}if(json.has("chin_dark_piss")){
				int chin_dark_piss=(int)EnumUtil.getEnumObject(json.getString("chin_dark_piss"), ChineseMedcine.class).getValueCode();
				ma.put("chin_dark_piss", chin_dark_piss);

			}if(json.has("chin_yellow")){
				int chin_yellow=(int)EnumUtil.getEnumObject(json.getString("chin_yellow"), ChineseMedcine.class).getValueCode();
				ma.put("chin_yellow", chin_yellow); 

			}if(json.has("chin_moist")){
				int chin_moist=(int)EnumUtil.getEnumObject(json.getString("chin_moist"), ChineseMedcine.class).getValueCode();
				ma.put("chin_moist", chin_moist);

			}if(json.has("chin_adapt_change")){
				int chin_adapt_change=(int)EnumUtil.getEnumObject(json.getString("chin_adapt_change"), ChineseMedcine.class).getValueCode();
				ma.put("chin_adapt_change", chin_adapt_change);

			}
			Result<String> result= systemOut.getChin(chin_personid,ma);
			System.out.println(result.getMsg());
			
			
			JSONObject jSONObject=inf.getChineseMedcine(Concat.ResultType.SUCCESS, result);
		//	log.debug("中医体质接口返回值："+jSONObject);
			lr.interfaceInfo("中医体质接口返回值", "中医体质接口返回值");
			return jSONObject;

		}catch(Exception e){
			//log.error(e.toString());
			lr.interfaceError("中医体质接口",e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			//log.error(js.toString());
			lr.interfaceError("中医体质接口",js.toString());
			return js;

		}	
	}
}

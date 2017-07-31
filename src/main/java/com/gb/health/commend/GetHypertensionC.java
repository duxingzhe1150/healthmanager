package com.gb.health.commend;

import com.gb.health.init.Concat;
import com.gb.health.init.HealthEnum.Age;
import com.gb.health.init.HealthEnum.Diastolic;
import com.gb.health.init.HealthEnum.HypertensionAll;
import com.gb.health.init.HealthEnum.Systolic;
import com.gb.health.op.Hypertension;
import com.gb.health.op.HypertensionSuggest;
import com.gb.health.op.Result;
import com.gb.health.service.i.SystemOut;

import com.gb.health.service.i.SystemOutImpl;

import com.gb.health.utils.EnumUtil;
import com.gb.health.utils.LogRecordInf;

import net.sf.json.JSONObject;
/**
 * 高血压数据接收分析
 * @author lx
 *
 */
public class GetHypertensionC  extends Commend{
	//private static Logger log = Logger.getLogger(GetHypertensionC.class); 
	LogRecordInf lr = new LogRecordInf (GetHypertensionC.class);
	private SystemOut systemOut=applicationContext.getBean(SystemOutImpl.class);


	public GetHypertensionC(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
	//	systemOut = (SystemOut)mContext.getBean("systemOutImpl");
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();
	}
/**
 * 高血压数据接收后的具体分析方法
 * @return
 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;
			Hypertension hypertension=new Hypertension();
			if(json.has("hb_age")){
				int hb_age=(int)EnumUtil.getEnumObject(json.getString("hb_age"), Age.class).getValueCode();
				hypertension.setAge(hb_age);
			} 
			if(json.has("hb_systolic")){
				int hb_systolic=(int)EnumUtil.getEnumObject(json.getString("hb_systolic"), Systolic.class).getValueCode();
				hypertension.setSystolic(hb_systolic);

			}
			if(json.has("hb_diastolic")){
				int hb_diastolic=(int)EnumUtil.getEnumObject(json.getString("hb_diastolic"), Diastolic.class).getValueCode();
				hypertension.setDiastolic(hb_diastolic);

			}
			if(json.has("hb_height")){
				String  hb_height =json.getString("hb_height");
				hypertension.setHeight(Float.valueOf(hb_height));
			}
			if(json.has("hb_weight")){
				String  hb_weight =json.getString("hb_weight");
				hypertension.setWeight(Float.valueOf(hb_weight));
				
			}if(json.has("hb_hypertension")){
				int hb_hypertension=(int)EnumUtil.getEnumObject(json.getString("hb_hypertension"), HypertensionAll.class).getValueCode();
				hypertension.setParent(hb_hypertension);
			}

			Result<HypertensionSuggest> result=  systemOut.getHypertensionSuggest(hypertension);

			System.out.println(result.getMsg());
			JSONObject jSONObject=inf.getHypertension(Concat.ResultType.SUCCESS, result);
		//	log.debug("高血压接口返回值："+jSONObject);
			lr.interfaceDebug("高血压接口返回值", jSONObject.toString());
			return jSONObject;

		}catch(Exception e){ 
			//log.error(e.toString());
			lr.interfaceError("高血压接口报错", e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			//log.error(js.toString());
			lr.interfaceError("高血压接口报错", js.toString());
			return js;

		}	
	}
}

package com.gb.health.commend;


import com.gb.health.init.Concat;
import com.gb.health.init.HealthEnum.*;
import com.gb.health.op.ICVD;
import com.gb.health.op.ICVDsuggest;
import com.gb.health.op.Result;
import com.gb.health.service.i.SystemOut;

import com.gb.health.service.i.SystemOutImpl;

import com.gb.health.utils.EnumUtil;
import com.gb.health.utils.LogRecordInf;

import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
/**
 * 心血管疾病数据接收处理
 * @author lx
 *
 */
public class GetCvdC  extends Commend{
//	private static Logger log = Logger.getLogger(GetCvdC.class);   
	
	LogRecordInf lr =new LogRecordInf(GetCvdC.class);
	private SystemOut systemOut=applicationContext.getBean(SystemOutImpl.class);


	public GetCvdC(JSONObject reqDate) {
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
	 * 分析心血管疾病数据
	 * @return
	 */
	private JSONObject api(){
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;
			ICVD cvd=new ICVD();
			if(json.has("b_tel")){
				String b_tel=(String) json.get("b_tel");
				System.out.println(b_tel);
			}
			if(json.has("heart_sex")){
				//String sex=(String) json.get("sex");
				int sex=(int)EnumUtil.getEnumObject(json.get("heart_sex"), Sex.class).getValueCode();
				cvd.setB_sex(sex);
			} 
			if(json.has("heart_age")){
				//String age=(String) json.get("age");
				int age=(int)EnumUtil.getEnumObject(json.get("heart_age"), Age.class).getValueCode();
				cvd.setB_age(age);
			}
			if(json.has("heart_systolic")){
				//String systolic=(String) json.get("systolic");
				int systolic=(int)EnumUtil.getEnumObject(json.get("heart_systolic"), Systolic.class).getValueCode();
				cvd.setGenerl_systolic(systolic);
			}
			if(json.has("heart_height")){
				String height=(String) json.get("heart_height");
				cvd.setB_heght(Float.valueOf(height));
			}
			if(json.has("heart_weight")){
				String weight=(String) json.get("heart_weight");
				cvd.setB_weight(Float.valueOf(weight));
			}
			if(json.has("heart_cholesterol")){
				//String cholesterol=(String) json.get("cholesterol");
				int cholesterol=(int)EnumUtil.getEnumObject(json.get("heart_cholesterol"), Cholesterol.class).getValueCode();
				cvd.setBiochemical_tc(Integer.valueOf(cholesterol));
			}
			if(json.has("heart_smoking")){
				//String smoking=(String) json.get("smoking");
				int smoking=(int)EnumUtil.getEnumObject(json.get("heart_smoking"), Smoking.class).getValueCode();
				cvd.setL_smoke_condition(Integer.valueOf(smoking));
			}
			if(json.has("heart_diabetes")){
				//String diabetes=(String) json.get("diabetes");
				int diabetes=(int)EnumUtil.getEnumObject(json.get("heart_diabetes"), Diabete.class).getValueCode();
				cvd.setDiabetes(Integer.valueOf(diabetes));
			}
			try {
				System.out.println(BeanUtils .describe(cvd));
			} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Result<ICVDsuggest> re=  systemOut.getICVDresult(cvd);
			JSONObject jSONObject=inf.getResCVD(Concat.ResultType.SUCCESS, re);
			//log.debug("心血管接口返回值："+jSONObject);
			lr.interfaceInfo("心血管接口返回值", jSONObject.toString());
			System.out.println(re.getMsg());
			return jSONObject;

		}catch(Exception e){
		//	log.error(e.toString());
			lr.interfaceError("心血管接口",e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
		//	log.error(js.toString());
			lr.interfaceError("心血管接口",js.toString());
			return js;

		}	
	}
}

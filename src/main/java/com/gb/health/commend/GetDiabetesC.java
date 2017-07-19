package com.gb.health.commend;

import com.gb.health.init.Concat;
import com.gb.health.init.HealthEnum.*;
import com.gb.health.op.Diabetes;
import com.gb.health.op.DiabetesSuggest;
import com.gb.health.op.Result;
import com.gb.health.service.i.SystemOut;
import com.gb.health.utils.EnumUtil;
import com.gb.health.utils.LogRecordInf;
import net.sf.json.JSONObject;
/**
 *  糖尿病数据接收处理
 * @author lx
 *
 */
public class GetDiabetesC extends Commend{
//	private static Logger log = Logger.getLogger(GetObesityC.class);     
	
	LogRecordInf lr = new LogRecordInf(GetObesityC.class);
	private SystemOut systemOut;


	public GetDiabetesC(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
		systemOut = (SystemOut)mContext.getBean("systemOutImpl");
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();
	}

	/**
	 *  分析糖尿病请求数据
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;
			Diabetes diabetes=new Diabetes();
	
		if(json.has("d_sex")){
			//String b_sex=(String) json.get("b_sex");
			int sex=(int)EnumUtil.getEnumObject(json.get("d_sex"), Sex.class).getValueCode();
			diabetes.setB_sex(sex);
		} 
		if(json.has("d_age")){
			//String b_heght=(String) json.get("b_heght");
			int age=(int)EnumUtil.getEnumObject(json.get("d_age"), Age.class).getValueCode();
			diabetes.setB_age(age);
		}
		if(json.has("d_waistline")){
			String d_waistline=(String) json.get("d_waistline");
			diabetes.setB_waistline(Integer.valueOf(d_waistline));
		}
		if(json.has("d_height")){
			String d_height=(String) json.get("d_height");
			diabetes.setB_heght(Float.valueOf(d_height));
			
		}
		if(json.has("d_weight")){
			String d_weight=(String) json.get("d_weight");
			diabetes.setB_weight(Float.valueOf(d_weight));
		}
		if(json.has("d_sport")){
			int d_sport=(int)EnumUtil.getEnumObject(json.get("d_sport"), Sport.class).getValueCode();
			diabetes.setL_liveSport_minuteCount(d_sport);
			
		}if(json.has("d_fruit")){
			int d_fruit=(int)EnumUtil.getEnumObject(json.get("d_fruit"), Fruit.class).getValueCode();
			diabetes.setL_liveFood_fruit(d_fruit);
			
		}if(json.has("d_vegetable")){
			int d_vegetable=(int)EnumUtil.getEnumObject(json.get("d_vegetable"), Vegetable.class).getValueCode();
			diabetes.setL_liveFood_vegetable(d_vegetable);
			
		}if(json.has("d_hypotensor")){
			int d_hypotensor=(int)EnumUtil.getEnumObject(json.get("d_hypotensor"), Hypotensor.class).getValueCode();
			diabetes.setHypotensor(d_hypotensor);
			
		}if(json.has("d_hypertension")){
			int d_hypertension=(int)EnumUtil.getEnumObject(json.get("d_hypertension"), HypertensionAll.class).getValueCode();
			diabetes.setHyperglycemia(d_hypertension);
			
		}if(json.has("d_diabetes")){
			int d_diabetes=(int)EnumUtil.getEnumObject(json.get("d_diabetes"), Diabete.class).getValueCode();
			diabetes.setFamaly(d_diabetes);
		}
	
		Result<DiabetesSuggest> result=  systemOut.getDiabetesSuggest(diabetes);
		
		
		    System.out.println(result.getMsg());
			JSONObject jSONObject=inf.getDiabetesSuggest(Concat.ResultType.SUCCESS, result);
			//log.debug("糖尿病接口返回值："+jSONObject);
			lr.interfaceInfo("糖尿病接口返回值", jSONObject.toString());
			return jSONObject;

		}catch(Exception e){
			//log.error(e.toString());
			lr.interfaceError("糖尿病接口", e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
		   // log.error(js.toString());
		    lr.interfaceError("糖尿病接口", js.toString());
			return js;

		}	
	}
}

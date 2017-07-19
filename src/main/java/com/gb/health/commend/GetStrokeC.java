package com.gb.health.commend;

import com.gb.health.init.Concat;
import com.gb.health.init.HealthEnum.*;
import com.gb.health.op.Result;
import com.gb.health.op.Stroke;
import com.gb.health.service.i.SystemOut;
<<<<<<< HEAD
import com.gb.health.service.i.SystemOutImpl;
import com.gb.health.utill.EnumUtil;
import com.gb.health.utill.LogRecordInf;
=======
import com.gb.health.utils.EnumUtil;
import com.gb.health.utils.LogRecordInf;
>>>>>>> origin/master
import net.sf.json.JSONObject;
/**
 * 获取脑卒中请求数据
 * @author lx
 *
 */
public class GetStrokeC extends Commend{
	//private static Logger log = Logger.getLogger(GetStrokeC.class);     
	LogRecordInf lr = new LogRecordInf (GetStrokeC.class);
	private SystemOut systemOut=applicationContext.getBean(SystemOutImpl.class);


	public GetStrokeC(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
		//systemOut = (SystemOut)mContext.getBean("systemOutImpl");
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();
	}

	/**
	 * 处理脑卒中请求数据
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		
		try{
			JSONObject json=requestDate;
			Stroke stroke=new Stroke();
		
		if(json.has("stroke_stroke")){
			
			int stroke_stroke=(int)EnumUtil.getEnumObject(json.getString("stroke_stroke"), Stroke_stroke.class).getValueCode();
			stroke.setStroke(stroke_stroke);
			
		} 
		if(json.has("stroke_ischemic")){
			int stroke_ischemic=(int)EnumUtil.getEnumObject(json.getString("stroke_ischemic"), Stroke_ischemic.class).getValueCode();
			stroke.setTIA(stroke_ischemic);
			
		}
		if(json.has("stroke_hypertension")){
			int stroke_hypertension=(int)EnumUtil.getEnumObject(json.getString("stroke_hypertension"), HypertensionAll.class).getValueCode();
			stroke.setHypertension(stroke_hypertension);
		}
		if(json.has("stroke_carditis")){
			int stroke_carditis=(int)EnumUtil.getEnumObject(json.getString("stroke_carditis"), Stroke_carditis.class).getValueCode();
			stroke.setMyocarditis(stroke_carditis);
			
		}
		if(json.has("stroke_smoking")){
			int stroke_smoking=(int)EnumUtil.getEnumObject(json.getString("stroke_smoking"), Smoking.class).getValueCode();
			stroke.setSmoking(stroke_smoking);
			
		}if(json.has("stroke_lipid")){
			int stroke_lipid=(int)EnumUtil.getEnumObject(json.getString("stroke_lipid"), Lipid.class).getValueCode();
			stroke.setBloodFat(stroke_lipid);
		
		}if(json.has("stroke_diabetes")){
			int stroke_diabetes=(int)EnumUtil.getEnumObject(json.getString("stroke_diabetes"), Diabete.class).getValueCode();
			stroke.setDiabetes(stroke_diabetes);
		
		}if(json.has("stroke_exercise")){
			int stroke_exercise=(int)EnumUtil.getEnumObject(json.getString("stroke_exercise"), Exercise.class).getValueCode();
			stroke.setExercise(stroke_exercise);
			
		}if(json.has("stroke_history")){
			int stroke_history=(int)EnumUtil.getEnumObject(json.getString("stroke_history"), History.class).getValueCode();
			stroke.setFamily(stroke_history);
			
		}if(json.has("stroke_height")){
			String stroke_height=json.getString("stroke_height");
			stroke.setHeight(Float.valueOf(stroke_height));
		}if(json.has("stroke_weight")){
			String stroke_weight=json.getString("stroke_weight");
			stroke.setWeight(Float.valueOf(stroke_weight));
		}
		
		
		Result<String> result=  systemOut.getStrokeSuggest(stroke);
		
		
		System.out.println(result.getMsg());
			JSONObject jSONObject=inf.getStroke(Concat.ResultType.SUCCESS, result);
			//log.debug("脑卒中接口返回值："+jSONObject);
			lr.interfaceInfo("脑卒中接口返回值", jSONObject.toString());
			return jSONObject;

		}catch(Exception e){
			//log.error(e.toString());
			lr.interfaceError("脑卒中接口报错", e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
		    // log.error(js.toString());
		     lr.interfaceError("脑卒中接口报错", js.toString()); 
			return js;

		}	
	}
}

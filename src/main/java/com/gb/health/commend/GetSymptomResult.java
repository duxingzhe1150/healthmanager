package com.gb.health.commend;
import com.gb.health.init.Concat;
import com.gb.health.op.Result;
import com.gb.health.op.ResultDisease;
import com.gb.health.service.i.SystemOut;

import com.gb.health.service.i.SystemOutImpl;
import com.gb.health.utils.LogRecordInf;
import net.sf.json.JSONObject;

/**
 * 获取症状请求数据（哈弗全书，分词）
 * @author lx
 *
 */
public class GetSymptomResult extends Commend{
	LogRecordInf lr = new LogRecordInf (GetSymptomResult.class);
	//private static Logger log = Logger.getLogger(GetSymptomResult.class);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	private SystemOut systemOut;


	public GetSymptomResult(JSONObject reqDate) {
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
	 *  处理症状请求数据
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
	//try{
			String SymptomResultId="";
		if(requestDate.has("SymptomResultId")){
			 SymptomResultId=requestDate.getString("SymptomResultId");
			
		}
		Result<ResultDisease> result=  systemOut.getNextDisease(SymptomResultId);
		System.out.println(result.getMsg());
			JSONObject jSONObject=inf.getSymptomResult(Concat.ResultType.SUCCESS, result,requestDate);
			//log.debug("获取 分词 症状结果接口返回值："+jSONObject);
			lr.interfaceInfo("获取 分词 症状结果接口返回值", jSONObject.toString());
			return jSONObject;

//		}catch(Exception e){
//			//log.error(e.toString());
//			lr.interfaceError("获取 分词 症状结果接口报错", e.toString());
//			System.out.println(e.toString());
//			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
//		   // log.error(js.toString());
//		    lr.interfaceError("获取 分词 症状结果接口报错", js.toString());
//			return js;
//
//		}	
	}
}

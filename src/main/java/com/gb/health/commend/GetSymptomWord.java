package com.gb.health.commend;

import com.gb.health.init.Concat;
import com.gb.health.service.i.SystemOut;
import com.gb.health.service.i.SystemOutImpl;
import com.gb.health.utils.LogRecordInf;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * 获取症状某个层级的结果数据请求（根据哈弗全书）
 * @author lx
 *
 */
public class GetSymptomWord extends Commend{

	LogRecordInf lr = new LogRecordInf (GetSymptomWord.class);
	//private static Logger log = Logger.getLogger(GetSymptomWord.class);

	private SystemOut systemOut=applicationContext.getBean(SystemOutImpl.class);


	public GetSymptomWord(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
//		systemOut = (SystemOut)mContext.getBean("systemOutImpl");
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();
	}

	/**
	 * 分析症状某个层级的结果数据请求
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
//		try{
			String symptom="";
			int page=1;
			if(requestDate.has("symptom")){
				symptom=requestDate.getString("symptom");

			}
			if(requestDate.has("page")){
				page=requestDate.getInt("page");

			}


			List<Map<String, String>> result=  systemOut.initDisease(symptom,page);

			JSONObject jSONObject=inf.getSymptomWord(Concat.ResultType.SUCCESS,result,requestDate);
			//log.debug("获取 分词 症状 接口返回值："+jSONObject);
			lr.interfaceDebug("获取 分词 症状 接口返回值", jSONObject.toString());
			return jSONObject;

//		}catch(Exception e){
//			//log.error(e.toString());
//			lr.interfaceError("获取 分词 症状 接口报错", e.toString());
//			System.out.println(e.toString());
//			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
//			//log.error(js.toString());
//			lr.interfaceError("获取 分词 症状 接口报错", js.toString());
//			return js;
//		}
	}
}


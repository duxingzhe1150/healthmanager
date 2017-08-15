package com.gb.health.commend;

import com.gb.health.service.i.SystemOutImpl;
import org.apache.log4j.Logger;

import com.gb.health.domain.ChatHistory;
import com.gb.health.init.Concat;
import com.gb.health.op.Page;
import com.gb.health.service.i.SystemOut;

import net.sf.json.JSONObject;

/**
 * 获取轨迹 记录列表
 * @author lx
 *
 */
public class GetHarvardAskRecord  extends Commend{

	private static Logger log = Logger.getLogger(GetHarvardAskRecord.class);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	private SystemOut systemOut;


	public GetHarvardAskRecord(JSONObject reqDate) {
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
	 *  处理 获取 轨迹列表请求数据
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;
			String personid="";
			int page=1;
		if(json.has("personid")){
			 personid=(String) json.get("personid");
			
		} 
		if(json.has("page")){
			page=(Integer) json.get("page");
			
		} 
		
		Page<ChatHistory> li=  systemOut.getChatHistoryList(personid,page);
		log.debug("哈弗全书 问答 完整轨迹接口返回值："+"");
		
			JSONObject jSONObject=inf.getHarvardAskRecord(Concat.ResultType.SUCCESS, li);
		
			return jSONObject;

		}catch(Exception e){
			log.error(e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
		log.error(js.toString());
			return js;

		}	
	}
}

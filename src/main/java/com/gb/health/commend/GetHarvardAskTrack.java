package com.gb.health.commend;

import com.gb.health.domain.ChatHistory;
import com.gb.health.init.Concat;
import com.gb.health.init.ErrerCode;
import com.gb.health.service.i.SystemIn;
import com.gb.health.service.i.SystemInImpl;
import com.gb.health.service.i.SystemOut;
import com.gb.health.service.i.SystemOutImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.util.Date;
/**
 *  哈弗全书 问答 完整轨迹
 * @author lx
 *
 */
public class GetHarvardAskTrack  extends Commend{
	private static Logger log = Logger.getLogger(GetHarvardAskTrack.class);
	private SystemOut systemOut=applicationContext.getBean(SystemOutImpl.class);
	private SystemIn systemIn=applicationContext.getBean(SystemInImpl.class);


	public GetHarvardAskTrack(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
		//systemOut = (SystemOut)mContext.getBean("systemOutImpl");
		//systemIn = (SystemIn)mContext.getBean("systemInImpl");
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();
	}

	/**
	 *  处理 问答 一个问题的完整轨迹请求数据
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;
			ChatHistory chatHistory = new ChatHistory();
			if(json.has("personid")){
				String personid=(String) json.get("personid");
				chatHistory.setPersonid(personid);	
			} 
			if(json.has("time")){
				String time=(String) json.get("time");
				chatHistory.setTime(new Date());
			} 
			if(json.has("chatType")){
				String chatType=(String) json.get("chatType");
				chatHistory.setChatType(chatType);
			} 
			if(json.has("chatContent")){
				JSONArray chatContent=json.getJSONArray("chatContent");
				chatHistory.setChatContent(chatContent.toString());
			} 

			Boolean result=  systemIn.saveChatHistory(chatHistory);

			JSONObject  jSONObject=new JSONObject();
			if(result){
				jSONObject=inf.getRespJsonByData( "",Concat.ResultType.SUCCESS);	
			}else{
				jSONObject=inf.getRespJsonByData( "数据存储错误", ErrerCode.ServerErrer.SERVER_CURRENT_API_OTHER.getCode());  
			}
			log.debug("插入哈弗全书 问答 完整轨迹接口返回值："+jSONObject);
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


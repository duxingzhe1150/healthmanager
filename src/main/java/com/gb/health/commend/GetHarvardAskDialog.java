package com.gb.health.commend;

import com.gb.health.init.Concat;
import com.gb.health.service.i.SystemIn;
import com.gb.health.service.i.SystemOut;
import com.gb.health.utils.LogRecordInf;
import net.sf.json.JSONObject;

import java.util.List;
/**
 * 获取单次问答请求
 * @author lx
 *
 */
public class GetHarvardAskDialog extends Commend {

	//private static Logger log = Logger.getLogger(GetHarvardAskDialog.class);    

	LogRecordInf lr = new LogRecordInf (GetHarvardAskDialog.class);

	private SystemOut systemOut;
	private SystemIn systemIn;

	public GetHarvardAskDialog(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
		systemOut = (SystemOut)mContext.getBean("systemOutImpl");
		systemIn = (SystemIn)mContext.getBean("systemInImpl");
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();
	}

	/**
	 *  处理 单次问答请求
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;

			int chat_id=0;
			if(json.has("chat_id")){
				chat_id=json.getInt("chat_id");
			}
			List<String> result=  systemOut.getChatHistoryDetail(chat_id);

			JSONObject jSONObject=inf.getHarvardAskDialog(Concat.ResultType.SUCCESS, result);
			//log.debug("哈弗全书 问答 单条完整轨迹接口返回值："+jSONObject);
			lr.interfaceInfo("哈弗全书 问答 单条完整轨迹接口返回值", jSONObject.toString());
			return jSONObject;

		}catch(Exception e){
			//log.error(e.toString());
			lr.interfaceError("哈弗全书 问答 单条完整轨迹接口", e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			//log.error(js.toString());
			lr.interfaceError("哈弗全书 问答 单条完整轨迹接口", js.toString());
			return js;

		}	
	}
}


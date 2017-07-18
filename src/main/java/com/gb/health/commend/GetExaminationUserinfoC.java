package com.gb.health.commend;

import com.gb.health.domain.TbHealthExamination;
import com.gb.health.init.Concat;
import com.gb.health.service.i.SystemOut;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.util.List;

public class GetExaminationUserinfoC  extends Commend{
	/**
	 *  此类暂时没有用途
	 * @author lx
	 *
	 */
	private static Logger log = Logger.getLogger(GetExaminationUserinfoC.class);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	private SystemOut systemOut;


	public GetExaminationUserinfoC(JSONObject reqDate) {
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
	 * 此方法暂时没有用途
	 * @return
	 */
	private JSONObject api() {
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;
			TbHealthExamination tbHealthExamination=new TbHealthExamination();

			if(json.has("b_personid")){
				String b_personid=(String) json.get("b_personid");
				tbHealthExamination.setbPersonid(b_personid);;
			} 
			if(json.has("b_name")){
				String b_name=(String) json.get("b_name");
				tbHealthExamination.setbName(b_name);
			}
			if(json.has("b_tel")){
				String b_tel=(String) json.get("b_tel");
				tbHealthExamination.setbTel(b_tel);;
			}


			List<TbHealthExamination> result=  systemOut.getHealthExamination(tbHealthExamination);



			//		JSONObject jSONObject=getUserInfo(Concat.ResultType.SUCCESS, result);
			//		log.debug("体检用户信息接口返回值："+jSONObject);
			return null;

		}catch(Exception e){
			log.error(e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			log.error(js.toString());
			return js;

		}	
	}
}

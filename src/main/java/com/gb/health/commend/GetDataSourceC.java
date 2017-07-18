package com.gb.health.commend;


import com.gb.health.domain.TbHealthRecord;
import com.gb.health.init.Concat;
import com.gb.health.init.Const;
import com.gb.health.init.ErrerCode;
import com.gb.health.service.TbHealthRecoedService;
import com.gb.health.service.i.SystemIn;
import com.gb.health.service.i.SystemOut;
import com.gb.health.utill.LogRecordInf;
import com.gb.health.utill.PostHttp;
import net.sf.json.JSONObject;

import java.util.Date;
/**
 * 数据来源数据接收处理
 * @author lx
 *
 */
public class GetDataSourceC  extends Commend{

	//private static Logger log = Logger.getLogger(GetDataSourceC.class);  
	
	LogRecordInf lr =new LogRecordInf(GetCvdC.class);
	private SystemOut systemOut;
	private SystemIn systemIn;
	private TbHealthRecoedService tbHealthRecordm;
	private JSONObject js_source;

	public GetDataSourceC(JSONObject reqDate) {
		super(reqDate);
		// TODO Auto-generated constructor stub
		systemOut = (SystemOut)mContext.getBean("systemOutImpl");
		systemIn = (SystemIn)mContext.getBean("systemInImpl");
		tbHealthRecordm = (TbHealthRecoedService)mContext.getBean("tbHealthRecoedService");
		js_source=reqDate;
	}

	@Override
	JSONObject execut() throws Exception {
		// TODO Auto-generated method stub
		return api();

	}
	/**
	 * 分析 数据来源数据
	 * @return
	 */
	private JSONObject api(){
		InterfProcessor inf= new InterfProcessor();
		try{
			JSONObject json=requestDate;

			String back=PostHttp.loadJSON( Const.SOURCE_URL);
			//String back=PostJson.sendCiMingData(js_source, "http://api.test.aikezd.com/v3/huis/get-hospital");


			if(back==null||back.equals("")){
				back="{'list':[]}";
			}

			TbHealthRecord tbHealthRecord =new TbHealthRecord();
			tbHealthRecord.setSendData(js_source.toString());
			tbHealthRecord.setSendReturn(back);
			tbHealthRecord.setSendTime(new Date());
			tbHealthRecord.setSendUrl(Const.SOURCE_URL);
			tbHealthRecord.setTypeName("DataSource");

			//log.debug("数据来源接口返回值："+back);
			
			lr.interfaceInfo("数据来源接口返回值", back);

			//		JSONObject jso=JSONObject.fromObject(back);

			//		int errmsg=0;
			//		if(jso.has("errmsg")){
			//			if("success".equals(jso.get("errmsg"))){
			//				errmsg=1;
			//			}else{
			//				errmsg=0;
			//			}
			//		}
			//
			//		tbHealthRecord.setSendStatus(errmsg);



			int insert=tbHealthRecordm.insert(tbHealthRecord);

			//log.debug("DataSource_Back:"+back);
			lr.interfaceInfo("DataSource_Back", back);

			if(insert >0){
				JSONObject js=inf.returnDataSource(json, Concat.ResultType.SUCCESS,back);
			//	log.debug(js);
				lr.interfaceInfo("数据来源接口", js.toString());
				
				return	js;
			}else {
				JSONObject js=inf.returnDataSource(json, ErrerCode.ClientErrer.CLIENT_ERRER.getCode(),back );
			//	log.debug(js); 
				lr.interfaceInfo("数据来源接口", js.toString());
				return	js;
			}



		}catch(Exception e){
			//log.error(e.toString());
			lr.interfaceError("数据来源接口", e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			//log.error(js.toString());
			lr.interfaceError("数据来源接口", js.toString());
			return js;

		}	
	}
}


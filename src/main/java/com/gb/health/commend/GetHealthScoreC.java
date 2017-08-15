package com.gb.health.commend;

import java.util.Set;

import com.gb.health.init.Concat;
import com.gb.health.init.ErrerCode;
import com.gb.health.op.LiveSuggestDetail;
import com.gb.health.op.Result;
import com.gb.health.service.i.SystemOut;

import com.gb.health.service.i.SystemOutImpl;
import com.gb.health.utils.LogRecordInf;
import net.sf.json.JSONObject;
/**
 *  健康陈述分数 数据接收处理
 * @author lx
 *
 */
public class GetHealthScoreC extends Commend {
	//private static Logger log = Logger.getLogger(GetHealthScoreC.class);
	
	LogRecordInf lr = new LogRecordInf(GetHealthScoreC.class);
	private SystemOut systemOut;


	public GetHealthScoreC(JSONObject reqDate) {
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
	 * 健康陈述分数 数据的处理方法
	 * @return
	 */
	private JSONObject api(){
		InterfProcessor inf= new InterfProcessor();
		try{	
			String b_personid="";
			JSONObject json = new JSONObject();
			System.out.println("wo:"+requestDate.toString());
			//log.debug("获取分数请求的数据格式："+ json.toString());
			lr.interfaceInfo("获取分数请求的数据格式", json.toString());
			Set<String> HealthScore_set=requestDate.keySet();
			for (String HealthScore_key : HealthScore_set) {
				if (HealthScore_key.equals("b_personid")) {
					b_personid=requestDate.getString("b_personid");
					int aa=systemOut.getLiveScore(b_personid);
					System.out.println("Score:"+aa);
					//log.debug("分值："+aa);
					lr.interfaceInfo("分值", aa+"");
					if( aa==-1){
						JSONObject getRespJsonByData= inf.getRespJsonByData(ErrerCode.ClientErrer.CLIENT_PERSONID_ERRER.getMsg(), ErrerCode.ClientErrer.CLIENT_PERSONID_ERRER.getCode());
						//log.debug(getRespJsonByData.toString());
						lr.interfaceInfo("获取分数", getRespJsonByData.toString());
						return getRespJsonByData;
					}
					if(aa == 0){
						JSONObject getRespJsonByData= inf.getRespJsonByData(ErrerCode.ClientErrer.CLIENT_LESS_ERRER.getMsg(), ErrerCode.ClientErrer.CLIENT_LESS_ERRER.getCode());
						//log.debug(getRespJsonByData.toString());
						lr.interfaceInfo("获取分数", getRespJsonByData.toString());
						return getRespJsonByData;
					}
				}
			}
			//总分
			int res =systemOut.getLiveScore(b_personid);
			
			if(res == -1){
				return inf.getRespJsonByData("找不到该用户", 201);
			}
			
			//log.debug("总分total:"+res);
			//log.debug("总分total:"+res);
			lr.interfaceInfo("总分total", res+"");
			Result<LiveSuggestDetail> re=systemOut.getLiveSuggestDetail(b_personid);
			//错误码         正确=200
			JSONObject js=null;
			LiveSuggestDetail liveSuggestDetail=null;
			System.out.println("返回信息结果码:"+re.getCode());
			if(re.isSucess()){
				 liveSuggestDetail=re.getResult();
				 js = JSONObject.fromObject(liveSuggestDetail);
			}else{
				return inf.getRespJsonByData(re.getMsg(),re.getCode());
			}
				
			JSONObject jSONObject=inf.getRespJsonByPersonid(json,Concat.ResultType.SUCCESS, res,liveSuggestDetail);
		//	log.debug("分数返回值："+jSONObject);
			lr.interfaceInfo("分数返回值", jSONObject.toString());
			return jSONObject;

		}catch(Exception e){
			//log.error(e.toString());			
			lr.interfaceError("获取分数报错", e.toString());
			System.out.println(e.toString());
			JSONObject js=inf.getRespJsonByData("信息有误", Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
			//log.error(js.toString());
			lr.interfaceError("获取分数报错", js.toString());
			return js;

			//return null;

		}	
	}
}

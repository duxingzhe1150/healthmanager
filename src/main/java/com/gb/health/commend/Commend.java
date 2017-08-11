package com.gb.health.commend;

import com.gb.health.utils.LogRecordInf;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import com.gb.health.init.MyContextListener;

import net.sf.json.JSONObject;


public abstract class Commend {
	//private static Logger log = Logger.getLogger(Commend.class);
	LogRecordInf lr =new LogRecordInf(Commend.class);
//	protected  WebApplicationContext  mContext = (WebApplicationContext) MyContextListener.getApplicationContext();
	protected ApplicationContext applicationContext=MyContextListener.applicationContext;
	public static String RESUIT = "result";
	public static String HEAD = "head";
	public static String dvdid = "dvdid";
	public static String total = "total";
	public static String SEROPERATE = "seroperate";
	protected Head mHead;

	private String code;
	private long id =-1;

	public Commend(JSONObject reqDate) {
		this.reqDate = reqDate;
		if (reqDate.has(HEAD)) {
			JSONObject reqHeader = (JSONObject) getReqDate().opt(Commend.HEAD);
			mHead = resoleHead(reqHeader);
		}
		/*if(reqDate.has(SEROPERATE)){
			resoleSeroperate();

		}*/
		if (reqDate.has(REQ_DATE)) {
			requestDate = (JSONObject) reqDate.opt(REQ_DATE);
		}
	}

	protected boolean cheakSeroperate(){
		if (id == -1 || StringUtils.isBlank(code)) {
			return false;
		}
		return true;
	}

	/*	protected static WebApplicationContext mWAppCtxt = (WebApplicationContext) ContextListener
			.getApplicationContext();*/

	private static final String REQ_DATE = "data";

	public static class DateParame {
		public static final String SEPOPERRATEID = "sepoperrateid";
		public static final String SEPOPERRATECODE = "sepoperratecode";

	}

	public static class HeadKey {
		public static final String DVDID = "dvdid";
		public static final String DVDNUMBER = "dvdnumber";
		public static final String VAECODE = "vercode";
	}

	private JSONObject reqDate;
	protected JSONObject requestDate;
	/**
	 * 验证head信息
	 * @param headJson
	 * @return
	 */
	private Head resoleHead(JSONObject headJson) {
		Head head = new Head();

		if (headJson.has(HeadKey.DVDID)) {
			head.setDvdid(headJson.getString(HeadKey.DVDID));
		}
		if (headJson.has(HeadKey.DVDNUMBER)) {
			head.setDVDNUMBER(headJson.getString(HeadKey.DVDNUMBER));
		}
		if (headJson.has(HeadKey.VAECODE)) {
			head.setVAECODE(headJson.getString(HeadKey.VAECODE));
		}

		return head;
	}
	/*	private void resoleSeroperate(){
		JSONObject serOperate = (JSONObject) reqDate.opt(Commend.SEROPERATE);
		id = serOperate.getLong(DateParame.SEPOPERRATEID);
		code = serOperate.getString(DateParame.SEPOPERRATECODE);
		if (id == -1 || StringUtils.isBlank(code)) {
			return;
		}
	}*/


	//生成记录

	/*private void genarateRecord() {
		if (Const.RECORD_RULE == Concat.RecordRule.record_TYPE_APPLYCUR) {
			if (!isAddRecod()) {
				return;
			}
		}
		if (Const.RECORD_RULE == Concat.RecordRule.record_TYPE_UNENABLE) {
			return;
		}

		if (!reqDate.has(Commend.SEROPERATE)) {
			return;
		}

		if (id == -1 || StringUtils.isBlank(code)) {
			return;
		}

		SerOperateService serOperateService = (SerOperateService) mWAppCtxt
				.getBean("serOperateService");
		AccountService accountService = (AccountService) mWAppCtxt
				.getBean("accountService");
		RoomInfoService roomInfoService = (RoomInfoService) mWAppCtxt
				.getBean("roomInfoService");
		Account ac = accountService.findAccountById((int) id);
		if (null == ac) {
			return;
		}
		RoomInfo roomInfo = roomInfoService.findTheAreaIsExistsRoom(
				ac.getAreacode(), code);
		if (roomInfo == null) {
			return;
		}
		Seroperate seroperate = new Seroperate();
		seroperate.setSeroperateId(ac.getId());
		seroperate.setSeroperateAreacode(ac.getAreacode());
		seroperate.setSeroperateDesc("");
		seroperate.setSeroperateIdentifier(roomInfo.getRoominfo_identifier());
		seroperate.setSeroperateRoomno(code);
		seroperate.setSeroperateTel(ac.getTel());
		seroperate.setSeroperateTime(HelpUtill
				.getStrBycurtime("yyyy-MM-dd hh:mm:ss"));
		seroperate.setSeroperateType(getTextCode());
		seroperate.setSeroperateOperator(ac.getName());
		serOperateService.insertIntoSerOperate(seroperate);
	}*/

	/*	abstract public JSONObject dispathExecute(Head head,String roomAllno,long serOperateId) throws Exception;

	abstract public boolean isAddRecod();

	abstract public String getTextCode();*/

	/*public JSONObject execut() throws Exception {
		//genarateRecord();
		return dispathExecute(mHead,code,id);
	}*/

	abstract JSONObject execut() throws Exception ;

	public JSONObject getReqDate() {
		return reqDate;
	}

	private JSONObject getRespJson() {
		JSONObject jb = new JSONObject();
		JSONObject head = new JSONObject();
		head.put("server", "v1.0");
		//return jb.accumulate("head", head);
		return jb;
	}
	/**
	 * 获取返回结果
	 * @param js
	 * @param result
	 * @return
	 */
	public JSONObject getRespJsonByData(JSONObject js, int result) {
		JSONObject rep = (JSONObject) getRespJson();
		if (js != null) {
			rep.accumulate("data", js);
		}
		rep.accumulate(RESUIT, result);
		return rep;
	}


}

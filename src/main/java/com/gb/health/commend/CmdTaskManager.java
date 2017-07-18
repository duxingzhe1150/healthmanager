package com.gb.health.commend;

import com.gb.health.utill.LogRecordInf;
import net.sf.json.JSONObject;

public class CmdTaskManager {
//	private static Logger log = Logger.getLogger(CmdTaskManager.class); 
	
	 LogRecordInf lr= new LogRecordInf(CmdTaskManager.class);
	/*	public static final String CMD_ASK_ADD_CATERING = "addcatering";
	public static final String CMD_ASK_UPDATE_CATERING = "updatecatering";
	public static final String CMD_ASK_LOGIN_ACCOUNT = "loginaccount";
	public static final String CMD_ASK_GETINFOBYTIME = "getinfobytime";
	public static final String CMD_ASK_GETUPDATESIGLE= "getupdatesigle";
	public static final String CMD_ASK_GETUPDATEPACKAGE = "getupdatepackage";
	public static final String CMD_ASK_GETCACELORDER = "getcacelorder";

	public static final String CMD_ASK_USERBYTELORROOM = "askuserbytelorroom";
	public static final String CMD_ASK_USERINFO = "getinfo";
	public static final String CMD_ASK_ECGRESULT = "getEcgResult";*/

	//cmd命令码

	public static final String CMD_ASK_GETSYMPTOMINFO = "getSymptomInfo";
	//健康陈述
	public static final String CMD_ASK_UPLOADHEALTH_PAID = "uploadHealth_Paid";
	//健康陈述paid版
	public static final String CMD_ASK_UPLOADHEALTH = "uploadHealth";
	//获取分数
	public static final String CMD_ASK_GETSCORE = "getHealthScore";
	//心血管
	public static final String CMD_ASK_GETCVD = "uploadCVD";
	//肥胖
	public static final String CMD_ASK_GETFAT = "uploadFat";
	//糖尿病
	public static final String CMD_ASK_DIABETES =  "uploadDiabetes";
	//脑卒中
	public static final String CMD_ASK_STROKE =  "uploadStroke";
	//高血压
	public static final String CMD_ASK_HB =  "uploadHb";
	//中医体质
	public static final String CMD_ASK_CHINA_MEDCINE =  "uploadChineseMedcine";
	//数据来源
	public static final String CMD_ASK_DATA_SOURCE =  "getDataSource";
	
	//分词 疾病关键词接收
	public static final String CMD_ASK_SYMPTOM_WROD  = "getSymptom_Word";
	
	//获取  分词 疾病关键词结果
	public static final String CMD_ASK_SYMPTOM_RESULT ="getSymptom_Result";
	
	//插入哈弗全书 问答 完整轨迹
	public static final String CMD_ASK_HARVARD_TRACK ="getHarvardAskTrack";
	
	//哈弗全书 问答 查询历史记录列表
	public static final String CMD_ASK_HARVARD_RECORD ="getHarvardAskRecord";
	
	//哈弗全书 问答 单次记录
	public static final String CMD_ASK_HARVARD_DIALOG ="getHarvardAskDialog";

	private JSONObject reqJson;
	private String cmd;

	public CmdTaskManager(JSONObject reqJson, String cmd) {
		this.reqJson = reqJson;
		this.cmd = cmd;
	}

	public JSONObject execut() throws Exception  {
		Commend commend = null;
		JSONObject responseJson = null;

		lr.interfaceInfo("AllJson", reqJson.toString());
		
		commend = getConCommend();
		if(commend!=null){
			responseJson = commend.execut();
		}

		lr.interfaceInfo("ReturnJson", responseJson.toString());
		return responseJson;

	}

	private Commend getConCommend() throws CmdMatchException  {
		Commend commend = null;


		if (cmd.equals(CMD_ASK_GETSYMPTOMINFO)) {
			//commend.commend = new GetSymptomInfoC(reqJson);
		}else if (cmd.equals(CMD_ASK_UPLOADHEALTH)) {
			commend= new GetUploadHealthC(reqJson);
		}else if (cmd.equals(CMD_ASK_GETSCORE)) {
			commend= new GetHealthScoreC(reqJson);
		}else if (cmd.equals(CMD_ASK_GETCVD)) {
			commend= new GetCvdC(reqJson);
		}else if (cmd.equals(CMD_ASK_GETFAT)) {
			commend= new GetObesityC(reqJson);
		}/*else if (cmd.equals(CMD_ASK_USERINFO)) {
			commend= new GetExaminationUserinfoC(reqJson);
		}*/
		else if (cmd.equals(CMD_ASK_DIABETES)) {
			commend= new GetDiabetesC(reqJson);
		}
		else if (cmd.equals(CMD_ASK_HB)) {
			commend= new GetHypertensionC(reqJson);
		}
		else if (cmd.equals(CMD_ASK_STROKE)) {
			commend= new GetStrokeC(reqJson);
		}else if (cmd.equals(CMD_ASK_CHINA_MEDCINE)) {
			commend= new GetChineseMedcineC(reqJson); 
		}else if (cmd.equals(CMD_ASK_UPLOADHEALTH_PAID)) {
			commend= new GetPaidHealthStateC(reqJson);
		}else if (cmd.equals(CMD_ASK_DATA_SOURCE)) {
		
			commend= new GetDataSourceC(reqJson);
		}else if (cmd.equals(CMD_ASK_SYMPTOM_WROD)) {
		
			commend= new GetSymptomWord(reqJson);
		}else if (cmd.equals(CMD_ASK_SYMPTOM_RESULT)) {
		
			commend= new GetSymptomResult(reqJson);
		}
		else if (cmd.equals(CMD_ASK_HARVARD_TRACK)) {
			
			commend= new GetHarvardAskTrack(reqJson);
		}
		else if (cmd.equals(CMD_ASK_HARVARD_RECORD)) {
			
			commend= new GetHarvardAskRecord(reqJson);
		}
		else if (cmd.equals(CMD_ASK_HARVARD_DIALOG)) {
			
			commend= new GetHarvardAskDialog(reqJson);
		}
		else{
			throw new CmdMatchException("命令不匹配");
		}

		return commend;
 
	}

}

package com.gb.health.controller;

import com.gb.health.commend.CmdMatchException;
import com.gb.health.commend.CmdTaskManager;
import com.gb.health.commend.Commend;
import com.gb.health.commend.Commend.HeadKey;
import com.gb.health.commend.Head;
import com.gb.health.init.Concat;
import com.gb.health.utils.LogRecordInf;
import com.google.gson.JsonObject;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * 健康陈述接口类
 * @author lx
 *
 */
@Controller
@Scope("prototype")
public class PhoneController extends BaseCtl{
	//private static Logger log = Logger.getLogger(PhoneController.class);
	
	LogRecordInf lr = new LogRecordInf(PhoneController.class);
	

	@RequestMapping(value = "/api", method = RequestMethod.POST)
	public void invoke(HttpServletRequest mRequest, HttpServletResponse mResponse)  {
		try {
			mRequest.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		mResponse.setCharacterEncoding("utf-8");
		mResponse.setContentType("text/html;charset=utf-8");
//		log.info("qingjiu");
		String commandName = "";
		String reqData = "";
		JSONObject reqHeaderJson = null;
		JSONObject reqJson;
		JSONObject respJson = null;
		Head head;
	
		int err = -1;
		try {
			//解析流 从流得到客户端传来的json
			byte[] buffer = new byte[4096];
			int len = 0;
			InputStream inputStream = mRequest.getInputStream();
			ByteArrayOutputStream outstream = new ByteArrayOutputStream();
			while ((len = inputStream.read(buffer)) > 0) {
				outstream.write(buffer, 0, len);
			}
			reqData = outstream.toString("UTF-8");
			inputStream.close();
			outstream.close();
		//	log.debug("接收页面数据："+reqData);
			lr.interfaceDebug("接收页面数据", reqData);
//			System.out.println(reqData);
		   //解析得到的json 找到cmd命令
			
			reqJson = JSONObject.fromObject(reqData);
			reqHeaderJson = reqJson.optJSONObject("head");
			head = resoleHead(reqHeaderJson);
			printLog( head);
			commandName = reqJson.optString("cmd");
			respJson = new CmdTaskManager(reqJson, commandName).execut();
		    if(respJson ==null){
		    	err =1;
		    	
		    }
		
		} catch (JSONException e) {
			System.out.println(e.getMessage());
			//log.error("格式错误",e);
			lr.interfaceError("格式错误", e.toString());
			e.printStackTrace();
			err = 1;
		}  catch (CmdMatchException e) {
			err = 2;
			e.printStackTrace();
			//log.error("命令无法匹配", e);
			lr.interfaceError("命令无法匹配", e.toString());
		}catch (Exception e) {
			err =3;
			e.printStackTrace();
			//log.error("服务器逻辑有误", e);
			lr.interfaceError("服务器逻辑有误", e.toString());
			System.out.println("服务器逻辑有误");
		}
		
		try{
			if(err>0){
				respJson = new JSONObject();
				
				
				
			  if(err==1){
				  respJson.put(Commend.RESUIT,  Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
				  respJson.put("errerMsg",  "客户端请求格式错误！");
			  }else if(err==2){
				  respJson.put(Commend.RESUIT, Concat.ResultType.CLIENT_TREATY_FORMAT_ERROR);
				  respJson.put("errerMsg",  "客户端请求格式错误！");
			  }else{
				  respJson.put(Commend.RESUIT,  Concat.ResultType.SERVER_CURRENT_API_FAULT);
				  respJson.put("errerMsg",  "服务端处理失败！");
				
			  }
			}
			
			 //服务器把json 返回给客户端
			    mResponse.setContentType("text/html; charset=utf-8");
			    mResponse.setContentType("application/json; charset=utf-8");
			    System.out.println("返回："+respJson.toString());
			    mResponse.getWriter().write(respJson.toString());
			    mResponse.getWriter().flush();
			    mResponse.getWriter().close();
			
		}
		catch(IOException e){
			e.printStackTrace();
			//log.error(e);
			lr.interfaceError("", e.toString());
		}
		
		

		return ;
	}
	
	private void printLog(Head head) {
		// TODO Auto-generated method stub
		System.out.print(head.getDvdid() + "  1");
		System.out.print(head.getDVDNUMBER() + "  1");
		System.out.print(head.getVAECODE() + "  1");
	}


	public String getJson() {
		String str = "";
		JsonObject js = new JsonObject();
		js.addProperty("result", "200");
		str = js.toString();
		return str;
	}
	
	public Commend getConCommend(JSONObject reqDate, String cmd) throws CmdMatchException {
		Commend commend = null;
	
		
		return commend;

	}
	private Head resoleHead(JSONObject headJson){
		Head head = new Head();
		
	   if(headJson.has(HeadKey.DVDID)){
		   head.setDvdid(headJson.getString(HeadKey.DVDID));
	   }
	   if(headJson.has(HeadKey.DVDNUMBER)){
		   head.setDVDNUMBER(headJson.getString(HeadKey.DVDNUMBER));
	   }
	   if(headJson.has(HeadKey.VAECODE)){
		   head.setVAECODE(headJson.getString(HeadKey.VAECODE));
	   }
	
	   return head;
	}

	
	
}

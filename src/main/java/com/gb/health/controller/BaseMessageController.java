package com.gb.health.controller;

import com.gb.health.utill.GetIp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;


@Controller
/**
 * 调用后台数据
 * @author Administrator
 *
 */
public class BaseMessageController {
	
	
	// 调用用户基本信息方法
	@RequestMapping(value = "getClientBaseMessage", method={RequestMethod.POST,RequestMethod.GET})
	public  String getClientBaseMessage(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		System.out.println(GetIp.getIpAddr(request));
		//设置编码格式
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//获取用户身份证号
		String personid=request.getParameter("personid");
		System.out.println(personid);
		
		//调用后台获取用户基本信息的接口

//		String back=GetCacheDataInfo.getInstance().getUserInfo(personid,"10001");
//		System.out.println(back);
//		
//		try {
//			response.getWriter().write(back);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		/*String back=GetCacheDataInfo.getInstance().getUserInfo(personid,"10001");
		System.out.println(back);
		
		try {
			response.getWriter().write(back);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		return null;	
	}

}

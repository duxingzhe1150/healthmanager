package com.gb.health.controller;

import com.gb.health.init.Const;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;

/**
 * 下载文件接口类
 * @author lx
 *
 */
@Controller
public class DownFileController {
	private static Logger log = Logger.getLogger(DownFileController.class);

	/**
	 * 下载文件接口
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/downHtml", method={RequestMethod.POST,RequestMethod.GET})
	public void downHtml(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//1.设置文件ContentType类型，这样设置，会自动判断下载文件类型  
		response.setContentType("multipart/form-data"); 
		String fileName=request.getParameter("fileName");
		//2.设置文件头：最后一个参数是设置下载文件名(假如我们叫fileName)  
	   response.setHeader("Content-Disposition", "attachment;fileName="+fileName);  
		//response.setHeader("Content-Disposition", "attachment;fileName=");  
		ServletOutputStream out;  
		//通过文件路径获得File对象(假如此路径中有一个fileName文件) 

		File file = new File(Const.FILE_PATH +fileName);
		log.debug(file.getAbsoluteFile()+"路径");
		FileInputStream inputStream = new FileInputStream(file);  
		//3.通过response获取ServletOutputStream对象(out)  
		out = response.getOutputStream();  
		int b = 0;  
		byte[] buffer = new byte[1024];  
		while ((b=inputStream.read(buffer)) != -1){  
			//4.写到输出流(out)中  
			if(b!=-1)
				out.write(buffer,0,b); 
			else
				break;
		}  
		inputStream.close();  
		out.close();  
		out.flush();  
	}




	
}

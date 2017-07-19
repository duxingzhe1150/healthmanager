package com.gb.health.utils;

import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
/**
 * http 请求 （发json）
 * @author Administrator
 *
 */
public class PostJson {
	public static  final Log log = LogFactory.getLog(PostJson.class);
	public static void main(String[] args) {
	 
	}

	public static String sendCiMingData(JSONObject json,String sendurl){
		String back="";
		try{  

			URL url = new URL(sendurl);

			URLConnection urlConnection = url.openConnection();  
			// 设置doOutput属性为true表示将使用此urlConnection写入数据  
			urlConnection.setDoOutput(true);  
			// 定义待写入数据的内容类型，我们设置为application/x-www-form-urlencoded类型  
			urlConnection.setRequestProperty("content-type", "application/x-www-form-urlencoded");  
			// 得到请求的输出流对象  
			OutputStreamWriter out = new OutputStreamWriter(urlConnection.getOutputStream());  
			// 把数据写入请求的Body 

			out.write(json.toString());  
			out.flush();  
			out.close();  
			// 从服务器读取响应  
			InputStream inputStream = urlConnection.getInputStream();  
			String encoding = urlConnection.getContentEncoding(); 
			log.info("encoding"+encoding);
			String body = IOUtils.toString(inputStream, encoding);  
			System.out.println(body);
			back=body;
			log.info("body"+body);
		}catch(IOException e){  
			// Logger.getLogger(RequestTest.class.getName()).log(Level.SEVERE, null, e);  
			e.printStackTrace();									
		} 	
		
		return back;
	}


}

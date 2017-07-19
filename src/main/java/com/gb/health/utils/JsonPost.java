package com.gb.health.utils;

import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * 
 *
 * post 以json形式提交
 * Copyright:   Copyright (c)2016  
* Company:     光宝联合   
 *
 * Create at: 2016年5月20日
 */
public class JsonPost {
	
	 public static String connectionByPost(String url,JSONObject json) throws Exception {
	        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

	        conn.setRequestMethod("POST");
	        conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");

	        conn.setDoInput(true);
	        conn.setDoOutput(true);

	        conn.setUseCaches(false);
	        conn.setInstanceFollowRedirects(true);

	        
	     
	        DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
	        wr.writeBytes(json.toString());
	        wr.flush();
	        wr.close();

	        return printResponse(conn);
	    }

	    private static String printResponse(HttpURLConnection conn) throws Exception {
	       if (conn.getResponseCode() != 200) {
	            // request error
	        }
	        InputStream is = conn.getInputStream();
	        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
	        String line;
	        StringBuffer response = new StringBuffer();
	        while ((line = rd.readLine()) != null) {
	            response.append(line);
	            response.append('\r');
	        }
	        rd.close();

	        System.out.println(response.toString());
	        return response.toString();
	    }


}

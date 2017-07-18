package com.gb.health.utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * http 请求  （只发一个json）
 * @author lx
 *
 */
public class PostHttp {
	
	 public static String loadJSON(String url) {
         StringBuilder json = new StringBuilder();
         try {
             URL oracle = new URL(url);
             URLConnection yc = oracle.openConnection();
             BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream(),"utf-8"));//防止乱码
             String inputLine = null;
             while ((inputLine = in.readLine()) != null) {
                 json.append(inputLine);
             }
             in.close();
         } catch (MalformedURLException e) {
         } catch (IOException e) {
         }
         System.out.println(json.toString());
        return json.toString();
     }

	
	
	
}


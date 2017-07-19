package com.gb.health.utils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonUtil {
	public static String forJson(JSONArray js){
		String str="";
		for (int i = 0; i < js.size(); i++) {
			str+=js.get(i)+":";

		}

		return str;

	}


	public static JSONArray forPaidJson(JSONArray js, Map map,String name){
		
		List<Object> li=new ArrayList<>();
		for (int i = 0; i < js.size(); i++) {
			li.add(map.get(name+js.get(i)));
			
		}
		
	
		JSONArray arr=JSONArray.fromObject(li);
		return arr;

	}

	public static void main(String[] args) {
		

		List<Object> li=new ArrayList<>();
		List<Object> li1=new ArrayList<>();
		List<Object> li2=new ArrayList<>();
		List<Object> li3=new ArrayList<>();
		li.add(1);
		li.add(1);
		li1.add(1);
		li1.add(1);
		li.add(1);
		li2.add(1);
		li3.add(1);
		li3.add(1);
		li3.add(1);
		li2.add(1);
		JSONArray a1=JSONArray.fromObject(li);
		JSONArray a2=JSONArray.fromObject(li1);
		JSONArray a3=JSONArray.fromObject(li2);
		JSONArray a=JSONArray.fromObject(li3);
	
		JSONObject aa=new JSONObject();
		aa.put("111", a1);
		aa.put("222", a2);
		aa.put("333", a3);
		aa.put("444", a);
		
		System.out.println(aa.toString());
	

	}
}

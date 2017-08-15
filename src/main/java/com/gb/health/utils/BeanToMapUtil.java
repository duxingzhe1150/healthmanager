package com.gb.health.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.gb.health.domain.TbHealthArchive;
import com.gb.health.domain.TbHealthDetails;



/**
 * 
 *
 * 将实体bean转换成map对象
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年3月16日
 */
public class BeanToMapUtil {
	
	/**
	 * 
	 * Description:普通bean实体转map的方法
	     * Create at:   2017年3月16日
		 * @param bean
		 * @return
	 */
	public static Map<String, String> getCommonBeanMap(Object bean){
		
		Map<String, String> map= new HashMap<String, String>();
		
		if (bean==null) {
			return map;
		}
		
		try {
			Field[] fields = bean.getClass().getDeclaredFields(); 
			Method[] methods = bean.getClass().getMethods();  
			   for(int i = 0; i < methods.length; i++){  
			       Method method = methods[i];  
			       if(method.getName().startsWith("get") && !method.getName().endsWith("Class")){  
			    	   if (method.invoke(bean)!=null) {
			    		  
			    		   if (method.getReturnType().isAssignableFrom(Date.class)) {
			    			   String key=method.getName().substring(3);
			    			   char[] cs=key.toCharArray();
			    		        
			    		        if(cs[0]>='A'  &&  cs[0]<='Z')  
			    		        {  
			    		        	cs[0]+=32; 
			    		        }  
			    			   
			    			   
				    		   map.put(String.valueOf(cs), DateTransfer.dateToString((Date)method.invoke(bean)));
				    	   }else {
				    		   String key=method.getName().substring(3);
			    			   
			    			   char[] cs=key.toCharArray();
			    			   if(cs[0]>='A'  &&  cs[0]<='Z')  
			    		        {  
			    		        	cs[0]+=32; 
			    		        } 
				    		   map.put(String.valueOf(cs), method.invoke(bean)+"");
				    	   }
			    	   }
			    	   
				    }  
			   }
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
	}
	
	 public static Object mapToObject(Map<String, String> map, Class<?> beanClass) throws Exception {    
	        if (map == null)  
	            return null;    
	  
	        Object obj = beanClass.newInstance();  
	  
	        Field[] fields = obj.getClass().getDeclaredFields();   
	        for (Field field : fields) {    
	            int mod = field.getModifiers();    
	            if(Modifier.isStatic(mod) || Modifier.isFinal(mod)){    
	                continue;    
	            }    
	  
	            field.setAccessible(true); 
	            
	            if (field.getType().isAssignableFrom(Date.class)) {
	            	field.set(obj, map.get(field.getName())==null?null:DateTransfer.dateStringToDate(map.get(field.getName()))); 
				}else if (field.getType().isAssignableFrom(Integer.class)) {
					field.set(obj, map.get(field.getName())==null?null:Integer.parseInt(map.get(field.getName()))); 
				}else if (field.getType().isAssignableFrom(Float.class)) {
					field.set(obj, map.get(field.getName())==null?null:Float.parseFloat(map.get(field.getName()))); 
				}else if (field.getType().isAssignableFrom(Boolean.class)) {
					field.set(obj, map.get(field.getName())==null?null:Boolean.parseBoolean(map.get(field.getName()))); 
				}else {
					field.set(obj, map.get(field.getName())); 
				}
	            
	             
	        }   
	  
	        return obj;    
	    }    
	
	public static void main(String[] args) {
		
		TbHealthArchive archive=new TbHealthArchive();

		archive.setbAddress("dewerwe");

		
		TbHealthDetails tb = new TbHealthDetails();
       try {
		BeanUtils.setProperty(tb, "hWaistline", 1.87   );
		


		System.out.println();

	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
		Map<String, String> map=new HashMap<>();
		
		
		
		
	map.putAll(getCommonBeanMap(archive));
		
		map.put("personid", "11112");
		
		try {
			BeanUtils.populate(archive, map);
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	/*	
		try {
			TbHealthArchive archive2=(TbHealthArchive) mapToObject(map, TbHealthArchive.class);
			
			
			System.out.println(archive2.gethAddress());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println(map);
	}

}

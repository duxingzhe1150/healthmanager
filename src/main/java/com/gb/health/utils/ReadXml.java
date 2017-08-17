package com.gb.health.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.util.ResourceUtils;
import org.springframework.web.context.WebApplicationContext;

import com.gb.health.init.MyContextListener;
/**
 * 读取xml文件内容
 * @author lx
 *
 */
public class ReadXml {
	
	
	private static Logger log = Logger.getLogger(ReadXml.class);
//	static	final String  rootD;
	
	
//	static{
////		WebApplicationContext web = MyContextListener.applicationContext;
////		String path =web.getServletContext().getRealPath("/");
//		String path = null;
//		try {
//			path = MyContextListener.applicationContext.getResource("lifestyle.xml").getFile().getPath();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		rootD = path;
//
//
//		System.out.println(rootD);
//		System.out.println(System.getProperty("hd.root"));
//		log.debug("System.getProperty)"+System.getProperty("hd.root"));
//		log.debug("rootD"+rootD);
//	}
	
	

	 public static void main(String[] args) throws Exception {
		 
		 
//		 System.out.println(rootD);
		 
/*		 File f = new File("src/test/hospital.xml");
		 System.out.println(f.isFile());
		 
		 System.out.println(f.getAbsolutePath());*/
/*			
		 getCompany();
		 getHospital();*/
		 getLifeStyle();	 

		 }
	 
	 
	 
/**
 * 读company.xml文件
 * @return
 */
	public  static LinkedHashMap<Object, String> getCompany()  {
		SAXReader reader = new SAXReader();

		//File file = new File("/data/medical/page.xml");
	    //File file = new File("/data/medical/pageee.xml");
		File file = new File("company.xml");

		//File file = new File("f:/page.xml");
		  Document document=null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
			
		}
		  Element root = document.getRootElement();
		  List<Element> childElements = root.elements();
		  LinkedHashMap<Object, String>map=new LinkedHashMap<Object, String>();
		  for (Element child : childElements) {
	
		   System.out.println("id:" + child.elementText("id"));
		  System.out.println("name:" + child.elementText("companyname"));
		  map.put(child.elementText("id"), child.elementText("companyname")); 
		  
		
		  }
		  
//		  for (Object ma : map.keySet()) {
//				
//				System.out.println(map.get(ma));
//			}
		  return map;

	}

	/**
	 * 读hospital.xml文件
	 * @return
	 */
	public static  LinkedHashMap<Object, String> getHospital()  {
		SAXReader reader = new SAXReader();

		File file = new File("hospital.xml");

		//File file = new File("f:/page.xml");
		System.err.println(file.getAbsolutePath());
		  Document document=null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
			
		}
		  Element root = document.getRootElement();
		  List<Element> childElements = root.elements();
		  LinkedHashMap<Object, String>map=new LinkedHashMap<Object, String>();
		  for (Element child : childElements) {
	
		   System.out.println("id:" + child.elementText("id"));
	  System.out.println("name:" + child.elementText("hospitalname"));
		  map.put(child.elementText("id"), child.elementText("hospitalname")); 
		  
		
		  }
		  
//		  for (Object ma : map.keySet()) {
//				
//				System.out.println(map.get(ma));
//			}
		  return map;

	}
	/**
	 * 读lifestyle.xml文件
	 * @return
	 */
	public static  LinkedHashMap<Object, String> getLifeStyle()  {
		SAXReader reader = new SAXReader();

//		File file = new File("lifestyle.xml");
		File file = null;
		try {
			file = ResourceUtils.getFile("classpath:lifestyle.xml");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//	File file = new File("/HealthManger/WebContent/WEB-INF/lifestyle.xml");
		System.err.println(file.getAbsolutePath());
		  Document document=null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
			
		}
		  Element root = document.getRootElement();
		  List<Element> childElements = root.elements();
		  LinkedHashMap<Object, String>map=new LinkedHashMap<Object, String>();
		  for (Element child : childElements) {
	
//		   System.out.println("key:" + child.elementText("key"));
//	       System.out.println("name:" + child.elementText("name"));
//	       System.out.println("my_id:" + child.elementText("my_id"));
//	       System.out.println("title:" + child.elementText("title"));
//	  
	  
			  map.put(child.elementText("key")+child.elementText("title"), child.elementText("my_id")); 
		  
			 // map.put(child.elementText("my_id"),child.elementText("title")); 
		  }
		//  System.out.println(map.get("初中"));
		 
		  return map;

	}
	
	
	
	/**
	 * 读lifestyle.xml文件
	 * @return
	 */
	public static  LinkedHashMap<Object, String> getLifeStyleValue()  {
		SAXReader reader = new SAXReader();

		File file = new File("lifestyle.xml");

	//	File file = new File("/HealthManger/WebContent/WEB-INF/lifestyle.xml");
		System.err.println(file.getAbsolutePath());
		  Document document=null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			log.error(e);
			e.printStackTrace();
			
		}
		  Element root = document.getRootElement();
		  List<Element> childElements = root.elements();
		  LinkedHashMap<Object, String>map=new LinkedHashMap<Object, String>();
		  for (Element child : childElements) {
	
//		   System.out.println("key:" + child.elementText("key"));
//	       System.out.println("name:" + child.elementText("name"));
//	       System.out.println("my_id:" + child.elementText("my_id"));
//	       System.out.println("title:" + child.elementText("title"));
//	  
	  
			 // map.put(child.elementText("key")+child.elementText("title"), child.elementText("my_id")); 
		  
			  map.put(child.elementText("my_id"),child.elementText("title")); 
		  }
		//  System.out.println(map.get("初中"));
		 
		  return map;

	}
}

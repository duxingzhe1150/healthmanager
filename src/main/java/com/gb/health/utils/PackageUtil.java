package com.gb.health.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.loader.WebappClassLoader;


	public class PackageUtil {

	  /**
	   * 返回包下所有的类
	   *
	   * @param packagePathList   包名全路径集合
	   * @param classWithPath 返回全路径开关 true 自动带上包名 false 只返回类名
	   *  包下所有的类
	   */
	  public static List<String> getPackageClasses(List<String> packagePathList, boolean classWithPath) {
	    List<String> result = new ArrayList<>();
	    for(String packagePath : packagePathList) {
	      List<String> classNames = getClassName(packagePath);
	      String path = classWithPath ? packagePath + "." : "";
	      for (String className : classNames) {
	    	  System.out.println(className);
	        //className:com.example.myFirstProject.enums.SexEnum
	        result.add(path + className.substring(className.lastIndexOf(".") + 1));
	      }
	    }
	    return result;
	  }

	  /**
	   * 获取该报名全路径下的所有class全路径集合
	   * @param packageName 包名全路径
	   * @return
	   */
	  private static List<String> getClassName(String packageName) {
	    //根据报名获取该package的系统路径

		/*  System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
		  System.out.println(packageName);*/
		  // String filePath = PackageUtil.class.getClassLoader().getResource("")+ packageName.replace(".", File.separator);
		  //String filePath=com.sun.org.apache.bcel.internal.util.ClassLoader.getSystemResource("").getPath() + packageName.replace(".", "\\");
		 String filePath= Thread.currentThread().getContextClassLoader().getResource("").getPath()+ packageName.replace(".", File.separator);
		 // String filePath=ClassLoader.getSystemResource("").getPath() + packageName.replace(".", "\\");
            System.out.println("filePath:"+filePath);
		  System.out.println(ClassLoader.getSystemResource(""));
		  System.out.println(packageName);
	  //String filePath = PackageUtil.class.getClassLoader().getResource("")+ packageName.replace(".", "\\");
		//  String filePath=Thread.currentThread().getContextClassLoader().getSystemResource("").getPath() + packageName.replace(".", "\\");

	    // filePath: /D:/workspace-git/springbootlearning/target/classes/com\example\myFirstProject\enums
	    List<String> fileNames = getClassName(filePath, null);
	    return fileNames;
	  }

	  /**
	   * 获取filePath文件夹下的所有class的全路径集合
	   * @param filePath
	   * @param className
	   * @return
	   */
	  private static List<String> getClassName(String filePath, List<String> className) {
	    List<String> myClassName = new ArrayList<>();
	    File file = new File(filePath);
	    File[] childFiles = file.listFiles();
	    for (File childFile : childFiles) {
	      if (childFile.isDirectory()) {
	        //递归获取该文件夹下的子文件夹里的所有文件
	        myClassName.addAll(getClassName(childFile.getPath(), myClassName));
	      } else {
	        String childFilePath = childFile.getPath();
	        //childFilePath:  D:\workspace-git\springbootlearning\target\classes\com\example\myFirstProject\enums\SexEnum.class
	        childFilePath = childFilePath.substring(childFilePath.indexOf(File.separator+"classes") + 9, childFilePath.lastIndexOf("."));
	        childFilePath = childFilePath.replace(File.separator, ".");
	        myClassName.add(childFilePath);
	      }
	    }

	    return myClassName;
	  }

	}


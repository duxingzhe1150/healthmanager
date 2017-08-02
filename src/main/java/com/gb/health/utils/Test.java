/**
 * FileName:     Test.java
 * @Description: TODO
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       ZTE-ITS WuXi LTD.
 * @author:    
 * @version    V1.0 
 * Createdate:         2017年2月13日 下午4:44:00
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017年2月13日       wu.zh          1.0             1.0
 * Why & What is modified: <修改原因描述>
 */

package com.gb.health.utils;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName:     Test.java
 * @Description:   TODO
 * 
 * @author         Administrator
 * @version        V1.0  
 * @Date           2017年2月13日 下午4:44:00 

 */
public class Test {
	
	
	public static void main(String[] args) {
		
		
		
	/*    try {  
            SolrClient solr = new HttpSolrClient("http://localhost:8983/solr/mycore");  
            SolrQuery query = new SolrQuery("头痛"); //定义查询内容  
            query.setStart(0);//起始页  

            query.setHighlight(true).setHighlightSnippets(1);
            query.setParam("hl.fl", "ti");
            query.setRows(10);//每页显示数量  
        
            QueryResponse rsp = solr.query( query );  
            SolrDocumentList results = rsp.getResults();
            System.out.println(rsp.getHighlighting());
            System.out.println(results.getNumFound());//查询总条数  
            
            for(SolrDocument doc:results){  
                System.out.println(doc);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }*/

		ArrayList<String> listFileName = new ArrayList<String>();
		getAllFileName("E:\\ABC\\体检报告",listFileName);
		for(String name:listFileName)
		{
			System.out.println(name);
		}
	}


	//获取指定文件夹中的所有文件夹名
	public static String [] getFileName(String path)
	{
		File file = new File(path);
		String [] fileName = file.list();
		return fileName;
	}
	//获取指定文件夹中的所有文件名
	public static void getAllFileName(String path,ArrayList<String> fileName)
	{
		File file = new File(path);
		File [] files = file.listFiles();
		String [] names = file.list();
		if(names != null)
			fileName.addAll(Arrays.asList(names));
		for(File a:files)
		{
			if(a.isDirectory())
			{
				getAllFileName(a.getAbsolutePath(),fileName);
			}
		}
	}
	
	

}

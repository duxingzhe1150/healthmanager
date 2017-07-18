package com.gb.health.service;

import com.gb.health.dao.AnalysisMapper;
import com.gb.health.domain.Analysis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 
 *
 * 对症状信息操作的方法
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年2月7日
 */
@Service(value="symptomService")
public class SymptomService {
	
	@Autowired
	private AnalysisMapper analysisMapper;
	
	public int insert(Analysis analysis){
		
		return analysisMapper.insert(analysis);
	}
	
	public List<Analysis> select(){
		
		return analysisMapper.selectAll();
	}
	
	public Analysis selectByNumber(String number){
		
		return analysisMapper.selectNextByNumber(number);
	}
	
	
	public String getRootNumId(String type){
		
		String child_arr="00000101"+type;
		
		return child_arr;
	}
	
	
	/**
	 * 
	 * Description: 根据父编号及指定的类型生成子编号   
	     * Create at:   2017年1月22日
		 * @param fartherId 父编号
		 * @param childType 类型
		 * @return
	 */
	public String getChildNumId(String fartherId,boolean childType){
		
		String deepth=fartherId.substring(6, 8);
		String fartherNum=fartherId.substring(0, 6);
		
		int deepth_int=Integer.parseInt(deepth);
		
		int deepth_child=deepth_int+1;
		
		int child_sex=0x1;
		
		if (!childType) {
			child_sex=0x0;
		}
		
		int childNum=Integer.parseInt(fartherNum,16) | (child_sex<<deepth_int);
		
		
		StringBuilder childNumId=new StringBuilder(String.format("%6x", childNum).replace(" ", "0"));
		
		childNumId.append(String.format("%2d", deepth_child).replace(" ", "0"));
		 
		childNumId.append(fartherId.substring(8, 10));
		
		return childNumId.toString();
	}
	
	/**
	 * 
	 * Description: 根据父编号生成所有（两种）子编号  
	     * Create at:   2017年1月22日
		 * @param fartherId 父编号
		 * @return 字符串数组类型
	 */
	public String[] getChildNumId(String fartherId){
		
		String[] child_arr=new String[2];
		
		
		child_arr[0]=getChildNumId(fartherId, true);
		child_arr[1]=getChildNumId(fartherId, false);
		
		return child_arr;
	}
	
	/**
	 * 
	 * Description: 根据子编号找出其对应的父编号  
	     * Create at:   2017年1月22日
		 * @param childNumId
		 * @return
	 */
	public String getFartherNumId(String childNumId){
		
		String deepth=childNumId.substring(6, 8);
		String childNum=childNumId.substring(0, 6);   
		
		int deepth_int=Integer.parseInt(deepth);
		
		int deepth_farther=deepth_int-1;
		
		System.out.println(Integer.parseInt(childNum,16));
		
		int fartherNum=Integer.parseInt(childNum,16) & 0xffffff>>24-deepth_farther;
		
		
		StringBuilder fartherNumId=new StringBuilder(String.format("%6x", fartherNum).replace(" ", "0"));
		
		fartherNumId.append(String.format("%2d", deepth_farther).replace(" ", "0"));
		 
		fartherNumId.append(childNumId.substring(8, 10));
		
		return fartherNumId.toString();
	}

}

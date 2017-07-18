package com.gb.health.algorithm;

import com.gb.health.op.Diabetes;
import com.gb.health.op.DiabetesSuggest;
import org.apache.log4j.Logger;

/**
 * 
 *
 * 糖尿病风险评估
 * Copyright:   Copyright (c)2017  
* Company:     光宝联合   
 *
 * Create at: 2017年5月16日
 */
public class DiabetesQuesAlgorithmAq extends AbsFactory<Diabetes, DiabetesSuggest>{

	private Logger logger=Logger.getLogger(DiabetesQuesAlgorithmAq.class);
	
	@Override
	public Object suggest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiabetesSuggest result(FetureInter<Diabetes> fi) {
		
		Diabetes diabetes=fi.getParam();
		
		//数据校验
		if (diabetes==null || diabetes.getB_age()==null || diabetes.getB_weight()==null || 
			diabetes.getB_heght()==null ||diabetes.getB_sex()==null || diabetes.getB_waistline()==null ||
			diabetes.getFamaly()==null || diabetes.getHyperglycemia()==null || diabetes.getHypotensor()==null ||
			diabetes.getL_liveFood_fruit()==null || diabetes.getL_liveFood_vegetable()==null ||
			diabetes.getL_liveSport_minuteCount()==null) {
			
			return null;
		}
		
		int result=0;
		
		//年龄分数
		try {
			int[] ageScore={0,2,3,4};
			result+=ageScore[diabetes.getB_age()];
		} catch (Exception e) {
			logger.error("年龄信息出现异常！："+diabetes.getB_age());
			return null;
		}
		
		//BMI分数
		Float bmi=diabetes.getB_weight()*10000/diabetes.getB_heght()*diabetes.getB_heght();
		if (bmi<24) {
			result+=0;
		}else if (bmi<=28) {
			result+=1;
		}else {
			result+=3;
		}
		
		//腰围分数
		int waistline=diabetes.getB_waistline();
		if (diabetes.getB_sex()==0) {
			waistline-=5;
		}
		if (waistline<80) {
			result+=0;
		}else if (waistline<=90) {
			result+=3;
		}else {
			result+=4;
		}
		
		//锻炼分数
		result+=diabetes.getL_liveSport_minuteCount()==1 ? 0 :2;
		
		//水果分数
		result+=diabetes.getL_liveFood_fruit()==1 ? 0 :1;
		
		//蔬菜分数
		result+=diabetes.getL_liveFood_vegetable()==1 ? 0 :1;
		
		//降压药分数
		result+=diabetes.getHypotensor()==0 ? 0 :2;
		
		//高血糖分数
		result+=diabetes.getHyperglycemia()==0 ? 0 :5;
		
		//亲属中有被确诊为糖尿病分数
		if (diabetes.getFamaly()==0) {
			result+=0;
		}else if (diabetes.getFamaly()==1) {
			result+=5;
		}else if (diabetes.getFamaly()==2) {
			result+=3;
		}
		
		DiabetesSuggest diabetesSuggest=new DiabetesSuggest();
		
		diabetesSuggest.setScore(result);
		
		if (result<7) {
			diabetesSuggest.setLevel("较低");
			diabetesSuggest.setRiskIndex(1f);
		}else if (result<=11) {
			diabetesSuggest.setLevel("轻度升高");
			diabetesSuggest.setRiskIndex(4f);
		}else if (result<=14) {
			diabetesSuggest.setLevel("中度升高");
			diabetesSuggest.setRiskIndex(17f);
		}else if (result<=20) {
			diabetesSuggest.setLevel("较高");
			diabetesSuggest.setRiskIndex(33f);
		}else {
			diabetesSuggest.setLevel("非常高");
			diabetesSuggest.setRiskIndex(50f);
		}
		
		return diabetesSuggest;
	}

}

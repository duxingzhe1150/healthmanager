package com.gb.health.algorithm;

import com.gb.health.op.Stroke;

public class StrokeQuesAlgorithmAq extends AbsFactory<Stroke, String>{

	@Override
	public Object suggest() {
		
		return null;
	}

	@Override
	public String result(FetureInter<Stroke> fi) {
		
		Stroke stroke=fi.getParam();
		
		if (stroke.getStroke()==null || stroke.getTIA()==null ||  stroke.getWeight()==null || 
				stroke.getHeight()==null || stroke.getBloodFat() ==null || stroke.getDiabetes() ==null ||
				stroke.getExercise()==null ||  stroke.getFamily()==null ||  stroke.getHypertension()==null ||
				stroke.getMyocarditis()==null ||  stroke.getSmoking()==null) {
			
			return null;
		}
		
		if (stroke.getStroke()==1) 
			return "脑卒中";
		
		if (stroke.getTIA()==1) 
			return "高危";
		
		
		Float bmi=stroke.getWeight()*10000/(stroke.getHeight()*stroke.getHeight());
		
		Integer score=stroke.getBloodFat()+stroke.getDiabetes()+stroke.getExercise()+
				stroke.getFamily()+stroke.getHypertension()+stroke.getMyocarditis()+
				stroke.getSmoking()+(bmi>26 ? 1 :0);
		
		Integer score_flag=stroke.getDiabetes()+stroke.getHypertension()+stroke.getMyocarditis();
		
		if (score>=3) 
			return "高危";
		else if (score_flag>=1) 
			return "中危";
		
		return "低危";
		
		
	}
	


}

package com.gb.health.algorithm;

import com.gb.health.op.Hypertension;
import com.gb.health.op.HypertensionSuggest;
import org.apache.log4j.Logger;

public class HypertensionQuesAlgorithmAq extends AbsFactory<Hypertension, HypertensionSuggest>{

	private Logger logger=Logger.getLogger(HypertensionQuesAlgorithmAq.class);
	
	@Override
	public Object suggest() {
		
		return null;
	}

	@Override
	public HypertensionSuggest result(FetureInter<Hypertension> fi) {
		
		Hypertension hypertension=fi.getParam();
		
		if (hypertension.getAge()==null || hypertension.getDiastolic()==null|| 
				hypertension.getHeight()==null || hypertension.getParent()==null ||
				hypertension.getSystolic()==null || hypertension.getWeight()==null) {
			
			return null;
		}
		
		Float bmi=hypertension.getWeight()*10000/(hypertension.getHeight()*hypertension.getHeight());
		
		int[] ageScore={0,1,3,5};
		
		int[] systolicScore={1,8,13};
		
		int[] diastolicScore={1,3,4};
		
//		int[] bmiScore={};
		
		int[] parentScore={1,1,5};
		
		int scoreResult=0;
		
		try {

			System.out.println(hypertension.getAge());
			System.out.println(hypertension.getSystolic());
			System.out.println(hypertension.getDiastolic());
			System.out.println(hypertension.getParent());
			
			    scoreResult=ageScore[hypertension.getAge()]+systolicScore[hypertension.getSystolic()]+
					diastolicScore[hypertension.getDiastolic()]+parentScore[hypertension.getParent()];
			
			if (bmi<24) 
				scoreResult+=1;
			else if(bmi<28)
				scoreResult+=4;
			else
				scoreResult+=7;
		} catch (Exception e) {
			
			logger.error("数据数值超出范围");
			
			
			
			return null;
		}
		
		HypertensionSuggest hypertensionSuggest=new HypertensionSuggest();
		
		Float[] indexs={29.3f,29.3f,31.8f,34.4f,37.2f,40.0f,42.9f,45.8f,48.7f,51.7f,54.6f,57.6f,60.4f,63.2f,65.9f,68.5f,71.0f,73.4f,75.7f,77.8f,79.8f,81.6f,83.3f,84.9f,86.4f,87.7f,88.9f,90.0f,91.0f,92.0f,92.8f};
		
		try {
			System.out.println(scoreResult+"--------------------");
			hypertensionSuggest.setRiskIndex(indexs[scoreResult-4]);
		} catch (Exception e) {
			logger.error("分数数值超出范围");
			System.out.println(e.getMessage());
			
			return null;
		}
		
		if (scoreResult<=12) {
			hypertensionSuggest.setLevel("低危");
		}else if (scoreResult<=24) {
			hypertensionSuggest.setLevel("中危");
		}else if (scoreResult<=30) {
			hypertensionSuggest.setLevel("高危");
		}else if (scoreResult<=34) {
			hypertensionSuggest.setLevel("极高危");
		}
		
		hypertensionSuggest.setScore(scoreResult);
		
		return hypertensionSuggest;
		
		
	}
	
	public static void main(String[] args) {
		
		Float index=29.3f;
		
		Float[] indexs={29.3f,31.8f,34.4f,37.2f,40.0f,42.9f,45.8f,48.7f,51.7f,54.6f,57.6f,60.4f,63.2f,65.9f,68.5f,71.0f,73.4f,75.7f,77.8f,79.8f,81.6f,83.3f,84.9f,86.4f,87.7f,88.9f,90.0f,91.0f,92.0f,92.8f};
		
		for (int i = 0; i < indexs.length; i++) {
			
			System.out.println(indexs[i]);
			
		}
		
	}
	


}

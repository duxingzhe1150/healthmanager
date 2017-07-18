package com.gb.health.algorithm;

import com.gb.health.domain.TbHealthArchive;
import com.gb.health.op.Obesity;

public class ObesityQuesAlgorithmAq extends AbsFactory<TbHealthArchive, Obesity>{

	@Override
	public Object suggest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Obesity result(FetureInter<TbHealthArchive> fi) {
		
		TbHealthArchive archive=fi.getParam();
		
		if (archive==null || archive.getbWeight()==null || archive.getbHeght()==null) {
			
			return null;
			
		}
		
		//计算BMI,结果暂时保留两位小数
		Float result=archive.getbWeight()/(archive.getbHeght()*archive.getbHeght());
		result=Math.round(result*100*10000)/100.0f;
		
		Obesity obesity=new Obesity();
		
		obesity.setBMI(result);
		
		//判断是否为肥胖症
		if (result<28) {
			
			//obesity.setIsObesity(false);
			obesity.setLevel("正常");
			obesity.setRisk("低风险");
			
		}else {
			
			//obesity.setIsObesity(true);
			obesity.setRisk("高风险");
			//确定肥胖症的级别
			if (archive.getbWaistline()==null || archive.getbSex()==null) {
				
				obesity.setLevel("肥胖");
				return obesity;
			}
			
			if ("0".equals(archive.getbSex())) {
				
				if (archive.getbWaistline()>90) {
					obesity.setLevel("中心性肥胖二级");
				}else if (archive.getbWaistline()>85) {
					obesity.setLevel("中心性肥胖一级");
				}else {
					obesity.setLevel("肥胖");
				}
				
			}else {
				if (archive.getbWaistline()>85) {
					obesity.setLevel("中心性肥胖二级");
				}else if (archive.getbWaistline()>80) {
					obesity.setLevel("中心性肥胖一级");
				}else {
					obesity.setLevel("肥胖");
				}
			}
			
		}
		
		return obesity;
	}
	
	public static void main(String[] args) {
		Float result=22.344f;
		
		result=Math.round(result*100)/100.0f;
		
		System.out.println(result);
	}

}

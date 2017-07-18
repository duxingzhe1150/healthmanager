package com.gb.health.algorithm;

import com.gb.health.op.ICVD;

public class ICVDQuesAlgorithmAq extends AbsFactory<ICVD, Integer>{

	@Override
	public Object suggest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer result(FetureInter<ICVD> fi) {

		ICVD icvd=	fi.getParam();
		
		if (icvd==null) {
			throw new RuntimeException("数据为空！--data is null");
		}
		
		int result=0;
		
		if (icvd.getB_age()==null  || icvd.getB_sex()==null || icvd.getBiochemical_tc()==null ||
				icvd.getB_weight()==null || icvd.getB_heght()==null || icvd.getGenerl_systolic()==null ||
				icvd.getL_smoke_condition()==null  || icvd.getDiabetes()==null) {
			return -10;
		}
		
		//年龄分
		result+=icvd.getB_age();
		
		//体重指数分
		Float bmi=icvd.getB_weight()*10000/(icvd.getB_heght()*icvd.getB_heght());
		bmi=Math.round(bmi*100)/100.0f;
		icvd.setGenerl_bmi(bmi);
		
		if (bmi>=28) {
			result+=2;
		}else if (bmi>=24) {
			result+=1;
		}
		
		//总胆固醇分
		result+=icvd.getBiochemical_tc();
		
		//收缩压男
		Integer[] generl_systolic_m={-2,0,1,2,5,8};
		
		//收缩压女
		Integer[] generl_systolic_w={-2,0,1,2,3,4};
		
		//吸烟男
		Integer[] l_smoke_condition_m={0,2};
		
		//吸烟女
		Integer[] l_smoke_condition_w={0,1};
		
		//糖尿病男
		Integer[] diabetes_m={0,1};
		
		//糖尿病女
		Integer[] diabetes_w={0,2};
		
		try {
			switch (icvd.getB_sex()) {
			case 0:
				result+=generl_systolic_m[icvd.getGenerl_systolic()];
				result+=l_smoke_condition_m[icvd.getL_smoke_condition()];
				result+=diabetes_m[icvd.getDiabetes()];
				break;

			case 1:
				result+=generl_systolic_w[icvd.getGenerl_systolic()];
				result+=l_smoke_condition_w[icvd.getL_smoke_condition()];
				result+=diabetes_w[icvd.getDiabetes()];
				break;

			default:
				throw new RuntimeException("性别数据错误--sex is wrong");
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int result = (63-35)/5;
		
		System.out.println(result);
	}

}

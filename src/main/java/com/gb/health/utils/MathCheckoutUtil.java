package com.gb.health.utils;

public class MathCheckoutUtil {
	
	/**
	 * 
	 * Description: 检查整型包装类是否为空，若为空，则返回0
	     * Create at:   2017年3月22日
		 * @param i
		 * @return
	 */
	public final static Integer integerCheckAndTransfer(Integer i){
		
		return i==null ? 0 : i;
	}
	
	/**
	 * 
	 * Description: 统计一组布尔类型的数据中，值为true的个数
	     * Create at:   2017年3月22日
		 * @param booleans
		 * @return
	 */
	public final static int booleanCount(Boolean... booleans){
		
		int count=0;
		
		if (booleans==null || booleans.length<=0) {
			return count;
		}
		
		for (int i = 0; i < booleans.length; i++) {
			if (booleans[i]!=null && booleans[i]) {
				count+=1;
			}
		}
		
		return count;
	}

}

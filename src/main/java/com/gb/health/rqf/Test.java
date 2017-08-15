package com.gb.health.rqf;

import com.gb.health.domain.CiMing;

public class Test {
	public static void main(String[] args) {
	
	/*	CimingServiceR ci = new CimingServiceR();
		DataHeader<CiMing> dh = new DataHeader<>(ci);
		dh.setEntiy(new CiMing());
		dh.dataIn.loadRedis("14042719901015813X");
		System.out.println(dh.getDataIn().getEntity().eye.getOphthalmology_colorvision());*/
		
		/*dh.dataIn.loadPathFile("D:\\", "wh.html");
		System.out.println("-----------------------");
		System.out.println(dh.getDataIn().getEntity().eye.getOphthalmology_colorvision());
		dh.dataOut.outRedis("14042719901015813X");*/
		new Test().test();
		
	}
	
	
	
	public void test(){
		CimingServiceR ci = new CimingServiceR();
		DataHeader<CiMing> dh = new DataHeader<>(ci);
		dh.setEntiy(new CiMing());
		boolean b = dh.dataIn.loadPathFile("D:\\", "姚磊.html");
		dh.dataOut.outRedis("1");
		System.out.println(b);
		
		
		
	}
	
	
	public void suchIm(String dir){
		CimingServiceR ci = new CimingServiceR();
		DataHeader<CiMing> dh = new DataHeader<>(ci);
		dh.setEntiy(new CiMing());
		boolean bo = dh.dataIn.loadPathFile("D:\\", "黄宇hy.html");
		System.out.println(bo);
		
/*		File file = new File(dir);
		if(file.isDirectory()){
			
		File[] files =	file.listFiles();
		for (int j = 0; j < files.length; j++) {
			if(files[j].getAbsolutePath().endsWith(".html")){
				System.out.println(dir+"  "+files[j].getName());
				dh.dataIn.loadPathFile(dir, files[j].getName());
			//	dh.dataOut.outRedis(dh.dataIn.getEntity().baseinfo.getB_personid());
				System.out.println(j+" j "+dh.dataIn.getEntity().baseinfo.getB_personid()+"  "+dh.dataIn.getEntity().baseinfo.getB_name());
				
			}
		}
		}*/
		
		
		
		
		/*dh.dataIn.loadPathFile("D:\\", "wh.html");
		
		dh.dataOut.outRedis("14042719901015813X");*/
		
		
		
		
		
		
		
		
	}


}

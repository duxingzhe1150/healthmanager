package com.gb.health.rqf;

public interface DataOut {
	
	
	public boolean outRedis(String key);
	
	public boolean outMysql();
	
	public boolean outFile(String addr);


}

package com.gb.health.rqf;
import com.gb.health.init.ErrerCode;

public interface DataOut {
	
	
	public boolean outRedis(String key);
	
	public boolean outMysql();
	
	public boolean outFile(String addr);


}

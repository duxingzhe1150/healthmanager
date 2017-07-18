package com.gb.health.utill;

import org.apache.log4j.Logger;



public class LogRecordInf {

	private static Logger log = null;

	public LogRecordInf(Class cal){
		log=Logger.getLogger(cal);
		
		  
	}

     public void interfaceDebug(String content ,String data){
    	 
    	 log.debug("interface:"+content+":"+data);
    	 
     }
     
     public void interfaceInfo(String content ,String data){
    	 
    	 log.info("interface:"+content+":"+data);
    	 
    	 
     }

    public void interfaceError(String content,String data){
    	 
    	 log.error("interface:"+content+":"+data);
    	 
    	 
     }


}

package com.gb.health.commend;


import com.gb.health.utils.LogRecordInf;

public class CmdMatchException extends Exception {
	LogRecordInf lr= new LogRecordInf(CmdMatchException.class);
	public CmdMatchException(String msg){
		super(msg);
		lr.interfaceInfo("异常：", msg);
	};

}

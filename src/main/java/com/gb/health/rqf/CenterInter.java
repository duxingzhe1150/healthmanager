package com.gb.health.rqf;
//中心对象
public interface CenterInter<T> {
	
	public DataIn<T> getDataIn();

	public DataOut getDataOut();
	
	public void setEntiy(T t);
	
	
    
	
	

}

package com.gb.health.rqf;


public  class DataHeader<T> implements CenterInter<T>{
	public DataIn<T> dataIn;
	DataOut dataOut;
	AbsCenter<T> abs;
	public DataHeader(AbsCenter<T> abs){
		this.dataIn = abs;
		this.dataOut = abs;
		this.abs = abs;
		
	}
	
	

	@Override
	public DataIn<T> getDataIn() {
		// TODO Auto-generated method stub
		
		return dataIn;
	}

	@Override
	public DataOut getDataOut() {
		// TODO Auto-generated method stub
		return dataOut;
	}



	@Override
	public void setEntiy(T t) {
		// TODO Auto-generated method stub
		this.abs.setEntiy(t);
	}

	
	



}

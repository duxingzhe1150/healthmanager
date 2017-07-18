package com.gb.health.rqf;

//接口， 从不同地方获取数据源
public interface DataIn<T> {
	
	
	
	public boolean loadPathFile(String path, String fileName);
	public boolean loadRedis(String key);
	
	public T loadSql(Object ob, Class<T> cls);
	
	public T getEntity();
	
	
	

	

}

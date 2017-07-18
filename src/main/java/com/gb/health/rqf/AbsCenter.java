package com.gb.health.rqf;

import com.gb.health.conn.DB;
import com.gb.health.op.Result;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
//该类对datain  和dataout 做基本实现
public   class AbsCenter<T> implements DataIn<T>,DataOut  {
	
	private T t;
	private static Logger log = Logger.getLogger(AbsCenter.class);
	
	
	public void setEntiy(T t){
		this.t = t;
	}
	
	@Override
	public boolean loadPathFile(String path, String fileName) {
		// TODO Auto-generated method stub

		if(StringUtils.isBlank(path) || StringUtils.isBlank(fileName) ){
			log.info("file name and path is null  path"+path+"  fileName"+fileName);
			return false;
		}
		
		File file = new File(path, fileName);
		
	/*	if(!file.exists()){
			log.info("file is not exis");
			return false;
		}*/
		
		this.t = loadPath(file);
		if(t == null){
			return false;
		}
		return true;
	}
	
	
 
	
	public  T loadPath(File file) {
		
		
		return null;
	}
	

	
	
    
	
	
	
	@Override
	public boolean loadRedis(String key) {
		Result<T> res=	CustomloadRedis(key);
		if(res != null){
			
			if(res.isSucess()){
				setEntiy(res.getResult());
				return true;
			}
			return false;
		}
	
		
	 	DB db=new DB();
	    Map<String, String> map =	db.getCacheDataByKey(key).getProperties();
	  
		try {
			BeanUtils.populate(t, map);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 setEntiy(t);
		return true;
	}
	
	
   public Result<T> CustomloadRedis(String key){
	return null;
	}

	





	@Override
	public T loadSql(Object ob, Class<T> cls) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public T getEntity() {
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public boolean outRedis(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean outMysql() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean outFile(String addr) {
		// TODO Auto-generated method stub
		return false;
	}


















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

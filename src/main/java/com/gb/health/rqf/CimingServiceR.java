package com.gb.health.rqf;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.gb.health.commend.GetUploadHealthC;
import com.gb.health.conn.DB;
import com.gb.health.domain.CiMing;
import com.gb.health.init.ErrerCode;
import com.gb.health.op.Result;

public class CimingServiceR extends AbsCenter<CiMing>{
	
	
	private static Logger log = Logger.getLogger(CimingServiceR.class);
	
	
	@Override
	public CiMing loadPath(File file) {
		GetHtmlData gethtmlData = new GetHtmlData();
		CiMing ciming = gethtmlData.getCiMingHtmlData(file);
		return ciming;
		
	}
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		CiMing ci = new CiMing();
		Field[] filed = ci.getClass().getFields();
		for (int i = 0; i < filed.length; i++) {
			System.out.println(filed[i].getType().getSimpleName());
			  filed[i].set(ci, filed[i].getType().newInstance());
				
			System.out.println(filed[i].get(ci));
		}
	}
	
 @Override
public boolean outRedis(String key) {
		System.out.println("key"+key);
     CiMing ciMIng =	super.getEntity();
     
     if(ciMIng.cbc== null ||ciMIng.baseinfo == null){
    	 log.info("ciming 实例为空");
    	 return false;
     }
 	Field[] filed = CiMing.class.getFields();
 	for(int i=0;i<filed.length;i++){
 		String smkey = "CiMing_"+filed[i].getType().getSimpleName()+key;
		Map<String, String> prop=new HashMap<String, String>();
		try {
			if(filed[i].get(ciMIng)== null){
				continue;
			}
			prop = BeanUtils.describe(filed[i].get(ciMIng));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
    Iterator<String> it=prop.keySet().iterator();
		
		while(it.hasNext()){
			
			String key1=it.next();
			if(prop.get(key1)==null){
				it.remove();
			}
		}
		
		System.out.println(prop+"accccccccccccccccccccccccccc");
		
		DB db=new DB();
		
		db.creatCacheData(smkey).setProperties(prop).saveWithoutTime();
 		
 	}
     
     
	 
	 
	
	return true;
}
	
	@Override
	public Result<CiMing> CustomloadRedis(String key) {
		DB db=new DB();
		Field[] filed = CiMing.class.getFields();
	    Result<CiMing> t = Result.newResult();
	    CiMing cm = super.getEntity();
		for (int i = 0; i < filed.length; i++) {
			  Map<String, String> map =	db.getCacheDataByKey("CiMing_"+filed[i].getType().getSimpleName()+key).getProperties();
			 
			  try {
				filed[i].set(cm, filed[i].getType().newInstance());
			    BeanUtils.populate(filed[i].get(cm), map);
			} catch (IllegalArgumentException e) {
				  t.setErrer(ErrerCode.ClientErrer.CLIENT_DATATYPE_ERRER);
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				  t.setErrer(ErrerCode.ClientErrer.CLIENT_DATATYPE_ERRER);
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				  t.setErrer(ErrerCode.ClientErrer.CLIENT_DATATYPE_ERRER);
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				  t.setErrer(ErrerCode.ClientErrer.CLIENT_DATATYPE_ERRER);
				e.printStackTrace();
			}
		}
		t.setResult(cm);
		return t;		
	}
	
	
	
	
	
	

}

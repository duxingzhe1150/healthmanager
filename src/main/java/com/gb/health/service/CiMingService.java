package com.gb.health.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.health.dao.TbHealthDetailsMapper;
import com.gb.health.dao.TbHealthExaminationMapper;
import com.gb.health.domain.CiMing;
import com.gb.health.domain.TbHealthDetails;
import com.gb.health.domain.TbHealthExamination;
import com.gb.health.init.Const;
import com.gb.health.rqf.CimingServiceR;
import com.gb.health.rqf.DataHeader;

@Service("ciMingService")
public class CiMingService   {
	@Autowired
	TbHealthExaminationMapper tbHealthExaminationMapper;
	public ArrayList<CiMing> getCimingByCompany(String comPanyCode){
		//根据公司名获取
		List<TbHealthExamination>  list = tbHealthExaminationMapper.selectAll();
		if(list == null || list.size() ==0){
			return null;
		}
		ArrayList<CiMing>  ciMIngs = new ArrayList<>();
		
		
		CimingServiceR ci = new CimingServiceR();
		DataHeader<CiMing> dh = new DataHeader<>(ci);
		
		
		
		for (int i = 0; i < list.size(); i++) {
			dh.setEntiy(new CiMing());
			dh.dataIn.loadRedis(list.get(i).getId()+""); 
			if(dh.getDataIn().getEntity().baseinfo.getB_name()==null){
			dh.dataIn.loadPathFile(Const.FILE_PATH, list.get(i).getbFileurl());
			
			System.out.println(dh.getDataIn().getEntity());
			if(dh.getDataIn().getEntity()==null || dh.getDataIn().getEntity().baseinfo.getB_name()==null){
				   continue;
					}else{
						dh.getDataOut().outRedis(list.get(i).getId()+"");
					}
			}
			
			
		ciMIngs.add(dh.getDataIn().getEntity());
				
			
		
			
			
		}
		return ciMIngs;
	}
	
	public boolean loadFileToRedis(String path,String fileName,int id){
		
		CimingServiceR ci = new CimingServiceR();
		DataHeader<CiMing> dh = new DataHeader<>(ci);
		dh.setEntiy(new CiMing());
		
	  boolean bool = 	dh.dataIn.loadPathFile(path, fileName);
	  if(!bool){
		  System.out.println("加载失败");
		return false;
	  }
		return dh.getDataOut().outRedis(String.valueOf(id));
	}
	
	
	


}

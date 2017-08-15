package com.gb.health.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.health.dao.TbHealthRecordMapper;

import com.gb.health.domain.TbHealthRecord;


@Service("tbHealthRecoedService")
public class TbHealthRecoedService {
	
	@Autowired
	TbHealthRecordMapper tbHealthRecordMapper;
	
	public int insert(TbHealthRecord record){
		
		
		
		return tbHealthRecordMapper.insert(record);
		
		
	}
}

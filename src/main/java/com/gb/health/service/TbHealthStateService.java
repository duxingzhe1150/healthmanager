package com.gb.health.service;

import com.gb.health.dao.TbHealthStateMapper;
import com.gb.health.domain.TbHealthState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tbHealthStateService")
public class TbHealthStateService {

	@Autowired
	TbHealthStateMapper tm;
	
	public int updateOrInBycard(TbHealthState tb){
		
		
		
		return tm.updateOrInBycard(tb);
		
		
	}
	
	

}

package com.gb.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.health.dao.AnalysisMapper;
import com.gb.health.domain.Analysis;


@Service("analysisService")
public class AnalysisService {
	@Autowired
	AnalysisMapper analysisMapper;
	public  List<Analysis> getAll()
	{
		return analysisMapper.selectAll();
	}
	public void updateByID(String id,String description)
	{
		analysisMapper.updateById(id, description);
	}
	public int updateByPK(Analysis analysis)
	{
		return analysisMapper.updateByPrimaryKey(analysis);
	}

}

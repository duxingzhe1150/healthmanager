package com.gb.health.dao;

import java.util.List;

import com.gb.health.domain.Analysis;

public interface AnalysisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Analysis record);

    Analysis selectByPrimaryKey(Integer id);

    List<Analysis> selectAll();
    
    Analysis selectNextByNumber(String number);
    
    int updateByPrimaryKey(Analysis record);
    int updateById(String id, String description);
    
}
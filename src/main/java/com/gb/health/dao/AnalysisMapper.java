package com.gb.health.dao;

import com.gb.health.domain.Analysis;

import java.util.List;

public interface AnalysisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Analysis record);

    Analysis selectByPrimaryKey(Integer id);

    List<Analysis> selectAll();
    
    Analysis selectNextByNumber(String number);
    
    int updateByPrimaryKey(Analysis record);
}
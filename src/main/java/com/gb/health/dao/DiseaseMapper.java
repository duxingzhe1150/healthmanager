package com.gb.health.dao;

import com.gb.health.domain.Disease;

import java.util.List;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Disease record);

    Disease selectByPrimaryKey(Integer id);
    
    Disease selectByDisease_number(String Disease_number);

    List<Disease> selectAll();

    int updateByPrimaryKey(Disease record);
}
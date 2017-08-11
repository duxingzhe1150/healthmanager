package com.gb.health.dao;

import java.util.List;

import com.gb.health.domain.Disease;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Disease record);

    Disease selectByPrimaryKey(Integer id);
    
    Disease selectByDisease_number(String Disease_number);

    List<Disease> selectAll();

    int updateByPrimaryKey(Disease record);
}
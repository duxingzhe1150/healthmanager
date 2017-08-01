package com.gb.health.dao;

import com.gb.health.domain.ReportPersonnel;

public interface ReportPersonnelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReportPersonnel record);

    int insertSelective(ReportPersonnel record);

    ReportPersonnel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReportPersonnel record);

    int updateByPrimaryKey(ReportPersonnel record);
}
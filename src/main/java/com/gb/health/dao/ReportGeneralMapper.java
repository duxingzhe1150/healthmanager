package com.gb.health.dao;

import com.gb.health.domain.ReportGeneral;

public interface ReportGeneralMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReportGeneral record);

    int insertSelective(ReportGeneral record);

    ReportGeneral selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReportGeneral record);

    int updateByPrimaryKey(ReportGeneral record);
}
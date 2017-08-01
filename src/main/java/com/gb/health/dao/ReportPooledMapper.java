package com.gb.health.dao;

import com.gb.health.domain.ReportPooled;

public interface ReportPooledMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReportPooled record);

    int insertSelective(ReportPooled record);

    ReportPooled selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReportPooled record);

    int updateByPrimaryKeyWithBLOBs(ReportPooled record);

    int updateByPrimaryKey(ReportPooled record);
}
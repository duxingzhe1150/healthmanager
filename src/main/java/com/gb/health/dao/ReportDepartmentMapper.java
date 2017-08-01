package com.gb.health.dao;

import com.gb.health.domain.ReportDepartment;

public interface ReportDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReportDepartment record);

    int insertSelective(ReportDepartment record);

    ReportDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReportDepartment record);

    int updateByPrimaryKey(ReportDepartment record);
}
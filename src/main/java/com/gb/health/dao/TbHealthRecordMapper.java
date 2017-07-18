package com.gb.health.dao;


import com.gb.health.domain.TbHealthRecord;

import java.util.List;

public interface TbHealthRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbHealthRecord record);

    TbHealthRecord selectByPrimaryKey(Integer id);

    List<TbHealthRecord> selectAll();

    int updateByPrimaryKey(TbHealthRecord record);
}
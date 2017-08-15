package com.gb.health.dao;


import java.util.List;

import com.gb.health.domain.TbHealthRecord;

public interface TbHealthRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbHealthRecord record);

    TbHealthRecord selectByPrimaryKey(Integer id);

    List<TbHealthRecord> selectAll();

    int updateByPrimaryKey(TbHealthRecord record);
}
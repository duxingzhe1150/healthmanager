package com.gb.health.dao;

import com.gb.health.domain.TbHealthLive;
import java.util.List;

public interface TbHealthLiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbHealthLive record);

    TbHealthLive selectByPrimaryKey(Integer id);
    
    TbHealthLive selectByPersonID(String personID);

    List<TbHealthLive> selectAll();

    int updateByPrimaryKey(TbHealthLive record);
}
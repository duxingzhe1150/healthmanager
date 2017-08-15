package com.gb.health.dao;

import com.gb.health.domain.TbHealthState;
import java.util.List;

public interface TbHealthStateMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(TbHealthState record);

    TbHealthState selectByPrimaryKey(Integer bId);

    List<TbHealthState> selectAll();

    int updateByPrimaryKey(TbHealthState record);


	TbHealthState selectByPersonId(String getbPersonid);

    
    int updateOrInBycard(TbHealthState record);

}
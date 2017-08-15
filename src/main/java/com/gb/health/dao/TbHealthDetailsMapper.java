package com.gb.health.dao;

import com.gb.health.domain.TbHealthDetails;
import java.util.List;

public interface TbHealthDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbHealthDetails record);

    TbHealthDetails selectByPrimaryKey(Integer id);

    List<TbHealthDetails> selectAll();

    int updateByPrimaryKey(TbHealthDetails record);
}
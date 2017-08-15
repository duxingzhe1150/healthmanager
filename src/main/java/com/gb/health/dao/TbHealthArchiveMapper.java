package com.gb.health.dao;

import com.gb.health.domain.TbHealthArchive;
import java.util.List;

public interface TbHealthArchiveMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(TbHealthArchive record);

    TbHealthArchive selectByPrimaryKey(Integer bId);

    List<TbHealthArchive> selectAll();

    int updateByPrimaryKey(TbHealthArchive record);
}
package com.gb.health.dao;

import com.gb.health.domain.TbHealthExamination;
import java.util.List;

public interface TbHealthExaminationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbHealthExamination record);

    TbHealthExamination selectByPrimaryKey(Integer id);

    List<TbHealthExamination> selectAll();

    int updateByPrimaryKey(TbHealthExamination record);

	List<TbHealthExamination> selectByCondition(TbHealthExamination examination);

	List<TbHealthExamination> selectCheck(TbHealthExamination examination);
	
	
}
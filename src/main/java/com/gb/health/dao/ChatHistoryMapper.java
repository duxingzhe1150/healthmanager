package com.gb.health.dao;

import com.gb.health.domain.ChatHistory;
import com.gb.health.domain.ChatHistoryExample;
import java.util.List;

public interface ChatHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatHistory record);

    int insertSelective(ChatHistory record);

    List<ChatHistory> selectByExampleWithBLOBs(ChatHistoryExample example);

    List<ChatHistory> selectByExample(ChatHistoryExample example);

    ChatHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatHistory record);

    int updateByPrimaryKeyWithBLOBs(ChatHistory record);

    int updateByPrimaryKey(ChatHistory record);
}
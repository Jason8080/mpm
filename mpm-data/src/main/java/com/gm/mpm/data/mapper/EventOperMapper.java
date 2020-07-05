package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.EventOper;

public interface EventOperMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EventOper record);

    int insertSelective(EventOper record);

    EventOper selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EventOper record);

    int updateByPrimaryKey(EventOper record);
}
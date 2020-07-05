package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.EventRecord;

public interface EventRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EventRecord record);

    int insertSelective(EventRecord record);

    EventRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EventRecord record);

    int updateByPrimaryKey(EventRecord record);
}
package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.EventRecordTemplate;

public interface EventRecordTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EventRecordTemplate record);

    int insertSelective(EventRecordTemplate record);

    EventRecordTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EventRecordTemplate record);

    int updateByPrimaryKey(EventRecordTemplate record);
}
package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.EventTemplate;

public interface EventTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EventTemplate record);

    int insertSelective(EventTemplate record);

    EventTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EventTemplate record);

    int updateByPrimaryKey(EventTemplate record);
}
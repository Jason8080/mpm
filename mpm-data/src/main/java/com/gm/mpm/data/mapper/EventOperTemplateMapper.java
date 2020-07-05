package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.EventOperTemplate;

public interface EventOperTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EventOperTemplate record);

    int insertSelective(EventOperTemplate record);

    EventOperTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EventOperTemplate record);

    int updateByPrimaryKey(EventOperTemplate record);
}
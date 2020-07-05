package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.MonitorInstance;

public interface MonitorInstanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MonitorInstance record);

    int insertSelective(MonitorInstance record);

    MonitorInstance selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MonitorInstance record);

    int updateByPrimaryKey(MonitorInstance record);
}
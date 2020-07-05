package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.MonitorRecord;

public interface MonitorRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MonitorRecord record);

    int insertSelective(MonitorRecord record);

    MonitorRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MonitorRecord record);

    int updateByPrimaryKey(MonitorRecord record);
}
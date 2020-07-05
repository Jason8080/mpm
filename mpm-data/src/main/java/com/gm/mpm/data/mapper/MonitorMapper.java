package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.Monitor;

public interface MonitorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Monitor record);

    int insertSelective(Monitor record);

    Monitor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Monitor record);

    int updateByPrimaryKey(Monitor record);
}
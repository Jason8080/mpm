package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.Flow;

public interface FlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Flow record);

    int insertSelective(Flow record);

    Flow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Flow record);

    int updateByPrimaryKey(Flow record);
}
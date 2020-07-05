package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.NodeOper;

public interface NodeOperMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NodeOper record);

    int insertSelective(NodeOper record);

    NodeOper selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NodeOper record);

    int updateByPrimaryKey(NodeOper record);
}
package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.Node;

public interface NodeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Node record);

    int insertSelective(Node record);

    Node selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}
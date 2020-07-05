package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.NodeTemplate;

public interface NodeTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NodeTemplate record);

    int insertSelective(NodeTemplate record);

    NodeTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NodeTemplate record);

    int updateByPrimaryKey(NodeTemplate record);
}
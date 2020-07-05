package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.NodeOperTemplate;

public interface NodeOperTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NodeOperTemplate record);

    int insertSelective(NodeOperTemplate record);

    NodeOperTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NodeOperTemplate record);

    int updateByPrimaryKey(NodeOperTemplate record);
}
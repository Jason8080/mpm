package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.NodeRecordTemplate;

public interface NodeRecordTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NodeRecordTemplate record);

    int insertSelective(NodeRecordTemplate record);

    NodeRecordTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NodeRecordTemplate record);

    int updateByPrimaryKey(NodeRecordTemplate record);
}
package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.NodeRecord;

public interface NodeRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NodeRecord record);

    int insertSelective(NodeRecord record);

    NodeRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NodeRecord record);

    int updateByPrimaryKey(NodeRecord record);
}
package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.FormRecord;

public interface FormRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FormRecord record);

    int insertSelective(FormRecord record);

    FormRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FormRecord record);

    int updateByPrimaryKey(FormRecord record);
}
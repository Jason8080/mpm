package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.FormRecordTemplate;

public interface FormRecordTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FormRecordTemplate record);

    int insertSelective(FormRecordTemplate record);

    FormRecordTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FormRecordTemplate record);

    int updateByPrimaryKey(FormRecordTemplate record);
}
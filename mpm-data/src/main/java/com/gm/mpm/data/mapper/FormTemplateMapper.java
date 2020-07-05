package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.FormTemplate;

public interface FormTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FormTemplate record);

    int insertSelective(FormTemplate record);

    FormTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FormTemplate record);

    int updateByPrimaryKey(FormTemplate record);
}
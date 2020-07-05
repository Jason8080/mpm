package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.FormOperTemplate;

public interface FormOperTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FormOperTemplate record);

    int insertSelective(FormOperTemplate record);

    FormOperTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FormOperTemplate record);

    int updateByPrimaryKey(FormOperTemplate record);
}
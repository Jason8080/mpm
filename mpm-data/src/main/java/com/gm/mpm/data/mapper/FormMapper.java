package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.Form;

public interface FormMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Form record);

    int insertSelective(Form record);

    Form selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Form record);

    int updateByPrimaryKey(Form record);
}
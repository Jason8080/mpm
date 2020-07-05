package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.FormOper;

public interface FormOperMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FormOper record);

    int insertSelective(FormOper record);

    FormOper selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FormOper record);

    int updateByPrimaryKey(FormOper record);
}
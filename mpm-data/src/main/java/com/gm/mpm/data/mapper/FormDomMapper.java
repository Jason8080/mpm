package com.gm.mpm.data.mapper;

import com.gm.mpm.data.model.FormDom;
import com.gm.mpm.data.model.FormDomWithBLOBs;

public interface FormDomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FormDomWithBLOBs record);

    int insertSelective(FormDomWithBLOBs record);

    FormDomWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FormDomWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FormDomWithBLOBs record);

    int updateByPrimaryKey(FormDom record);
}
package com.gm.mpm.def.api;

import com.gm.mpm.def.form.*;

import java.util.List;

/**
 * The interface Form api.
 *
 * @author Jason
 */
public interface FormApi {
    /**
     * 发起流程表单.
     *
     * @param initiator 发起人
     * @return 节点/表单ID long
     */
    Long initiate(Integer initiator);

    /**
     * 修改表单.
     *
     * @param formRecord the formRecord
     */
    void update(FormRecordTemplate formRecord);

    /**
     * 操作表单.
     *
     * @param formOper the formOper
     */
    void operate(FormOperTemplate formOper);
}

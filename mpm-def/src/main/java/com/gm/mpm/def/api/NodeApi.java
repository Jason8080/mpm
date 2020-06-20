package com.gm.mpm.def.api;

import com.gm.mpm.def.form.FormOperTemplate;
import com.gm.mpm.def.form.FormRecord;
import com.gm.mpm.def.form.FormRecordTemplate;
import com.gm.mpm.def.form.FormTemplate;
import com.gm.mpm.def.node.NodeOperTemplate;
import com.gm.mpm.def.node.NodeRecordTemplate;

import java.util.Date;

/**
 * The interface Node api.
 *
 * @author Jason
 */
public interface NodeApi {
    /**
     * 发起流程节点.
     *
     * @param initiator 发起人
     * @return 节点ID long
     */
    Long initiate(Integer initiator);

    /**
     * 修改节点.
     *
     * @param nodeRecord the nodeRecord
     */
    void update(NodeRecordTemplate nodeRecord);

    /**
     * 操作节点.
     *
     * @param nodeOper the nodeOper
     */
    void operate(NodeOperTemplate nodeOper);

}

package com.gm.mpm.def.api;

import com.gm.mpm.def.event.EventOperTemplate;
import com.gm.mpm.def.event.EventRecordTemplate;
import com.gm.mpm.def.node.NodeOperTemplate;
import com.gm.mpm.def.node.NodeRecordTemplate;

/**
 * @author Jason
 */
public interface EventApi {
    /**
     * 发起流程事件.
     *
     * @param initiator 发起人
     * @return 事件ID long
     */
    Long initiate(Integer initiator);

    /**
     * 修改事件.
     *
     * @param eventRecord the eventRecord
     */
    void update(EventRecordTemplate eventRecord);

    /**
     * 操作事件.
     *
     * @param eventOper the eventOper
     */
    void operate(EventOperTemplate eventOper);
}

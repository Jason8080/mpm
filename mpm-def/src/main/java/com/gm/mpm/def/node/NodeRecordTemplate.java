package com.gm.mpm.def.node;

import java.util.Date;

/**
 * The interface Node record template.
 *
 * @author Jason
 */
public interface NodeRecordTemplate {
    /**
     * 节点ID.
     *
     * @return the node id
     */
    Long getId();

    /**
     * 流程ID.
     *
     * @return the flow id
     */
    Long getFlowId();
    /**
     * 节点状态.
     *
     * @return
     */
    Integer getState();
    /**
     * 接收时间.
     *
     * @return
     */
    Date getStarTime();
    /**
     * 提交时间.
     *
     * @return
     */
    Date getEndTime();
    /**
     * 处理结果.
     *
     * @return
     */
    String getMeans();
}

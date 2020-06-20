package com.gm.mpm.def.event;

/**
 * The interface Form record template.
 *
 * @author Jason
 */
public interface EventRecordTemplate {
    /**
     * 事件ID.
     *
     * @return the id
     */
    Long getId();
    /**
     * 节点ID.
     *
     * @return
     */
    Long getNodeId();

    /**
     * 事件状态.
     *
     * @return
     */
    Integer getState();
}

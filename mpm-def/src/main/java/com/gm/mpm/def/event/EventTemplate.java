package com.gm.mpm.def.event;

/**
 * The interface Form template.
 *
 * @author Jason
 */
public interface EventTemplate {
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
     * 事件类型.
     *
     * @return
     */
    Integer getType();
    /**
     * 触发条件.
     *
     * @return
     */
    Integer getTriggers();
}

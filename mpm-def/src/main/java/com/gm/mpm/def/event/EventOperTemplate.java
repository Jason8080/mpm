package com.gm.mpm.def.event;

/**
 * The interface Form oper template.
 *
 * @author Jason
 */
public interface EventOperTemplate {

    /**
     * 事件ID.
     *
     * @return
     */
    Long getId();

    /**
     * 节点ID.
     *
     * @return
     */
    Long getNodeId();

    /**
     * 字段名.
     *
     * @return
     */
    String getField();

    /**
     * 字段值.
     *
     * @return
     */
    String getValue();
}

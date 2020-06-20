package com.gm.mpm.def.node;

/**
 * The interface Node oper template.
 *
 * @author Jason
 */
public interface NodeOperTemplate {
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
     * 是否必填.
     *
     * @return required
     */
    Integer getRequired();

    /**
     * 是否必填.
     *
     * @return type
     */
    Integer getType();

    /**
     * 操作名称.
     *
     * @return oper name
     */
    String getOperName();

    /**
     * 操作名称.
     *
     * @return oper value
     */
    String getOperValue();
}

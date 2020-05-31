package com.gm.mpm.bpm.sign;

import com.gm.mpm.bpm.node.Node;

/**
 * 签定义接口.
 *
 * @author Jason
 */
public interface Sign {
    /**
     * 签类型.
     *
     * <p>
     * -1. 减签
     * 0. 跳签: 根据跳到的节点决定下个节点如何执行, 包括原路执行和跳回执行..
     * 1. 串签
     * 2. 并签
     * </p>
     *
     * @return 返回签类型 integer
     */
    Integer type();

    /**
     * Sets type.
     *
     * @param type the type
     */
    void setType(Integer type);

    /**
     * 执行签操作的节点.
     *
     * @return the node
     */
    Node getExecutionNode();

    /**
     * Sets execution node.
     *
     * @param executionNode the execution node
     */
    void setExecutionNode(Node executionNode);


    /**
     * 被执行签操作的节点.
     *
     * <p>
     *     被执行的签操作节点可能多个, 比如减签多个节点, 并签多个节点
     *     注意: 跳签只能跳到一个节点, 不能同时跳多个节点
     * </p>
     *
     * @return the be node
     */
    Node[] getBeNode();

    /**
     * Sets be node.
     *
     * @param beNode the be node
     */
    void setBeNode(Node[] beNode);
}

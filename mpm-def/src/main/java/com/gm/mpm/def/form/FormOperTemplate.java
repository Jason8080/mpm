package com.gm.mpm.def.form;

/**
 * The interface Form oper template.
 *
 * @author Jason
 */
public interface FormOperTemplate {

    /**
     * 节点ID.
     *
     * @return
     */
    Long getId();

    /**
     * 节点ID.
     *
     * @return
     */
    Long getFlowId();

    /**
     * 是否必填.
     *
     * @return
     */
    Integer getRequired();

    /**
     * 操作类型.
     *
     * @return
     */
    Integer getType();

    /**
     * 操作状态.
     *
     * @return
     */
    Integer getState();

    /**
     * 操作名称.
     *
     * @return
     */
    String getOperName();

    /**
     * 操作值.
     *
     * @return
     */
    String getOperValue();
}

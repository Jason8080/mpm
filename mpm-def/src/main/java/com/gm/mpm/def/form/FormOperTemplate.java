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
     * 权限标识: 类似Linux wrx.
     *
     * @return
     */
    String getCrud();

    /**
     * 操作状态.
     *
     * @return
     */
    Integer getState();

    /**
     * 操作提示.
     *
     * @return
     */
    String getOperTitle();

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

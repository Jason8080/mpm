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
     * 是否可见.
     *
     * @return
     */
    Integer getVisible();

    /**
     * 权限标识: 参照Linux wrx.
     *
     * @return
     */
    String getPermission();

    /**
     * 操作类型: 0-, 1input, 2checkbox, 3select, 4a, 5button
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

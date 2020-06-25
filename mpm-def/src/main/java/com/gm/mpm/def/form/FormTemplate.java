package com.gm.mpm.def.form;

/**
 * The interface Form template.
 *
 * @author Jason
 */
public interface FormTemplate {
    /**
     * 表单ID.
     *
     * @return the id
     */
    Long getId();
    /**
     * 上级表单ID: 支持主从表(多级关系表).
     *
     * @return the id
     */
    Long getSuperior();
    /**
     * 流程ID.
     *
     * @return
     */
    Long getFlowId();
    /**
     * 表单标题.
     *
     * @return
     */
    String getTitle();
}

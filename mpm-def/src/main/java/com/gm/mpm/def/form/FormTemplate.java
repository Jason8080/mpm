package com.gm.mpm.def.form;

/**
 * The interface Form template.
 *
 * @author Jason
 */
public interface FormTemplate {
    /**
     * 节点ID.
     *
     * @return the id
     */
    Long getId();
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

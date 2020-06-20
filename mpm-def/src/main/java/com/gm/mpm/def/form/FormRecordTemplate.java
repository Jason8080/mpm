package com.gm.mpm.def.form;

/**
 * The interface Form record template.
 *
 * @author Jason
 */
public interface FormRecordTemplate {
    /**
     * 节点ID.
     *
     * @return the id
     */
    Long getId();

    /**
     * 流程ID.
     *
     * @return the flow id
     */
    Long getFlowId();

    /**
     * 流程ID.
     *
     * @return
     */
    String getField();

    /**
     * 流程ID.
     *
     * @return
     */
    String getValue();
}

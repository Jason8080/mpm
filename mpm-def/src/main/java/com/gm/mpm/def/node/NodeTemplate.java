package com.gm.mpm.def.node;

import java.util.Date;

/**
 * The interface Node template.
 *
 * @author Jason
 */
public interface NodeTemplate {
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
     * 序号.
     *
     * @return the order
     */
    Integer getOrder();

    /**
     * 执行人.
     *
     * @return unit id
     */
    Integer getUnitId();

    /**
     * 到期时间.
     *
     * @return due time
     */
    Date getDueTime();
}

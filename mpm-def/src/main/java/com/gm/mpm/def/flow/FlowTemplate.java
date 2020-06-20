package com.gm.mpm.def.flow;

import java.util.Date;

/**
 * The interface Flow.
 *
 * @author Jason
 */
public interface FlowTemplate {
    /**
     * 流程ID.
     *
     * @return the id
     */
    Long getId();

    /**
     * 发起时间.
     *
     * @return start time
     */
    Date getStartTime();

    /**
     * 结束时间.
     *
     * @return end time
     */
    Date getEndTime();

    /**
     * 发起人.
     *
     * @return
     */
    Integer getUnitId();
}

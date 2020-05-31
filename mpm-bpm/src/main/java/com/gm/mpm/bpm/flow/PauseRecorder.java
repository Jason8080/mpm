package com.gm.mpm.bpm.flow;

import java.util.UUID;

/**
 * 流程节点暂存接口.
 *
 * @author Jason
 */
public interface PauseRecorder {
    /**
     * 获取暂停快照编号.
     *
     * @return the long
     */
    Long getId();

    /**
     * 暂停时间
     *
     * @return 返回暂停时间 start time
     */
    Long getStartTime();

    /**
     * 结束时间
     *
     * @return 返回结束时间 end time
     */
    Long getEndTime();

    /**
     * 暂停时长
     *
     * @return 返回计算暂停时长 time
     */
    default Long getTime() {
        return getEndTime() - getStartTime();
    }

    /**
     * 暂停的流程.
     *
     * @return 返回流程ID flow id
     */
    Long getFlowId();

    /**
     * 暂存的节点.
     *
     * @return 返回节点ID node id
     */
    Long getNodeId();

    /**
     * 暂存的人.
     *
     * @return 返回操作人 executor
     */
    Long getExecutor();
}

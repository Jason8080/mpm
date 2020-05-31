package com.gm.mpm.bpm.business.recorder;

import java.util.List;

/**
 * 流程回复记录.
 * <p>
 * 记录流程下的往来信息.
 * </p>
 *
 * @author Jason
 */
public interface ReplyRecorder {
    /**
     * 获取回复ID.
     *
     * @return 返回回复编号 id
     */
    Long getId();

    /**
     * 获取流程ID.
     *
     * @return 返回流程编号 flow id
     */
    Long getFlowId();

    /**
     * 获取回复的执行人.
     *
     * <p>
     * 用于支撑树状展示回复信息
     * 如果是回复流程, 则返回null
     * </p>
     *
     * @return the reply id
     */
    Long getReplyId();

    /**
     * 获取执行人.
     *
     * @return 返回执行人. executor
     */
    Long getExecutor();

    /**
     * 获取执行时间.
     *
     * @return 返回执行时间 time
     */
    Long getTime();

    /**
     * 返回第二层回复信息(所有回复按照回复时间@getTime()倒序排序).
     *
     * @return the reply recorders
     */
    List<ReplyRecorder> getReplyRecorders();
}

package com.gm.mpm.def.api;

/**
 * The interface Flow api.
 *
 * @author Jason
 */
public interface FlowApi {
    /**
     * 发起新流程.
     *
     * @param initiator 发起人
     * @return 流程ID long
     */
    Long initiate(Integer initiator);


    /**
     * 关闭流程.
     *
     * @param State 关闭的状态: 0终止, 1完成
     */
    void close(Integer State);
}

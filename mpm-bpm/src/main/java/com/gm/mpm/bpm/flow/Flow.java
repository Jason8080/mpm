package com.gm.mpm.bpm.flow;

import com.gm.mpm.bpm.node.NodeUnit;

import java.util.Map;

/**
 * 流程接口.
 *
 * @author Jason
 */
public interface Flow {

    /**
     * 锁定
     */
    Integer LOCK_FLOW_STATUS = -1;
    /**
     * 开始/待激活
     */
    Integer START_FLOW_STATUS = 0;
    /**
     * 待办
     */
    Integer AWAIT_FLOW_STATUS = 1;
    /**
     * 暂停
     */
    Integer PAUSE_FLOW_STATUS = 2;
    /**
     * 关闭
     */
    Integer CLOSE_FLOW_STATUS = 3;
    /**
     * 结束
     */
    Integer END_FLOW_STATUS = 9;

    /**
     * 获取发起人节点.
     *
     * @return 返回发起人节点
     */
    Long getInitialNode();

    /**
     * 获取流程状态.
     *
     * <p>
     * -1. 锁定
     * 0. 发起
     * 1. 待办
     * 2. 暂存/暂停
     * 3. 关闭
     * 9. 结束
     * </p>
     *
     * @return 返回当前流程状态 integer
     */
    Integer getStatus();

    /**
     * Sets status.
     *
     * @param status the status
     */
    void setStatus(Integer status);

    /**
     * 获取流程总耗时.
     *
     * <p>
     * 从流程发起时 到 关闭/结束总耗时
     * 包含: 暂停等任何时间
     * </p>
     *
     * @return 返回耗时毫秒数 long
     */
    Long getTime();

    /**
     * Sets time.
     */
    void setTime();

    /**
     * 获取当前节点.
     *
     * @return 返回当前待办节点数组(可能是并发). long [ ]
     */
    Long[] currentNode();

    /**
     * Sets current node.
     *
     * @param currentNode the current node
     */
    void setCurrentNode(Long[] currentNode);

    /**
     * 获取当前节点的执行人.
     *
     * <p>
     *     Map<Long,Long>
     *         Long: 执行节点
     *         Long: 执行人
     * 获取当前待办人
     * </p>
     *
     * @return 返回当前节点的执行人数组(可能是并发). map
     */
    Map<Long, NodeUnit> currentExecutor();

    /**
     * Set current executor.
     *
     * @param currentExecutor the current executor
     */
    void setCurrentExecutor(NodeUnit currentExecutor);

}

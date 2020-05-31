package com.gm.mpm.bpm.flow;

import java.util.List;

/**
 * 流程模板.
 * <p>
 * 流程模板: 用于设定流程的走向形状
 * </p>
 *
 * @author Jason
 */
public interface FlowTemplate {
    /**
     * 获取模板ID.
     *
     * <p>
     * 没有模板ID的流程视为: 无模板流程
     * </p>
     *
     * @return 返回模板编号 id
     */
    Long getId();

    /**
     * 获取发起人节点.
     *
     * <p>
     *     注意: 这里的节点ID是模板节点ID, 并非正常的节点(存放的表不一样)
     * </p>
     *
     * @return 返回发起人节点 initial node
     */
    Long getInitialNode();


    /**
     * 获取模板状态.
     * 0. 禁用 (可用于加锁)
     * 1. 启用
     *
     * @return the status
     */
    Integer getStatus();

    /**
     * Sets status.
     *
     * @param status the status
     */
    void setStatus(Integer status);


    /**
     * 获取模板执行人: 责任人: 最后一次修改模板的人为责任人.
     *
     * @return 返回模板执行人 executor
     */
    Long getExecutor();

    /**
     * Sets executor.
     *
     * @param executor the executor
     */
    void setExecutor(Long executor);


    /**
     * 获取最后更新时间.
     *
     * @return the create time
     */
    Long getLastTime();

    /**
     * Sets last time.
     *
     * @param lastTime the last time
     */
    void setLastTime(Long lastTime);
}

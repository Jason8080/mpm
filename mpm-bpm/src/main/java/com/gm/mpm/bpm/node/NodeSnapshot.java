package com.gm.mpm.bpm.node;

import java.util.Date;
import java.util.UUID;

/**
 * 流程节点执行记录器.
 * <p>
 *     该记录器主要用于支撑流程跳跃执行.
 * </p>
 *
 * @author Jason
 */
public interface NodeSnapshot extends Node {
    /**
     * 执行记录编号.
     *
     * @return 返回编号.
     */
    Long getRecorderId();
}

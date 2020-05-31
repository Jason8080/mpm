package com.gm.mpm.bpm.node;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 流程节点接口
 *
 * @author Jason
 */
public interface Node {

    /**
     * 节点形状: 串形节点
     */
    Integer SERIAL_NODE_FORM = 0;
    /**
     * 节点形状: 并行节点
     */
    Integer PARALLEL_NODE_FORM = 1;

    /**
     * 获取节点ID.
     *
     * <p>
     * 节点的唯一标识
     * </p>
     *
     * @return 默认UUID生成
     */
    default Long getId() {
        return UUID.randomUUID().getMostSignificantBits();
    }

    /**
     * 获取节点类型.
     *
     * <p>
     * 流程节点: 可以自由定制类型
     * -10. 智能节点: 智能处理
     * 0. 空节点
     * 10. 起点: 发起人节点
     * 20. 终点: 发起人节点
     * 30. 知会: 能收到即可
     * 40. 阅读节点: 阅读即可
     * 50. 审批节点: 需要同意或拒绝
     * 60. 协同节点: 需要处理表单内容
     * </p>
     *
     * @return 默认为空节点
     */
    default Integer getType() {
        return 0;
    }

    /**
     * 获取节点形态.
     * <p>
     * 0. 串形: 当前节点是串发节点
     * 1. 并形: 当前节点是并发节点
     *
     * @return 默认串形
     */
    default Integer getForm() {
        return SERIAL_NODE_FORM;
    }


    /**
     * 获取发起人ID.
     *
     * <p>
     * 可用于返回上一节点和下一节点
     * </p>
     *
     * @return 默认自己.
     */
    default Long getInitiator() {
        return getId();
    }

    /**
     * 获取下一节点.
     *
     * <p>
     * 下一节点可能是并发节点
     * </p>
     *
     * @return 返回下一节点数组
     */
    default Long[] nextIds() {
        return new Long[]{getInitiator()};
    }

    /**
     * 获取上一节点.
     *
     * <p>
     * 上一节点可能是并发节点
     * </p>
     *
     * @return 上一节点数组
     */
    default Long[] prevIds() {
        return new Long[]{getInitiator()};
    }


    /**
     * 必填的字段.
     *
     * <p>
     *     该数据用于协同节点: 必须处理某内容才能提交 (进入下一节点)
     * </p>
     *
     * @return 返回必填的字段, 如果对必填字段的值有要求, 可存至value, 没有要求统一存null.
     */
    default Map<String,Object> requiredFields(){
        return new HashMap(0);
    }

    /**
     * 当前节点执行记录.
     *
     * <p>
     *     用于支撑随意跳跃指定节点执行
     * </p>
     *
     * @return 返回当前节点的执行记录.
     */
    default Void recorder(){
        return null;
    }
}

package com.gm.mpm.bpm.node;

import com.gm.mpm.bpm.preset.Preset;

import java.util.Map;
import java.util.TreeMap;

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
*     * 节点的唯一标识
     * </p>
     *
     * @return 默认UUID生成 id
     */
    Long getId();

    /**
     * 节点所在位置的排序号.
     *
     * <p>
     * Map<Integer, Map<..>>:
     * Integer: 排序号
     * NodeB2A: 前后节点
     * 一个节点可能处理多次, 所以序号可能多个
     * 另外上一节点和下一节点可能并发
     * </p>
     *
     * @return 返回节点所在位置的排序号集合 map
     */
    TreeMap<Integer, NodeB2A> order();

    /**
     * Add order.
     *
     * @param order   the order
     * @param prevIds the prev ids
     * @param nextIds the next ids
     */
    void addOrder(Integer order, Node[] prevIds, Node[] nextIds);

    /**
     * 获取流程ID.
     *
     * @return 返回流程编号 long
     */
    Long getFlowId();

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
     * 70. 预设节点: 需要预先选好下一个节点
     * </p>
     *
     * @return 默认为空节点 type
     */
    Integer getType();

    /**
     * 获取节点形态.
     * <p>
     * 0. 串形: 当前节点是串发节点
     * 1. 并形: 当前节点是并发节点
     *
     * @return 默认串形 form
     */
    Integer getForm();

    /**
     * Sets form.
     *
     * @param form the form
     */
    void setForm(Integer form);

    /**
     * 获取下一节点: 取最大序号节点.
     *
     * <p>
     * 下一节点可能是并发节点
     * </p>
     *
     * @return 返回下一节点数组 long [ ]
     */
    default Long[] nextIds() {
        Map.Entry<Integer, NodeB2A> lastEntry = order().lastEntry();
        NodeB2A b2a = lastEntry.getValue();
        return b2a.nextIds();
    }

    /**
     * 获取上一节点: 取最大序号节点.
     *
     * <p>
     * 上一节点可能是并发节点
     * </p>
     *
     * @return 上一节点数组 long [ ]
     */
    default Long[] prevIds() {
        Map.Entry<Integer, NodeB2A> lastEntry = order().lastEntry();
        NodeB2A b2a = lastEntry.getValue();
        return b2a.prevIds();
    }


    /**
     * 必填的字段.
     *
     * <p>
     * 该数据用于协同节点: 必须处理某内容才能提交 (进入下一节点)
     * </p>
     *
     * @return 返回必填的字段 : {  如果对必填字段的值有要求, 可存至value, 没有要求统一存null.  另外快照存储时value为真实提交的Value. }
     */
    Map<String, Object> requiredFields();

    /**
     * Sets required fields.
     *
     * @param requiredFields the required fields
     */
    void setRequiredFields(Map<String, Object> requiredFields);

    /**
     * 需要预设节点.
     *
     * <p>
     * 该数据用于预设节点: 必须选好下一个节点(可以并发)才能提交
     * 预设类型参考: {@link Preset#getType()}
     * </p>
     *
     * @return 返回预设的节点 : {  如果对预设节点有要求, 可存至presetNodes, 没有要求统一存null.  另外快照存储时presetNodes为真实提交的presetNodes. }
     */
    Preset requiredPreset();

    /**
     * Sets required preset.
     *
     * @param preset the preset
     */
    void setRequiredPreset(Preset preset);

    /**
     * 节点触发事件: 节点接收时间 .
     *
     * <p>
     * 用于计算消耗时长
     * </p>
     *
     * @return 返回节点处理时间. long
     */
    Long startTime();

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    void setStartTime(Long startTime);

    /**
     * 节点执行时间: 执行才有 .
     *
     * @return 返回节点处理时间. long
     */
    Long executionTime();

    /**
     * Sets execution time.
     *
     * @param executionTime the execution time
     */
    void setExecutionTime(Long executionTime);

    /**
     * 执行人.
     *
     * <p>
     * 可能是部门单位. 不止是个人
     * </p>
     *
     * @return 返回执行人ID long
     */
    NodeUnit executor();

    /**
     * Sets executor.
     *
     * @param executor the executor
     */
    void setExecutor(Long executor);

}

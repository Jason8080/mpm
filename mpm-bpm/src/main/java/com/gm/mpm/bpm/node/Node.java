package com.gm.mpm.bpm.node;

import java.util.*;

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
     * @return 默认UUID生成 id
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
     * @return 默认为空节点 type
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
     * @return 默认串形 form
     */
    default Integer getForm() {
        return SERIAL_NODE_FORM;
    }

    /**
     * Sets form.
     *
     * @param form the form
     */
    void setForm(Integer form);


    /**
     * 获取发起人ID.
     *
     * <p>
     * 可用于返回上一节点和下一节点
     * </p>
     *
     * @return 默认自己. initial node
     */
    default Long getInitialNode() {
        return getId();
    }

    /**
     * 获取下一节点.
     *
     * <p>
     * 下一节点可能是并发节点
     * </p>
     *
     * @return 返回下一节点数组 long [ ]
     */
    default Long[] nextIds() {
        return new Long[]{getInitialNode()};
    }

    /**
     * Sets next ids.
     *
     * @param ids the ids
     */
    void setNextIds(Long[] ids);

    /**
     * 获取上一节点.
     *
     * <p>
     * 上一节点可能是并发节点
     * </p>
     *
     * @return 上一节点数组 long [ ]
     */
    default Long[] prevIds() {
        return new Long[]{getInitialNode()};
    }

    /**
     * Sets prev ids.
     *
     * @param ids the ids
     */
    void setPrevIds(Long[] ids);


    /**
     * 必填的字段.
     *
     * <p>
     * 该数据用于协同节点: 必须处理某内容才能提交 (进入下一节点)
     * </p>
     *
     * @return 返回必填的字段 : {  如果对必填字段的值有要求, 可存至value, 没有要求统一存null.  另外快照存储时value为真实提交的Value. }
     */
    default Map<String,Object> requiredFields(){
        return new HashMap(0);
    }

    /**
     * Sets required fields.
     *
     * @param requiredFields the required fields
     */
    void setRequiredFields(Map<String, Object> requiredFields);

    /**
     * 节点执行时间: 执行才有 .
     *
     * @return 返回节点处理时间. long
     */
    default Long executionTime(){
        return System.currentTimeMillis();
    }

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
    default Long executor(){
        return 0L;
    }

    /**
     * Sets executor.
     *
     * @param executor the executor
     */
    void setExecutor(Long executor);

    /**
     * 当前节点执行快照.
     *
     * <p>
     * 用于支撑随意跳跃指定节点执行
     * </p>
     *
     * @return 返回当前节点的执行记录. list
     */
    default List<NodeSnapshot> snapshots(){
        return new ArrayList();
    }
}

package com.gm.mpm.bpm.node;

import com.gm.mpm.bpm.unit.Ut;

/**
 * 流程节点执行单位.
 *
 * @author Jason
 */
public interface NodeUnit {
    /**
     * 执行单位.
     * 可能是个人ID
     * 也可能是部门ID
     * 还可能... {@link #getType()}
     *
     * @return 返回编号 id
     */
    Long getId();

    /**
     * 执行单位类型.
     * <p>
     * -10: 智能节点
     * 00. 空
     * 10. 个人
     * 20. 部门
     * 30. 单位/公司
     * 40. 集团
     * {{@link Ut#getId()} ()}}
     *
     * @return 返回单位类型编号{{@link Ut#getId()} ()}
     */
    Integer getType();

    /**
     * 获取执行单位昵称.
     *
     * @return the nickname
     */
    String getNickname();


    /**
     * 在哪里: 描述执行单位所在的路径.
     *
     * @return 返回所在的单位路径 string
     */
    String where();
}

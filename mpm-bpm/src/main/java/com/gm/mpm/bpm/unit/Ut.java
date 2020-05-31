package com.gm.mpm.bpm.unit;

/**
 * 单位类型
 *
 * @author Jason
 */
public interface Ut {

    /**
     * 获取单位类型ID.
     *
     * <p>
     * -10: 智能节点
     * 00. 空
     * 10. 个人
     * 20. 部门
     * 30. 单位/公司
     * 40. 集团
     * </p>
     *
     * @return 返回单位类型编号
     */
    Integer getId();

    /**
     * 获取当前节点颜色(根据节点的执行单位类型区分{{@link #getType()}}).
     *
     * @return the color
     */
    default String getColor() {
        // 默认所有单位类型都是: 蓝色
        return "blue";
    }

    /**
     * 获取单位类型图标.
     *
     * @return the ico
     */
    default String getIco() {
        // 默认所有单位类型都是: 个人
        return "single.png";
    }
}

package com.gm.mpm.bpm.sign;

/**
 * 执行单位
 * <p>
 *     可用于节点执行人 和 加签执行人/被加签执行人
 * </p>
 *
 * @author Jason
 */
public interface SignUnit {

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
     * 获取当前节点颜色(根据节点的执行单位类型区分{{@link #getId()} .
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

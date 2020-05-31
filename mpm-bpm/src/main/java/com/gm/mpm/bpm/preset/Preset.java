package com.gm.mpm.bpm.preset;

import com.gm.mpm.bpm.node.Node;

/**
 * 预设操作定义接口.
 *
 * @author Jason
 */
public interface Preset {
    /**
     * 获取预设类型.
     *
     * <p>
     * 预设类型:
     * 1. 可选预设: 只有选择的权利, 只能选择指定的节点作为下一节点
     * 2. 流程预设: 可以选择流程内, 任意节点作为下一节点
     * 3. 自由预设: 可以任意节点作为下一节点
     * </p>
     *
     * @return the type
     */
    Integer getType();


    /**
     * 预设节点选择器.
     *
     * <p>
     *  如果对预设节点有要求, 可存至presetNodes, 没有要求统一存null.
     *  另外快照存储时presetNodes为真实提交的presetNodes.
     *
     *  预设类型参考: {@link #getType()}
     * </p>
     *
     * @return the node [ ]
     */
    Node[] getPresetNodes();

}

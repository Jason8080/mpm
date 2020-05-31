package com.gm.mpm.bpm.business;

import com.gm.mpm.bpm.node.NodeSnapshot;

import java.util.List;

/**
 * 节点业务模型.
 * @author Jason
 */
public interface BusinessNode<N> {


    /**
     * 当前节点执行快照.
     *
     * <p>
     * 用于支撑随意跳跃指定节点执行
     * </p>
     *
     * @return 返回当前节点的执行记录. list
     */
    List<NodeSnapshot> nodeSnapshots();
}

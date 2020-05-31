package com.gm.mpm.bpm.node;

import java.util.Arrays;

/**
 * 当前节点的前后节点.
 *
 * @author Jason
 */
public class NodeB2A {
    /**
     * 当前节点ID
     */
    private Long currentId;
    /**
     * 前一节点ID数组
     */
    private Long[] beforeIds;
    /**
     * 后一节点ID数组
     */
    private Long[] afterIds;

    public NodeB2A(Long currentId, Long[] beforeIds, Long[] afterIds) {
        this.currentId = currentId;
        this.beforeIds = beforeIds;
        this.afterIds = afterIds;
    }

    public Long[] prevIds(){
        return beforeIds;
    }

    public String prevToString(){
        String array = Arrays.toString(beforeIds);
        return array.substring(1, array.length()-1);
    }

    public Long[] nextIds(){
        return afterIds;
    }

    public String nextToString(){
        String array = Arrays.toString(afterIds);
        return array.substring(1, array.length()-1);
    }

    @Override
    public String toString() {
        return "NodeB2A{" +
                "currentId=" + currentId +
                ", beforeIds=" + Arrays.toString(beforeIds) +
                ", afterIds=" + Arrays.toString(afterIds) +
                '}';
    }
}

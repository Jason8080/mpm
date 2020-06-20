package com.gm.mpm.def.monitor;

/**
 * The interface Monitor.
 *
 * @author Jason
 */
public interface Monitor {
    /**
     * 监控ID.
     *
     * @return the id
     */
    Long getId();

    /**
     * 节点ID.
     *
     * @return the node id
     */
    Long getNodeId();

    /**
     * 接收时监控.
     *
     * @return the start
     */
    Integer getStart();

    /**
     * 处理前监控.
     *
     * @return the pre
     */
    Integer getPre();

    /**
     * 处理后监控.
     *
     * @return the post
     */
    Integer getPost();

    /**
     * 异常时监控.
     *
     * @return the ex
     */
    Integer getEx();

    /**
     * 完成后监控.
     *
     * @return the after
     */
    Integer getAfter();

    /**
     * 提交后监控.
     *
     * @return the end
     */
    Integer getEnd();
}

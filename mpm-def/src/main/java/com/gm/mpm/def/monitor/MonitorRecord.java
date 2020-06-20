package com.gm.mpm.def.monitor;

/**
 * The interface Monitor.
 *
 * @author Jason
 */
public interface MonitorRecord {
    /**
     * 监控ID.
     *
     * @return the id
     */
    Long getId();


    /**
     * 执行状态.
     *
     * @return the state
     */
    Integer getState();

    /**
     * 执行结果.
     *
     * @return the result
     */
    String getResult();
}

package com.gm.mpm.def.api;

import com.gm.mpm.def.monitor.MonitorInstance;
import com.gm.mpm.def.monitor.MonitorRecord;

/**
 * The interface Monitor.
 *
 * @author Jason
 */
public interface MonitorApi {
    /**
     * 发起节点监控.
     *
     * @param nodeId 监控节点
     * @return 监控ID long
     */
    Long initiate(Long nodeId);

    /**
     * 定制监控.
     *
     * @param monitorInstance the monitor instance
     */
    void made(MonitorInstance monitorInstance);

    /**
     * 记录监控.
     *
     * @param monitorRecord the monitor record
     */
    void recorder(MonitorRecord monitorRecord);
}

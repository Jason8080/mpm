package com.gm.mpm.def.monitor;

/**
 * The interface Monitor.
 *
 * @author Jason
 */
public interface MonitorInstance {
    /**
     * 监控ID.
     *
     * @return the id
     */
    Long getId();

    /**
     * 监控实例字节码路径.
     *
     * @return the classes
     */
    String getClasses();

    /**
     * 实例方法(多个以,号分隔).
     *
     * @return the methods
     */
    String getMethods();
}

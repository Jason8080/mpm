package com.gm.mpm.def.api;

import java.util.Date;

/**
 * The interface Bpm api.
 *
 * @author Jason
 */
public interface DefApi {
    /**
     * 加签.
     *
     * @param order   the order
     * @param unitId  the unit id
     * @param dueTime the due time
     * @return 节点编号 long
     */
    Long add(Integer order, Integer unitId, Date dueTime);

    /**
     * 减签.
     *
     * @param id 节点编号
     */
    void del(Long id);

    /**
     * 会签.
     *
     * @param order   the order
     * @param unitId  the unit id
     * @param dueTime the due time
     * @return 节点编号 long
     */
    Long top(Integer order, Integer unitId, Date dueTime);

    /**
     * 重签.
     *
     * @param unitIds the unit ids
     * @return 节点编号 long
     */
    Long rew(Integer... unitIds);

    /**
     * 转发: 会起新流程.
     *
     * @param id      the id
     * @param unitId  the unit id
     * @param dueTime the due time
     * @return 节点编号 long
     */
    void forward(Integer id, Integer unitId, Date dueTime);

    /**
     * 移交: 原流程换人执行.
     *
     * @param id      the id
     * @param unitId  the unit id
     * @param dueTime the due time
     * @return 节点编号 long
     */
    void move(Integer id, Integer unitId, Date dueTime);

    /**
     * 提交.
     *
     * @param id the id
     */
    void submit(Long id);

    /**
     * 暂存.
     *
     * @param id 节点编号
     */
    void timeOut(Long id);

    /**
     * 加时.
     *
     * @param id   节点编号
     * @param time 新的时间
     */
    void overtime(Long id, Date time);
}

package com.gm.mpm.def.log;

import java.util.Date;

/**
 * The interface Log.
 *
 * @author Jason
 */
public interface Log {
    /**
     * 日志ID.
     *
     * @return the id
     */
    String getId();

    /**
     * 操作人.
     *
     * @return the operator
     */
    String getOperator();

    /**
     * 操作项.
     *
     * @return the item
     */
    String getItem();

    /**
     * 详细说明.
     *
     * @return the detail
     */
    String getDetail();

    /**
     * 操作状态.
     *
     * @return the state
     */
    Integer getState();

    /**
     * 操作时间.
     *
     * @return the time
     */
    Date getTime();

    /**
     * 外键.
     *
     * @return the foreign key
     */
    String getForeignKey();
}

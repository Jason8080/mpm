package com.gm.mpm.def.unit;

/**
 * The interface Unit.
 *
 * @author Jason
 */
public interface Unit {
    /**
     * 单位编号.
     *
     * @return the id
     */
    Integer getId();

    /**
     * 外键.
     *
     * @return the foreign key
     */
    String getForeignKey();

    /**
     * 单位名称.
     *
     * @return the name
     */
    String getName();

    /**
     * 上级单位.
     *
     * @return the name
     */
    Integer getSuperior();
}

package com.gm.mpm.def.api;

import com.gm.mpm.def.unit.Unit;

/**
 * The interface Unit api.
 *
 * @author Jason
 */
public interface UnitApi {

    /**
     * 新增单位.
     *
     * @param unit the unit
     * @return the integer
     */
    Integer add(Unit unit);

    /**
     * 修改单位.
     *
     * @param unit the unit
     */
    void update(Unit unit);
}

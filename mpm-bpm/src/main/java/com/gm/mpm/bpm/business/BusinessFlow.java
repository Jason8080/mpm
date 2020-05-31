package com.gm.mpm.bpm.business;

import com.gm.mpm.bpm.flow.PauseRecorder;

import java.util.List;

/**
 * 流程业务模型.
 * @author Jason
 */
public interface BusinessFlow<F> {

    /**
     * 暂存快照.
     *
     * <p>
     * 用于支撑随意暂存执行.
     * </p>
     *
     * @return the long
     */
    List<PauseRecorder> pauseRecorder();
}

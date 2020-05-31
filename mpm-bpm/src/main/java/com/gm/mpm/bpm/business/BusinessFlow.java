package com.gm.mpm.bpm.business;

import com.gm.mpm.bpm.business.recorder.PauseRecorder;
import com.gm.mpm.bpm.business.recorder.ReplyRecorder;
import com.gm.mpm.bpm.node.Node;

import java.util.List;

/**
 * 流程业务模型.
 *
 * @param <F> the type parameter
 * @author Jason
 */
public interface BusinessFlow<F> {

    /**
     * 发起流程.
     *
     * @param initiator 发起人
     * @param template  流程模板
     * @return 返回发起节点
     */
    Node initiate(Long initiator, Long template);

    /**
     * 关闭流程.
     *
     * @param executor 执行人
     * @param remark   备注
     */
    void close(Long executor, String remark);

    /**
     * 流程结束.
     * <p>
     * 设置流程状态
     * 计算流程时长
     * </p>
     */
    void end();

    /**
     * 回复记录.
     *
     * @return the list
     */
    List<ReplyRecorder> replyRecorder();

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

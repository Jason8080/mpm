package com.gm.mpm.bpm.business;

import com.gm.mpm.bpm.business.recorder.PauseRecorder;
import com.gm.mpm.bpm.business.recorder.ReplyRecorder;
import com.gm.mpm.bpm.flow.Flow;
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
     * @return 返回发起节点 flow
     */
    Flow initiate(Long initiator, Long template);

    /**
     * 关闭流程.
     *
     * @param id       流程ID
     * @param executor 执行人
     * @param remark   备注
     */
    void close(Long id, long executor, String remark);

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
     * 回复.
     *
     * @param replyRecorder the reply recorder
     */
    void reply(ReplyRecorder replyRecorder);

    /**
     * 获取暂存记录.
     *
     * <p>
     * 用于支撑随意暂存执行.
     * </p>
     *
     * @return the long
     */
    List<PauseRecorder> pauseRecorder();


    /**
     * 暂存.
     *
     * @param pauseRecorder the pause recorder
     */
    void pause(PauseRecorder pauseRecorder);
}

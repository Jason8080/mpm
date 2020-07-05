package com.gm.mpm.data.model;

import java.util.Date;

public class NodeRecord {
    private Long id;

    private Long flowId;

    private Boolean state;

    private Date startTime;

    private Date endTime;

    private String means;

    public NodeRecord(Long id, Long flowId, Boolean state, Date startTime, Date endTime, String means) {
        this.id = id;
        this.flowId = flowId;
        this.state = state;
        this.startTime = startTime;
        this.endTime = endTime;
        this.means = means;
    }

    public NodeRecord() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getMeans() {
        return means;
    }

    public void setMeans(String means) {
        this.means = means == null ? null : means.trim();
    }
}
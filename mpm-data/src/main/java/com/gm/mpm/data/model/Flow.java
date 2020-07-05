package com.gm.mpm.data.model;

import java.util.Date;

public class Flow {
    private Long id;

    private Boolean state;

    private Date startTime;

    private Date endTime;

    private Integer unitId;

    public Flow(Long id, Boolean state, Date startTime, Date endTime, Integer unitId) {
        this.id = id;
        this.state = state;
        this.startTime = startTime;
        this.endTime = endTime;
        this.unitId = unitId;
    }

    public Flow() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", state=").append(state);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", unitId=").append(unitId);
        sb.append("]");
        return sb.toString();
    }
}
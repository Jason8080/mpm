package com.gm.mpm.data.model;

import java.util.Date;

public class Node {
    private Long id;

    private Long flowId;

    private Byte order;

    private Integer unitId;

    private Date dueTime;

    public Node(Long id, Long flowId, Byte order, Integer unitId, Date dueTime) {
        this.id = id;
        this.flowId = flowId;
        this.order = order;
        this.unitId = unitId;
        this.dueTime = dueTime;
    }

    public Node() {
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

    public Byte getOrder() {
        return order;
    }

    public void setOrder(Byte order) {
        this.order = order;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowId=").append(flowId);
        sb.append(", order=").append(order);
        sb.append(", unitId=").append(unitId);
        sb.append(", dueTime=").append(dueTime);
        sb.append("]");
        return sb.toString();
    }
}
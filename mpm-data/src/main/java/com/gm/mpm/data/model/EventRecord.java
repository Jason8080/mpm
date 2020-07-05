package com.gm.mpm.data.model;

public class EventRecord {
    private Long id;

    private Long nodeId;

    private Boolean state;

    public EventRecord(Long id, Long nodeId, Boolean state) {
        this.id = id;
        this.nodeId = nodeId;
        this.state = state;
    }

    public EventRecord() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nodeId=").append(nodeId);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}
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
}
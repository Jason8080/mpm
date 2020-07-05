package com.gm.mpm.data.model;

public class EventRecordTemplate {
    private Long id;

    private Long nodeId;

    private Boolean state;

    public EventRecordTemplate(Long id, Long nodeId, Boolean state) {
        this.id = id;
        this.nodeId = nodeId;
        this.state = state;
    }

    public EventRecordTemplate() {
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
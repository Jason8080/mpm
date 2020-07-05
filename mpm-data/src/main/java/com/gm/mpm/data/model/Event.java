package com.gm.mpm.data.model;

public class Event {
    private Long id;

    private Long nodeId;

    private Boolean type;

    private Boolean triggers;

    public Event(Long id, Long nodeId, Boolean type, Boolean triggers) {
        this.id = id;
        this.nodeId = nodeId;
        this.type = type;
        this.triggers = triggers;
    }

    public Event() {
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

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getTriggers() {
        return triggers;
    }

    public void setTriggers(Boolean triggers) {
        this.triggers = triggers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nodeId=").append(nodeId);
        sb.append(", type=").append(type);
        sb.append(", triggers=").append(triggers);
        sb.append("]");
        return sb.toString();
    }
}
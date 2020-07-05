package com.gm.mpm.data.model;

public class EventOperTemplate {
    private Long id;

    private Long nodeId;

    private String field;

    private String value;

    public EventOperTemplate(Long id, Long nodeId, String field, String value) {
        this.id = id;
        this.nodeId = nodeId;
        this.field = field;
        this.value = value;
    }

    public EventOperTemplate() {
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

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}
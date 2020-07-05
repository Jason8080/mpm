package com.gm.mpm.data.model;

public class FormRecordTemplate {
    private Long id;

    private Long flowId;

    private String field;

    private String value;

    public FormRecordTemplate(Long id, Long flowId, String field, String value) {
        this.id = id;
        this.flowId = flowId;
        this.field = field;
        this.value = value;
    }

    public FormRecordTemplate() {
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
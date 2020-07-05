package com.gm.mpm.data.model;

public class FormRecord {
    private Long id;

    private Long flowId;

    private String field;

    private String value;

    private String old;

    public FormRecord(Long id, Long flowId, String field, String value, String old) {
        this.id = id;
        this.flowId = flowId;
        this.field = field;
        this.value = value;
        this.old = old;
    }

    public FormRecord() {
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

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old == null ? null : old.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowId=").append(flowId);
        sb.append(", field=").append(field);
        sb.append(", value=").append(value);
        sb.append(", old=").append(old);
        sb.append("]");
        return sb.toString();
    }
}
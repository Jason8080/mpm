package com.gm.mpm.data.model;

public class NodeOper {
    private Long id;

    private Long flowId;

    private Boolean required;

    private Boolean type;

    private String operName;

    private String operValue;

    public NodeOper(Long id, Long flowId, Boolean required, Boolean type, String operName, String operValue) {
        this.id = id;
        this.flowId = flowId;
        this.required = required;
        this.type = type;
        this.operName = operName;
        this.operValue = operValue;
    }

    public NodeOper() {
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

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getOperValue() {
        return operValue;
    }

    public void setOperValue(String operValue) {
        this.operValue = operValue == null ? null : operValue.trim();
    }
}
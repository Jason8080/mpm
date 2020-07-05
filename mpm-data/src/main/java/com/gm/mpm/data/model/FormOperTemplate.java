package com.gm.mpm.data.model;

public class FormOperTemplate {
    private Long id;

    private Long flowId;

    private String crud;

    private Boolean required;

    private Boolean state;

    private String operTitle;

    private String operName;

    private String operValue;

    public FormOperTemplate(Long id, Long flowId, String crud, Boolean required, Boolean state, String operTitle, String operName, String operValue) {
        this.id = id;
        this.flowId = flowId;
        this.crud = crud;
        this.required = required;
        this.state = state;
        this.operTitle = operTitle;
        this.operName = operName;
        this.operValue = operValue;
    }

    public FormOperTemplate() {
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

    public String getCrud() {
        return crud;
    }

    public void setCrud(String crud) {
        this.crud = crud == null ? null : crud.trim();
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getOperTitle() {
        return operTitle;
    }

    public void setOperTitle(String operTitle) {
        this.operTitle = operTitle == null ? null : operTitle.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowId=").append(flowId);
        sb.append(", crud=").append(crud);
        sb.append(", required=").append(required);
        sb.append(", state=").append(state);
        sb.append(", operTitle=").append(operTitle);
        sb.append(", operName=").append(operName);
        sb.append(", operValue=").append(operValue);
        sb.append("]");
        return sb.toString();
    }
}
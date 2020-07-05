package com.gm.mpm.data.model;

import java.util.Date;

public class Log {
    private String id;

    private String operator;

    private String item;

    private Boolean state;

    private Date time;

    private String result;

    private String foreignKey;

    private String detail;

    public Log(String id, String operator, String item, Boolean state, Date time, String result, String foreignKey) {
        this.id = id;
        this.operator = operator;
        this.item = item;
        this.state = state;
        this.time = time;
        this.result = result;
        this.foreignKey = foreignKey;
    }

    public Log(String id, String operator, String item, Boolean state, Date time, String result, String foreignKey, String detail) {
        this.id = id;
        this.operator = operator;
        this.item = item;
        this.state = state;
        this.time = time;
        this.result = result;
        this.foreignKey = foreignKey;
        this.detail = detail;
    }

    public Log() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(String foreignKey) {
        this.foreignKey = foreignKey == null ? null : foreignKey.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operator=").append(operator);
        sb.append(", item=").append(item);
        sb.append(", state=").append(state);
        sb.append(", time=").append(time);
        sb.append(", result=").append(result);
        sb.append(", foreignKey=").append(foreignKey);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }
}
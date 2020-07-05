package com.gm.mpm.data.model;

public class MonitorRecord {
    private Long id;

    private Boolean state;

    private String result;

    public MonitorRecord(Long id, Boolean state, String result) {
        this.id = id;
        this.state = state;
        this.result = result;
    }

    public MonitorRecord() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}
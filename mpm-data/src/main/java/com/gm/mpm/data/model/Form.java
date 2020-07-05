package com.gm.mpm.data.model;

public class Form {
    private Long id;

    private Long flowId;

    private String title;

    public Form(Long id, Long flowId, String title) {
        this.id = id;
        this.flowId = flowId;
        this.title = title;
    }

    public Form() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}
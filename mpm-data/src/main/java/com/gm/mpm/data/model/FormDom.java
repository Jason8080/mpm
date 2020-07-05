package com.gm.mpm.data.model;

public class FormDom {
    private Long id;

    private Long formId;

    private String action;

    private String method;

    private String enctype;

    private String desc;

    public FormDom(Long id, Long formId, String action, String method, String enctype, String desc) {
        this.id = id;
        this.formId = formId;
        this.action = action;
        this.method = method;
        this.enctype = enctype;
        this.desc = desc;
    }

    public FormDom() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getEnctype() {
        return enctype;
    }

    public void setEnctype(String enctype) {
        this.enctype = enctype == null ? null : enctype.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}
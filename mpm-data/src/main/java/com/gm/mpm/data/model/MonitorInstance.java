package com.gm.mpm.data.model;

public class MonitorInstance {
    private Long id;

    private String classes;

    private String methods;

    public MonitorInstance(Long id, String classes, String methods) {
        this.id = id;
        this.classes = classes;
        this.methods = methods;
    }

    public MonitorInstance() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods == null ? null : methods.trim();
    }
}
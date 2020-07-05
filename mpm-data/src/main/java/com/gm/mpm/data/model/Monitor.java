package com.gm.mpm.data.model;

public class Monitor {
    private Long id;

    private Long nodeId;

    private Boolean start;

    private Boolean pre;

    private Boolean post;

    private Boolean ex;

    private Boolean after;

    private String end;

    public Monitor(Long id, Long nodeId, Boolean start, Boolean pre, Boolean post, Boolean ex, Boolean after, String end) {
        this.id = id;
        this.nodeId = nodeId;
        this.start = start;
        this.pre = pre;
        this.post = post;
        this.ex = ex;
        this.after = after;
        this.end = end;
    }

    public Monitor() {
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

    public Boolean getStart() {
        return start;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public Boolean getPre() {
        return pre;
    }

    public void setPre(Boolean pre) {
        this.pre = pre;
    }

    public Boolean getPost() {
        return post;
    }

    public void setPost(Boolean post) {
        this.post = post;
    }

    public Boolean getEx() {
        return ex;
    }

    public void setEx(Boolean ex) {
        this.ex = ex;
    }

    public Boolean getAfter() {
        return after;
    }

    public void setAfter(Boolean after) {
        this.after = after;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nodeId=").append(nodeId);
        sb.append(", start=").append(start);
        sb.append(", pre=").append(pre);
        sb.append(", post=").append(post);
        sb.append(", ex=").append(ex);
        sb.append(", after=").append(after);
        sb.append(", end=").append(end);
        sb.append("]");
        return sb.toString();
    }
}
package com.gm.mpm.data.model;

public class FormDomWithBLOBs extends FormDom {
    private String dom;

    private String css;

    private String js;

    public FormDomWithBLOBs(Long id, Long formId, String action, String method, String enctype, String dom, String css, String js) {
        super(id, formId, action, method, enctype);
        this.dom = dom;
        this.css = css;
        this.js = js;
    }

    public FormDomWithBLOBs() {
        super();
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom == null ? null : dom.trim();
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css == null ? null : css.trim();
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js == null ? null : js.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dom=").append(dom);
        sb.append(", css=").append(css);
        sb.append(", js=").append(js);
        sb.append("]");
        return sb.toString();
    }
}
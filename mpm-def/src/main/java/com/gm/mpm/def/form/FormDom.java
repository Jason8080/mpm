package com.gm.mpm.def.form;

public interface FormDom {
    /**
     * DOM主键
     * @return
     */
    Long getId();

    /**
     * 表单主键
     * @return
     */
    Long getFormId();

    /**
     * 后端接口地址
     * @return
     */
    String getAction();

    /**
     * 提交方法
     * @return
     */
    String getMethod();

    /**
     * 数据编码方式
     * @return
     */
    String getEnctype();

    /**
     * DOM树
     * @return
     */
    String getDom();

    /**
     * 样式
     * @return
     */
    String getCss();

    /**
     * JS脚本
     * @return
     */
    String getJs();

    /**
     * 描述
     * @return
     */
    String getDesc();
}

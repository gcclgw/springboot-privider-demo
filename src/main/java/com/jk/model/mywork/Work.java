package com.jk.model.mywork;

import java.io.Serializable;

public class Work implements Serializable {

    private static final long serialVersionUID = 1677646403923146957L;
    private Integer workid;

    private Integer htid;

    private Integer workstatus;

    private Integer handling;//处理方式

    private  String  htname;//  合同名称

    private String  htphone;  //商户电话

    private String text;



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getHtid() {
        return htid;
    }

    public void setHtid(Integer htid) {
        this.htid = htid;
    }

    public Integer getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(Integer workstatus) {
        this.workstatus = workstatus;
    }

    public Integer getHandling() {
        return handling;
    }

    public void setHandling(Integer handling) {
        this.handling = handling;
    }

    public String getHtname() {
        return htname;
    }

    public void setHtname(String htname) {
        this.htname = htname;
    }

    public String getHtphone() {
        return htphone;
    }

    public void setHtphone(String htphone) {
        this.htphone = htphone;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

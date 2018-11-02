package com.jk.model.cont;

import java.io.Serializable;
import java.util.Date;

public class Contx implements Serializable {

    private static final long serialVersionUID = 4368851814090799453L;
    private Integer htid;
    private String htname;
    private String htstatus;
    private Date startdate;
    private Date endtime;
    private Integer qid;
    private Date creatdate;
    private String htinfo;

    public Integer getHtid() {
        return htid;
    }

    public void setHtid(Integer htid) {
        this.htid = htid;
    }

    public String getHtname() {
        return htname;
    }

    public void setHtname(String htname) {
        this.htname = htname;
    }

    public String getHtstatus() {
        return htstatus;
    }

    public void setHtstatus(String htstatus) {
        this.htstatus = htstatus;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public String getHtinfo() {
        return htinfo;
    }

    public void setHtinfo(String htinfo) {
        this.htinfo = htinfo;
    }
}

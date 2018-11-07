package com.jk.model.rolePower;

import java.io.Serializable;

public class RolePower implements Serializable {

    private static final long serialVersionUID = -1246253737081947978L;

    private Integer rpid;

    /**
     * 权限id
     */
    private Integer pid;

    /**
     * 角色id
     */
    private Integer rid;

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}

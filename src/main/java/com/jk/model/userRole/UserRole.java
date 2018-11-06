package com.jk.model.userRole;

import com.jk.utils.Page;

import java.io.Serializable;

public class UserRole  extends Page implements Serializable {

    private static final long serialVersionUID = 10806609544196726L;

    /**
     * 用户角色关联id
     */
    private Integer nid;

    /**
     * 角色id
     */
    private Integer rid;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     *
     * @return
     */
    private String roleId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}

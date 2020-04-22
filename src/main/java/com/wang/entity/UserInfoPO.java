package com.wang.entity;

import java.io.Serializable;

public class UserInfoPO implements Serializable {
    private Integer dno;

    private String dnmae;

    private String loc;

    private static final long serialVersionUID = 1L;

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDnmae() {
        return dnmae;
    }

    public void setDnmae(String dnmae) {
        this.dnmae = dnmae == null ? null : dnmae.trim();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }
}
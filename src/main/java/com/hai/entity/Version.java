package com.hai.entity;

import java.util.Date;

public class Version {
    private Integer id;

    private String appKey;

    private String versionCode;

    private Date createTime;

    public Version(String appKey, String versionCode, Date createTime) {
        this.appKey = appKey;
        this.versionCode = versionCode;
        this.createTime = createTime;
    }

    public Version(Integer id, String appKey, String versionCode, Date createTime) {
        this.id = id;
        this.appKey = appKey;
        this.versionCode = versionCode;
        this.createTime = createTime;
    }

    public Version() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode == null ? null : versionCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Version{" +
                "id=" + id +
                ", appKey='" + appKey + '\'' +
                ", versionCode='" + versionCode + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
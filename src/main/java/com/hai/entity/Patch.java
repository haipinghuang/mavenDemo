package com.hai.entity;

import java.util.Date;

public class Patch {
    private Integer id;

    private String versionCode;

    private String patchMd5;

    private Date createTime;

    private Integer downloadSuccessNum;

    private Integer applySuccessNum;

    public Patch(Integer id, String versionCode, String patchMd5, Date createTime, Integer downloadSuccessNum, Integer applySuccessNum) {
        this.id = id;
        this.versionCode = versionCode;
        this.patchMd5 = patchMd5;
        this.createTime = createTime;
        this.downloadSuccessNum = downloadSuccessNum;
        this.applySuccessNum = applySuccessNum;
    }

    public Patch() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getPatchMd5() {
        return patchMd5;
    }

    public void setPatchMd5(String patchMd5) {
        this.patchMd5 = patchMd5 == null ? null : patchMd5.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDownloadSuccessNum() {
        return downloadSuccessNum;
    }

    public void setDownloadSuccessNum(Integer downloadSuccessNum) {
        this.downloadSuccessNum = downloadSuccessNum;
    }

    public Integer getApplySuccessNum() {
        return applySuccessNum;
    }

    public void setApplySuccessNum(Integer applySuccessNum) {
        this.applySuccessNum = applySuccessNum;
    }

    @Override
    public String toString() {
        return "Patch{" +
                "id=" + id +
                ", versionCode=" + versionCode +
                ", patchMd5='" + patchMd5 + '\'' +
                ", createTime=" + createTime +
                ", downloadSuccessNum=" + downloadSuccessNum +
                ", applySuccessNum=" + applySuccessNum +
                '}';
    }
}
package com.hai.entity;

import java.util.Date;

public class Patch {
    private Integer id;

    private Integer appId;

    private Integer versionId;

    private String patchMd5;

    private Date createTime;

    private Integer downloadSuccessNum;

    private Integer applySuccessNum;

    public Patch(Integer id, Integer appId, Integer versionId, String patchMd5, Date createTime, Integer downloadSuccessNum, Integer applySuccessNum) {
        this.id = id;
        this.appId = appId;
        this.versionId = versionId;
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

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
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
}
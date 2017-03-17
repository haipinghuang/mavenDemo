package com.hai.entity;

import java.util.Date;

public class PatchWithBLOBs extends Patch {
    private String describe;

    private String downloadLink;

    public PatchWithBLOBs(Integer id, Integer versionCode, String patchMd5, Date createTime, Integer downloadSuccessNum, Integer applySuccessNum, String describe, String downloadLink) {
        super(id, versionCode, patchMd5, createTime, downloadSuccessNum, applySuccessNum);
        this.describe = describe;
        this.downloadLink = downloadLink;
    }

    public PatchWithBLOBs() {
        super();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink == null ? null : downloadLink.trim();
    }
}
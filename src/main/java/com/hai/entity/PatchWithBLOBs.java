package com.hai.entity;

import java.util.Date;

public class PatchWithBLOBs extends Patch {
    private String depict;

    private String downloadLink;

    public PatchWithBLOBs(Integer id, Integer appId, Integer versionId, String patchMd5, Date createTime, Integer downloadSuccessNum, Integer applySuccessNum, String depict, String downloadLink) {
        super(id, appId, versionId, patchMd5, createTime, downloadSuccessNum, applySuccessNum);
        this.depict = depict;
        this.downloadLink = downloadLink;
    }

    public PatchWithBLOBs() {
        super();
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict == null ? null : depict.trim();
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink == null ? null : downloadLink.trim();
    }
}
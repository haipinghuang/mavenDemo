package com.hai.service;

import com.hai.entity.PatchExample;
import com.hai.entity.PatchWithBLOBs;

import java.util.List;

/**
 * Created by 黄海 on 2017/3/31.
 */
public interface PatchService {
    List<PatchWithBLOBs> selectByExampleWithBLOBs(PatchExample example);
    public int insert(int appId, int versionId, String filePath, String patchMd5, String depict);
    PatchWithBLOBs selectByPrimaryKey(Integer id);
}

package com.hai.service;

import com.hai.entity.PatchWithBLOBs;
import com.hai.entity.Version;

/**
 * Created by 黄海 on 2017/3/17.
 */
public interface PatchService {
    int insert(PatchWithBLOBs record);
    int update(int versionCode,String patchMd5);
}

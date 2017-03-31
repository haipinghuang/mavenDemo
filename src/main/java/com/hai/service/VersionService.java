package com.hai.service;

import com.hai.entity.App;
import com.hai.entity.AppExample;
import com.hai.entity.Version;

import java.util.List;

/**
 * Created by 黄海 on 2017/3/17.
 */
public interface VersionService {
    int insert(Version record);
    List<Version> selectVersions();
    Version selectByPrimaryKey(Integer id);
    Version selectByVersionCode(String versionCode);
}

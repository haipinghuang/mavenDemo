package com.hai.service;

import com.hai.entity.Version;
import com.hai.entity.VersionExample;

import java.util.List;

/**
 * Created by 黄海 on 2017/3/17.
 */
public interface VersionService {
    int insert(Version record);
    List<Version> selectByExample(VersionExample example);
}

package com.hai.service.impl;

import com.hai.dao.AppMapper;
import com.hai.dao.VersionMapper;
import com.hai.entity.Version;
import com.hai.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 黄海 on 2017/3/30.
 */
@Service
public class VersionServiceImpl implements VersionService {
    @Autowired
    VersionMapper versionMapper;

    @Override
    public int insert(Version record) {
        return versionMapper.insert(record);
    }

    @Override
    public Version selectByPrimaryKey(Integer id) {
        return versionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Version> selectByAppKey(String appKey) {
        return versionMapper.selectByAppKey(appKey);
    }

    @Override
    public List<Version> selectVersions() {
        return versionMapper.selectVersions();
    }

    @Override
    public Version selectByVersionCode(String versionCode) {
        return versionMapper.selectByVersionCode(versionCode);
    }
}

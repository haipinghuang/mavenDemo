package com.hai.service.impl;

import com.hai.dao.AppMapper;
import com.hai.dao.VersionMapper;
import com.hai.entity.Version;
import com.hai.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Version> selectVersions() {
        return versionMapper.selectVersions();
    }
}

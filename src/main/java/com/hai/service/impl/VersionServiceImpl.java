package com.hai.service.impl;

import com.hai.dao.VersionMapper;
import com.hai.entity.Version;
import com.hai.service.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by 黄海 on 2017/3/17.
 */
@Service
public class VersionServiceImpl implements VersionService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    VersionMapper versionMapper;

    public int insert(Version record) {
        return versionMapper.insert(record);
    }

}

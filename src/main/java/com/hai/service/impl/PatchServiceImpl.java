package com.hai.service.impl;

import com.hai.dao.PatchMapper;
import com.hai.dao.VersionMapper;
import com.hai.entity.PatchWithBLOBs;
import com.hai.entity.Version;
import com.hai.service.PatchService;
import com.hai.service.VersionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by 黄海 on 2017/3/17.
 */
@Service
public class PatchServiceImpl implements PatchService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PatchMapper patchMapper;

    @Override
    public int insert(PatchWithBLOBs record) {
        return patchMapper.insert(record);
    }

    @Override
    public int update(int versionCode, String patchMd5) {
        return 0;
    }
}

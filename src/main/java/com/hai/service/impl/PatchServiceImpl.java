package com.hai.service.impl;

import com.hai.dao.PatchMapper;
import com.hai.entity.Patch;
import com.hai.entity.PatchExample;
import com.hai.entity.PatchWithBLOBs;
import com.hai.service.PatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by 黄海 on 2017/3/31.
 */
@Service
public class PatchServiceImpl implements PatchService {
    @Autowired
    PatchMapper patchMapper;

    @Override
    @Transactional
    public List<PatchWithBLOBs> selectByExampleWithBLOBs(PatchExample example) {
        return patchMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public int insert(int appId, int versionId, String filePath, String patchMd5, String depict) {
        if (patchMapper.countByAppIdAndVersionId(appId, versionId) == 1) {
            PatchWithBLOBs patchWithBLOBs = new PatchWithBLOBs(null, appId, versionId, patchMd5, new Date(), 0, 0, depict, filePath);
            return patchMapper.insert(patchWithBLOBs);
        }
        return 0;
    }

    @Override
    public PatchWithBLOBs selectByPrimaryKey(Integer id) {
        return patchMapper.selectByPrimaryKey(id);
    }
}

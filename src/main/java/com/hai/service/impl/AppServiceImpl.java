package com.hai.service.impl;

import com.hai.dao.AppMapper;
import com.hai.entity.App;
import com.hai.entity.AppExample;
import com.hai.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 黄海 on 2017/3/30.
 */
@Service
public class AppServiceImpl implements AppService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    AppMapper appMapper;


    @Override
    public int insert(App record) {
        return appMapper.insert(record);
    }

    @Override
    public List<App> selectByExample(AppExample example) {
        return appMapper.selectByExample(example);
    }

    @Override
    public App selectByAppKey(String appKey) {
        return appMapper.selectByAppKey(appKey);
    }

    @Override
    public App selectByPrimaryKey(Integer id) {
        return appMapper.selectByPrimaryKey(id);
    }
}

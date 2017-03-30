package com.hai.service;

import com.hai.entity.*;

import java.util.List;

/**
 * Created by 黄海 on 2017/3/17.
 */
public interface AppService {
    int insert(App record);

    List<App> selectByExample(AppExample example);

    App selectByAppKey(String appKey);

    App selectByPrimaryKey(Integer id);
}

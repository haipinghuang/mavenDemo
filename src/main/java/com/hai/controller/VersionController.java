package com.hai.controller;

import com.hai.entity.Version;
import com.hai.service.VersionService;
import com.hai.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 黄海 on 2017/3/17.
 */
@RestController
@RequestMapping("/version")
public class VersionController {
    private static final String TAG = VersionController.class.getSimpleName();
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    VersionService versionService;

    @RequestMapping("/insert")
    public String insertVersion(@RequestParam("appKey") String appkey, @RequestParam("appVersion") String versionCode) {
        System.out.println(" sout insertVersion() called with: " + "appkey = [" + appkey + "], versionCode = [" + versionCode + "]");
        if (!StringUtils.isEmpty(appkey, versionCode)) {
            int insert = versionService.insert(new Version(appkey, versionCode, new Date()));
            return "insert num=" + insert;
        }
        return "insert num=0";
    }
}

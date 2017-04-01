package com.hai.controller;

import com.hai.entity.App;
import com.hai.entity.Version;
import com.hai.service.AppService;
import com.hai.service.VersionService;
import com.hai.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by 黄海 on 2017/3/17.
 */
@Controller
@RequestMapping("/version")
public class VersionController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    VersionService versionService;
    @Autowired
    AppService appService;

    @RequestMapping(value = "/toAddVersion")
    public ModelAndView toAddVersion(@RequestParam("appId") int appId) {
        App app = appService.selectByPrimaryKey(appId);
        ModelAndView mav = new ModelAndView("/jsp/versionAdd");
        mav.addObject("app", app);
        return mav;
    }

    @RequestMapping("/insert")
    public ModelAndView insertVersion(@RequestParam("appId") int appId, @RequestParam("versionCode") String versionCode) {
        logger.info("insertVersion() called with: " + "appId = [" + appId + "], versionCode = [" + versionCode + "]");
        if (!StringUtils.isEmpty(versionCode)) {
            App app = appService.selectByPrimaryKey(appId);
            if (app != null) {
                int num = versionService.insert(new Version(null, app.getAppKey(), versionCode, new Date()));
                if (num > 0) {
                    logger.info("创建版本success");
                    List<Version> versions = versionService.selectVersions();
                    ModelAndView mav = new ModelAndView("/jsp/appDetail");
                    mav.addObject("app", app);
                    mav.addObject("versions", versions);
                    return mav;
                } else logger.info("创建版本失败num=0");
            } else {
                logger.info("创建版本失败:appId 不存在");
            }
        }
        logger.info("创建版本失败versionCode=null");
        return null;
    }

    @RequestMapping("/getVersionList")
    public ModelAndView getVersionList(@RequestParam(value = "appId") int appId) {
        List<Version> versions = versionService.selectVersions();
        ModelAndView mv = new ModelAndView("jsp/versionAdd");
        return mv;
    }
}

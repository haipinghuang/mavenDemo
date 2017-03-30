package com.hai.controller;

import com.hai.entity.App;
import com.hai.entity.AppExample;
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
    public String insertVersion(@RequestParam("appId") int appId, @RequestParam("versionCode") String versionCode) {
        logger.info("insertVersion() called with: " + "appId = [" + appId + "], versionCode = [" + versionCode + "]");
        if (!StringUtils.isEmpty(versionCode)) {
            appService.selectByPrimaryKey(appId);
        }
        logger.info("创建版本失败");
        return "insert num=0";
    }

    @RequestMapping("/getVersionList")
    public ModelAndView getVersionList() {
        List<Version> versions = versionService.selectVersions();
        ModelAndView mv = new ModelAndView("jsp/versionAdd");
        return mv;
    }
}

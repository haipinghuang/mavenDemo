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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by 黄海 on 2017/3/30.
 */
@Controller
@RequestMapping(value = "/app")
public class AppController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    AppService appService;
    @Autowired
    VersionService versionService;

    @RequestMapping(value = "/selectAllApp")
    public ModelAndView selectAllApp() {
        List<App> apps = appService.selectByExample(new AppExample());
        ModelAndView mav = new ModelAndView("/jsp/appList");
        mav.addObject("apps", apps);
        return mav;
    }

    @RequestMapping(value = "/insert")
    public ModelAndView insertApp(@RequestParam(value = "appName") String appName) {
        logger.info("appName=" + appName);
        if (!StringUtils.isEmpty(appName)) {
            App app = new App(null, appName, appName + new Date().getTime());
            if (appService.insert(app) > 0) {
                logger.info("app 创建成功 with info=" + app);

            }
        }
        return selectAllApp();
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public ModelAndView detail(@RequestParam(value = "id") int id) {
        App app = appService.selectByPrimaryKey(id);
        List<Version> versions = versionService.selectVersions();
        ModelAndView mav = new ModelAndView("/jsp/appDetail");
        mav.addObject("app", app);
        mav.addObject("versions", versions);
        return mav;
    }
}

package com.hai.controller;

import com.hai.entity.App;
import com.hai.entity.PatchExample;
import com.hai.entity.PatchWithBLOBs;
import com.hai.entity.Version;
import com.hai.service.AppService;
import com.hai.service.PatchService;
import com.hai.service.VersionService;
import com.hai.util.Md5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by 黄海 on 2017/3/17.
 */
@Controller
@RequestMapping("/patch")
public class PatchController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PatchService patchService;
    @Autowired
    AppService appService;
    @Autowired
    VersionService versionService;

    @RequestMapping(value = "/getAllPatch")
    public ModelAndView getAllPatch(@RequestParam("appId") int appId, @RequestParam("versionId") int versionId) {
        logger.info("getAllPatch() called with: " + "appId = [" + appId + "], versionId = [" + versionId + "]");
        PatchExample patchExample = new PatchExample();
        PatchExample.Criteria criteria = patchExample.createCriteria();
        criteria.andAppIdEqualTo(appId);
        criteria.andVersionIdEqualTo(versionId);
        patchExample.setOrderByClause("ID DESC");
        List<PatchWithBLOBs> patchWithBLOBses = patchService.selectByExampleWithBLOBs(patchExample);
        App app = appService.selectByPrimaryKey(appId);
        Version version = versionService.selectByPrimaryKey(versionId);
        ModelAndView mav = new ModelAndView("/jsp/patchList");
        mav.addObject("patchs", patchWithBLOBses);
        mav.addObject("app", app);
        mav.addObject("version", version);
        return mav;
    }

    @RequestMapping(value = "/toAddPatch")
    public ModelAndView toAddPatch(@RequestParam("appId") int appId, @RequestParam("versionId") int versionId) {
        logger.info("getAllPatch() called with: " + "appId = [" + appId + "], versionId = [" + versionId + "]");
        App app = appService.selectByPrimaryKey(appId);
        Version version = versionService.selectByPrimaryKey(versionId);
        ModelAndView mav = new ModelAndView("/jsp/patchAdd");
        mav.addObject("app", app);
        mav.addObject("version", version);
        return mav;
    }

    @RequestMapping("/insert")
    public ModelAndView insertPatch(@RequestParam("appId") int appId, @RequestParam("versionId") int versionId
            , @RequestParam("file") CommonsMultipartFile file, @RequestParam(value = "depict", required = false) String describe) {
        logger.info("insertPatch() called with: " + "appId = [" + appId + "], versionId = [" + versionId + "], file = [" + file + "], describe = [" + describe + "]");
        if (file != null && !file.isEmpty()) {
            String path = "F:/fileUpload";
            File destFile = new File(path, new Date().getTime() + file.getOriginalFilename());
            if (!destFile.getParentFile().exists()) destFile.getParentFile().mkdir();
            if (!destFile.exists()) {
                try {
                    destFile.createNewFile();
                    file.transferTo(destFile);
                    logger.info("file:" + file.getOriginalFilename() + " copied success");
                } catch (IOException e) {
                    e.printStackTrace();
                    destFile.delete();
                    return null;
                }
            }
            String fileMD5 = Md5Utils.getFileMD5(destFile);
            int num = patchService.insert(appId, versionId, destFile.getAbsolutePath(), fileMD5, describe);
            if (num == 1) {
                logger.info("补丁插入成功");
                return getAllPatch(appId, versionId);
            } else destFile.deleteOnExit();
        }
        return null;
    }

    @RequestMapping("/download")
    public String download(@RequestParam("patchId") int patchId) {
        PatchWithBLOBs patchWithBLOBs = patchService.selectByPrimaryKey(patchId);
        if (patchWithBLOBs != null) {
            return "redirect:/file/download?filePath=" + patchWithBLOBs.getDownloadLink();
        }
        return null;
    }
}

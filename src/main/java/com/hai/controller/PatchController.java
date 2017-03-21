package com.hai.controller;

import com.hai.entity.Patch;
import com.hai.entity.PatchWithBLOBs;
import com.hai.service.VersionService;
import com.hai.util.Md5Utils;
import com.hai.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * Created by 黄海 on 2017/3/17.
 */
@RestController
@RequestMapping("/patch")
public class PatchController {
    private static final String TAG = PatchController.class.getSimpleName();
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    VersionService versionService;

    @RequestMapping("/insert")
    public String insertPatch(@RequestParam("file") CommonsMultipartFile file, @RequestParam("versionCode") String versionCode, @RequestParam(value = "describe", required = false) String describe) {
        System.out.println("insertPatch() called with: " + "file = [" + file + "], versionCode = [" + versionCode + "], describe = [" + describe + "]");
        if (file != null && !file.isEmpty() && !StringUtils.isEmpty(versionCode)) {
            String path = "F:/fileUpload";
            File destFile = new File(path, new Date().getTime() + file.getOriginalFilename());
            if (!destFile.exists()) {
                try {
                    destFile.createNewFile();
                    file.transferTo(destFile);
                    System.out.println("file:" + file.getOriginalFilename() + " upload success");
                } catch (IOException e) {
                    e.printStackTrace();
                    destFile.delete();
                    return "file:" + file.getOriginalFilename() + " upload failed";
                }
            }
            String fileMD5 = Md5Utils.getFileMD5(destFile);
        }
        return " upload failed";
    }
}

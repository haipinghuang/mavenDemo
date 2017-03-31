package com.hai.controller;

import com.hai.util.StringUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;

/**
 * Created by 黄海 on 2017/3/31.
 */
@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(@RequestParam(value = "filePath") String filePath) {
        if (!StringUtils.isEmpty(filePath)){
            File file=new File(filePath);
            if (file.exists()&&file.length()>0){
                HttpHeaders httpHeaders=new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
                httpHeaders.setContentDispositionFormData("attachment",filePath);
                try {
                    return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),httpHeaders, HttpStatus.CREATED);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

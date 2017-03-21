package com.hai;

import com.hai.util.Md5Utils;
import com.hai.util.StringUtils;

/**
 * Created by 黄海 on 2017/3/17.
 */
public class MyTest {
    public static void main(String[] str) {
        String filepath = "F:\\BaiduYunDownload\\Adobe Photoshop CC 2015最新版.rar";
        System.out.println(Md5Utils.getFileMD5(filepath));
    }

}

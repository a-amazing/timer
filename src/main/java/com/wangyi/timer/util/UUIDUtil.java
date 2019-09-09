package com.wangyi.timer.util;

import java.util.UUID;

/**
 * @author:wangyi
 * @Date:2019/9/9
 */
public class UUIDUtil {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}

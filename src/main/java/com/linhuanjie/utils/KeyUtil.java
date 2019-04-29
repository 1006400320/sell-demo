package com.linhuanjie.utils;

import java.util.Random;

/**
 * @author: linhuanjie
 * @description:
 * @createTime : 2019-04-25 23:05
 * @email: lhuanjie@qq.com
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}

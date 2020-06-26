package com.zbb.common.util.string;

import com.zbb.common.util.date.DateUtil;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @author sunflower
 * @className StringUtil
 * @description TODO
 * @date 2019/9/25 17:16
 */

public class StringUtil extends org.apache.commons.lang3.StringUtils {

    /**
     * 获取UUID
     *
     * @return uuid
     */
    public static String getUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 获取当前时间戳
     *
     * @return 时间戳
     */
    public static Long getTimestamp() {
        return System.currentTimeMillis();
    }


    /**
     * 获取流水号
     *
     * @return 流水号
     */
    public static String getOrderNo() {
        return DateUtil.date2Str(new Date(), "yyyyMMddHHmmssSSSSSS");
    }

    /**
     * 获取追溯码流水号
     *
     * @return 流水号
     */
    public static String getOrderCodeNo() {
        return DateUtil.date2Str(new Date(), "yyyyMMdd");
    }

    /**
     * 获取随机验证码
     *
     * @return integer
     */
    public static String getSmsCode() {
        Random random = new Random();
        return String.valueOf(random.nextInt(9000) + 1000);
    }

}

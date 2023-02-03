package com.nanaseme.funmessage.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

/**
 * Md5加密工具类
 *
 * @author WangZD
 * @Date 2023/2/3 16:59
 */
@Component
public class Md5Utils {
    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    /**
     * 密码盐
     */
    private static final String PASSWORD_SALT = "encryption";

    /**
     * 第一次加密
     *
     * @param inputStr 需加密字符串
     * @return md5加密后字符串
     */
    public static String firstMd5(String inputStr) {
        //md5加密密码前，先对密码进行处理，按以下PASSWORD_SALT的规则处理密码
        String md5Str = "" + PASSWORD_SALT.charAt(0) + PASSWORD_SALT.charAt(2) + inputStr + PASSWORD_SALT.charAt(5) + PASSWORD_SALT.charAt(4);
        return md5(md5Str);
    }

    /**
     * 第二次加密
     *
     * @param inputStr 需加密字符串
     * @return md5加密后字符串
     */
    public static String secondMd5(String inputStr) {
        String md5Str = "" + PASSWORD_SALT.charAt(0) + PASSWORD_SALT.charAt(2) + inputStr + PASSWORD_SALT.charAt(5) + PASSWORD_SALT.charAt(4);
        return md5(md5Str);
    }

    /**
     * 有效加密
     *
     * @param inputStr 需加密字符串
     * @return md5加密后字符串
     */
    public static String validMd5(String inputStr) {
        String firstStr = firstMd5(inputStr);
        return secondMd5(firstStr);
    }
}
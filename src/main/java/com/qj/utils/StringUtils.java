package com.qj.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huangzequan on 2017/7/20.
 */
public class StringUtils {

    static String  regEx = "[\u4e00-\u9fa5]";
    static Pattern pat   = Pattern.compile(regEx);

    //是否中文字
    public static boolean isContainsChinese(String str)
    {
        Matcher matcher = pat.matcher(str);
        boolean flg = false;
        if (matcher.find())    {
            flg = true;
        }
        return flg;
    }

    public static Boolean isBlank(String str) {
        return str == null || "".equals(str);
    }

    public static Boolean isNotBlank(String str){
        return str !=null&& !str.trim().equals("");
    }
}

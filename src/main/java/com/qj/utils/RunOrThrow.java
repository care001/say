package com.qj.utils;

import com.qj.bean.ErrCode;

/**
 * Created by huangzequan on 2017/7/20.
 */
public class RunOrThrow {
    public static void nullThrow(String str, String msg) {
        if(null == str || str.trim().equals("")) {
            throw new SayException(msg, "30001");
        }
    }

    public static void falseThrow(boolean b, String msg) {
        if (!b) {
            throw new SayException(msg, "30003");
        }
    }

    public static void blankThrow(Object str, String msg) {
        if(str == null ) {
            throw new SayException(msg, "30002");
        }
    }
}

package com.qj.bean;

/**
 * Created by huangzequan on 2017/7/20.
 */
public enum  ErrCode {
    /**3 代码参数*/
    NULL_ERR(30001, "有不能为null的为null"),
    BLANK_ERR(30002, "有不能为空值的为空值"),
    TERM_ERR(30003, "条件不满足"),

    /**2 数据库*/
    DATA_ERR(20001, "数据库错误"),

    /**1 系统*/
    SYSTEM_ERR(10001, "系统错误");
    private  int errorCode;
    private String errorMsg;
    ErrCode(int errorCode, String errorMsg)
    {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMsg()
    {
        return errorMsg;
    }


}

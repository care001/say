package com.qj.utils;

import com.qj.bean.ErrCode;

/**
 * Created by huangzequan on 2017/7/20.
 */
public class SayException extends RuntimeException{
    private String sayErrCode;

    public SayException(ErrCode errCode){
        super(errCode.getErrorMsg());
        this.sayErrCode = errCode.getErrorCode()+"";
    }

    public SayException(String errorMsg){
        super(errorMsg);
        this.sayErrCode = "10002";
    }

    public SayException(String errorMsg, String errorCode){
        super(errorMsg);
        this.sayErrCode = errorCode;
    }

    public String getSayErrCode() {
        return sayErrCode;
    }

    public void setSayErrCode(String sayErrCode) {
        this.sayErrCode = sayErrCode;
    }
}

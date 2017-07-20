package com.qj.utils;

/**
 * Created by huangzequan on 2017/7/19.
 */
public class BackJson {
    private String errCode;
    private boolean success;
    private String errMsg;
    private Object data;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static BackJson buildSuccess(Object object){
        BackJson backJson = new BackJson();
        backJson.setErrCode("200");
        backJson.setErrMsg("成功");
        backJson.setSuccess(true);
        backJson.setData(object);

        return backJson;
    }


}

package com.qj.controller;

import com.qj.utils.BackJson;
import com.qj.utils.SayException;
import com.qj.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by huangzequan on 2017/7/20.
 */

@ControllerAdvice(basePackages = "com.qj.controller")
public class ExceptionController {

    private static Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BackJson handler(HttpServletRequest request, Exception e) throws Exception{
        BackJson backJson = new BackJson();
        backJson.setSuccess(false);
        backJson.setErrCode("400");
        backJson.setData(null);
        String msg = e.getMessage();
        backJson.setErrMsg(msg);

        logger.info(msg, e);
        //如果是自定义异常 取自定义code
        if(e instanceof SayException){
            backJson.setErrCode(((SayException) e).getSayErrCode());
        }

        //如果异常为中文 打印
        if(msg != null && StringUtils.isContainsChinese(msg)){
            backJson.setErrMsg(msg);
        }else{
            if(e instanceof HttpMessageNotReadableException){
                backJson.setErrMsg("请求数据错误");
            }else{
                backJson.setErrMsg("未知异常");
            }
        }
        return backJson;
    }
}

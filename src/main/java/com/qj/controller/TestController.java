package com.qj.controller;

import com.qj.mybatis.entity.SayUser;
import com.qj.mybatis.service.SayUserService;
import com.qj.utils.BackJson;
import com.qj.utils.RunOrThrow;
import com.qj.utils.SayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by huangzequan on 2017/7/18.
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
    private SayUserService sayUserService;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public BackJson test(@RequestBody Map<String, String> args){
        RunOrThrow.blankThrow(args.get("openId"),"openId不能为空");
        SayUser user = sayUserService.getByOpenId(args.get("openId"));
        return BackJson.buildSuccess(user);
    }
}

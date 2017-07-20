package com.qj.mybatis.service;

import com.qj.mybatis.entity.SayUser;
import org.springframework.stereotype.Service;

/**
 * Created by huangzequan on 2017/7/20.
 */
public interface SayUserService {

    public boolean insert(SayUser sayUser);

    public SayUser getByOpenId(String openId);
}

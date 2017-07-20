package com.qj.mybatis.service.impl;

import com.qj.bean.ErrCode;
import com.qj.mybatis.entity.SayUser;
import com.qj.mybatis.mapper.SayUserMapper;
import com.qj.mybatis.service.SayUserService;
import com.qj.utils.SayException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by huangzequan on 2017/7/20.
 */
@Service
public class SayUserServiceImpl implements SayUserService{
    @Resource
    private SayUserMapper sayUserMapper;

    @Override
    public boolean insert(SayUser sayUser) {
        sayUserMapper.insert(sayUser);
//        if(sayUserMapper.insert(sayUser)<1){
//            throw new SayException(ErrCode.DATA_ERR);
//        }
        return true;
    }

    @Override
    public SayUser getByOpenId(String openId) {
        return sayUserMapper.selectByOpenId(openId);
    }
}

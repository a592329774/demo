package com.demo.userInfo.impl;

import com.demo.userInfo.dao.UserInfoDao;
import com.demo.userInfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoDao userInfoDao ;
    @Override
    public Map selectAll() {
        return userInfoDao.selectAll() ;
    }
}

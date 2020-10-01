package com.yewencong.demo.service.impl;

import com.yewencong.demo.Dao.UserInfo;
import com.yewencong.demo.mapper.UserMapper;
import com.yewencong.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserInfo(UserInfo user) {
        UserInfo userInfo = userMapper.getUserInfo(user);
        return userInfo;
    }
}

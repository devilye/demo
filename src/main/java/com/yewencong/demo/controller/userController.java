package com.yewencong.demo.controller;

import com.yewencong.demo.Dao.UserInfo;
import com.yewencong.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/user")
public class userController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUserInfo")
    public UserInfo getUserInfo(@RequestBody UserInfo user) {
        UserInfo userInfo= new UserInfo();
        try {
            userInfo = userService.getUserInfo(user);
        } catch (Exception e){
            log.info("[userController] getUserInfo exception : ()", e);
        }
        return userInfo;
    }
}

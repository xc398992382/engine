package com.example.engine.controller;

import com.example.engine.mybatis.auto.domain.Userinfo;
import com.example.engine.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:  HelloController
 * Description:UserInfo测试类
 * Author:  XC
 * Version: 1.0
 * Date : 2017-09-23  19:01
 */
@RestController
public class UserInfoController {

    /** logger */
     private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

     @Autowired
     private UserInfoService userInfoService;

    @RequestMapping(value="/add/user")
    public Userinfo addUser(String uname){
        Userinfo userInfo=new Userinfo();
        userInfo.setName(uname);
        int flag=userInfoService.addUserInfo(userInfo);
        return userInfo;
    }
}

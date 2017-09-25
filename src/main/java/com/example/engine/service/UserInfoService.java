package com.example.engine.service;

import com.example.engine.mybatis.auto.domain.Userinfo;

import java.util.List;

/**
 * ClassName:  UserInfoService
 * Description:
 * Author:  XC
 * Version: 1.0
 * Date : 2017-09-24  17:53
 */
public interface UserInfoService {

    /**
     * 获取所有用户
     * @return
     */
    List<Userinfo> getAllUserInfo();

    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int addUserInfo(Userinfo userInfo);

    /**
     * 更新用户
     * @param userinfo
     * @return
     */
    int updateUserInfo(Userinfo userinfo);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int deleteUserInfo(Integer userId);


}

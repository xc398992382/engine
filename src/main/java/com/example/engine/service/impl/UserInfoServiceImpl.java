package com.example.engine.service.impl;

import com.example.engine.mybatis.auto.dao.UserinfoMapper;
import com.example.engine.mybatis.auto.domain.Userinfo;
import com.example.engine.mybatis.auto.domain.UserinfoExample;
import com.example.engine.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName:  UserInfoServiceImpl
 * Description:
 * Author:  XC
 * Version: 1.0
 * Date : 2017-09-24  17:56
 */
@Service(value="userInfoServiceImpl")
@Transactional
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public List<Userinfo> getAllUserInfo() {
        UserinfoExample example=new UserinfoExample();
        UserinfoExample.Criteria criteria=example.createCriteria();
        example.setOrderByClause("id");
        return userinfoMapper.selectByExample(example);
    }

        @Override
        public int addUserInfo(Userinfo userInfo) {
            return userinfoMapper.insert(userInfo);
        }

        @Override
        public int updateUserInfo(Userinfo userinfo) {
            return userinfoMapper.updateByPrimaryKeySelective(userinfo);
        }

        @Override
        public int deleteUserInfo(Integer userId) {
            return userinfoMapper.deleteByPrimaryKey(userId);
        }

}

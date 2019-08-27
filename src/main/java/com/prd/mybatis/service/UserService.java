package com.prd.mybatis.service;

import com.prd.mybatis.entity.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: 用户信息逻辑接口类
 * @Author: WeiWei
 * @Date: 2019-08-21 10：58
 * */
public interface UserService {
    User selectByPrimaryKey(Integer userId);
}

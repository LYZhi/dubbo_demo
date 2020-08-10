package com.zhi.service.impl;

import com.zhi.pojo.User;
import com.zhi.service.UserService;

/**
 * @author LYZhi
 * @date 2020/8/9 22:09
 */
public class UserServiceImpl implements UserService {
    @Override
    public User selectById(String id) {
        User user = new User();

        user.setId(id);
        user.setName("zhi");
        user.setTel("123123");

        return user;
    }
}

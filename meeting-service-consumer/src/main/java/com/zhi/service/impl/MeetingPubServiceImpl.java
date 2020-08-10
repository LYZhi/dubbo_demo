package com.zhi.service.impl;

import com.zhi.pojo.MeetingPub;
import com.zhi.pojo.User;
import com.zhi.service.MeetingPubService;
import com.zhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LYZhi
 * @date 2020/8/9 22:23
 */
@Service
public class MeetingPubServiceImpl implements MeetingPubService {

    @Autowired
    private UserService userService;

    @Override
    public MeetingPub selectByPcode(String pcode) {
        MeetingPub meetingPub = new MeetingPub();

        meetingPub.setId("1001");
        meetingPub.setPcode(pcode);
        meetingPub.setTitle("dubbo");
        meetingPub.setContent("学习dubbo啊！！1");
        meetingPub.setUid("123");

        //根据用户ID查询用户信息
        System.out.println("------------正在远程访问----"+userService);
        User user = userService.selectById(meetingPub.getUid());
        meetingPub.setUser(user);
        //得到用户信息


        return meetingPub;

    }
}

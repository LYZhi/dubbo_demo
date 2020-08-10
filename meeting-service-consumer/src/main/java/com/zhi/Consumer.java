package com.zhi;

import com.zhi.pojo.MeetingPub;
import com.zhi.service.MeetingPubService;
import com.zhi.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LYZhi
 * @date 2020/8/10 10:09
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[] {"classpath:consumer.xml"});
        context.start();

        MeetingPubService meetingPubService = context.getBean(MeetingPubService.class);
        //获取远程访问数据
        MeetingPub meetingPub = meetingPubService.selectByPcode("1001");

        //显示调用结果
        System.out.println(meetingPub);

        System.in.read();

    }
}

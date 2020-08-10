package com.zhi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LYZhi
 * @date 2020/8/9 23:01
 */
public class App {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[]{"classpath:provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}

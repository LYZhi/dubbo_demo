package com.zhi.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LYZhi
 * @date 2020/8/9 22:18
 */
@Data
public class MeetingPub implements Serializable {

    private String id;

    private String pcode;

    private String title;

    private String content;

    //用户信息
    private User user;

    private String Uid;


}

package com.zhi.service;

import com.zhi.pojo.MeetingPub;

/**
 * @author LYZhi
 * @date 2020/8/9 22:20
 */
public interface MeetingPubService {

    /*根据会议编号ID查询详细信息*/
    MeetingPub selectByPcode(String pcode);
}

package com.zhi.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LYZhi
 * @date 2020/8/9 22:00
 */
@Data
public class User implements Serializable {

    private String id;
    private String name;
    private String tel;

}

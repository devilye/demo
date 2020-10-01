package com.yewencong.demo.Dao;

import lombok.Data;

@Data
public class UserInfo {

    /**
     * id
     */
    private int id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型
     * 0：管理员，1：普通用户
     */
    private String type;
}

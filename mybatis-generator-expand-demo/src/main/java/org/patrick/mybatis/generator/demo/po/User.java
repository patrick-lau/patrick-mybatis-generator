package org.patrick.mybatis.generator.demo.po;

import org.patrick.mybatis.generator.demo.BasicBean;

public class User extends BasicBean {
    private String userId;

    private String userName;

    private static final long serialVersionUID = 1L;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}
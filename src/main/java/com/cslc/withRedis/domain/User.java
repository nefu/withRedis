package com.cslc.withRedis.domain;

import java.io.Serializable;

/**
 * Created by jay on 2018/5/6.
 */
public class User implements Serializable{
    private static final long serialVersionUID = -1L;
    private String username;
    private Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }
    public User(){

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

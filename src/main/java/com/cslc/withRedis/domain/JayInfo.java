package com.cslc.withRedis.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jay on 2018/5/7.
 */
@Component
public class JayInfo {
    @Value("${com.cslc.jay.name}")
    private String name;
    @Value("${com.cslc.jay.age}")
    private String age;
    public JayInfo(){

    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

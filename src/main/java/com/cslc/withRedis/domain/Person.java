package com.cslc.withRedis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jay on 2018/5/7.
 */
@Entity
public class Person{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String age;
    public Person(){

    }
    public Person(String name,String age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

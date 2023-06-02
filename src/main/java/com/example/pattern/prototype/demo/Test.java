package com.example.pattern.prototype.demo;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 11:04
 */
public class Test {
    private String name;
    private int age;
    private int id;
    public Test(String name,int age,int id){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

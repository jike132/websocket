package com.example.pattern.prototype;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:42
 */
public class ConcretePrototype implements Prototype {
    @Override
    public Prototype clone(){
        try {
            return (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void test(){
        System.out.println("测试");
    }
}
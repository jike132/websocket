package com.example.pattern.prototype;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:43
 */
public class Test {
    public static void main(String[] args) {
        Client c=new Client();
        ConcretePrototype p=new ConcretePrototype();
     Prototype t= c.operation(p);
        System.out.println(t);

        System.out.println(p);
    }
}

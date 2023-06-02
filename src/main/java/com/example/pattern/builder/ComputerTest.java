package com.example.pattern.builder;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:04
 */
public class ComputerTest {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        Computer t410 = director.constructT410();
        System.out.println(t410);
        System.out.println("------------------------");
        Computer x201 = director.constructX201();
        System.out.println(x201);
    }
}
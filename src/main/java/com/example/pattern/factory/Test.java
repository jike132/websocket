package com.example.pattern.factory;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/1 15:15
 */
public class Test {
    public static void main(String[] args) {
        Car c1=new BydFactory().createCar();
        Car c2=new JieliFactory().createCar();
        c1.run();
        c2.run();
    }
}

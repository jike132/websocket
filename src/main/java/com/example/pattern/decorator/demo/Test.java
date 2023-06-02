package com.example.pattern.decorator.demo;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 14:39
 */
public class Test {
    public static void main(String args[]) {
        Car car = new Benz();
        // 对奔驰车进行装饰
        CarDecorator cd = new ConcreteCarDecorator(car);
        cd.show();
    }
}

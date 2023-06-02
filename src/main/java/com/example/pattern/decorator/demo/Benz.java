package com.example.pattern.decorator.demo;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 14:37
 */
//奔驰车（裸车，需要装饰）
public class Benz implements Car {
    @Override
    public void show() {
        System.out.println("奔驰车的默认颜色是黑色");
    }
}

package com.example.pattern.factory;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: 简单工程模式
 * @date 2023/6/1 14:56
 */
public class SimpleFactory {
public Car createCar(String type){
    switch (type){
        case "比亚迪":
           return new Byd();
        case "吉利":
            return new Jieli();
        default:
            return null;

    }

}

}

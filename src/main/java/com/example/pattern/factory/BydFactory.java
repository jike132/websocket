package com.example.pattern.factory;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/1 15:14
 */
public class BydFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Byd();
    }
}

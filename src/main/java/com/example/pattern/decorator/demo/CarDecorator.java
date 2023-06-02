package com.example.pattern.decorator.demo;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 14:37
 */
//汽车装饰（抽象装饰）
public abstract class CarDecorator implements Car {
    private Car car = null;
    public CarDecorator(Car car) {
        this.car = car;
    }
    @Override
    public void show() {
        this.car.show();
    }
}

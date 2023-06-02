package com.example.pattern.decorator.demo;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 14:38
 */
//具体汽车装饰
public class ConcreteCarDecorator extends CarDecorator {
    public ConcreteCarDecorator(Car car) {
        super(car);
    }
    // 给车进行彩绘
    private void print() {
        System.out.println("在车尾绘制“新手”字样，颜色是紫色霞光");
    }
    // 给车安装GPS设备
    private void setGps() {
        System.out.println("安装GPS定位导航系统");
    }
    // 重写show方法
    @Override
    public void show() {
        super.show();
        this.print();
        this.setGps();
    }
}
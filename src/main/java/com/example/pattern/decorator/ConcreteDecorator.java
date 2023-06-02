package com.example.pattern.decorator;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 14:33
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    //定义自己的方法
    private void method(){
        System.out.println("修饰");
    }
    //重写operation方法
    @Override
    public void operation(){
        this.method();
        super.operation();
    }
}
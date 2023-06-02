package com.example.pattern.decorator;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 14:33
 */
public class Test {

        public static void main(String args[]) {
            Component component = new ConcreteComponent();
            //进行装饰
            component = new ConcreteDecorator(component);
            component.operation();
        }

}

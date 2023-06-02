package com.example.pattern.decorator;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 14:32
 */
public abstract class Decorator implements Component {
    private Component component = null;
    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation() {
        this.component.operation();
    }
}
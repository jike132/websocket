package com.example.pattern;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: 单例模式
 * @date 2023/6/1 12:04
 */
public class SingleLeton {
    public static void main(String[] args) {
        System.out.println(Car.getC());
        System.out.println(Car.getC());

    }
}
class Cat{//饿汉式
    private String name;
    public static Cat c=new Cat("测试");

    public static Cat getC() {
        return c;
    }
    public Cat(String name){
        this.name=name;
    }

}
class Car{//懒汉式，使用的时候才实例化
    private String name;
    public static Car c;

    public static synchronized Car getC() {//线程安全
        if(c==null){
            c=new Car("懒汉式");
        }
        return c;
    }
    public Car(String name){
        this.name=name;
    }
    private Car(){//防止反射绕过
        if(c!=null){
            throw new RuntimeException();
        }
    }

    //常用懒汉式实现，静态内部类
private static class SingleletonClass{
        private  static final Car instance=new Car("懒汉");
}
public static Car getInstance(){
        return  SingleletonClass.instance;
}
}
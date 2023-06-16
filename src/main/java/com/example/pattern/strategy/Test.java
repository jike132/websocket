package com.example.pattern.strategy;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/7 10:58
 */
public class Test {
    public static void main(String[] args) {
     int a[]={1,2,3,4};
        Btree b=null;
        System.out.println(b.getValue());

    }
}
class Btree{
    private  int value;
    private Btree next;
    public Btree(int value,Btree next){
        this.value=value;
        this.next=next;
    }

    public int getValue() {
        return value;
    }

    public Btree getNext() {
        return next;
    }
}
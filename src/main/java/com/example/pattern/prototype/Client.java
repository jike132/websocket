package com.example.pattern.prototype;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:40
 */
public class Client {
    public Prototype operation(Prototype example) {
        // 得到example的副本
        return example.clone();

    }


}
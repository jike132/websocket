package com.example.thread;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: Lock显示加锁
 * @date 2023/5/18 17:15
 */
public class TestThread extends Thread {


    public static void main(String args[]) {
        TestThread testThread = new TestThread();

        T t = new T();
        Thread t1 = new Thread(t,"帅哥");
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("test"+Thread.currentThread().getName());
            }
        } );
        t4.start();
        t1.setPriority(6);
        t2.setPriority(1);
        t3.setPriority(3);
        t1.setDaemon(true);
//        testThread.start();
        t1.start();
        t2.start();
        t3.start();
       // t1.stop();
        for (int i = 0; i < 10; i++) {

            if(i%5==0){
                try {
                    t1.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @SneakyThrows
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(1);
            System.out.println(getName());
            TimeUnit.SECONDS.sleep(10);
        }

    }
}

class T implements Runnable {

    Map<String, Integer> map = new HashMap<>();
private final ReentrantLock reentrantLock=new ReentrantLock();

    public int add() {
        if(map.isEmpty()){
            map.put("1",0);
        }
//定义lock锁,reentrantLock可重入锁

//        synchronized (map) {
        int i;
        try {
            reentrantLock.lock();
            i=map.get("1")+1;

        }finally {
            reentrantLock.unlock();
        }

        map.put("1",i);
        return map.get("1");
//        }

    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {


//            System.out.println("开始" + Thread.currentThread().getName());
//               System.out.println("退让");
//               Thread.yield();
//            System.out.println("停止" + Thread.currentThread().getName());
            System.out.println(add() + ":===" + Thread.currentThread().getName());
           Thread.sleep(12);
        }
    }
}

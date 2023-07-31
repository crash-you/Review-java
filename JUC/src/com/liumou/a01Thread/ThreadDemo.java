package com.liumou.a01Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        * 多线程启动得第一种方法
        *   1、自己定义一个类并继承Thread类
        *   2、重写run方法
        *   3、创建子类对象，并启动线程
        * */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}

package com.liumou.a02Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        多线程第二种启动方式
        1、自己定义一个类实现runnable接口
        2、重写里面得run放法
        3、创建自己得类得对象
        4、创建一个Thread类得对象，并开启线程
        * */

        //创建Myrun对象
        //表示多线程要执行得任务
        Myrun myrun = new Myrun();

        //创建线程对象
        Thread thread1 = new Thread(myrun);
        Thread thread2 = new Thread(myrun);

        //给线程设置名字
        thread1.setName("线程1");
        thread2.setName("线程2");

        //开启线程
        thread1.start();


    }
}

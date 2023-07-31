package com.liumou.a04ThreadMethod;

public class ThreadDemo {
    public static void main(String[] args) {

        /*
        * String getName()获取线程名字
        * void setName(String name) 设置线程名字
        *如果没有给线程设置名字，线程有默认名称，格式：Thread-X（X，序号，从0开始）
        *
        * 细节:
            当JVM虚拟机启动之后，会自动的启动多条线程其中有一条线程就叫做main线程
            他的作用就是去调用main方法，并执行里面的代码
            在以前，我们写的所有的代码，其实都是运行在main线程当中
            *
        * static Thread currentThread()获取当前线程对象
        * static void sleep(long time) 让线程休眠指定时间，单位为毫秒
        *
        * 细节:
            1、哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间2、方法的参数:就表示睡眠的时间，单位毫秒
            2、1秒= 1000毫秒
            3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
        */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

    }
}

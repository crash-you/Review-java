package com.liumou.a02Thread;

public class Myrun implements Runnable{

    @Override
    public void run() {
        //书写线程要执行得代码、
        for (int i = 0; i < 100; i++) {
            //获取到当前线程的对象
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "helloWorld!");
        }
    }
}

package com.liumou.a03Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        * 多线程启动的第三种方法：
        * 特点：可以获取到多线程运行的结果
        *
        *   1、创建一个MyCallable实现Callable接口
        *   2、重写call（有返回值，返回值为多线程运行的结果）
        *   3、创建MyCallable的对象（表示多线程要执行的任务）
        *   4、创建FutureTask的对象，（管理多线程运行的结果）
        *   5、创建Thread类的对象，并启动（表示线程）
        */

        //创建一个MyCallable实现Callable接口
        MyCallable myCallable = new MyCallable();
        //创建FutureTask的对象，（管理多线程运行的结果）
        FutureTask<Integer> gt = new FutureTask<>(myCallable);
        //创建Thread类的对象
        Thread thread1 = new Thread(gt);
        thread1.start();

        //获取多线程运行的结果
        Integer result = gt.get();

        System.out.println(result);



    }
}

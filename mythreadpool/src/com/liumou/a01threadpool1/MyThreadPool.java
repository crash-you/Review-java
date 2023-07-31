package com.liumou.a01threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {
    public static void main(String[] args) {
        /*
        *
        * public static ExecutorService newCachedThreadPool()创建一个没有上限的线程池
        * public static ExecutorService newFixedThreadPool(int nThreads) 创建一个有上线的线程池
        * */

        //获取线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();

        //提交任务
        pool1.submit(new MyRunnable());

       //pool1.shutdown();

    }
}

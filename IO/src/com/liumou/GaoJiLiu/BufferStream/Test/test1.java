package com.liumou.GaoJiLiu.BufferStream.Test;

import java.io.*;

public class test1 {

    public static void main(String[] args) throws IOException {

        //四种拷贝方式拷贝文件，统计用时

        //字节输入流 ： 基本流，一次拷贝一个字节 、 一次拷贝字节数组
        //字节缓冲流 一次拷贝一个字节 、 一次拷贝一个数组
        long start = System.currentTimeMillis();

        method1();
//        method2();
//        method3();
//        method4();

        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "秒");


    }

    private static void method4() throws IOException {
        //字节缓冲流，一次读取字节数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO\\csb.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\csb04.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read()) != -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }

    private static void method3() throws IOException {
        //字节缓冲流
        //一次读取一个字节
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO\\csb.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\csb03.txt"));
        int len;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }
        bos.close();
        bis.close();

    }

    private static void method1() throws IOException {
        //基本流
        //一次读取一个字节
        FileInputStream fis = new FileInputStream("IO\\csb.txt");
        FileOutputStream fos = new FileOutputStream("IO\\csb02.txt");
        int len;
        while (( len = fis.read()) != -1){
            fos.write(len);
        }
        fos.close();
        fis.close();
    }

    private static void method2() throws IOException {
        //基本流，一次读取一个字节数组
        FileInputStream fis = new FileInputStream("IO\\csb.txt");
        FileOutputStream fos = new FileOutputStream("IO\\csb01.txt");
        byte[] bytes = new byte[1024];
        int len;
        while (( len = fis.read()) != -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}

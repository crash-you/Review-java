package com.liumou.GaoJiLiu.BufferStream.ByteBufferStream;

import java.io.*;

public class demo1 {

    public static void main(String[] args) throws IOException {

        //利用字节缓冲流拷贝文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IO\\m.txt"));

        int len;
        while ((len = bis.read()) != -1)
        {
            bos.write(len);
        }
        bos.close();
        bis.close();

        //两个疑问
        /*
        字节缓冲流和字节流相比，谁的效率高？
        为什么参数里的字节流不需要关流？
            源码中内置了关闭流
        * */

        //一次读取多个字节
        byte[] bytes = new byte[1024];
        int len1;
        while ((len1 = bis.read(bytes)) != -1){
            bos.write(bytes,0,len1);
        }

    }

}

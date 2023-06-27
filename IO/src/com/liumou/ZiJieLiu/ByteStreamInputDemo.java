package com.liumou.ZiJieLiu;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamInputDemo {
    public static void main(String[] args) throws IOException {

        //字节输入流

        //如果文件不存在，则直接报错
        //一次读一个字节，读出来的是在ASCII码上对应的数字
        //一个一个读，如果越界（读不到）则返回-1
        FileInputStream fileInputStream = new FileInputStream("IO\\a.txt");

        //一个一个读，如果越界（读不到）则返回-1
        int read = fileInputStream.read();
        System.out.println(read);
        fileInputStream.close();

        //循环读取
        FileInputStream fileInputStream1 = new FileInputStream("IO\\a.txt");

        int read1 ;

        while ((read1 = fileInputStream1.read()) != -1)
        {
            System.out.println((char) read1);
        }

        fileInputStream1.close();


    }
}

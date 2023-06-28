package com.liumou.GaoJiLiu.BufferStream.Zifu;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {

        //字符缓冲流
        //内置 8096 缓冲区
        //两个特有方法
        // public String readLine(); 读取一行数据，如果没有数据可读了，返回null，但是不会把回车换行读取到内存中
        //public void newLine() :跨平台的换行
        BufferedReader bufferedReader = new BufferedReader(new FileReader("IO\\v.txt"));
        String line1;
        while ((line1 = bufferedReader.readLine()) != null)
        {
            System.out.println(line1);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\ab.txt"));
        bw.write("我最帅");
        bw.newLine();

    }
}

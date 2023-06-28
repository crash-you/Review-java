package com.liumou.GaoJiLiu.BufferStream.Test;

import java.io.*;

public class test3 {
    public static void main(String[] args) throws IOException {
        /*
        * 实现一个验证程序运行次数的小程序，要求如下:
            1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
            * 2.程序运行演示如下:
            * 第一次运行控制台输出:欢迎使用本软件,第1次使用免费~
            * 第二次运行控制台输出:欢迎使用本软件,第2次使用免费～
            * 第三次运行控制台输出:欢迎使用本软件,第3次使用免费～
            第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~*/

        //IO流
        // 随用随创建
        // 不用就关闭
        BufferedReader br = new BufferedReader(new FileReader("IO\\counter.txt"));
        //BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\counter.txt"));结果报错
        //输出流关联文件时，如果存在会清空！！！！！！！！！！
        //所以不能先创建输出流文件
        String s = br.readLine();
        br.close();
        int count = Integer.parseInt(s);
        count++;
        if( count <= 3){
            System.out.println("欢迎使用本软件，第" + count + "次使用免费");
        }else {
            System.out.println("本软件只能免费使用3次，欢迎您注册VIP后再来-");
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\counter.txt"));
        bw.write(count+"");
        bw.close();
    }
}

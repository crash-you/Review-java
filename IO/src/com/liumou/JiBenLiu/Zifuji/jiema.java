package com.liumou.JiBenLiu.Zifuji;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class jiema {

    public static void main(String[] args) throws UnsupportedEncodingException {

        //java中的解码方法,默认UTF-8
        String str = "ai你";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        //指定编码方式
        byte[] gbks = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));

        //java中解码方式
        String str2 = new String(bytes);
        System.out.println(str2);
        String str3 = new String(bytes,"GBK");
        System.out.println(str3);
    }
}

package com.liumou.GaoJiLiu.TransformStream;

import java.io.*;
import java.nio.charset.Charset;

public class test1 {
    public static void main(String[] args) throws IOException {

        //利用转换流按照指定字符编码读取
//        E:\zixuezhilu--java\Review-java\IO\GBK.txt

        //创建对象并指定字符编码
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("IO\\GBK.txt"),"GBK");

        int ch;
        while ((ch = isr.read()) != -1)
        {
            System.out.print((char) ch);
        }
        isr.close();*/
        //以上方法被淘汰，替代方案如下

        FileReader fr = new FileReader("IO\\GBK.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1)
        {
            System.out.print((char) ch);
        }
        fr.close();

    }
}

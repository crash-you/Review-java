package com.liumou.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {

    public static void main(String[] args) throws IOException {
        //文件加密
        //为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。加密原理:
        //对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
        //解密原理:
        //读取加密之后的文件，按照加密的规则反向操作，变成原始文件。

        // ^ 异或 符号
        //两边相同 false
        //两边不同 true

        /*

        System.out.println(100 ^ 10); //110
        System.out.println(110 ^ 10); //100
        结论 ： 一个数字异或另外一个数字两次，得到的还是他本身数字


        * */

//        /创建对象关联原始文件
        FileInputStream fis = new FileInputStream("IO\\v2-7ac49d77a88f4bd659555363d2b73f7d_r.jpg");
        //创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("IO\\aasd.jpg");

        int len;
        while ( (len = fis.read()) != -1){

            fos.write(len ^ 10);

        }

        fos.close();
        fis.close();



    }
}

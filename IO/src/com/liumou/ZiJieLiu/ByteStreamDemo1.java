package com.liumou.ZiJieLiu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //字节输出流 FileOutputStream

        FileOutputStream fileOutputStream = new FileOutputStream("IO\\a.txt");
        //参数为字符串路径或者File对象都行
        //如果文件不存在将会新建一个文件，但是要保证父级路径存在
        //如果文件已经存在，则会清空文件

        fileOutputStream.write(97);
        //写入的整数将会自动转为ASCII码中对应的字符

        fileOutputStream.close();


        //换行
       /*
       再次写出一个换行符就可以了
       windows: \r\n
        Linux:\n
        Mac :\r
        细节:
        在windows操作系统当中，java对回车换行进行了优化。虽然完整的是\r\n，
        但是我们写其中一个\r或者\n，java也可以实现换行，因为java在底层会补全。
        建议: 不要省略，还是写全了。
        */
        FileOutputStream fileOutputStream1 = new FileOutputStream("IO\\a.txt");
        String s = "wozuishuia";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes)); //变成字符串
        fileOutputStream1.write(bytes);

        //续写
        //打开续写开关即可，创建对象的第二个参数

    }
}

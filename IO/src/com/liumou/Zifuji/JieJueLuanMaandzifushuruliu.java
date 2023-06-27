package com.liumou.Zifuji;

import java.io.FileReader;
import java.io.IOException;

public class JieJueLuanMaandzifushuruliu {

    public static void main(String[] args) throws IOException {

        //字符流=字节流+字符集
        //特点:
        // 输入流：一次读一个字节，遇到中文时，一次读多个字节
        // 输出流：底层会把数据按照指定的编码方式进行编码，变成字节再写到文件中
        //使用场景：对于纯文本文件进行读写操作

        //创建字符输入流对象
        //public FileReader(File file) 创建字符输入流关联本地文件
        //public FileReader(String pathname) 创建字符输入流关联本地文件

        //读取数据
        /*
        * public int read 读取数据，读到末尾返回-1
        * public int read(char[] buffer) 读取多个数据，末尾返回-1
        * 按字节进行读取，遇中文，一次读多个字节，读后解码，返回一个整数
        * 读到文件末尾了，read方法返回-1
        *
        * */

        //释放资源
        /*
        public int close()
        * */


        FileReader fr = new FileReader("IO\\wenzi.txt");
        // public int read 底层也是一个字节一个字节读取，遇到中文一次多个字节
        //读取后，会进行解码，转成十进制返回
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char) ch);
        }

        fr.read();
        fr.close();

        FileReader fr2 = new FileReader("IO\\wenzi.txt");
        char[] chars = new char[2];
        //read(chars):读取数据，解码，强转三步合并了
        //把强转之后的字符放到数组当中。
        // 空参的read +强转类型转换
        int len;
        while ((len = fr2.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        fr2.close();

    }
}

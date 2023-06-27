package com.liumou.Zifuji;

import java.io.FileWriter;
import java.io.IOException;

public class zifushuchuliu {

    public static void main(String[] args) throws IOException {

        /*
        * ①创建字符输出流对象
            细节1:参数是字符串表示的路径或者File对象都是可以的
            细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
            细节3:如果文件已经存在，则会清空文件，如果不想清空可以打开续写开关
          ②写数据
            细节:如果write方法的参数是整数，但是实际上写到本地文件中的是整数在字符集上对应的字符
          ③释放资源
            细节:每次使用完流之后都要释放资源
        * */


        FileWriter fw = new FileWriter("IO\\ab.txt",true);//append：续写开关
        //注意和字节输出流区分，字节输出流一次只输出一个字节，若超过一个字节范围会乱码
        //fw.write(25105);
        //fw.write("你好世界!!");//占用14个字节
        //fw.write("你好世界java！",1,4);//写出数组的一部分
        /*char[] chars = {'a','b','b','我'};
        fw.write(chars);*/
        fw.close();


    }
}

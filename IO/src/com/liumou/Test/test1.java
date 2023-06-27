package com.liumou.Test;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {

        //目的，拷贝文件夹
        //创建对象表示数据源
        File src = new File("E:\\test\\src");
        //创建对象表示目的地
        File copysrc = new File("E:\\test\\copysrc");

        //调用方法开始拷贝
        copydir(src,copysrc);



    }
    private static void copydir(File src, File copysrc) throws IOException {
        //无论是否存在，先创建文件夹
        copysrc.mkdir();

        //files里表示src的全部子一级目录
        File[] files = src.listFiles();

        for (File file : files) {
            if(file.isFile()){
                //是文件，进行拷贝
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(copysrc,file.getName()));

                int len;
                byte[] bytes = new byte[1024];
                while ( (len = fileInputStream.read(bytes)) != -1){
                    fileOutputStream.write(bytes,0,len);
                }
                fileOutputStream.close();
                fileInputStream.close();

            }else {
                //不是文件，进行递归
                //copydir(要拷贝的文件夹，目的地)
                //目的地未 copysrc内部，名称和被拷贝的文件夹名称一致
                copydir(file,new File(copysrc,file.getName()));
            }

        }


    }
}

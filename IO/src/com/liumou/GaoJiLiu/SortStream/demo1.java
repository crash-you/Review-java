package com.liumou.GaoJiLiu.SortStream;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         *
         *使用对象输出流将对象保存到文件时会出现NotSerializableException异常
         * 需要让javabean类实现Serializable借口
         *
         */

        //创建对象
        Student s = new Student("zhangsan",23);
        //创建序列化流对象/对象操作输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("IO\\a.txt"));
        //写出数据
        objectOutputStream.writeObject(s);
        objectOutputStream.close();

        /*
        * 反序列化流
        *
        * */

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("IO\\a.txt"));
        Object o = (Student)objectInputStream.readObject();
        System.out.println(o);
        objectInputStream.close();

    }
}

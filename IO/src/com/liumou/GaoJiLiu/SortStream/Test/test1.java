package com.liumou.GaoJiLiu.SortStream.Test;

import java.io.*;
import java.util.ArrayList;

public class test1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //需求
        //将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作

        Teacher teacher1 = new Teacher("zhangsan",23,"nanjing");
        Teacher teacher2 = new Teacher("zhangsan1",231,"nanjing1");
        Teacher teacher3 = new Teacher("zhangsan2",232,"nanjing2");

        ArrayList<Teacher> list = new ArrayList<>();
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("IO\\a.txt"));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("IO\\a.txt"));
        ArrayList<Teacher> teachers = (ArrayList<Teacher>) objectInputStream.readObject();
        for (Teacher isjf : teachers)
            System.out.println(isjf);
        }

    }


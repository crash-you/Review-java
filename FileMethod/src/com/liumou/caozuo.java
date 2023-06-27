package com.liumou;

import java.io.File;
import java.io.IOException;

public class caozuo {

    public static void main(String[] args) throws IOException {

        //对一个文件的路径进行判断
        File f1 = new File("C:\\ccc\\1.txt");
        System.out.println(f1.isDirectory());//是否为文件夹
        System.out.println(f1.isFile());//是否为文件
        System.out.println(f1.exists());//是否存在

        System.out.println("================================");
        //对一个文件夹的路径进行判断
        File f2 = new File("C:\\ccc\\bbb");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());
        System.out.println("================================");
        File f3 = new File("C:\\ccc\\c.txt");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
        System.out.println("================================");

        //length() 返回文件的字节大小
        //这个方法只能获取文件的大小，单位是字节
        //如果我们单位是MB,G，需要不断除以1024
        //这个方法无法获取文件夹大小，如果要获取，需要把这个文件夹里边的每个文件累加
        File f4 = new File("C:\\ccc\\a.txt");
        System.out.println(f4.length());
        System.out.println("=====================================");

        //getAbsolutePath 返回文件的绝对路径
        File f5 = new File("C:\\ccc\\a.txt");
        System.out.println(f5.getAbsoluteFile());

        //getPath() 返回定义文件时使用的路径

        //getName() 获取名字
        //如果调用的是文件，返回 文件名+后缀名（扩展名） 如 a.txt
        //如果调用的是文件夹，则返回文件夹的名称

        //lastModified 返回文件最后修改时间（时间毫秒值）

        //createNewFile 创建一个新的空的文件
        //若当前路径表示的文件不存在，则创建成功，返回true
        //若存在，创建失败，返回false
        //若父级路径不存在，则方法有异常抛出
        //该方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
        File f6 = new File("C:\\ccc\\b.txt");
        boolean newFile = f6.createNewFile();
        System.out.println(newFile);
        System.out.println("====================================");

        //mkdir 创建文件夹（目录）
        //windows中，路径是唯一的，如果当前路径已存在，则无法创建
        //mkdir 只能创建单级文件夹

        //mkdirs 可以创建多级文件夹
        //既可以创建单机也可以创建多级

        //delete 删除文件，空文件夹
        //如果删除的是文件，则直接删除，不走回收站
        //如果删除的是空文件夹，则直接删除，不走回收站
        //如果删除的是有内容的文件夹，则删除失败

        //public File[] listFiles() 获得当前路径下的所有内容
        //当调用者File表示的路径不存在时，返回null当调用者File表示的路径是文件时，返回null
        //当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
        //当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
        //当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
        File f7 = new File("C:\\ccc");
        File[] files = f7.listFiles();
        for (File file : files) {
            System.out.println(file);
        }


    }

}

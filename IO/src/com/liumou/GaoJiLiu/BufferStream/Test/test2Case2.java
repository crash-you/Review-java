package com.liumou.GaoJiLiu.BufferStream.Test;

import java.io.*;
import java.util.*;

public class test2Case2 {
    public static void main(String[] args) throws IOException {
        //把出师表文章顺序进行恢复，并放到一个新的文件中，文件为 csbTest2.txt

        BufferedReader br = new BufferedReader(new FileReader("IO\\csbTest2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\csbTest22.txt"));
        String line;
        //Treemap集合，自动排序
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        while ((line = br.readLine()) != null)
        {
//            System.out.println(line);
            String[] s = line.split("\\.");
            treeMap.put(Integer.parseInt(s[0]),line);
        }

        //写出
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }

        bw.close();
        br.close();



    }
}

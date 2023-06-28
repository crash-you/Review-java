package com.liumou.GaoJiLiu.BufferStream.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test2Case1 {
    public static void main(String[] args) throws IOException {
        //把出师表文章顺序进行恢复，并放到一个新的文件中，文件为 csbTest2.txt

        BufferedReader br = new BufferedReader(new FileReader("IO\\csbTest2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\csbTest21.txt"));
        String line;
        ArrayList<String> ar = new ArrayList<>();
        while ((line = br.readLine()) != null)
        {
//            System.out.println(line);
            ar.add(line);
        }

        Collections.sort(ar,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                //获取o1和o2的序号
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2 ;
            }
        });

        //写出
        for (String str : ar) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();



    }
}

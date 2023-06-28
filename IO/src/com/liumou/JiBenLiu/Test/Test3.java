package com.liumou.JiBenLiu.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {

    public static void main(String[] args) throws IOException {
        //反转字符
        //将v.txt中 4-6-2-9-5 按照从大到小排序重新输入
        //纯文本文件，用FileReader方法 字符输入流方法
        FileReader fr = new FileReader("IO\\v.txt");
        //接收字符
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1)
        {
//           字符拼接
            sb.append((char) ch);
        }
        fr.close();

        //将sb转为String类型对象进行切割
        String str = sb.toString();
        String[] arrStr = str.split("-");
        //转为数组，方便排序
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            arrayList.add(i);
        }

       // System.out.println(arrayList);

        //调用Collections中sort方法排序，默认从小到大
        Collections.sort(arrayList);
        System.out.println(arrayList);

        FileWriter fw = new FileWriter("IO\\M.txt");
        for (int i = 0; i < arrayList.size(); i++) {
            if(i == arrayList.size() -1){
                    //get（i） 获得的是integer类型的，加上""拼接为字符串
                    fw.write(arrayList.get(i) + "");
            }else {
                fw.write(arrayList.get(i) + "-");
            }
        }
            fw.close();

    }
}

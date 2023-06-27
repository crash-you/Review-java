package com.liumou.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Test31 {

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

        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);



    }
}

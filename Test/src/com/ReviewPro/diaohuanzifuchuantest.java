package com.ReviewPro;

//          给定两个字符串,A和B。
//        A的旋转操作就是将A最左边的字符移动到最右边。
//        例如,若A= 'abcde'，在移动一次之后结果就是'bcdea'。如果在若干次调整操作之后，A能变成B，那么返回True。如果不能匹配成功，则返回false

import java.util.Scanner;

public class diaohuanzifuchuantest {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入字符串一:");
        String st1 = sc1.next();
        System.out.println("请输入字符串二:");
        String st2 = sc2.next();
        boolean result = Equal(st1, st2);
        System.out.println(result);
    }

    public static boolean Equal(String st1 , String st2)
    {
        String s;
        for (int i = 0; i < st1.length(); i++) {
            s = recyeleS(st1);
            if(s.equals(st2))
            {
                return true;
            }
        }
        return false;
    }
    public static String recyeleS(String st1)
    {
        char c = st1.charAt(0);
        String substring = st1.substring(1); //截取1索引之后的字符串
        return substring + c ;
    }


}

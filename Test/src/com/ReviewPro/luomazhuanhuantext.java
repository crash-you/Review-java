package com.ReviewPro;

//          键盘录入一个字符串，要求1∶长度为小于等于9要求2:只能是数字将内容变成罗马数字
//        下面是阿拉伯数字跟罗马数字的对比关系:
//        l- 1、l-2、Ⅲ - 3、IV - 4、V - 5、VI- 6、VII- 7、VI- 8、IX - 9注意点:
//        罗马数字里面是没有0的
//        如果键盘录入的数字包含0，可以变成””(长度为0的字符串)

import java.util.Scanner;

public class luomazhuanhuantext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next;
        System.out.println("请输入一个数字字符串");
        while (true) {
            next = sc.next();
            boolean b = panDuan(next);
            if(b)
            {
                break;
            }
            else {
                System.out.println("输入的数据有误，请重新输入");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < next.length(); i++) {
            char c = next.charAt(i);
            int i1 = c - 48;
            sb.append(changeFu(i1));
        }
        System.out.println(sb);
    }

    public static String changeFu(int number)
    {
        String [] str = {"","l","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
       return str[number];
    }

    public static boolean panDuan(String next)
    {
        if(next.length() > 9)
        {
            return false;
        }
        for (int i = 0; i < next.length() ; i++) {
            char c = next.charAt(i);
            if(c < '0' || c > '9')
            {
                return false;
            }
        }
        return true;
    }











}

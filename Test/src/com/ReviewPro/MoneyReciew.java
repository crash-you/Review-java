package com.ReviewPro;

import java.util.Scanner;

public class MoneyReciew {
    public static void main(String[] args) {
        //主要思路
        //1、 转换数字
        //2、前面补零
        //3、加单位
        int money;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入金额:");
            money = sc.nextInt();
            if (money < 0) {
                System.out.println("输入金额无效");
            } else {
                break;
            }
        }
        String s = "";
            while (true)
            {
                int ge = money%10;
                String capitalNumber = getCapitalNumber(ge);
                money = money / 10;
//                System.out.println(capitalNumber);
                s = capitalNumber + s;
                if (money == 0){
                    break;
                }
            }
        int Str = 7 - s.length();
        for (int i = 0; i < Str; i++) {
            s = "零" + s;
        }
        String resule = "";
        String [] arr = {"佰","仕","万","仟","佰","拾","元"};
        for (int i =0 ; i <s.length() ; i++) {
            char c =s.charAt(i);
            resule = resule + c + arr[i];
        }
        System.out.println(resule);

    }
    public static String getCapitalNumber(int number)
    {
        String [] arr ={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}

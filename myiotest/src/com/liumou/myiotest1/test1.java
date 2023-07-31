package com.liumou.myiotest1;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) throws IOException {

        //定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&device=pc&from=home";
        String boyName = "https://baijiahao.baidu.com/s?id=1604866437439996498";

        //爬取数据
        String Str1 = webCrawler(familyNameNet);

        ArrayList<String> getData = getData(Str1, "(.{4})(，|。)", 1);
        System.out.println(getData);

    }

    private static ArrayList<String> getData(String familyNameNet, String regex, int i) {
        ArrayList<String> list = new ArrayList<>();
        //根据正则表达式获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern规则，到familyNet中获取数据
        Matcher matcher = pattern.matcher(familyNameNet);
        while (matcher.find()){
            list.add(matcher.group(i));
        }
        return list;
    }

    public static String webCrawler(String net) throws IOException {

        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        URLConnection unn = url.openConnection();

        InputStreamReader isr = new InputStreamReader(unn.getInputStream());
        int ch;
        while ((ch=isr.read()) != -1){
            sb.append((char)ch);
        }
        isr.close();
        return sb.toString();
    }

}

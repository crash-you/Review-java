package com.liumou.a01netAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {

        /*

        static InetAddress getByName(string host)确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        string getHostName( ) 获取此IP地址的主机名
        string getHostAddress()返回文本显示中的IP地址字符串
        * */

        InetAddress allByName = InetAddress.getByName("LAPTOP-G891MSRN");
        System.out.println(allByName);

        String hostName = allByName.getHostName();
        System.out.println(hostName);

        String hostAddress = allByName.getHostAddress();
        System.out.println(hostAddress);


    }
}

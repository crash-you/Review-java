package com.liumou.a02UdpDemo;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {

        //发送数据

        //创建对象
        //细节:
        //绑定端口
        // 以后我们就是通过这个端口往外发送
        // 空参:所有可用的端口中随机一个进行使用
        // 有参:指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket();

        //打包
        String str = "你好！";
        byte[] bytes = str.getBytes();
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,byName,port);

        //发送数据
        ds.send(dp);


        ds.close();


    }


}

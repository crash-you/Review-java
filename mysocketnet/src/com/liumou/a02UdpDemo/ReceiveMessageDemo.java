package com.liumou.a02UdpDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        //接受数据

        //创建DatagramSocket对象
        //细节：
        //在接受的时候，一定要绑定端口
        //绑定的端口，一定要和发送的端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);

        //接受数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        //该方法是阻塞的
        //程序执行到这一步的时候，会在这里死等/等发送端发送消息
        ds.receive(dp);

        //解析数据包
        byte[] data = dp.getData();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        int length = dp.getLength();

        System.out.println("接收到数据：" + new String(data,0,length));
        System.out.println("该数据是从" + address + "中的" + port + "端口发送");


    }
}

package com.liumou.a05TcpDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //利用TCP发送数据


        //1、创建socket对象
        //细节：在创建对象的同时会连接服务端如果连接不上会报错
        Socket socket = new Socket("127.0.0.1",10000);

        //从连接通道中获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //字节流往外写出时只能写出字节信息
        outputStream.write("你好".getBytes());
        //释放资源
        socket.close();
        outputStream.close();

    }
}

package com.example.sample;

import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Section11_3 {
    public static void main(String[] args) throws Exception{
        System.out.println("起動完了");
        ServerSocket svSocket = new ServerSocket(39648);
        Socket socket = svSocket.accept();//呼び出すと誰かから接続されるまで待ち続ける
        System.out.println(socket.getInetAddress()+"から接続");
        socket.getOutputStream().write("WELCOME".getBytes());
        socket.getOutputStream().flush();
        socket.close();
    }
}

package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *JAVA NIO
 * NIO称为非阻塞IO,读写的过程中不会发生阻塞线程
 * 我们之前所学习的流称为BIO:阻塞是IO,就是在读写的过程中可能会发生阻塞现象
 * @author jitwxs
 * @date 2022/4/17 9:36 上午
 * @param null
 * @return null
 */
public class NIODemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * 非阻塞IO面向Channel("通道")的,不是面向Stream(流)的
         *
         * 流的特点:方向单一,顺序读写,流要么是输入流用于顺序读取数据,要么是输出流用于顺序写出数据
         *
         * Channel的特点:双向的,即可以读又可以写
         *
         * JAVA  NIO核心API
         * Channel 通道,常见的实现:
         * FileChannel: 文件用到, 可对文件进行读取操作
         * SocketChannel: 套接字通道, 可以与远端计算机进行TCP读写操作
         * ServerSocketChannel:服务端的套接字通道,用于监听客户端的连接
         *
         * Buffer缓冲区,通道是对缓冲区中的数据进行读写操作
         * 常见的缓冲区实现
         * ByteBuffer:字节缓冲区,缓冲区内部内容都是字节
         * @author jitwxs
         * @date 2022/4/17 9:38 上午
         * @param args
         */
        //BIO的文件复制操作,使用流的方式进行复制
        FileInputStream fis = new FileInputStream("movie.wmv");
    }
}

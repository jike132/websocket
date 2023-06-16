package com.example.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/9 14:38
 */
public class Test {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file=new RandomAccessFile("d:\\tr.txt","rw");
        FileChannel fileChannel=file.getChannel();

        ByteBuffer buf=ByteBuffer.allocate(1024);
        int bytes=fileChannel.read(buf);
        System.out.println(buf);
        while (bytes!=-1){

            buf.flip();
            while (buf.hasRemaining()){
                System.out.println(buf.get());
            }
            buf.clear();
            bytes=fileChannel.read(buf);
        }
fileChannel.close();
    }
}

package com.example.io;

import java.io.*;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: BufferReader,BufferWriter;按字符读取，不要操作二进制文件，可能造成文件损坏
 * @date 2023/5/18 14:46
 */
public class BufferOpt  {
public void read() throws IOException {
    String filePath="e:\\test1.txt";
    BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
 String line;//按行读取
    while ((line=   bufferedReader.readLine())!=null){
        System.out.println(line);
    }
bufferedReader.close();
}
    public void write() throws IOException {
        String filePath="e:\\test1.txt";
        BufferedWriter bufferedReader=new BufferedWriter(new FileWriter(filePath,true));
        String line="\n生活真美好";   //按行读取
        bufferedReader.write(line,0,line.length());
        bufferedReader.newLine();
        bufferedReader.close();
    }
    public void copy() throws IOException {
        String filePath="e:\\test1.txt";
        BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("d:\\copy.txt",true));
       String line="";
        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line,0,line.length());
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }



}

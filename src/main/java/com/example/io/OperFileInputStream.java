package com.example.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: inputstream基本操作
 * @date 2023/5/18 10:17
 */
public class OperFileInputStream {
    protected Logger logger = LoggerFactory.getLogger(getClass());

 public void readFile01(){//fileInputStream,字节流，中文乱码，读取效率比较低
     String filePath="e:\\test1.txt";
     int readData=0;
     FileInputStream fileInputStream=null;
     try {
         fileInputStream=new FileInputStream(filePath);
        while ((readData=fileInputStream.read())!=-1){
         System.out.print((char) readData);
        }
     }catch (IOException e){
         e.printStackTrace();
     }finally {
         try {
             fileInputStream.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

 }
    public void readFile02(){//fileInputStream,字节数组，中文乱码，读取效率比较低
        String filePath="e:\\test1.txt";

        byte[] buf=new byte[8];
        int len=0;
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(filePath);
            while ((len=fileInputStream.read(buf))!=-1){
                logger.info(new String(buf,0,len));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/5/18 10:56
 */
public class FileOutputStream_ {
    public void copy(){

    }
    public void write(){
        FileOutputStream fileOutputStream=null;
        String path="e:\\t.txt";
        try {
            fileOutputStream=new FileOutputStream(path,true);
            char a[]={'a','b','c'};
            String s="hello,world";
            for (int i=0;i<a.length;i++){
                fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

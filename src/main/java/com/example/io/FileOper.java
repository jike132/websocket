package com.example.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/5/18 9:05
 */
public class FileOper {
    protected Logger logger = LoggerFactory.getLogger(getClass());

public void createF01(){
    String filePath="e:\\test1.txt";
    File file=new File(filePath);
    try {
        file.createNewFile();
        logger.info("创建成功");
    }catch (IOException e){
        e.printStackTrace();
    }

}
public void info(){
    String filePath="e:\\test1.txt";
    File file=new File(filePath);
    logger.info(file.getName()+":"+file.getParent()+":"+file.length());
}
public void delete(){
    String filePath="e:\\test1.txt";
    File file=new File(filePath);
    if (file.exists()){
        if(file.delete()){
            logger.info("删除功");
        }else {
            logger.info("删除失败");
        }
    }

}
public void makdir(){
    String filePath="e:\\d\\c";
    File file=new File(filePath);

       if (file.mkdirs()){
           logger.info("创建成功");
       }else {
           logger.info("创建失败");
       }


}
public void reader(){//FileReader操作
    String filePath="e:\\test1.txt";
    FileReader fileReader=null;
    char data=' ';
    int read=0;
    char[] buf=new char[8];
    try {
        fileReader=new FileReader(filePath);
        while ((read=fileReader.read(buf))!=-1){
           logger.info(new String(buf,0,read));
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
public void writer(){//FileWriter操作,
    String filePath="e:\\test1.txt";
    FileWriter fileWriter=null;
     String txt="/\n李清照";
    try {
        fileWriter=new FileWriter(filePath,true);
        fileWriter.write(txt.toCharArray());
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        try {
           // fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

}

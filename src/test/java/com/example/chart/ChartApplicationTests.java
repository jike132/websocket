package com.example.chart;

import com.example.chart.dao.SimsClassMapper;
import com.example.io.BufferOpt;
import com.example.io.FileOper;
import com.example.io.FileOutputStream_;
import com.example.io.OperFileInputStream;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootTest
class ChartApplicationTests {
    @Resource
    private SimsClassMapper simsClassMapper;
    protected Logger logger = LoggerFactory.getLogger(getClass());
//    @Test
//    void contextLoads() {
//        SimsClass simsClass=new SimsClass();
//        simsClass.setClassId("1");
//        simsClass.setClassName("ree");
//        simsClass.setAdviser("wee");
//        simsClass.setAdviser("sss");
//
//        simsClassMapper.insert(simsClass);
//        logger.info("测试");
//    }
//    @Test
//    void mqtt(){
//
//    }
    @Test
    void create() throws IOException {
        BufferOpt bufferOpt=new BufferOpt();
        bufferOpt.copy();

    }
    @Test
void fill(){
        int a[]=new int[10];
        Arrays.fill(a,10);
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

}

}

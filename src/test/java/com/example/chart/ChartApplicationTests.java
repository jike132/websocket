package com.example.chart;

import com.example.chart.dao.SimsClassMapper;
import com.example.chart.entity.SimsClass;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ChartApplicationTests {
    @Resource
    private SimsClassMapper simsClassMapper;
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        SimsClass simsClass=new SimsClass();
        simsClass.setClassId("1");
        simsClass.setClassName("ree");
        simsClass.setAdviser("wee");
        simsClass.setAdviser("sss");

        simsClassMapper.insert(simsClass);
        logger.info("测试");
    }

}

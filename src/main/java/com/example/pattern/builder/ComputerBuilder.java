package com.example.pattern.builder;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:01
 */
// 计算机Builder
public interface ComputerBuilder {
    void buildCpu(); // 建造CPU
    void buildRam(); // 建造内存
    void buildHardDisk(); // 建造硬盘
    void buildGraphicCard();// 建造显卡
    void buildMonitor();// 建造显示器
    void buildOs(); // 建造操作系统
    Computer getResult(); // 得到建造好的计算机
}

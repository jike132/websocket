package com.example.pattern.builder;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:02
 */
public class X201Builder implements ComputerBuilder {
    private X201 computer = new X201();
    @Override
    public void buildCpu() {
        computer.setCpu("i3-350");
    }
    @Override
    public void buildRam() {
        computer.setRam("2GB 1333MHz");
    }
    @Override
    public void buildHardDisk() {
        computer.setHardDisk("250GB 5400转");
    }
    @Override
    public void buildGraphicCard() {
        // 无显卡
    }
    @Override
    public void buildMonitor() {
        computer.setMonitor("12英寸 1280＊800");
    }
    @Override
    public void buildOs() {
        computer.setOs("Windows7 Home版");
    }
    @Override
    public X201 getResult() {
        return computer;
    }
}

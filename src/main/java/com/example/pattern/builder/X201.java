package com.example.pattern.builder;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:00
 */
public class X201 extends Computer {
    public X201() {
        this.setType("ThinkPad X201i");
    }
    @Override
    public String toString() {
        return "型号：\t" + this.getType() + "\nCPU：\t" + this.getCpu()
                + "\n内存：\t" + this.getRam() + "\n硬盘：\t" + this.getHardDisk()
                +"\n显示器：\t"+ this.getMonitor() + "\n操作系统：" + this.getOs();
    }
}
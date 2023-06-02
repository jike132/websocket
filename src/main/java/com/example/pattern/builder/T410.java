package com.example.pattern.builder;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 9:59
 */
public class T410 extends Computer {
    private String graphicCard; // 显卡
    public T410() {
        this.setType("ThinkPad T410i");
    }
    public String getGraphicCard() {
        return graphicCard;
    }
    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }
    @Override
    public String toString() {
        return "型号：\t" + this.getType() + "\nCPU：\t" + this.getCpu()
                + "\n内存：\t" + this.getRam() + "\n硬盘：\t" + this.getHardDisk()
                + "\n显卡：\t" + this.getGraphicCard() + "\n显示器：\t"
                + this.getMonitor() + "\n操作系统：" + this.getOs();
    }
}
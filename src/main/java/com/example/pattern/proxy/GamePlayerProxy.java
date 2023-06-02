package com.example.pattern.proxy;

import java.util.Date;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 11:34
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer player = null;
    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }
    // 记录打怪的时间
    private void log() {
        System.out.println("打怪时间 "+new Date().toString());
    }
    @Override
    public void killBoss() {
        this.log();
        player.killBoss();
    }
    @Override
    public void upGrade() {
        player.upGrade();
        this.count();
    }
    // 计算升级所用的时间
    private void count() {
        System.out.println("升1级耗费50小时");
    }
}

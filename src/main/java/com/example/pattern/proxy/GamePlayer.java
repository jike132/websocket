package com.example.pattern.proxy;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 11:33
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    public GamePlayer(String name) {
        this.name = name;
    }
    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }
    @Override
    public void upGrade() {
        System.out.println(this.name + "成功升了1级！");
    }
}

package com.example.pattern.proxy;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 11:34
 */
public class Test {

        public static void main(String args[]) {
            IGamePlayer player = new GamePlayer("李逍遥");
            IGamePlayer proxy = new GamePlayerProxy(player);
            proxy.killBoss();
            proxy.upGrade();
        }

}

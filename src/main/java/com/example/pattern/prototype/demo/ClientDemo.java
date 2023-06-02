package com.example.pattern.prototype.demo;

import java.util.Random;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:56
 */
public class ClientDemo {
    // 发送账单的数量，这个值是从数据库中获得的
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        // 模拟发送邮件
        int i = 0;
        // 定义一个邮件对象
        Mail mail = new Mail("某商场五一抽奖活动",
                "五一抽奖活动通知：凡在五一期间在本商场购物满100元的客户都有获得抽奖机会！...");
        mail.setTail("解释权归某商场所有");
        Test t=new Test("张超",29,1);
        mail.setTest(t);
        Mail[] cloneMail = new Mail[MAX_COUNT];
        while (i < MAX_COUNT) {
            //克隆邮件

             cloneMail[i] = mail.clone();
             if(i>3){
                 Test t1=new Test("梁帅",29,1);
                 cloneMail[i].setTest(t1);
             }

            // 以下是每封邮件不同的地方
            cloneMail[i].setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail[i].setReceiver(getRandString(5) + "@" + getRandString(8)
                    + ".com");
            // 发送邮件
            sendMail(cloneMail[i]);
            i++;
        }
        System.out.println(cloneMail[1].getTest().getName());
        System.out.println(cloneMail[4].getTest().getName());
    }
    // 发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人："
                + mail.getReceiver() + "\t....发送成功！");
    }
    // 获得指定长度的随机字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
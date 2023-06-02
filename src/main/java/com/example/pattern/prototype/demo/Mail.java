package com.example.pattern.prototype.demo;

/**
 * @author zhangchao01
 * @version 1.0
 * @description: TODO
 * @date 2023/6/2 10:55
 */
public class Mail implements Cloneable{
    //收件人
    private String receiver;
    //邮件标题
    private String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String contxt;

    private Test test;
    //邮件的尾部，一般都是加上“×××版权所有”等信息
    private String tail;
    //构造函数
    public Mail(String subject,String contxt){
        this.subject =subject;
        this.contxt =contxt;
    }
    //克隆方法
    @Override
    public Mail clone(){
        Mail mail =null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
    //get和set方法

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}

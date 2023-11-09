package com.tedu.java.oop;

/**
 * @ClassName Phone
 * @Author Administrator
 * @Date 2023/11/6 20:55
 * @Version 1.0
 * @Description Phone实体类
 **/
public class Phone {
    // 属性
    double price; // 价格
    String name; //品牌
    // 方法
    public void call(){
        System.out.println("手机能打电话");
    }

    public void sendMessage(String message){
        System.out.println("发送的短信:"+message);
    }
    public void playGame(){
        System.out.println("手机可以玩游戏");
    }
}

package com.tedu.java.oop;

/**
 * @ClassName PhoneTest
 * @Author Administrator
 * @Date 2023/11/6 20:59
 * @Version 1.0
 * @Description Phone的测试类
 **/
public class PhoneTest {
    public static void main(String[] args) {
        // 创建Phone的对象
        Phone p1 = new Phone();
        // 通过phone的对象，调用其内部声明的属性或方法
        p1.name = "huwei mate50";
        p1.price = 6799;
        System.out.println("name = "+p1.name+",价格为:"+p1.price);

        // 调用方法
        p1.call();
        p1.sendMessage("有内鬼,终止交易.");
    }
}

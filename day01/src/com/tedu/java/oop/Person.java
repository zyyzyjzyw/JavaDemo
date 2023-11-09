package com.tedu.java.oop;

/**
 * @ClassName Person
 * @Author Administrator
 * @Date 2023/11/8 19:45
 * @Version 1.0
 * @Description TODO
 **/
public class Person {
    String name;// 姓名
    int age;//年龄
    char gender;//性别
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(int hour){
        System.out.println("人至少保证每天"+hour+"小时的睡眠");
    }
    public void interests(String hobby){
        System.out.println("我的爱好是"+hobby);
    }
}

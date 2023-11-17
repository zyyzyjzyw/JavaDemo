package com.tedu.java.oop;

/**
 * @ClassName Person
 * @Author Administrator
 * @Date 2023/11/11 11:26
 * @Version 1.0
 * @Description TODO
 **/
class Person {
    // 属性
    String name; // 姓名
    int age; // 年龄
    boolean isMale; // 是否是男性

    public void show(String nation){
        // nation 局部变量
        String color; // 局部变量
        color = "yellow";
    }

    // 测试类
    static class PersonTest{
        public static void main(String[] args) {
            Person p = new Person();
            p.show("CHN");
        }
    }
}

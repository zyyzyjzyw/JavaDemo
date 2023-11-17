package com.tedu.java.oop;

/**
 * @ClassName PersonTest
 * @Author Administrator
 * @Date 2023/11/11 11:26
 * @Version 1.0
 * @Description TODO
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="赵同学";
        p1.age = 20;
        p1.isMale = true;

        Person p2 = new Person();
        p2.age = 10;

        Person p3 =new Person();
        p3.name = "郭同学";
    }
}

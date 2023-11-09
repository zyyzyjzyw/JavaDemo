package com.tedu.java.oop;

/**
 * @ClassName PersonTest
 * @Author Administrator
 * @Date 2023/11/8 19:47
 * @Version 1.0
 * @Description TODO
 **/
public class PersonTest {
    public static void main(String[] args) {
        // 创建对象，类的实例化
        Person person = new Person();
        // 通过对象调用属性或者方法
        person.age=24;
        person.name="杰克";
        person.gender='男';
        person.eat();
        person.sleep(8);
        person.interests("乒乓球");
    }
}

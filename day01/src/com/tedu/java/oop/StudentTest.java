package com.tedu.java.oop;

/**
 * @ClassName StudentTest
 * @Author Administrator
 * @Date 2023/11/11 14:45
 * @Version 1.0
 * @Description TODO
 **/
public class StudentTest {
    public static void main(String[] args) {
        // com.tedu.java.oop.Person@1b6d3586
        System.out.println(new Person());

        Person person = new Person();
        // com.tedu.java.oop.Person@4554617c
        System.out.println(person);

        int [] arr = new int[5];
        // [I@74a14482
        System.out.println(arr);
    }
}

package com.tedu.java.oop;

/**
 * @ClassName TestVariable
 * @Author Administrator
 * @Date 2023/11/16 9:35
 * @Version 1.0
 * @Description TODO
 **/
public class TestVariable {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.a);
        System.out.println(((Sub)b).a);

        Sub s = new Sub();
        System.out.println(s.a);
        System.out.println(((Base)s).a);
    }
}
class Base{
    int a = 1;
}
class Sub extends Base{
    int a = 2;
}


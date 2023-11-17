package com.tedu.java.oop;

/**
 * @ClassName MethodDefineDemo
 * @Author Administrator
 * @Date 2023/11/14 9:35
 * @Version 1.0
 * @Description TODO
 **/
public class MethodDefineDemo {
    /***
     * @date: 2023/11/14 9:36
     * @param:  * @param
     * @return: void
     * @description: 无参无返回的方法演示
     */
    public void syaHello(){
        System.out.println("hello");
    }
    /***
     * @date: 2023/11/14 9:39
     * @param length 第一个参数,标识矩形的长
     * @param width 第二个参数，表示举行的宽
     * @param sign 第三个参数,标识填充举行图形的符号
     * @return: void
     * @description:
     */
    public void printRectangle(int length,int width,char sign){
        for(int i = 1;i<length;i++){
            for (int j = 1;j<=width;j++){
                System.out.println(sign);
            }
            System.out.println();
        }
    }
    /**
     * 无参有返回值方法的演示
     * @return
     */
    public int getIntBetweenOneToHundred(){
        return (int)(Math.random()*100+1);
    }
    /***
     * @date: 2023/11/14 16:17
     * @param a 第一个参数,要比较大小的整数之一
     * @param b 第二个参数,要比较大小的整数之二
     * @return: int 比较大小的两个整数中较大者的值
     * @description: 有参有返回值方法的演示
     */
    public int max(int a,int b){
        return a > b ? a : b;
    }
}

package com.tedu.java.thread;

/**
 * @ClassName EventNumberTest
 * @Author Administrator
 * @Date 2023/11/13 19:40
 * @Version 1.0
 * @Description 创建一个线程1，用于遍历100以内的偶数
 **/
public class EventNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        p.start();
    }

}

// 创建一个集成于Thread类的子类
class PrintNumber extends Thread{
    // 重写thread类的run()-->将此线程要执行的操作声明在此方法中

    @Override
    public void run() {
        for(int i = 1;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

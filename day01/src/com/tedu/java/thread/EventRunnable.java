package com.tedu.java.thread;

/**
 * @ClassName EventRunnable
 * @Author Administrator
 * @Date 2023/11/15 20:09
 * @Version 1.0
 * @Description TODO
 **/
public class EventRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

class RunnableTest{
    public static void main(String[] args) {
        EventRunnable eventRunnable = new EventRunnable();
        Thread thread = new Thread(eventRunnable);
        thread.start();
    }
}
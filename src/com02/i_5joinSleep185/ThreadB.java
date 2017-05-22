package com02.i_5joinSleep185;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadB extends Thread{
    public void run(){
        try {
            System.out.println("b run begin timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end  timer="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void bservice(){
        System.out.println("打印了bservice timer="+System.currentTimeMillis());
    }
}

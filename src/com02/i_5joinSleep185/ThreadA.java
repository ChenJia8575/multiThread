package com02.i_5joinSleep185;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadA extends Thread{
    private ThreadB b;
    public ThreadA(ThreadB b){
        this.b=b;
    }
    public void run(){
        try {
            synchronized (b) {
                b.start();
                Thread.sleep(6000);//不释放锁
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
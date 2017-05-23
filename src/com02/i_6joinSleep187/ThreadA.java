package com02.i_6joinSleep187;

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
                 b.join();//说明join释放锁了。
                 System.out.print("over");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
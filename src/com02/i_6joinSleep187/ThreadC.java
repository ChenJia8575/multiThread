package com02.i_6joinSleep187;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadC extends Thread{
    private ThreadB threadB;
    public ThreadC(ThreadB threadB){
        this.threadB=threadB;
    }
    public void run(){
        threadB.bservice();
    }
}
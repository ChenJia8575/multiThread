package com03.a_2ReentrantLock202;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service){
        this.service=service;
    }
    @Override
    public void run() {
        service.methodB();
    }
}

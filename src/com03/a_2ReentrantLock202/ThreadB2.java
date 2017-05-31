package com03.a_2ReentrantLock202;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class ThreadB2 extends Thread {
    private MyService service;

    public ThreadB2(MyService service){
        this.service=service;
    }
    @Override
    public void run() {
        service.methodB();
    }
}

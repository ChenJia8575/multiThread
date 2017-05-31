package com03.a_2ReentrantLock202;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class ThreadA2 extends Thread {
    private MyService service;

    public ThreadA2(MyService service){
        this.service=service;
    }
    @Override
    public void run() {
        service.methodA();
    }
}

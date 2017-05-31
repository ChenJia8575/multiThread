package com03.a_2ReentrantLock202;

import com03.a_1ReentrantLock201.*;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA (MyService service){
        this.service=service;
    }
    @Override
    public void run() {
        service.methodA();
    }
}

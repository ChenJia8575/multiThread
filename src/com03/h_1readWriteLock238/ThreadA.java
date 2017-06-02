package com03.h_1readWriteLock238;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        this.service=service;
    }
    @Override
    public void run() {
        service.read();
    }
}

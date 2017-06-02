package com03.h_1readWriteLock237;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        this.service=service;
    }
    @Override
    public void run() {
        service.write();
    }
}

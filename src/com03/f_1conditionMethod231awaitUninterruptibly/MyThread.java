package com03.f_1conditionMethod231awaitUninterruptibly;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class MyThread extends Thread {
    private Service service;
    public MyThread(Service service){
        this.service=service;
    }
    @Override
    public void run() {
        service.method();
    }
}

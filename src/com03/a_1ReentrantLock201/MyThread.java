package com03.a_1ReentrantLock201;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service){
        this.service=service;
    }
    @Override
    public void run() {
        service.method();
    }
}

package com03.f_1conditionMethod232awaitUntil;



/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class ThreadNotify extends Thread {
    private Service service;
    public ThreadNotify(Service service){
        this.service=service;
    }
    @Override
    public void run() {
        service.notifyMethod();
    }
}

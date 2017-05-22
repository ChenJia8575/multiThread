package com02.c_1interruptWait147;

/**
 * Created by juqiang.xie on 2017/5/17.
 */
public class ThreadA extends Thread{
    private Object lock;
    public ThreadA(Object lock){
        this.lock=lock;
    }
    @Override
    public void run(){
        Service service = new Service();
        service.method(lock);
    }
}

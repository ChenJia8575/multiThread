package com02.c_3notifyAll150;

/**
 * Created by juqiang.xie on 2017/5/17.
 */
public class NotifyThread extends Thread{
    private Object lock;
    public NotifyThread(Object lock){
        this.lock=lock;
    }
    @Override
    public void run(){
        synchronized (lock){
            lock.notifyAll();
        }
    }
}

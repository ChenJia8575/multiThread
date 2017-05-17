package com02.c_2notifyOne148;

/**
 * Created by juqiang.xie on 2017/5/17.
 */
public class Main {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            ThreadA b = new ThreadA(lock);
            b.start();
            ThreadA c = new ThreadA(lock);
            c.start();
            Thread.sleep(1000);
            NotifyThread notifyThread = new NotifyThread(lock);
            notifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

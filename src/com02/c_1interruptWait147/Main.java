package com02.c_1interruptWait147;

/**
 * Created by juqiang.xie on 2017/5/17.
 */
public class Main {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(1000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

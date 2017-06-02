package com03.h_1readWriteLock238;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
       Thread.sleep(100);
        b.start();
    }
}

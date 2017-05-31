package com03.a_2ReentrantLock202;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadA2 a2 = new ThreadA2(service);
        a2.setName("A2");
        a2.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadB2 b2 = new ThreadB2(service);
        b2.setName("B2");
        b2.start();
    }
}

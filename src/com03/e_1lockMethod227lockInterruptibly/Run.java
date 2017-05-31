package com03.e_1lockMethod227lockInterruptibly;

import com03.a_2ReentrantLock202.*;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread a = new Thread(runnable);
        a.setName("A");
        a.start();
        Thread.sleep(500);
        Thread b = new Thread(runnable);
        b.setName("B");
        b.start();
        b.interrupt();
        System.out.println("main ends");
    }
}

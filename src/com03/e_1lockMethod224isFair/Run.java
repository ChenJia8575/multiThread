package com03.e_1lockMethod224isFair;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.method();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        final Service service2 = new Service(false);
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                service2.method();
            }
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}

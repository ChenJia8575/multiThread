package com03.e_1lockMethod225isHeldByCurrentThread;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.method();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

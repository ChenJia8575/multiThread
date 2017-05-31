package com03.e_1lockMethod229tryLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Run {
    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" invoke waitmethod time "+ System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread a = new Thread(runnable);
        a.setName("A");
        a.start();
        Thread b = new Thread(runnable);
        b.setName("B");
        b.start();
    }
}

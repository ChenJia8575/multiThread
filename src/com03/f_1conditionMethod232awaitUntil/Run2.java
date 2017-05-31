package com03.f_1conditionMethod232awaitUntil;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadWait wait = new ThreadWait(service);
        wait.start();
        Thread.sleep(2000);
        ThreadNotify notify = new ThreadNotify(service);
        notify.start();
    }
}

package com03.e_1lockMethod223hasWaiters;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] arr = new Thread[10];
        for(int i=0;i<10;i++){
            arr[i]=new Thread(runnable);
            arr[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }





}

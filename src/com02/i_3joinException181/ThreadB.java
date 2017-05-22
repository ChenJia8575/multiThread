package com02.i_3joinException181;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadB extends Thread{
    public void run(){
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("B run end print.");
        } catch (InterruptedException e) {
            System.out.println("B catch print.");
            e.printStackTrace();
        }
    }
}

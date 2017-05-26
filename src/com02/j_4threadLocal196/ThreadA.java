package com02.j_4threadLocal196;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class ThreadA extends Thread {
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("ThreadA "+Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}

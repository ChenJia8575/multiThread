package com02.j_1threadLocal192;

/**
 * Created by juqiang.xie on 2017/5/24.
 */
public class ThreadB extends Thread{
    public void run(){
        try {
            for (int i=0;i<100;i++){
                Tools.t1.set("ThreadB"+(i+1));
                System.out.println("ThreadB get Value="+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

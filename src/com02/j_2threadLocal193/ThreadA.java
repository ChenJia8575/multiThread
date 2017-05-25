package com02.j_2threadLocal193;

import java.util.Date;

/**
 * Created by juqiang.xie on 2017/5/25.
 */
public class ThreadA extends Thread {
    public void run(){
        try {
            for (int i=0;i<20;i++){
                if (Tools.t1.get()==null){
                    Tools.t1.set(new Date());
                }
                System.out.println("A "+ Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

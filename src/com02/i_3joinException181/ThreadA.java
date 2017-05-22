package com02.i_3joinException181;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadA extends Thread{
    public void run(){
        for (int i=0;i<Integer.MAX_VALUE;i++){
            String newString = new String();
            Math.random();
        }
    }
}

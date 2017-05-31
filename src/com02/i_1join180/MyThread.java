package com02.i_1join180;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class MyThread extends Thread{
    public void run(){
        try {
            int secondValue = (int) (Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

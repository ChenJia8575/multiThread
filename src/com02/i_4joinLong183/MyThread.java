package com02.i_4joinLong183;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class MyThread extends Thread {
    public void run(){
        try {
            System.out.println("begin Timer="+ System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

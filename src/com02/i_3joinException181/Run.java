package com02.i_3joinException181;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c= new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

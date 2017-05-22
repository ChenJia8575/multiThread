package com02.i_2join180;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThrad th = new MyThrad();
            th.start();
            th.join();
            System.out.println("do after MyThread done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

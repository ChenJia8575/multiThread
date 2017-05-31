package com02.i_1join180;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Test {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        System.out.println("do after MyThread done.");
    }
}

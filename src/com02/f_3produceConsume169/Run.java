package com02.f_3produceConsume169;

import com02.f_2produceConsume167.*;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        Producer p1 = new Producer(myStack);
        Producer p2 = new Producer(myStack);
        Producer p3 = new Producer(myStack);
        Producer p4 = new Producer(myStack);
        Producer p5 = new Producer(myStack);
        Producer p6 = new Producer(myStack);

        ThreadP tc1 = new ThreadP(p1);
        ThreadP tc2 = new ThreadP(p2);
        ThreadP tc3 = new ThreadP(p3);
        ThreadP tc4 = new ThreadP(p4);
        ThreadP tc5 = new ThreadP(p5);
        ThreadP tc6 = new ThreadP(p6);
        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();
        tc6.start();
        Consumer c = new Consumer(myStack);
        ThreadC tc = new ThreadC(c);
        tc.start();
    }
}

package com02.f_2produceConsume168;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Producer p = new Producer(myStack);
        Consumer c1 = new Consumer(myStack);
        Consumer c2 = new Consumer(myStack);
        Consumer c3 = new Consumer(myStack);
        Consumer c4 = new Consumer(myStack);
        Consumer c5 = new Consumer(myStack);
        ThreadP tp = new ThreadP(p);
        tp.start();
        ThreadC tc1 = new ThreadC(c1);
        ThreadC tc2 = new ThreadC(c2);
        ThreadC tc3 = new ThreadC(c3);
        ThreadC tc4 = new ThreadC(c4);
        ThreadC tc5 = new ThreadC(c5);
        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();
    }

}

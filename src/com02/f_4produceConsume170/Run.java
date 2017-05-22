package com02.f_4produceConsume170;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        new ThreadP(new Producer(myStack)).start();
        new ThreadP(new Producer(myStack)).start();
        new ThreadP(new Producer(myStack)).start();
        new ThreadP(new Producer(myStack)).start();
        new ThreadP(new Producer(myStack)).start();
        new ThreadP(new Producer(myStack)).start();

        new ThreadC(new Consumer(myStack)).start();
        new ThreadC(new Consumer(myStack)).start();
        new ThreadC(new Consumer(myStack)).start();
        new ThreadC(new Consumer(myStack)).start();
        new ThreadC(new Consumer(myStack)).start();
        new ThreadC(new Consumer(myStack)).start();
        new ThreadC(new Consumer(myStack)).start();
        new ThreadC(new Consumer(myStack)).start();

    }
}

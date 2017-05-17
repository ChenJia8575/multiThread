package com02.c_3notifyAll150;

/**
 * Created by juqiang.xie on 2017/5/17.
 */
public class Service {
    public void method(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait thread " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end   wait " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了");
        }
    }
}

package com02.c_1interruptWait147;

/**
 * Created by juqiang.xie on 2017/5/17.
 */
public class Service {
    public void method(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait");
                lock.wait();
                System.out.println("begin wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了");
        }
    }
}

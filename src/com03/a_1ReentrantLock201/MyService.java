package com03.a_1ReentrantLock201;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void method(){
        lock.lock();
        for(int i=1;i<6;i++){
            System.out.println("ThreadName="+Thread.currentThread().getName()+" "+i);
        }
        lock.unlock();
    }
}

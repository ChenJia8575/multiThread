package com03.a_2ReentrantLock202;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/26.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void methodA(){
        try {
            lock.lock();
            System.out.println("methodA begin threadname "+ Thread.currentThread().getName()+" time "
            +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end   threadname "+ Thread.currentThread().getName()+" time "
                    +System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void methodB(){
        try {
            lock.lock();
            System.out.println("methodB begin threadname "+ Thread.currentThread().getName()+" time "
                    +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end   threadname "+ Thread.currentThread().getName()+" time "
                    +System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

package com03.e_1lockMethod223hasWaiters;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();
    public void waitMethod(){
        try {
            lock.lock();
            cond.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("are there any threads waiting for cond?"+lock.hasWaiters(cond)+
            " threads numbers is "+lock.getWaitQueueLength(cond));
            cond.signal();
            System.out.println("are there any threads waiting for cond?"+lock.hasWaiters(cond)+
                    " threads numbers is "+lock.getWaitQueueLength(cond));
        } finally {
            lock.unlock();
        }
    }
}

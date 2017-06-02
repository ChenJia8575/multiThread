package com03.h_1readWriteLock236;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class Service {
    private ReentrantReadWriteLock lock= new ReentrantReadWriteLock();
    public void read(){
        try {
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+" gets readLock. "+System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}

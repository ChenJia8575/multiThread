package com03.h_1readWriteLock237;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class Service {
    private ReentrantReadWriteLock lock= new ReentrantReadWriteLock();
    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName()+" gets writeLock. "+System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}

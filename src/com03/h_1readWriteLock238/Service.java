package com03.h_1readWriteLock238;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by juqiang.xie on 2017/6/2.
 */
public class Service {
    private ReentrantReadWriteLock lock= new ReentrantReadWriteLock();
    public void read(){
        try {
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+" gets readLock.  "+System.currentTimeMillis());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName()+" gets writeLock. "+System.currentTimeMillis());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}

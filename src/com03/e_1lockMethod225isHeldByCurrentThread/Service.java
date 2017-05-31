package com03.e_1lockMethod225isHeldByCurrentThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        lock=new ReentrantLock(isFair);
    }
    public void method(){
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}

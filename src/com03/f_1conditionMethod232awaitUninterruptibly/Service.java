package com03.f_1conditionMethod232awaitUninterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();
    public void method(){
        try {
            lock.lock();
            System.out.println("wait begin");
            cond.awaitUninterruptibly();
            System.out.println("wait ends ");
        } finally {
            lock.unlock();
        }
    }
}

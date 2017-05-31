package com03.f_1conditionMethod231awaitUninterruptibly;

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
            cond.await();
            System.out.println("wait ends ");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }
    }





}

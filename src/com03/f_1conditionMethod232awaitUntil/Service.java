package com03.f_1conditionMethod232awaitUntil;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();
    public void waitMethod(){
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,4);
            lock.lock();
            System.out.println("wait begin time "+ System.currentTimeMillis());
            cond.awaitUntil(calendar.getTime());
            System.out.println("wait end   time "+ System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("notify begin time "+ System.currentTimeMillis());
            cond.signalAll();
            System.out.println("notify end   time "+ System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}
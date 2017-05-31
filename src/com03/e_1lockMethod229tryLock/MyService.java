package com03.e_1lockMethod229tryLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod(){
        try {
            if(lock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName()+" now gets lock.    time "+System.currentTimeMillis());
                Thread.sleep(4000);
            }else{
                System.out.println(Thread.currentThread().getName()+" now dont get lock.time "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(lock.isHeldByCurrentThread())lock.unlock();
        }
    }
}

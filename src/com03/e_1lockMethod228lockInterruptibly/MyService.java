package com03.e_1lockMethod228lockInterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();
    public void waitMethod(){
        try {
            lock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName()+" lock begin ");
            for(int i=0;i<Integer.MAX_VALUE/10;i++){
                String str = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()+" lock end ");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" in catch.");
            e.printStackTrace();
        } finally {
            if(lock.isHeldByCurrentThread()){
                lock.unlock();
                System.out.println("lock.unlock.");
            }
        }
    }
}

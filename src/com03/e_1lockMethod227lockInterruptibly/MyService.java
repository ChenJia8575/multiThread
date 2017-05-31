package com03.e_1lockMethod227lockInterruptibly;

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
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" lock begin ");
            //Thread.sleep(1000);
            for(int i=0;i<Integer.MAX_VALUE/10;i++){
                String str = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()+" lock end ");
        }  finally {
            if(lock.isHeldByCurrentThread()){
                lock.unlock();
                System.out.println("lock.unlock.");
            }
        }
    }
}

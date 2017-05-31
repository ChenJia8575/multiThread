package com03.e_1lockMethod228tryLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod(){
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+" now gets lock.");
        }else{
            System.out.println(Thread.currentThread().getName()+" now dont get lock.");
        }
    }
}

package com03.e_1lockMethod224isFair;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by juqiang.xie on 2017/5/31.
 */
public class Service {
    private ReentrantLock lock ;
    public Service (boolean isFair){
        lock=new ReentrantLock(isFair);
    }
    public void method(){
        try {
            lock.lock();
            System.out.println("isFair?"+lock.isFair());
        } finally {
            lock.unlock();
        }
    }






}

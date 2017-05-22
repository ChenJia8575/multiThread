package com02.f_2produceConsume167;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadC extends Thread{
    private Consumer c;
    public ThreadC(Consumer c){
        this.c=c;
    }
    public void run(){
        while(true){
            c.pop();
        }
    }
}

package com02.f_2produceConsume168;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class ThreadP extends Thread{
    private Producer p;
    public ThreadP(Producer p){
        this.p=p;
    }
    public void run(){
        while(true){
            p.push();
        }
    }
}

package com02.f_2produceConsume167;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class MyStack {
    private List list = new ArrayList<>();
    synchronized public void push(){
        try {
            if(list.size()==1){
                System.out.println("push 操作中的："+Thread.currentThread().getName()+" now in waiting");
                this.wait();
            }
            list.add("anything="+Math.random());
            this.notify();
            System.out.println(Thread.currentThread().getName()+" push="+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public String pop(){
        String returnValue="";
        try {
            if(list.size()==0){
                System.out.println("pop 操作中的："+Thread.currentThread().getName()+" now in waiting");
                this.wait();
            }
            returnValue = ""+list.get(0);
            list.remove(0);
            this.notify();
            System.out.println(Thread.currentThread().getName()+" pop="+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }


}

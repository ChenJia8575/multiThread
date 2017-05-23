package com02.e_1waitOld157;

/**
 * Created by juqiang.xie on 2017/5/19.
 */
public class Add {
    private String lock;
    public Add(String lock){
        this.lock=lock;
    }
    public void add(){
        synchronized (lock){
        	ValueObject.list.add("cf");
        	lock.notifyAll();
        }
    }


}

package com02.f_3produceConsume169;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Consumer {
    private MyStack myStack;
    public Consumer(MyStack myStack){
        this.myStack=myStack;
    }
    public void pop(){
        System.out.println(Thread.currentThread().getName()+" pop="+myStack.pop());
    }
}

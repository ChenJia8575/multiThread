package com02.f_2produceConsume167;

/**
 * Created by juqiang.xie on 2017/5/22.
 */
public class Producer{
    private MyStack myStack;
    public Producer(MyStack myStack){
        this.myStack=myStack;
    }
    public void push(){
        myStack.push();
    }
}

package com02.g_1produceConsume165stack;

public class Consumer {
	private MyStack myStack;
	public Consumer(MyStack myStack){
		this.myStack=myStack;
	}
	public void pop(){
		System.out.println("pop = "+myStack.pop());
	}

}

package com02.g_1produceConsume165stack;

public class Producer {
	private MyStack myStack;
	public Producer(MyStack myStack){
		this.myStack=myStack;
	}
	public void push(){
		myStack.push();
	}

}

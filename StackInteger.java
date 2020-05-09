package com.dsprep;

public class StackInteger {
	
	int top = -1; 
    int items[];
	
    public StackInteger() {
		this.items = new int[100];
	}
    
    public StackInteger(int size) {
		super();
		this.items = new int[size];
	}
    
public int pop() {
		
		if(top < 0) {
			
			System.out.println("Stack unde-rflow");
			
		}
			int var =  items[top];
			//items[top] = (Integer) null;
			top --;
			return var;
		
	}

public void push(int key) {
	
	if(top <= items.length -1) {
		
		top++;
		items[top] = key;
		
	}else {
		System.out.println("Stack over-flow");
	}
	
	
}

public boolean isEmpty() {
	
	return (top == -1) ? true : false ;
	
}


}

package com.dsprep.two;

public class Stack {
	int top = -1; 
    char items[];
	
    public Stack() {
		this.items = new char[100];
	}
    
    public Stack(int size) {
		super();
		this.items = new char[size];
	}
    
public char pop() {
		
		if(top < 0) {
			
			System.out.println("Stack unde-rflow");
			
		}
			char ch =  items[top];
			top --;
			return ch;
		
	}

public void push(char key) {
	
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

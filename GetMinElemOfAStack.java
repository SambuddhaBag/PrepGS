package com.dsprep.two;

import java.util.Stack;

public class GetMinElemOfAStack {
	
	private Stack<Integer> main = new Stack<Integer>();
	private Stack<Integer> supp = new Stack<Integer>();
	
	
	public void push(int x) {
		
		if(!main.isEmpty()) {
			
			main.push(x);
			
			if(supp.peek() >= x && !supp.isEmpty()) {
				supp.push(x);
			}
		}else {
		main.push(x);
		supp.push(x);
		}
	}
	
	public int pop() {
		
		if(main.isEmpty()) {
			System.out.println("Under flow");
			return -1;
		}else {
			int it = main.pop();
			
			if(it == supp.peek()) {
				supp.pop();
			}
			
			return it;
			
		}
		
	}
	public void getMin() {
		
			System.out.println(supp.peek());
		}
		
	}
	





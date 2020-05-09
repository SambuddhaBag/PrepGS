package com.dsprep;

public class KstackInArray {
	
	private StackInteger[] array; 

	public KstackInArray(int noOfStack, int stackSize) {
		super();
		this.array = new StackInteger[noOfStack];
		for(int i = 0; i < noOfStack; i++) {
			
			array[i] = new StackInteger(stackSize);
			
		}
		
	}
	
	public KstackInArray(int noOfStack) {
		super();
		this.array = new StackInteger[noOfStack];
		for(int i = 0; i < noOfStack; i++) {
			
			array[i] = new StackInteger();
			
		}
		
	}
	
	public KstackInArray() {
		super();
		this.array = new StackInteger[10];
		for(int i = 0; i < 10; i++) {
			
			array[i] = new StackInteger();
			
		}
		
	}
	
	
	public void push(int key, int stackNo) {
		
		array[stackNo].push(key);
		
	}
	
	public int pop(int stackNo) {
		
		return array[stackNo].pop();
		
	}
	
	public boolean isEmpty(int stackNo) {
		
		return array[stackNo].isEmpty();
		
	}
	

}

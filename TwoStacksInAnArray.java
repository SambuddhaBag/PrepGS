package com.dsprep;

public class TwoStacksInAnArray {

	
	int arr[];
	int top1;
	int top2;
	
	
	public TwoStacksInAnArray(int n) {
		
		arr = new int[n];
		
		top1 = -1;
		top2 = n;
		
	}
	
	public void push1(int key) {
		
		while(top1 < top2-1) {
			
			top1++;
			arr[top1] = key;
			
		}
		
		
	}
	
	public void push2(int key) {
			
			if(top1 < top2-1) {
				
				top2++;
				arr[top2] = key;
			}
			else {
				System.out.println("stack overflow");
			}
				
	}
	
	
	public int pop1() {
		
		if(top1 - 1 >= 0) {
			top1 --;
			return arr[top1];
			
		}
		
		return -1;
		
	}
public int pop2() {
		
		if(top2 + 1 <= arr.length) {
			top2 ++;
			return arr[top2];
			
		}
		
		return -1;
		
	}

			
		
	
	
}

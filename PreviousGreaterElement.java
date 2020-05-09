package com.dsprep;

/*  Previous Greater Element :  [MEDIUM]
        Given an array of distinct integers , Find position-wise greater on left of every element.
        
        eg:   i/p  -  {15, 10, 18 , 12, 4 , 6  , 2, 8  }
              o/p  -  {-1, 15, -1 , 18, 12, 12 , 6, 12 } 
*/
public class PreviousGreaterElement {
	
	public void prevGtElem(int[] arr) {
		
		
		StackInteger stI = new StackInteger(arr.length);
		StackInteger st2 = new StackInteger(arr.length);
		
		
		for(int i = arr.length -1; i>=0; i--) {
			
			stI.push(arr[i]);
			int next = (i - 1);
			
			if(next >=0) {
			while(arr[next] < arr[i]) {
				
				next --;
				
				if(next < 0) {
					stI.pop();
					stI.push(-1);
					break;
				}
				
			}
			if(next >= 0 && arr[next] > arr[i]) {
				
				stI.pop();
				stI.push(arr[next]);
				
			}
			
			
			
		}else {
			stI.pop();
			stI.push(-1);
			
		}
		}
		
		while(!stI.isEmpty()) {
			
			st2.push(stI.pop());
		}
		while (!st2.isEmpty()) {
			
			System.out.print(st2.pop() + "->");
		}
		
	}
}

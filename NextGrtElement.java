package com.dsprep;


/*Next Greater Element :  [MEDIUM]
        Given an array of integers, find next greater element (position-wise) for every array element.
        
       eg : i/p - {5 , 15 , 10 , 8 , 6 , 12 , 9 , 18} 
            o/p -  15  18   12   12  12  18   18  -1*/


public class NextGrtElement {
	
public void nxtGtElem(int[] arr) {
		
		
		StackInteger stI = new StackInteger(arr.length);
		
		
		for(int i = 0; i<=arr.length -1; i++) {
			
			stI.push(arr[i]);
			int next = (i + 1);
			
			if(next <= arr.length -1) {
			while(arr[next] < arr[i]) {
				
				next ++;
				
				if(next > arr.length -1) {
					stI.pop();
					stI.push(-1);
					break;
				}
				
			}
			if(next <= arr.length -1 && arr[next] > arr[i]) {
				
				stI.pop();
				stI.push(arr[next]);
				
			}
			
			
			
		}else {
			stI.pop();
			stI.push(-1);
			
		}
		}
		
		while(!stI.isEmpty()) {
			
			System.out.print(stI.pop()+" -> ");
			
		}
		
		
	}

}

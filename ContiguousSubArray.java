package com.dsprep;


//[1,2,3,-2,5]
//[-1,1,2,3,5]
public class ContiguousSubArray {
	
	public void findMaxContiguousSumSubArray(int[] array) {
		
		int maxValue = 0;
		int maxEndValue = 0;
		
		for (int i = 0; i< array.length; i++) {
			
			maxEndValue = maxEndValue + array[i];
			
			if(maxEndValue < 0) {
				
				maxEndValue = 0;
				
			}
			if(maxEndValue > maxValue) {
				
				maxValue = maxEndValue;
				
			}
			
		}
		
		System.out.println("Maximum contiguous SUM "+ maxValue);
		
	}

}

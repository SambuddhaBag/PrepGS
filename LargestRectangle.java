package com.dsprep;

public class LargestRectangle {
	
	public void findLargestRect(int[] arr, int weight) {
		
		int maxArea =0;
		int high = arr.length -1;
		int low = 0;
		
		while(low < high) {
			
			maxArea = Math.max(maxArea, Math.min(arr[low], arr[high]) * ((high-low))*weight);
			
			if(arr[low] > arr[high])
				high --;
			else
				low ++;
			
		}
		
		System.out.println(maxArea);
		
		
		
			}
}

package com.dsprep;

public class Median {
	
	public double median(int[] arr) {
		
		if(arr.length != 0) {
			
		int high = arr.length - 1;
		int low = 0;
		
		if(low == high)
			return Double.valueOf(arr[low]);
		
		while(low != high) {
			
			
			
			if(low == high)
				return Double.valueOf(arr[low]);
			
			if(high - low == 1) {
				return (Double.valueOf(arr[low]) + Double.valueOf(arr[high]))/2;
				
			}
			
			low += 1;
			high -=1;
			
		}
		}
		
		return 0;
		
	}

}

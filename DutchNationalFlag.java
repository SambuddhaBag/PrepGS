package com.dsprep;

public class DutchNationalFlag {
	
	public int[] dnfOrder(int[] arr, int pivot) {
		
		int low = 0;
		int high = arr.length -1;
		int i = 0;
		
		while(i < high) {
			
			if(arr[i] < pivot) {
				
				swap(arr[i], arr[low]);
				low += 1;
				i++;
				
			}
			else if(arr[i] > pivot) {
				
				swap(arr[i], arr[high]);
				high -= 1;
				
			}
			
		}
		
		
		
		return arr;
		
	}
	
	public void swap(int data1, int data2) {
		
		int temp = data1;
		data1 = data2;
		data2 = temp;
		
	}

}

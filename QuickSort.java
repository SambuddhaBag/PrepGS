package com.dsprep;

public class QuickSort {
	
	public void quickSort(int[] arr, int start, int end) {
		
		if(start < end) {
			
			int pIndex = partition(arr, start, end-1);
			
			quickSort(arr, start, pIndex);
			quickSort(arr, pIndex+1, end);
			
		}
		
	}
	
	
	public int partition(int[] arr, int start,int end) {
		
		int pivot = arr[end];
		int pIndex = start;
		
		for(int i = start; i< end; i++) {
			
			if(arr[i] < pivot) {
				
				int temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;
				pIndex ++;
				
			}
			
			
		}
		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;
		return pIndex;
		
		
	}


	

}

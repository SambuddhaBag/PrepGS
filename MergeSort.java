package com.dsprep;

public class MergeSort {
	
	public int[] mergeSort(int[] arr, int start, int end) {
		
		if(start < end) {
			
			int mid = (start + end )/2;
			
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			
			merge(arr, start, mid, end);
			
		}
		
		
		return arr;
		
	}
	
	
	
	public void merge(int[] arr, int start, int mid, int last) {
		
		int cap1 = mid - start +1;
		int cap2 = last - mid;
		
		int[] left = new int[cap1];
		int[] rig = new int[cap2];
		
		for(int i = 0; i < cap1; i++)
			left[i] = arr[start + i];
			
		for(int j = 0; j < cap2; j++ )
			rig[j] = arr[mid+1+j];
		
		int i = 0;
		int j = 0;
		
		int k = start;
		
		while(i < cap1 && j < cap2) {
			
			if(left[i] < rig[j]) {
				
				arr[k] = left[i];
				i++;
				
			}else {
				
				arr[k] = rig[j];
				j++;
				
			}
			
			k++;
			
		}
		
		for( ; i < cap1; i++) {
			
			arr[k] = left[i];
			k++;
			
		}
		
		for( ; j < cap2; j++) {
			
			arr[k] = rig[j];
			k++;
			
		}
		
		
	}

}

package com.dsprep;

public class LMIndex {
	
	public int lmIndex(int[] arr, int key, int low, int high) {
		
		if(low < high && arr.length !=0) {
		
		int mid = (low + high)/2;
		if(arr[mid] > key)
			lmIndex(arr, key, low,mid-1);
		if(arr[mid] < key )
			lmIndex(arr, key, mid, high);
		if(arr[mid] == key) {
			int ind = mid;
			while(arr[ind] == key) {
				ind--;
			}
			return ind+1;
			
		}
		}
		
		return 0;
		
	}

}

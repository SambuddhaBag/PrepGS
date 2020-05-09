package com.dsprep;

public class ElementInInfiniteArray {
	
	public int lastIndexofArray(int arr[], int high, int low) {
		while(low <= high) {
			int mid = (low + high)/2;
			
			
			try {
				
				int temp = arr[mid];
				
			}catch(ArrayIndexOutOfBoundsException ex) {
				
				high = mid-1;
				continue;
				
			}
			
			try {
				
				int temp = arr[mid+1];
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				return mid;
			}
			
			low = mid+1;
		}
		
		return -1;
		
	}
	
	
	public int findElem(int arr[], int key) {
		
		int low = 0;
		int high = 1;
		int lastIndex;
		
		while(true) {
			
			try {
				
			int temp = arr[high];
			
			
			}catch (ArrayIndexOutOfBoundsException e) {

				lastIndex = lastIndexofArray(arr, high, low);
				break;
			
			}
			
			high = high * 2;
			
		}
		
		return binarySearch(arr, low, lastIndex, key);
		
		
	}


	private int binarySearch(int[] arr, int low, int high, int key) {
		// TODO Auto-generated method stub
		while(low <= high) {
			
		int mid = (low + high)/2;
		
		if(arr[mid] == key) {
			return mid;
			
		}
		if(arr[mid] > key) {
			high = mid-1;
			binarySearch(arr, low, high, key);
			
		}
		if(arr[mid] < key) {
			
			low = mid+1;
			binarySearch(arr, low, high, key);
			
		}
		
		}
		return -1;
	}

}

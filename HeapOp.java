package com.dsprep;

public class HeapOp {
	
	public static void heapify(int arr[], int len, int root) {
		
		int max = root;
		int lef = 2*root +1;
		int rig = 2*root+2;
		
		if(lef < len && arr[lef] > arr[max]) {
			max = lef;
		}
		
		if(rig < len && arr[rig] > arr[max]) {
			max = rig;
		}
		
		if(max != root) {
			
			int swap = arr[root];
			arr[root] = arr[max];
			arr[max] = swap;
			heapify(arr, len, max);
			
		}
		
	}
	
	public static void printArr(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}

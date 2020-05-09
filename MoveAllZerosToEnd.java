package com.dsprep.two;

public class MoveAllZerosToEnd {
	
	public static void moveZeros(int[] arr) {
		
        int count =0;
		for (int i = 0; i < arr.length; i++) 
            if (arr[i] != 0) 
                arr[count ++] = arr[i]; // here count is 
                                       // incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < arr.length) 
            arr[count++] = 0;
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		
		
		moveZeros(arr);
		System.out.println(arr);
		

	}

}

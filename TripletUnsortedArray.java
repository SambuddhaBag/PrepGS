package com.dsprep;

import java.util.Arrays;

/*Print all the Triplets in an array(unsorted) with sum less than or equal to given number.
in Big O of N Square. O(N^2)

arr =  {2,7,4,9,5,1,3};
	= 1,2,3,,4,5,7,9
Sum = 10*/

public class TripletUnsortedArray {
	
	public void findTriplet(int[] arr, int key) {
		
		Arrays.sort(arr);
		
		
		for(int i = 0; i< (arr.length - 3); i++) {
			
			int hP = arr.length - 1;
			int lP = i+1;
			
			while(lP < hP) {
				
				if(arr[i]+arr[lP]+arr[hP] > key) {
					hP --;
						
					}
				else{
					
					for(int k = lP+1; k <= hP; k++) {
						System.out.println(arr[i] + "," + arr[lP]+","+arr[k]);
						
					}
					
					lP++;
					
				}
				
			}
			
			
			
			
		}
		
	}

}

package com.dsprep.two;

import java.util.Stack;

@FunctionalInterface
interface SecSmall{
	public void findElem(int[] arr);
}

public class SecondSmallestElem {

	public static void main(String[] args) {
		
		
		SecSmall sm = (arr) ->{
			
			int small = Integer.MAX_VALUE;
			int secSmall = Integer.MAX_VALUE;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] < small && arr[i] < secSmall) {
					
					secSmall = small;
					small = arr[i];
				}
				else {
					if(arr[i] > small && arr[i] < secSmall) {
						secSmall = arr[i];
					}
				}
				
			}
			
			System.out.println("Second smallest no. : "+ secSmall);
		};
		
		int[] arr = {2,3,8,8,2}; 
		sm.findElem(arr);
		

	}

}

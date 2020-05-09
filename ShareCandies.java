package com.dsprep.two;

import java.util.Arrays;

public class ShareCandies {
	//3,1,0 -- 3,0,1 -- 3,2,1
	//3,2,1 -- 2,1,2 -- 3,2,1
	public static int countCandies(int[] array) {
		
		int sum = 0;
		// to itreate right to left
        int[] candyright = new int[array.length];
        int[] candyleft = new int[array.length];
        Arrays.fill(candyright, 1);
        Arrays.fill(candyleft, 1);
        
        //Comparing left hand side of each child
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
            	candyright[i] = candyright[i - 1] + 1;
            }
        }
        
        //Comparing right hand side
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] > array[i + 1]) {
            	candyleft[i] = candyleft[i + 1] + 1;
            }
        }
        
        for (int i : array) {
            sum += Math.max(candyright[i], candyleft[i]);
        }
        return sum;
    
			}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,0};
		
		System.out.println(countCandies(arr));
		
	}
			
}

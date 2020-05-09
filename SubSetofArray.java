package com.dsprep.two;

import java.util.HashSet;
import java.util.Set;

public class SubSetofArray {
	
	public static void isSubset(int[] ar1, int[] ar2) {
		
		int cap = 0;
		int[] sub;
		int[] main;
		if(ar1.length > ar2.length) {
			cap = ar2.length;
			sub = ar2;
			main = ar1;
		}
		else {
			cap = ar1.length;
			sub = ar1;
			main = ar2;
		}
		
		Set<Integer> maping = new HashSet<Integer>();
		for (Integer integer : sub) {
			
			maping.add(integer);
			
		}
		
		for (Integer integer : main) {
			
			if(maping.contains(integer))
				cap --;
			if(cap == 0) {
				System.out.println("Yes");
				return;
			}
				
		}
		System.out.println("No");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,6,5,3};
		int[] arr2 = {1,4,7,3,5,6};
		
		isSubset(arr1,arr2);

	}

}

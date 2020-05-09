package com.dsprep;

import java.util.PriorityQueue;

public class KlargestElem {
	
	public void kLargestElem(int[] arr, int k) {
			
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		
		for (int i = 0; i<k; i++) {
			pQ.add(arr[i]);
		}
		
		for (int i =k; i< arr.length;i++) {
			
			if(pQ.peek() < arr[i]) {
				
				pQ.remove();
				pQ.add(arr[i]);
				
			}
		}
		
			System.out.println(pQ);
			
	}

}

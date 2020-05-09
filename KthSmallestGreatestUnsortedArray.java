package com.dsprep.two;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class KthSmallestGreatestUnsortedArray {
	
	public static void kThSmallest(int[] array, int k) {
		
		Stack<Integer> small = new Stack<Integer>();
		
		Queue<Integer> pQueue = new PriorityQueue<Integer>();
		/*
		 * int kSmall = 0;
		 * boolean flag = true;
		 */
		
		for (Integer integer : array) {
			
			pQueue.add(integer);

		}
		
		/*
		 * while (k > 0) {
		 * 
		 * kSmall = small.pop(); k --;
		 * 
		 * }
		 */
		
		System.out.println("K th smallest: ");
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,23,4,12,22,21,23,5,90};
		
		kThSmallest(arr, 4);

	}

}

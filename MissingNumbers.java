package com.dsprep.two;

public class MissingNumbers {
	
	public static void findMissingNo(int[] input) {
	
		
	int high = input[input.length -1] + 1;	
	int[] track = new int[high];


    for (int i : input) {
      track[i] = 1;
    }

    System.out.println("missing numbers in given array");

    for (int i = 1; i < track.length; i++) {
      if (track[i] == 0) {
        System.out.println(i);
      }
    }
	}
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0};
		
		findMissingNo(arr);

	}

}

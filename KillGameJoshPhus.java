package com.dsprep.two;

public class KillGameJoshPhus {
	
	public static int killGame(int noOfPeople, int k) {
		
		return (killGame(noOfPeople - 1, k)+ k-1 ) % (noOfPeople-1);
				//(killGame(noOfPeople-1), k)+ k-1) % noOfPeople+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,4,6,2,5,9};
		
		System.out.println("President is: "+ killGame(arr.length-1, 2));

	}

}

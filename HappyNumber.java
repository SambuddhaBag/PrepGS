package com.dsprep.two;

public class HappyNumber {
	
	public static boolean ifHappy(int num) {
		
		int sum = 0;
		
		  //System.out.println(num % 10);
		  //System.out.println(num / 10);
		 
		
		if(num == 1)
			return true;
		
		while(sum != 1) {
			sum = (num % 10) * (num % 10);
			
			int temp = num / 10;
			
			while(temp >= 10) {
				
				sum += (temp % 10) * (temp % 10);
				temp = temp /10;
				
			}
			
			sum += temp * temp;
			num = sum;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		int num = 2;
		if(ifHappy(num))
			System.out.println("HAPPY");
		else
			System.out.println("Not HAPPY");
		
	}

}

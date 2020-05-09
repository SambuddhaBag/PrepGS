package com.dsprep;

/*Check if a number is power of 10 (i.e.: 1000 it is, 500 is not).*/

import java.util.Queue;

public class PowerOfTen {
	
	public void isPowerof(int key) {
		
		if(key == 0 || key == 1 || key == -1) {
			System.out.println("No key element. Element passed is " + key);
			return;
		}
		while(key != 0) {
			
			int qotient = key/10;
			
			if(key%10 != 0) {
				System.out.println("No "+ key);
				return;
			}
			
			if(qotient > 10 || qotient < -10) 
				key = qotient;
			
			else {
				if(qotient == 10 || qotient == -10 || qotient == 1 || qotient == -1)
					System.out.println("yes "+ key);
				else
					System.out.println("No "+ key);
				
				break;
			}
				
			
			
		}
	
		
		
	}

}

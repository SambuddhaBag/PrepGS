package com.dsprep;


/*Find the longest sub string and return its start index and length
 * E.g,: input = "abbbccda"output = [1,3]Testcases were1) 
 * input = "", output = [-1,0]2) input = "100001011", output = [1,4]2) 
 * input = "aabbbbbCDaA", output = [2,5]
 */


public class LongestSubstring {
	
	public void findLongestSubString(String str) {
		
		int maxLength = 0;
		int startInd = -1;
		int endInd = 0;
		int currentLength = 0;
		char current = Character.MAX_VALUE;
		
		if(!str.isEmpty()) {
			
			
			for (int i = 0; i < str.length(); i++) {
				
				/*
				 * Checks if the current character is in streak. If it maintains the streak it
				 * continue counts its length. Else if current character differs from previous,
				 * it updates the current character for comparison, and set its length to 1.
				 */
				
				if(str.charAt(i) == current) {
				
					currentLength++;
					
					// When length of current streak becomes maximum, it records it as well as the end index till which the streak continued.
					if(currentLength > maxLength) {
						
						maxLength = currentLength;
						endInd = i;
						
					}
					
				}
				else {
					
					current = str.charAt(i);
					currentLength = 1;
					
					if(currentLength > maxLength) {
						maxLength = currentLength;
						endInd = i;
						
					}
					
				}
			
			}
			
			// Start index of the longest Streak is end point of the (streak - length)+1
			startInd = endInd - maxLength + 1;
			System.out.println("Output: ["+startInd+","+maxLength+"]");
			
		}
		//If string is empty, prints initial start point and length.
		else {
			
			System.out.println("Output: ["+startInd+","+maxLength+"]");
			
		}
		
		
		
	}

}

package com.dsprep.two;

import java.util.HashMap;
import java.util.Map;

public class StringProblems {
	
	private static void findLastNonRepeatedChar(String str) {
		
		for(int i = str.length()-1; i >0; i--) {
			
			if(str.charAt(i) != str.charAt(i-1)) {
				System.out.println("last Non repeated char: "+ str.charAt(i));
				break;
			}
		}
		
		
	}
	
	private static void FindFirstNonRepeated(String str) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer[][]> charMap = new HashMap<Character, Integer[][]>();
		char ch = Character.MIN_VALUE;
		int ind = Integer.MAX_VALUE;
		for (int i = 0; i < str.length(); i++) {
			
			if(charMap.containsKey(str.charAt(i))) {
				
				Integer[][] temp = charMap.get(str.charAt(i));
				temp[0][0] +=1;
				temp[0][1] = i;
				charMap.put(str.charAt(i), temp);
				
			}else {
				
				Integer[][] temp = {{1,i}};
				charMap.put(str.charAt(i), temp);
				
			}
			
			
		}
		
		for(Map.Entry<Character, Integer[][]> mp : charMap.entrySet()) {
			
			Integer[][] temp = mp.getValue();
			
			if(temp[0][0] == 1 && temp[0][1] < ind) {
				ch = mp.getKey();
				ind = temp[0][1];
				
			}
			
			
		}
		
		System.out.println(ch);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ab";
		FindFirstNonRepeated(str);

	}

}

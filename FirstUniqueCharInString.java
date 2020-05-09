package com.dsprep.two;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInString {
	
	//"aaaabccedd"
	
	
	
	public static void findFirstUnqChar(String str) {
		
		
		if(!str.isEmpty()) {
		Character unq = null;
		int ind = Integer.MAX_VALUE;
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		

		
		for(int i =0; i< str.length(); i++) {
			
			if(charMap.containsKey(str.charAt(i))) {
				charMap.put(str.charAt(i), Integer.MAX_VALUE);
			}
			else {
				charMap.put(str.charAt(i), i);
			}
			
		}
		
		for(Map.Entry<Character, Integer> mp : charMap.entrySet()) {
			
			if(mp.getValue() < ind) {
				unq = mp.getKey();
				ind = mp.getValue();
			}
		}
		
		System.out.println("First unique Character: "+ unq +" Present at index: "+ ind);
		}
		else {
			throw new IllegalArgumentException("No String passed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "aabcda";
		
		findFirstUnqChar(st);
		
		
		

	}

}

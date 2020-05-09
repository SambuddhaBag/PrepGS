package com.dsprep;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatble {
	
	public void findFirstNonRepeat(String str) {
		
		if(!str.isEmpty()) {
		
		Map<String, Integer> charMap = new HashMap();
		
		for (int i =0 ; i< str.length(); i++) {
			
			if(charMap.containsKey(String.valueOf(str.charAt(i)))) {
				int newValue = charMap.get(String.valueOf(str.charAt(i))) + 1;
				charMap.put(String.valueOf(str.charAt(i)), newValue);
			}
			else
				charMap.put(String.valueOf(str.charAt(i)), 1);
			
		}
		
		for (Map.Entry<String, Integer> element : charMap.entrySet()) {
			
			if(element.getValue() == 1)
				System.out.println(element.getKey());
			
		}
		
		
	}
		else {
			throw new IllegalArgumentException("Invalid Input");
		}
	
	}
	

}

package com.dsprep;

import java.util.Stack;

/* Check if balanced parenthesis
        
        eg :    {[()]} - true
                {(]}   - false */

public class MatchParenthesis {
	
	public boolean matchParenthesis(String str) {
		
		Stack<Character> st = new Stack<Character>();
	
		
		if( str.length() % 2 == 0 && str.length() >= 1) {
		
		for(int i = 0; i < str.length(); i++) {
			
			
			
			if('(' == str.charAt(i) || '{' == str.charAt(i) || '[' == str.charAt(i)) {
				
				st.push(str.charAt(i));
				
			}
			
			else if(')' == str.charAt(i) || '}' == str.charAt(i) || ']' == str.charAt(i)) {
				
				if(st.isEmpty()) {
					return false;
				}
				
				char ch = (char) st.pop();
				
				if((str.charAt(i) == ')' && ch == '(') || (str.charAt(i) == '}' && ch == '{') || (str.charAt(i) == ']' && ch == '[')) {
					
					
				}else {
					return false;
				}
			
			}
			
		}
		
		return (st.isEmpty()) ? true : false;

		}
		
		return false;
		
	}
	
	
}

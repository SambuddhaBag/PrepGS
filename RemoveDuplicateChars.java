package com.dsprep.two;

public class RemoveDuplicateChars {
	public static void main(String[] args) {
		String input = "caaabbbaacdddd";
		System.out.println(input + "-" + input.length());
		StringBuffer buffer = new StringBuffer(input);
		RemoveDuplicateChars(buffer, 0, input.length());
		System.out.println(buffer.toString() + "-" + buffer.length());
	}
	
	public static String remStr(String input, int ind1, int ind2) {
		String str =input;
		
		if(input.length() > 0) {
			
			
			
		}
		
		return str;
		
	}

	static void RemoveDuplicateChars(StringBuffer str, int start, int length) {
		if (start == length)
			return;
		RemoveDuplicateChars(str, start + 1, length);
		if (start > 0 && start != str.length() && str.charAt(start - 1) == str.charAt(start))
			str.delete(start - 1, start + 1);
	}
}
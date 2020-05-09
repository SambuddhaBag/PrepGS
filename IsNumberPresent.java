package com.dsprep.two;

public class IsNumberPresent {
	
	public static void isNuberPresent(String str) {
		
		boolean flag = false;
		String newStr = null;
		
		for (Character element : str.toCharArray()) {
			

			
			if(Character.isDigit(element)) {
				flag = true;
				String st = Integer.toBinaryString(Character.getNumericValue(element));
				if(newStr == null)
					newStr = st;
				else
					newStr += st;
			}
			else {
				if(newStr == null)
					newStr = element.toString();
				else
					newStr += element.toString();
			}
			
		}
		if(!flag)
			System.out.println("no digit found");
		else 
			System.out.println(newStr);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "sam";
		isNuberPresent(st);

	}

}

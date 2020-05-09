package com.dsprep.two;

import java.util.Stack;

import javax.crypto.spec.PSource.PSpecified;

public class RevStrWithoutSpcialChar {
	
	 public static String reverseWithoutSpclChar(String str){
		    
		    Character[] specialChar = new Character[str.length()];
		    Stack<Character> stk = new Stack<Character>();
		    int count = 0;
		    String rev = null;
		    String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}" ;
		    
		    for(int i = 0; i< specialChar.length; i++){
		      
		      specialChar[i] = Character.MIN_VALUE;
		      
		    }
		    
		    for(int i = 0; i < str.length(); i++){
		      
		      char chk = str.charAt(i);
		      
		      if(!specialCharacters.contains(Character.toString(chk))){
		        
		        stk.push(str.charAt(i));
		      
		      }
		      else{
		        
		        specialChar[i] = str.charAt(i);
		        stk.push(Character.MAX_VALUE);
		        
		      }
		    
		    }
		    
		    while(!stk.isEmpty() && count < str.length()){
		      
		      Character popped = stk.pop();
		      
		      if(specialChar[count] != Character.MIN_VALUE){
		        if(rev == null)
		          rev = specialChar[count].toString();
		        else
		          rev += specialChar[count].toString();
		        
		      }
		      
		      if(popped != Character.MAX_VALUE){
		        
		        if(rev == null)
		          rev = popped.toString();
		        else 
		          rev += popped.toString();
		      
		      }
		      count ++;
		    
		    
		    }
		    
		    
		    return rev;
		  
		      
		  }
		  public static void main(String[] args) {
		    
		    String st = "!ambu@hha";
		    
		    System.out.print(reverseWithoutSpclChar(st));
		    
		    

		  }
	

}

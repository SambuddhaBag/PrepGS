package com.dsprep;

import java.util.Stack;

public class ReverseString {
	
	
	public void reverseString(String str){
	      
		
		  if(str == null) {
			  
			  throw new IllegalArgumentException("String is NULL");
			  
		  }
	      Stack<String> stk = new Stack<String>();
	      
	      String temp = String.valueOf(' ');
	      
	      if(!str.isEmpty()) {
	      for(int i = 0; i < str.length(); i++){
	        
	        if(str.charAt(i) == ' '){
	          if(temp.equals(null)){
	            i++;
	            stk.push(" ");
	          }
	          else{
	            stk.push(temp);
	            stk.push(" ");
	            temp = String.valueOf(' ');
	          }
	          
	        }
	         else if(i < str.length()){
	           
	           if(temp.equals(String.valueOf(' ')))
	             temp = String.valueOf(str.charAt(i));
	           else
	             temp = temp + String.valueOf(str.charAt(i));
	           
	         }
	      
	      
	      }
	      
	      
	      stk.push(temp);
	      
	      while(!stk.isEmpty()){
	      
	        System.out.print(stk.pop());
	      
	      }
	      }
	      else{
	          System.out.print("No Proper string input. String passed is null or         empty");
	        }
	      
	    }
	    

}

package com.dsprep.two;
import java.io.*;
import java.util.*;

import javax.swing.text.StyleContext.SmallAttributeSet;

/*
* Find highest average in 2d array of students scores
*
* Example 1.
* String[][] arr = {
* {"Bobby","87";},
* {Charles,100;},
* {Eric;65},
* {Charles,22},
* {Charles,37},
* {Eric,49}
* }
* If students names are repeated multiple times,
* then find the average score for the student and do Math.floor if
necessary.
*
* So, Charles average score would be Math.floor((100+22+37)/3) = 53 And,
* for Eric it would be Math.floor((65+49)/2) = 57.
*
* So highest average would be [Bobby,87].
*
* --------------------------------------------------
*
* Example 2
* String[][] arr = {
* {Charles,87},
* {Bobby,87}
* }
* Highest average should be [Bobby,87],[Charles,87], which is
ordered by name
*
* --------------------------------------------------------
* Note: Should handle EMPTY, WHITESPACE &amp; NULL values.
*/

class Solution {
  public static void main(String[] args) {
   String[][] arr = {
          {"Bobby","87"},
          {"Aharles","100"},
          {"Eric","65"},
          {"Aharles","74"},
          {"Eric","49"}
          };
    String highest=getMaxAverageOfStudents(arr);
    System.out.println(highest);

  }
  
	
	  public static String getMaxAverageOfStudents(String[][] students){
		  
		  String nameOfStud = null;
		  int maxAvg = 0;
		  
		  Map<String, Integer[][]> studMap = new HashMap<String, Integer[][]>();
		  
		  for(int i = 0; i< students.length; i++) {
			  
			  String name = students[i][0];
			  String score = students[i][1];
			  
			  if(studMap.containsKey(name)) {
				  
				  Integer[][] result = studMap.get(name);
				  result[0][0] += Integer.parseInt(score);
				  result[0][1] += 1;
				  
				  
				  
			  }
			  else {
				  
				  Integer[][] result = {{Integer.parseInt(score),1}};
				  
				  studMap.put(name, result);
				  
			  }
			  
		  }
		  
		  for(Map.Entry<String, Integer[][]> sMap : studMap.entrySet()) {
			  
			  Integer[][] result = sMap.getValue();
			  int avg = result[0][0] / result[0][1];
			  
			  if(avg > maxAvg) {
				  nameOfStud = sMap.getKey();
				  maxAvg = avg;
			  }else if(avg == maxAvg && nameOfStud.compareToIgnoreCase(sMap.getKey()) >0 ) {
				  
				  nameOfStud = sMap.getKey();
				  
			  }
			  
		  }
		  
		  return nameOfStud + " " + maxAvg;
		  
	  }
	 
}
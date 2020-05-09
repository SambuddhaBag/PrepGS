package com.dsprep;

import java.util.LinkedList;
import java.util.List;

public class Election {
	
	static int indic = 1;
	
	public void electPresident(int[] arr, int period) {
		
		int length = arr.length;
		
		while(length > 1) {
			
			List<Integer> tempList = new LinkedList<Integer>();
			
			for(int i = 0; i < arr.length; i++) {
				
				if(indic != period) {
					tempList.add(arr[i]);
					indic++;
				}
				indic = 1;
				
			}
			
			int[] newArr = new int[tempList.size()];
			
			for (int i =0; i < tempList.size(); i++) {
				newArr[i] = tempList.get(i);
				
			}
			
			length ++;
			indic ++;
			
			
			
		}
		
	}

}

package com.dsprep.two;

import java.util.HashMap;
import java.util.Map;

public class SingleOcc {
	
	public static int singOcc(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		if(arr.length >= 0) {
		for(int i =0; i< arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1 );
			}else {
				map.putIfAbsent(arr[i], 1);
			}
			
		}
		
		for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
			
			if(mp.getValue() == 1)
				return mp.getKey();
			
		}
		
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = {2,2,1};
		int[] arr2 = {4,1,2,1,2};
		
		System.out.println(singOcc(arr1));
		System.out.println(singOcc(arr2));
		
	}

}

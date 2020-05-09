package com.dsprep.two;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tsream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(10);
		hset.add(30);
		hset.add(20);
		hset.add(40);
		
		Iterator<Integer> itr = hset.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		

	}

}

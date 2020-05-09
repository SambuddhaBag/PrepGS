package com.dsprep;

import java.util.LinkedList;
import java.util.Queue;

/*Question of the day :

Given a number N , Print first N numbers ( in increasing order ) such that all these numbers have digits in the set  {5,6}

Example :  
I/P : N = 10
O/P :  5, 6, 55, 56, 65 , 66 , 555 , 556 , 565 , 566*/

public class SetiFy {

	public void makeSet(int n, String key1, String key2) {
		
		Queue<String> pri = new LinkedList<String>();
		pri.add(key1);
		pri.add(key2);
		
		for(int i = 0; i< n; i++) {
			
			String elem = pri.poll();
			System.out.print(elem + ", ");
			pri.add(elem+key1);
			pri.add(elem+key2);
			
		}
		
		
		
	}
	
}

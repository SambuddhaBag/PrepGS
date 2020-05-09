package com.dsprep;

public class SquareRoot {
	
	public int sqRoot(int key) {
		
		int  mid = key/2;
		int piv;
		
		if(mid*mid == key) {
			return mid;
		}
		if(mid*mid > key) {
			
			piv = (1 + mid )/2;
			
			if(piv*piv == key)
				return piv;
			
			while(piv * piv > key) {
				
				mid = piv;
				piv = (1+piv)/2;
				
			}
			
			for(int i = piv; i <= mid; i++) {
				
				if(i * i < key && (i+1)*(i+1) > key) {
					
					return i;
					
				}
				
			}
			
		}
		
		
		return -1;
		
		
	}

}

package com.dsprep.two;

@FunctionalInterface
interface MaxTrpWtr{
	public int wtrTrp(int[] arr);
}

public class MaxWaterTrap {
	
	public static void main(String[] args) {
		
		int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		MaxTrpWtr mtw = (val) -> {
			int water = 0;
			int left =0;
			int right = val.length - 1;
			int max_left = 0;
			int max_right = 0;
			
			while(left < right) {
				
				if(val[left] > val[right]) {
					
					if(val[right] > max_right) 
						max_right = val[right];	
					else
						water += max_right - val[right];
					
					right --;
					
				}else {
					
					if(val[left] > max_left) 
						max_left = val[left];	
					else
						water += max_left - val[left];
					
					left ++;
				}
				
			}
			
			return water ;
		};
		
		System.out.println("Total trapped water is = "+ mtw.wtrTrp(array));
		
	}
	
	

}

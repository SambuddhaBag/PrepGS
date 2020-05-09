package com.dsprep.two;

@FunctionalInterface
interface Interf{
	public void maxSum(int[] array);
}

public class MaxSumSubArrayoOrKeadneAlgo {
	
	public static void main(String[] args) {
		
		Interf intf = (array) ->{
			
			int maxSum = 0;
			int maxEndValue = 0;
			
			for (int i =0; i< array.length; i++) {
				
				maxEndValue += array[i];
				
				if(maxEndValue < 0)
					maxEndValue = 0;
				if(maxEndValue > maxSum)
					maxSum = maxEndValue;
					
			}
			System.out.println("Maximum Sum: "+ maxSum);
			
		};
		
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		intf.maxSum(arr );
		
		
	}

}

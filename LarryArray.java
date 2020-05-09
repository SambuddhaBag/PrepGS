package com.dsprep.two;

public class LarryArray {
	
	static boolean solve(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int index = find(A, i + 1);

			while (index >= i + 2) {
				A[index] = A[index - 1];
				A[index - 1] = A[index - 2];
				A[index - 2] = i + 1;

				index -= 2;
			}

			if (index == i + 1) {
				if (index == A.length - 1) {
					return false;
				}

				A[index] = A[index + 1];
				A[index + 1] = A[index - 1];
				A[index - 1] = i + 1;
			}
		}
		return true;
	}

	static int find(int[] a, int target) {
		for (int i = 0;; i++) {
			if (a[i] == target) {
				return i;
			}
		}
	}
	
	
	public static void main(String[]args) {
		
		int[] a = {1,6,5,2,4,3};
		System.out.println(solve(a) ? "Yes" : "No");
		
		
	}

}

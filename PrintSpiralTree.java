package com.dsprep;

import java.util.Stack;

public class PrintSpiralTree {
	
	static Stack<Node> stL = new Stack<Node>();
	static Stack<Node> stR = new Stack<Node>();
	static boolean flag;
	
	public static void spiralTree(Node root) {
		

		
		stL.add(root);
		flag = true;
		
		if(root != null) {

			while(!stL.empty() || !stR.empty()) {
				
				if(flag) {
					
					while(!stL.empty()) {
						
						Node out = stL.pop();
						System.out.print(out.data+" ");
						
						if(out.left != null || out.right != null) {
						stR.add(out.left);
						stR.add(out.right);
						}
						
						
					}
					
					System.out.println();
					flag = false;
					
				}else {
					
						
					
					while(!stR.empty()) {
						
						Node out = stR.pop();
						System.out.print(out.data+" ");
						
						if(out.left != null || out.right != null) {
						stL.add(out.right);
						stL.add(out.left);
						}
						
					}
					System.out.println();
					flag = true;
					
					
					
				}
				
			
				
			}
			
		
		}
		
	}

}

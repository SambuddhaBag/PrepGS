package com.dsprep;

public class PostOrder {
	
	public static void postOrder(Node root) {
		
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+"->");
			
		}
		
	}

}

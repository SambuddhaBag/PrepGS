package com.dsprep;

import java.util.LinkedList;
import java.util.Queue;

public class BFSearch {
	public static void bfSearch(Node root) {
		if(root != null) {
			Queue<Node> que = new LinkedList<Node>();
			que.add(root);
			while(!que.isEmpty()) {
				
				Node out = que.poll();
				System.out.print(out.data + " ");
				
			
				if(out.left != null) {
					que.add(out.left);
				}
				if(out.right != null) {
					que.add(out.right);
				}
				
			}
			
		}
		
	}
}

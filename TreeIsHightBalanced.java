package com.dsprep;

public class TreeIsHightBalanced {
	
	int height(Node node) 
    { 
        //Base case
        if (node == null) 
            return 0; 
        //Height of left, right recursive
        return 1 + Math.max(height(node.left), height(node.right)); 
    } 
	
	boolean isBalanced(Node node) 
    { 
        int lefth; //for height of left subtree 
  
        int righth; // for height of right subtree 
  
        // If tree is empty then return true
        if (node == null) 
            return true; 
  
        // height of left and right sub trees
        lefth = height(node.left); 
        righth = height(node.right); 
  
        if (Math.abs(lefth - righth) <= 1
            && isBalanced(node.left) 
            && isBalanced(node.right)) 
            return true; 
  
        return false; 
    } 

}

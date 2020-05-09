package com.dsprep.two;

import java.util.Comparator;
import java.util.PriorityQueue;

class Node { 
    int data; 
    Node next; 
    Node(int data) 
    { 
        this.data = data; 
        next = null; 
    } 
} 

public class MergeKsortedList {
	
	public static Node mergeKSortedLists(Node arr[], int k) 
    { 
        Node head = null, last = null; 
  
        // priority_queue 'pq' implemeted as min heap with the 
        // help of 'compare' function 
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() { 
            public int compare(Node a, Node b) 
            { 
                return a.data - b.data; 
            } 
        }); 
  
        // push the head nodes of all the k lists in 'pq' 
        for (int i = 0; i < k; i++) 
            if (arr[i] != null) 
                pq.add(arr[i]); 
  
        // loop till 'pq' is not empty 
        while (!pq.isEmpty()) { 
            // get the top element of 'pq' 
            Node top = pq.peek(); 
            pq.remove(); 
  
            // check if there is a node next to the 'top' node 
            // in the list of which 'top' node is a member 
            if (top.next != null) 
                // push the next node in 'pq' 
                pq.add(top.next); 
  
            // if final merged list is empty 
            if (head == null) { 
                head = top; 
                // points to the last node so far of 
                // the final merged list 
                last = top; 
            } 
            else { 
                // insert 'top' at the end of the merged list so far 
                last.next = top; 
                // update the 'last' pointer 
                last = top; 
            } 
        } 
        // head node of the required merged list 
        return head; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

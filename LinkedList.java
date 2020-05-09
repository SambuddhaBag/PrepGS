package com.dsprep;

public class LinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		//Constructor
		Node(int d){
			
			this.data = d;
			next = null;
			
		}
	}
	
	public LinkedList insert(int d) {
		Node newNode = new Node(d);
		
		//Add new new node if head is null
		
		if(this.head == null) {
			
			this.head = newNode;
			
		}
		else {
			
			Node last = this.head;
			while(last.next != null) {
				
				last = last.next;
				
			}
			last.next = newNode;
		}
		
		return this;
	}
	
	
	public void printList() {
		
		Node curNode = this.head;
		
		System.out.println("Linked List: ");
		
		while(curNode.next != null) {
			
			System.out.print(curNode.data + ", ");
			
		}
		
	}
	

}

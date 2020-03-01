package com.DataStructures;

public class LinkedList {

	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void showLinkedList() {
		Node printNode = head;
		do {
			System.out.println(printNode.data);
			printNode = printNode.next;
		} while (printNode.next != null);

		System.out.println(printNode.data);

	}

	public void reverseLL() {
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current != null) {
			next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
		}
		head = prev;
	}
	
	public void ispalindrome() {
		
	}
	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		ls.insert(11);
		ls.insert(21);
		ls.insert(13);
		ls.insert(17);
		ls.insert(19);
		ls.showLinkedList();
		ls.reverseLL();
		System.out.println("****************");
		ls.showLinkedList();
		
	}

}

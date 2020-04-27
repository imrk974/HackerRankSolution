package com.RandomInterview.Test;

import com.DataStructures.Node;

class LinkNode {

	String data;
	LinkNode next;
}

class Link {
	LinkNode head;
	String data;

	public void insert(String data) {

		LinkNode node = new LinkNode();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			LinkNode n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void showLinkedList() {
		LinkNode printNode = head;
		do {
			System.out.print(printNode.data + " --> ");
			printNode = printNode.next;
		} while (printNode.next != null);

		System.out.print(printNode.data);

	}

}

public class ReverseLinkedList {

	public LinkNode reverseList(LinkNode list) {
		LinkNode prev = null;
		LinkNode current = list;
		while(current.next != null && current != null) {
			current = prev;
			current.next = current;
			
		}
		
		return prev;
	}

	public static void main(String[] args) {

		Link link = new Link();
		link.insert("A");
		link.insert("P");
		link.insert("P");
		link.insert("D");
		System.out.println("Original Linkedlist");
		link.showLinkedList();
		System.out.println("Reverse LinkedList");
		ReverseLinkedList reverse = new ReverseLinkedList();
	//	reverse.reverseList(link);
		
		

	}

}

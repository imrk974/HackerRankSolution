package com.DataStructures;

class NodeS {
	String data;
	NodeS next;
}


public class LinkedListPalindrome {
	NodeS head;
	public void insert(String data) {
		
		NodeS node = new NodeS();
		node.data = data;
		node.next = null;
		
		if (head == null) {
			head = node;
		} else {
			NodeS n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public NodeS reverseLL (NodeS node) {
		NodeS current = node;
		NodeS prev = null;
		NodeS next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = current;
		return node;
	}
	
	public void showLL (NodeS noden) {
		NodeS node = noden;
		do {
			System.out.println(node.data);
			node = node.next;
		} while (node.next != null);
		
		System.out.println(node.data);
	}
	
	
	public static void main(String[] args) {
		
		LinkedListPalindrome lsp = new LinkedListPalindrome();
		lsp.insert("S");
		lsp.insert("A");
		lsp.insert("T");
		lsp.showLL(lsp.head);
		lsp.reverseLL(lsp.head);
		lsp.showLL(lsp.reverseLL(lsp.head));
		

	}

}

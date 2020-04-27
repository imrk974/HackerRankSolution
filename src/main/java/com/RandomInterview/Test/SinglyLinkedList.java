package com.RandomInterview.Test;

class Node {
	int val;
	Node next;

	public Node(int val) {
		this.val = val;
	}

}

public class SinglyLinkedList {

	public int reverseNum(int num) {

		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}

		return reverse;
	}

	public Node addtwoReverseList(Node node1, Node node2) {
		Node dummy = new Node(0);
		Node head = dummy;
		int carry = 0;
		while (node1 != null || node2 != null) {
			int node1_val = (node1 != null) ? node1.val : 0;
			int node2_val = (node2 != null) ? node2.val : 0;

			int curr_sum = node1_val + node2_val + carry;
			carry = curr_sum / 10;
			int last_digit = curr_sum % 10;
			
			Node node3 = new Node(last_digit);
			head.next = node3;
			
			node1 = node1.next;
			node2 = node2.next;
			head = head.next;
		}
		
		if (carry > 0) {
			Node node3 = new Node(carry);
			head.next = node3;
			head = head.next;
		}
		Node prev = null;
		while (dummy.next != null) {
			prev = dummy;
			dummy.next = dummy;
			dummy = dummy.next;
			
		}
		
		return prev.next;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		node1.next = new Node(4);
		node1.next.next = new Node(3);

		Node node2 = new Node(1);
		node2.next = new Node(4);
		node2.next.next = new Node(3);

		SinglyLinkedList list = new SinglyLinkedList();
		Node res = list.addtwoReverseList(node1, node2);
		while (res != null) {
			System.out.print(res.val + " --> ");
			res = res.next;
		}
	}

}

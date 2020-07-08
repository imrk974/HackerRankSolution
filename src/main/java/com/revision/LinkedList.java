package com.revision;

import java.util.Stack;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

}

public class LinkedList {
	
	public static boolean isPalindrome(Node head) {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast != null && fast.next == null) {
			slow = slow.next;
		}

		Stack<Integer> stack = new Stack<Integer>();
		while (slow != null) {
			stack.add(slow.data);
			slow = slow.next;
		}
		fast = head;
		while (!stack.isEmpty()) {
			int pop = stack.pop().intValue();
			if (fast.data != pop) {
				return false;
			}
			fast = fast.next;
		}

		return true;
	}

	public static void reverseLinkedList(Node head) {

		Node prev = null;
		Node curr = head;

		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		while (prev != null) {
			System.out.println(prev.data);
			prev = prev.next;
		}

	}

	public static Node mergeSortedLinkedList(Node l1, Node l2) {
		Node temp = new Node(0);
		Node head = temp;
		while (l1 != null && l2 != null) {
			if (l1.data <= l2.data) {
				head.next = l1;
				l1 = l1.next;
			} else if (l1.data > l2.data) {
				head.next = l2;
				l2 = l2.next;
			}
			head = head.next;
		}

		if (l1 != null && l2 == null) {
			head.next = l1;
			l1 = l1.next;
		}
		if (l1 == null && l2 != null) {
			head.next = l2;
			l2 = l2.next;
		}

		return temp.next;

	}

	public static int mergePointOfLinkedList(Node l1, Node l2) {

		Node temp = l2;

		while (l1 != null) {
			l2 = temp;
			while (l2 != null) {
				if (l1 == l2) {
					return l1.data;
				}
				l2 = l2.next;
			}
			l1 = l1.next;
		}

		return -1;
	}

	public static int mergePointOfLinkedListOpt(Node headA, Node headB) {
		
		while (headA == null || headB == null) {
            return -1;
        }
        Node a_runner = headA;
        Node b_runner = headB;
        
        while (a_runner != b_runner) {
            //System.out.println(a_runner.data + " " + b_runner.data);
            if(a_runner == null) {
                a_runner = headB;
            } else {
                a_runner = a_runner.next;
            }
            if (b_runner == null) {
                b_runner = headA;
            } else {
                b_runner = b_runner.next;
            }
        }
		
		return a_runner.data;
	}
	
	/*
	 * 8
[4,1,8,4,5]
[5,0,1,8,4,5]
2
3
	 */

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(6);
		head.next.next.next = new Node(8);

		Node head2 = new Node(2);
		head2.next = new Node(4);
		head2.next.next = new Node(5);
		head2.next.next.next = head.next.next;

		// head.next.next.next = new Node(2);
		// head.next = new Node(2);

		// Node res = mergeSortedLinkedList(head, head2);
		//
		// while (res != null) {
		// System.out.println(res.data);
		// res = res.next;
		// }

		int res = mergePointOfLinkedList(head, head2);

		System.out.println(res);
	}

}

/*
 * You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

 */

package com.RandomInterview.Test;

public class AddtwoNums {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp = new ListNode(0);
		ListNode node = temp;
		int carry = 0;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			int last_digit = sum % 10;
			carry = sum / 10;
			ListNode tempNode = new ListNode(last_digit);
			node.next = tempNode;
			node = node.next;
			l1 = l1.next;
			l2 = l2.next;
		}

		return temp.next;
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		AddtwoNums add = new AddtwoNums();
		ListNode sum = add.addTwoNumbers(l1, l2);

		while (sum != null) {
			System.out.print(sum.val);
			sum = sum.next;
		}

	}

}

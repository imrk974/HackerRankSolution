package com.RandomInterview.Test;

public class Dunzo2_InsertLinkedList {

	public static ListNode insertANotherListAtSpecifiedPosition(ListNode list1, ListNode list2, int a, int b) {
		if (a < b) {

			int fi = 1;
			int si = 0;
			ListNode leftNode = list1;
			ListNode rightNode = list1;
			ListNode temp = list2;
			while (si++ < b) {
				rightNode = rightNode.next;
			}

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = rightNode;

			while (++fi < a) {
				leftNode = leftNode.next;
			}
			leftNode.next = list2;
			return list1;
		} else {
			System.out.println("\n\nERROR : FirstIndex value cant be smaller then second index.");
			return null;
		}

		

	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		list1.next.next.next.next = new ListNode(5);

		ListNode temp1 = list1;
		System.out.println("Size of List one is : " + temp1.size(temp1));
		System.out.println("FirstList contains");
		while (temp1 != null) {
			System.out.print(temp1.val + " --> ");
			temp1 = temp1.next;
		}
		ListNode list2 = new ListNode(6);
		list2.next = new ListNode(7);
		list2.next.next = new ListNode(8);
		list2.next.next.next = new ListNode(9);

		ListNode temp2 = list2;
		System.out.println("\n\nSize of List two is : " + temp2.size(temp2));
		System.out.println("SecondList contains");
		while (temp2 != null) {
			System.out.print(temp2.val + " --> ");
			temp2 = temp2.next;
		}

		ListNode res = insertANotherListAtSpecifiedPosition(list1, list2, 2, 3);
		System.out.println("\n\nFinalList Contains");
		while (res != null) {
			System.out.print(res.val + " --> ");
			res = res.next;

		}

	}

}

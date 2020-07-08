package com.RandomInterview.Test;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
	int count = 0;
	public int size(ListNode node) {
		while (node != null) {
			node = node.next;
			count++;
		}
		return count;
	}
	
	@Override
	public String toString() {
		return "ListNode [val=" + val + "]";
	}
	
	
}

public class MergetwosortedList {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		ListNode temp = new ListNode(0);
		ListNode merged = temp;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				merged.next = l1;
				l1 = l1.next;
			} else if (l1.val > l2.val) {
				merged.next = l2;
				l2 = l2.next;
			}
			merged = merged.next;
		}
		if (l1 == null && l2 != null) {
			merged.next = l2;
			l2 = l2.next;
		} else if (l1 != null && l2 == null) {
			merged.next = l1;
			l1 = l1.next;

		}
		return temp.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);

		ListNode firstList = l1;
		System.out.println("List one is :\n");
		while (l1 != null) {
			System.out.print(l1.val + " --> ");
			l1 = l1.next;
		}

		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(7);
		l2.next.next = new ListNode(8);
		l2.next.next.next = new ListNode(9);

		ListNode secondList = l2;
		System.out.println("\n\nList two is :\n");
		while (l2 != null) {
			System.out.print(l2.val + " --> ");
			l2 = l2.next;
		}

		MergetwosortedList merge = new MergetwosortedList();
		ListNode finalNode = merge.mergeTwoLists(firstList, secondList);

		System.out.println("\n\nMerged List is :\n");
		while (finalNode != null) {
			System.out.print(finalNode.val + " --> ");
			finalNode = finalNode.next;
		}
	}

}

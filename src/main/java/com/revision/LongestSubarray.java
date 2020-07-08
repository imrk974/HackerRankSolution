package com.revision;

import java.util.ArrayList;
import java.util.List;

/*
 * This problem was asked by Google.

Given an array of elements, return the length of the longest subarray where all its elements are distinct.

For example, given the array [5, 1, 3, 5, 2, 3, 4, 1], return 5 as the longest subarray of distinct elements is [5, 2, 3, 4, 1].
 */
public class LongestSubarray {

	public static List<Integer> longestSubArr(int[] ar) {
		List<List<Integer>> subArrList = new ArrayList<List<Integer>>();

		int index = 0;

		while (index <= ar.length) {
			int pointer = index;
			List<Integer> list = new ArrayList<Integer>();
			while (pointer < ar.length) {
				if (!list.contains(ar[pointer])) {
					list.add(ar[pointer]);
				} else {
					break;
				}
				pointer++;
			}
			subArrList.add(list);
			index++;
		}
		List<Integer> largest = new ArrayList<Integer>();
		largest = subArrList.get(0);
		for (int i = 1; i < subArrList.size(); i++) {
			if (largest.size() < subArrList.get(i).size()) {
				largest = subArrList.get(i);
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int[] ar = new int[] { 5, 1, 3, 8, 4, 2, 5, 2, 3, 4, 1 };
		System.out.println(longestSubArr(ar));

	}

}

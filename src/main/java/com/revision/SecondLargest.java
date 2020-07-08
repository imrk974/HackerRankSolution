package com.revision;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {

	public static int findSecondLargest(List<Integer> list) {
		int max = 0;
		int secondMax = 0;

		for (int i = 0; i < list.size() - 1; i++) {
			max = Math.max(max, list.get(i));
			secondMax = Math.max(secondMax, list.get(i + 1));

			if (max < secondMax) {
				int temp = max;
				max = secondMax;
				secondMax = temp;
			}
		}

		return secondMax;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(71);
		list.add(17);
		list.add(8);
		list.add(23);
		list.add(79);
		System.out.println(findSecondLargest(list));
	}

}

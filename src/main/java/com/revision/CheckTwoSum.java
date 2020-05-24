package com.revision;

import java.util.ArrayList;
import java.util.List;

public class CheckTwoSum {

	// add all the elements in a list and check if the req num - the picked num
	// exist in list
	public static boolean checSum(int[] ar, int num) {
		List<Integer> list = new ArrayList<Integer>();

		for (int a : ar) {
			list.add(a);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.contains(num - list.get(i))) {
				return true;
			}
		}

		return false;
	}

	// second approach

	public static boolean checksumofTwo(int[] ar, int num) {

		for (int i = 0; i < ar.length -1; i++) {
			int reqNum = num - ar[i];
			int j = i+1;
			while ( j < ar.length) {
				if(reqNum == ar[j]) {
					return true;
				}
				j++;
			}
			
		}

		return false;
	}

	public static void main(String[] args) {
		int[] ar = { 4, 5, 7, 1, 9 };
		System.out.println(checksumofTwo(ar, 14));

	}

}

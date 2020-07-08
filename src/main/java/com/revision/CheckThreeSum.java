package com.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckThreeSum {

	public static boolean checksumofThree(int[] ar, int num) {
		int fp = 0;
		int sp = 1;

		while (fp < ar.length - 1) {
			while (sp < ar.length) {
				List<Integer> list = new ArrayList<Integer>();
				for (int i = 0; i < ar.length; i++) {
					if (i != fp || i != sp) {
						list.add(ar[i]);
					}
				}

				if (list.contains(num - (ar[fp] + ar[sp]))) {
					return true;
				}
				sp++;
			}
			fp++;
		}

		return false;
	}

	public static boolean checksumofThreeVal(int[] ar, int sum) {
		int fp = 0;
		int sp = 1;
		int tp = 2;

		for (int i = 0; i < ar.length - 2; i++) {
			int remSum = sum - ar[fp];
			while (sp < ar.length - 1) {
				while (tp < ar.length) {
					if (ar[sp] + ar[tp] == remSum) {
						return true;
					} else {
						tp++;
					}
				}
				sp++;
			}
			fp++;
		}

		return false;
	}

	// 1,4,5,7,9

	// return List of all the combination of triplets which sums is equal to a
	// given num
	public static List<List<Integer>> printCombofTriplets(int[] ar, int sum) {
		Arrays.sort(ar);
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		for (int i = 0; i < ar.length - 1; i++) {
			int low = i + 1;
			int high = ar.length - 1;
			int comp = sum - ar[i];
			while (low < high) {
				if (ar[low] + ar[high] == comp) {
					finalList.add(Arrays.asList(ar[i], ar[low], ar[high]));
					while (low < high && ar[low] + ar[high] > comp)
						high--;
					while (low < high && ar[low] + ar[high] < comp)
						low++;
					low++;
					high--;
				} else if (ar[low] + ar[high] > comp) {
					high--;
				} else {
					low++;
				}
			}

		}

		return finalList;
	}

	//using sorting 
	public static boolean CheckSumOfTriplets(int[] ar, int sum) {
		Arrays.sort(ar);
		for (int i=0; i < ar.length-1; i++) {
			int low = i+1;
			int high = ar.length-1;
			int comp = sum - ar[i];
			while (low < high) {
				if(ar[low] + ar[high] == comp) {
					return true;
				} else if (ar[low] + ar[high] > comp) {
					high--;
				} else {
					low++;
				}
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) throws IllegalAccessException {
		int[] ar = { 4, 5, 7, 1, 9, 2, 3 };
		System.out.println((CheckSumOfTriplets(ar, 101)));

	}

}

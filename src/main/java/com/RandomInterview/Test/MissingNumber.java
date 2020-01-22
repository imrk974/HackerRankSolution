package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void printMissingNumberBetween(int range, int[] arr) {
		List<Integer> l = new ArrayList<Integer>();

		for (int i = 1; i <= range; i++) {
			l.add(i);
		}

		for (int i = 0; i < arr.length; i++) {
			l.remove(new Integer(arr[i]));
		}

		System.out.println(l);
	}

	
	
	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 12 };
		printMissingNumberBetween(20, arr);

	}

}

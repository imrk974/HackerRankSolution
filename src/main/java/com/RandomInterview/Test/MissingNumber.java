package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 12 };

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 1; i <= 20; i++) {
			for(int j=0; j < arr.length;j++) {
				if(i!=arr[j]) {
					l.add(i);
				}
			}
		}
		System.out.println(l);
		
		for (int i = 0; i < arr.length-1; i++) {
			l.remove(arr[i]);
			}

		System.out.println(l);
	}

}

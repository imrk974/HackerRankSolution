package com.HackerRank.Solution;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

	
	static int numCount(int[] a, int[] b) {
		List<Integer> al = new ArrayList<Integer>();
		int factOf = a[0];
		int factor = 1;
		int count = 2;
		int finalcount = 0;
		factor = factOf*count;
		boolean isfactor =true;
		while(isfactor) {
			if (b[b.length-1]%factor == 0) {
                al.add(factor);
            } else {
            	isfactor = false;
            }
			count++;
            factor = factOf*count;
		}
		boolean factorStatus = true;
		
		for (int i =0; i < al.size(); i++) {
			for (int j=0; j < b.length; j++) {
				if (!(b[j] % al.get(i) == 0)) {
					factorStatus = false;
					break;
				}
			}
			
			if(factorStatus) {
				finalcount++;
			}
			factorStatus = true;
		}
		return finalcount;
	}
	
	public static void main(String[] args) {
		int[] a = {3,4};
		int[] b = {24,48};
		System.out.println(numCount(a, b));

	}

}

package com.coursera;

public class Twooccurence {

	public static boolean twoOccurrences(String a, String b) {
		int count = 0;
		int pos = 0;
		do {
			pos = b.indexOf(a, pos) + 1;
			if(pos != 0) {
				count++;
			}
			
		} while (pos != 0);

		if (count >= 2) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(twoOccurrences("by", "A story by Abby Long"));
		System.out.println(twoOccurrences("a", "banana"));
		System.out.println(twoOccurrences("atg", "ctgtatgta"));
	}
}

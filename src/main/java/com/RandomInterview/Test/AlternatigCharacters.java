package com.RandomInterview.Test;

/*
 * You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.

For example, given the string , remove an  at positions  and  to make  in  deletions.

Function Description

Complete the alternatingCharacters function in the editor below. It must return an integer representing the minimum number of deletions to make the alternating string.

alternatingCharacters has the following parameter(s):

s: a string
Input Format

The first line contains an integer , the number of queries.
The next  lines each contain a string .

Constraints

Each string  will consist only of characters  and 
Output Format

For each query, print the minimum number of deletions required on a new line.
 */

public class AlternatigCharacters {

	static int alternatingCharacters(String s) {
		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				s = s.substring(0, i) + s.substring(i + 1, s.length());
				System.out.println(s);
				i--;
			}
		}
		return count;
	}

	static int altchars(String s) {
		int res = 0;
		int lp = 0, rp = 1;

		while (lp < s.length() && rp < s.length()) {
			if (s.charAt(lp) == s.charAt(rp)) {
				lp = rp;
				rp++;
				res++;
			} else {
				lp++;
				rp++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAAAbcdd"));
	}

}

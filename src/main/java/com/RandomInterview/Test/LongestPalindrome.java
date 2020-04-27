package com.RandomInterview.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

	public static boolean ispalindrome(String s) {

		int lp = 0, rp = s.length() - 1;

		while (lp < rp) {

			if (s.charAt(lp) != s.charAt(rp)) {
				return false;
			}
			lp++;
			rp--;
		}
		return true;
	}

	public static String longestString(String s) {
		int lp = 0, rp = 1;
	//	Set<String> set = new HashSet<String>();
		String largestPalindrome = "";

		while (lp < s.length()) {
			String subs = "";
			while (rp <= s.length()) {
				
			//		set.add(s.substring(lp, rp));
					if(ispalindrome(s.substring(lp,rp))) {
						if(largestPalindrome.length() < s.substring(lp,rp).length()) {
							largestPalindrome = s.substring(lp,rp);
						}
						
						//largestPalindrome =  Math.max(largestPalindrome.length(), s.substring(lp,rp));						
					}
				
				rp++;
			}
			lp++;
			rp = lp + 1;
		}
		
//		System.out.println(set);
		return largestPalindrome;
	}

	public static void main(String[] args) {
		System.out.println(longestString("rfkqyuqfjkxy"));

	}

}

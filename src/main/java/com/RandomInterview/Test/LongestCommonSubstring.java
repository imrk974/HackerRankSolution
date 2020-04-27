package com.RandomInterview.Test;

public class LongestCommonSubstring {

	public static String commonString(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return "";
		}
		String subs="";
		int[][] arr = new int[s1.length()][s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					if (i > 0 && j > 0) {
						arr[i][j] = arr[i - 1][j - 1] + 1;
					} else {
						arr[i][j] = 1;
					}
					
					if(arr[i][j] > subs.length()) {
						subs = s1.substring(i-arr[i][j]+1, i+1);
					}
				}
			}
		}
		
		return subs;
	}

	public static void main(String[] args) {
		System.out.println(commonString("ababcdfg", "babacd"));

	}

}

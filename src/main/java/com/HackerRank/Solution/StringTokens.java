package com.HackerRank.Solution;

public class StringTokens {

	public static void tokenize(String s) {
		s = s.trim();
		String[] sar = null;
		if (s.length() > 0) {
			sar = s.trim().split("[ !,?\\._'@]+",0);
			System.out.println(sar.length);
			for (String words : sar) {
				System.out.println(words);
			}
		} else {
			System.out.println(0);
		}
		System.out.println("apple".compareTo("banana"));
	}
	

	public static void main(String[] args) {
		tokenize("                        ");

	}

}
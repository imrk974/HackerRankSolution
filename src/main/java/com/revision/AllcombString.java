package com.revision;

import java.util.ArrayList;
import java.util.List;

public class AllcombString {

	public void combination(String full) {
		List<String> list = new ArrayList<String>();
		list = permutation("", full, list);
		System.out.println(list);
	}

	public List<String> permutation(String prefix, String rem, List<String> list) {

		if (rem.length() == 0) {
			list.add(prefix);
		}

		for (int i = 0; i < rem.length(); i++) {
			list = permutation(prefix + rem.charAt(i), rem.substring(0, i) + rem.substring(i + 1, rem.length()), list);
		}

		return list;
	}
	List<String> list = new ArrayList<String>();
	public void printPattern(String s, char[] buf, int i, int j, int n) {
		
		if(i == n) {
			buf[j] = '\0';
			String t = new String(buf);
			list.add(t.trim());
			System.out.print(buf);
			System.out.print(", ");
			return;
		}
		buf[j] = s.charAt(i); 
		printPattern(s, buf, i+1, j+1, n);
		buf[j] = '_';
		buf[j+1] = s.charAt(i);
		
		printPattern(s, buf, i+1, j+2, n);
	}
	
	public void appendUnderscore(String s) {
		int len = s.length();
		char[] buf = new char[2*len];
		buf[0] = s.charAt(0);
		printPattern(s, buf, 1, 1, len);
	}
	
	
	
	public static void main(String[] args) {

		AllcombString comb = new AllcombString();
		comb.appendUnderscore("abcde");
		System.out.println();
		System.out.println(comb.list);
	}

}

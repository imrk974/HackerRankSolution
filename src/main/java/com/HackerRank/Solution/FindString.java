package com.HackerRank.Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindString {

	static Set<String> makeComb(String s) {
		Set<String> list = new TreeSet<String>();
		int lp = 0;
		int rp = 1;
		while (lp < s.length()) {
			while (rp <= s.length()) {
				String temp = s.substring(lp, rp);
				list.add(temp);
				rp++;
			}
			lp++;
			rp = lp + 1;
		}
		return list;
	}

	static void findStringLex(String[] w, int[] k) {
		Set<String> set = new TreeSet<String>();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < w.length; i++) {
			set.addAll(makeComb(w[i]));
		}
		list.addAll(set);
		for(int i =0; i < k.length; i++) {
			if (k[i] > list.size() || k[i] == 0) {
				System.out.println("INVALID");
			} else {
				
				System.out.println(list.get(k[i] - 1));
			}
			
		}
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		String[] w = { "aab", "aac" };
		int[] k = {3,8,23};
		findStringLex(w, k);
		

	}

}

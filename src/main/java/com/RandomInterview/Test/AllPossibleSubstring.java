package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AllPossibleSubstring {

	public static List<String> substring(String s) {

		List<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		int lp = 0, rp = 1;

		while (lp < s.length() - 1) {
			while (rp < s.length()) {
				String subs = s.charAt(lp) + "";
				for (int i = rp; i < s.length(); i++) {
					subs = subs + "" + s.charAt(i);
					list.add(subs);
				}
				rp++;
			}
			lp++;
			rp = lp + 1;
		}

		return list;

	}

	static int checkCommonString(String s1, String s2) {

		List<String> s1_substring = substring(s1);
		List<String> s2_substring = substring(s2);
		// System.out.println(s1_substring);
		// System.err.println("String 2\n\n");
		// System.out.println(s2_substring);
		Set<String> s1_set = new HashSet<String>();
		Set<String> s2_set = new HashSet<String>();

		for (String s : s1_substring) {
			s1_set.add(s);
		}

		for (String s : s2_substring) {
			s2_set.add(s);
		}
		System.out.println(s1_set);
		System.out.println(s2_set);
		s1_set.retainAll(s2_set);
		System.out.println(s1_set);
		int max = 0;
		Iterator<String> it = s1_set.iterator();
		if (s1_set.size() > 1) {
			while (it.hasNext()) {
				max = Math.max(max, it.next().length());
			}
		} else if (s1_set.size() == 1) {
			max = it.next().length();
		}

		return max;
	}

	public static int LCS(String s1, String s2, int m, int n) {
		int res = 0;
//		int[][] arr = new int[m][n];
//		if (arr[m][n] != 0) {
//			return arr[m][n];
//		}
		if (m == 0 || n == 0) {
			return 0;
		}

		if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
			res = 1 + LCS(s1, s2, m - 1, n - 1);
		} else if (s1.charAt(m - 1) != s2.charAt(n - 1)) {
			int temp1 = LCS(s1, s2, m - 1, n);
			int temp2 = LCS(s1, s2, m, n - 1);
			res += Math.max(temp1, temp2);
		}

		return res;
	}

	public static void main(String[] args) {
		// System.out.println(substring("FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));
		// System.out.println(checkCommonString("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS",
		// "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));
		String s1 = "acdcadcadc";
		String s2 = "asdaswdwddw";
		System.out.println(LCS(s1, s2, s1.length(), s2.length()));
	}

}

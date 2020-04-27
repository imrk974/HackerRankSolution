package com.RandomInterview.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestDistinctChars {

	public static int longestDistinctChars(String s) {

		if (s.length() == 0) {
			return 0;
		}
		// aldshfla sghdfasgfkhgasdfasdgvfyweofyewyrtyefgv
		int max = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				count++;
				// System.out.println(sb.toString());
				sb = new StringBuffer();
				j = Math.max(j, map.get(s.charAt(i)) + 1);
				sb.append(s.subSequence(count, i));
			}
			sb.append(s.charAt(i));
			map.put(s.charAt(i), 1);
			max = Math.max(max, i - j + 1);
		}

		return max;
	}

	public static int lonestdistinctSlidingWindow(String s) {
		int pointer1 = 0, pointer2 = 0;
		int max = 0;
		HashSet<Character> set = new HashSet<Character>();
		while (pointer2 < s.length()) {

			if (!set.contains(s.charAt(pointer2))) {
				set.add(s.charAt(pointer2));
				pointer2++;
				max = Math.max(max, set.size());
			} else {
				set.remove(s.charAt(pointer1));
				pointer1++;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println(longestDistinctChars("aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv"));
		System.out.println(lonestdistinctSlidingWindow("aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv"));
	}

}

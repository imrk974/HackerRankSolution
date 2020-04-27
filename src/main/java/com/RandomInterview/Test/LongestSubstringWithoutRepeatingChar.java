package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringWithoutRepeatingChar {

	public static int longestSubstring(String s) {
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		List<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				list.add(sb.toString());
				sb = new StringBuffer();
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			sb.append(s.charAt(i));
			max = Math.max(max, i - j + 1);

		}
		System.out.println(list);
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		longestSubstring("abcadca");
	}

}

package com.RandomInterview.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumofCharDeleteForAnagram {

	static int remAnagram(String str1, String str2) {
		// make hash array for both string
		// and calculate frequency of each
		// character
		int count1[] = new int[26];
		int count2[] = new int[26];

		// count frequency of each character
		// in first string
		for (int i = 0; i < str1.length(); i++)
			count1[str1.charAt(i) - 'a']++;
		System.out.println(Arrays.toString(count1));
		// count frequency of each character
		// in second string
		for (int i = 0; i < str2.length(); i++)
			count2[str2.charAt(i) - 'a']++;
		System.out.println(Arrays.toString(count2));
		// traverse count arrays to find
		// number of characters to be removed
		int result = 0;
		for (int i = 0; i < 26; i++)
			result += Math.abs(count1[i] - count2[i]);
		return result;
	}

	public static int compareMap(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2,
			boolean compSamekey) {
		int count = 0;
		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
			if (map2.containsKey(entry.getKey())) {
				if (!(entry.getValue() == map2.get(entry.getKey())) && compSamekey) {
					count = count + (Math.abs(entry.getValue() - map2.get(entry.getKey())));
				}

			} else {
				count = count + entry.getValue();
			}

		}
		return count;
	}

	public static int makeAnagram(String a, String b) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		int finalCount = 0;
		for (int i = 0; i < a.length(); i++) {
			if (map1.containsKey(a.charAt(i))) {
				map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
			} else {
				map1.put(a.charAt(i), 1);
			}
		}

		for (int i = 0; i < b.length(); i++) {
			if (map2.containsKey(b.charAt(i))) {
				map2.put(b.charAt(i), map2.get(b.charAt(i)) + 1);
			} else {
				map2.put(b.charAt(i), 1);
			}
		}

		finalCount += compareMap(map1, map2, true);
		finalCount += compareMap(map2, map1, false);
		return finalCount;

	}

	public static void main(String[] args) {
		// System.out.println(makeAnagram("fcrxzwscanmligyxyvym",
		// "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
		System.out.println(remAnagram("zywaaaabcd", "cdefg"));
	}

}

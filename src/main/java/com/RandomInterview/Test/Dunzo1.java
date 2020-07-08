package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dunzo1 {

	public static boolean checkAnagram(String s1, String s2) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			if (map1.containsKey(s1.charAt(i))) {
				map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
			} else {
				map1.put(s1.charAt(i), 1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (map2.containsKey(s2.charAt(i))) {
				map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
			} else {
				map2.put(s2.charAt(i), 1);
			}
		}
		if (map1.equals(map2)) {
			return true;
		}
		return false;
	}

	public static List<String> funWithAnagrams(List<String> text) {
		Collections.sort(text);
		List<String> finalList = new ArrayList<String>();
		String first = text.get(0);
		finalList.add(first);
		
		for (int i = 1; i < text.size(); i++) {
			if (!checkAnagram(first, text.get(i))) {
				finalList.add(text.get(i));
				first = text.get(i);
			}
		}
		
		return finalList;
	}

	public static void main(String[] args) {
		List<String> text = new ArrayList<String>();
		text.add("code");
		text.add("aaagmnrs");
		text.add("coed");
		text.add("anagrams");
		text.add("dcoe");
		text.add("rakesh");
		text.add("coed");
		text.add("sharke");
		text.add("dshark");
		text.add("doce");
		System.out.println(funWithAnagrams(text));

	}

}

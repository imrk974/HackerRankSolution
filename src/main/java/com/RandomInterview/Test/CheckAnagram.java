package com.RandomInterview.Test;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

	public static boolean checkAnagram(String stringOne, String stringTwo) {
		stringOne = stringOne.toLowerCase();
		stringTwo = stringTwo.toLowerCase();
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < stringOne.length(); i++) {
			if (!map1.containsKey(stringOne.charAt(i))) {
				map1.put(stringOne.charAt(i), count);
			} else {
				map1.put(stringOne.charAt(i), map1.get(stringOne.charAt(i)) + 1);
			}

		}

		for (int i = 0; i < stringTwo.length(); i++) {
			if (!map2.containsKey(stringTwo.charAt(i))) {
				map2.put(stringTwo.charAt(i), count);
			} else {
				map2.put(stringTwo.charAt(i), map2.get(stringTwo.charAt(i)) + 1);
			}
		}
		System.out.println(map1 + "\n" + map2);

		return map1.equals(map2);
	}

	public static void main(String[] args) {
		System.out.println(checkAnagram("aaabbbbcde", "aaabbbbcde"));

	}

}

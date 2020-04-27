package com.RandomInterview.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagram {

public static String checkAnagram1(String s1, String s2) {
        
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        
        for (int i =0; i < s1.length(); i++ ) {
            if(map1.containsKey(s1.charAt(i))) {
                map1.put(s1.charAt(i), map1.get(s1.charAt(i))+1);
            } else {
                map1.put(s1.charAt(i),1);
            }
        }
        for (int i =0; i < s2.length(); i++) {
            if(map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), map2.get(s2.charAt(i))+1);
            } else {
                map2.put(s2.charAt(i),1);
            }
        }
        
        if(map1.equals(map2)) {
            return "YES";
        }
        
        return "NO";
    }
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

	public static String checkAnagram2(String s1, String s2) {
		int[] freq_s1Chars = new int[26];
		
		for (int i =0 ; i < s1.length(); i++) {
			freq_s1Chars[s1.charAt(i) - 'a']++;
		}
		
		System.out.println(Arrays.toString(freq_s1Chars));
		for (int i = 0; i < s2.length(); i++) {
			freq_s1Chars[s2.charAt(i) - 'a']--;
			
		}
		
		System.out.println(Arrays.toString(freq_s1Chars));
		
		for (int i =0; i < 26 ; i++) {
			if(freq_s1Chars[i] != 0) {
				return "NO";
			}
		}
		return "YES";
	}
	
	public static void main(String[] args) {
	//	System.out.println(checkAnagram("aaabbbbcde", "aaabbbbcde"));
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] ar = new String[num];
		sc.nextLine();
		for (int i =0;i < num; i++) {
			ar[i] = sc.nextLine();
		}
		for (int i =0; i < ar.length; i++) {
		    String[] arr = ar[i].split(" ");
			System.out.println(checkAnagram2(arr[0], arr[1]));
		}
		sc.close();
	}

}

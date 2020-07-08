package com.revision;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Write a Program to find the Susbstring that occurs the maximum number of times in a Given String. 
 * 
 * Input String -- He is a very very is a very very is a good good boy.
                 He - 1
                 is - 3
                 a - 2
                 very - 4
                 good - 4
                 boy - 1

 

                 So the output has to be --"very" good
 */



public class SubstringMax {

	public static List<String> maxNumSubstring(String str) {
		
		String[] sArr = str.split(" ");
		Map<String, Integer> countofSubstring = new HashMap<String, Integer>();
		for (int i = 0; i < sArr.length; i++) {
			if (!countofSubstring.containsKey(sArr[i])) {
				countofSubstring.put(sArr[i], 1);
			} else {
				countofSubstring.put(sArr[i], countofSubstring.get(sArr[i]) +1);
			}
		}
		
		System.out.println(countofSubstring);
		int max = 0;
		List<String> finalListofString = new ArrayList<String>();
		for (Map.Entry<String, Integer> map : countofSubstring.entrySet()) {			
			if (map.getValue() > max ) {
				max = map.getValue();
			}
		}
		
		System.out.println("Max value is : " + max);
		for (Map.Entry<String, Integer> map : countofSubstring.entrySet()) {			
			if (map.getValue() == max ) {
				finalListofString.add(map.getKey());
			}
		}
		
		return finalListofString;
	}
	
	public static void main(String[] args) {
		
		System.out.println(maxNumSubstring("He he he he is a very very is a very very is a good good boy good good"));
	}
	
}
 
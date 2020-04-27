package com.RandomInterview.Test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDups {

	public static String removeDuplicateChars(String s) {
		Set<Character> set = new LinkedHashSet<Character>();
        
        for (int i = 0 ; i < s.length(); i ++) {
            
            set.add(s.charAt(i));
        }
        String sb = "";
        Iterator<Character> it = set.iterator();
        while(it.hasNext()) {
        	sb += it.next() + "";
        }
        
        return sb;
	}
	
	public static void main(String[] args) {
		System.out.println(removeDuplicateChars("geeks forgeeks"));

	}

}

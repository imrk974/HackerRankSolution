package com.RandomInterview.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Permutations {

	public static List<String> permute(String prefix, String remaining, List<String> list) {
			Scanner sc = new Scanner(System.in);
		if (remaining.length() == 0) {
			list.add(prefix);			
		}
		
		for (int i = 0; i < remaining.length(); i++) {
			permute(prefix + remaining.charAt(i),
					remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()), list);
			
		}
		
		return list;
	}

	public static List<String> permute(String full) {
		List<String> list = new ArrayList<String>();
		list = permute("", full,list);
		Collections.sort(list);
	//	System.out.println(list.toString());
		return list;
		//System.out.println(permute("", full));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] ar = new String[num];
		for (int i =0;i < num; i++) {
			ar[i] = sc.next();
		}
		for (int i =0; i < ar.length; i++) {
			List<String> list = permute(ar[i]);
			for (int j=0; j < list.size(); j++) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
		//System.out.println(permute("ABC"));
	}

}

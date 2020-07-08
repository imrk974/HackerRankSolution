package com.HackerRank.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunnyString {

	static String reverse(String s) {
        if(s.length() == 0) {
            return null;
        }
        int index = s.length() -1;
        String reverse = "";
        while(index >= 0) {
            reverse = reverse + s.charAt(index);
            index--;
        }
        return reverse;
    }

    static List<Integer> getAsciiValues(String s) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i =0; i< s.length(); i++) {
            list.add((int) s.charAt(i));
        }
    return list;
    }
    static int[] getdiffArray(List<Integer> list) {
        int[] res = new int[list.size()-1];
        for (int i =0; i < list.size()-1; i ++) {
            res[i] = Math.abs(list.get(i) - list.get(i+1));
        }
        return res;
    }
    // Complete the funnyString function below.
    static String funnyString(String s) {
        List<Integer> list1 = getAsciiValues(s);
        String reverse = reverse(s);
        System.out.println(reverse);
        int[] res1 = getdiffArray(list1);
        List<Integer> list2 = getAsciiValues(reverse);
        int[] res2 = getdiffArray(list2);
        if(Arrays.equals(res1, res2)) {
            return "Funny";
        }
        return "Not Funny";
    }
    
	public static void main(String[] args) {
		System.out.println(funnyString("lmnop"));

	}

}

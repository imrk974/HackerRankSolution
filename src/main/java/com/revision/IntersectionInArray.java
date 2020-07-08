package com.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntersectionInArray {
/*
 * 1, 3, 4, 7, 13
1, 2, 4, 13, 15
 * 
 */
	
	 public static String FindIntersection(String[] strArr) {
		    
		    List<Integer> first = new ArrayList<Integer>();
		    List<Integer> second = new ArrayList<Integer>();
		    String[] firstD = strArr[0].split(", ");
		    String[] secondD = strArr[1].split(", ");
		    
		    
		    for (int i =0; i < firstD.length; i++) {
		      first.add(Integer.parseInt(firstD[i]));
		    }
		    for (int i =0; i < secondD.length; i++) {
		      second.add(Integer.parseInt(secondD[i]));
		    }
		    List<Integer> res = new ArrayList<Integer>();
		    for (int i =0; i < first.size(); i++) {
		      if (second.contains(first.get(i))) {
		        res.add(first.get(i));
		      }
		    }
		    if(res.size() == 0) {
		    	return "false";
		    } else {
		    	return res.toString().replaceAll("\\[|\\]|\\s", "");
		    }
		    
		  }

		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    String[] strArr = new String[] {"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"};
		    System.out.print(FindIntersection(strArr));
		  }
		  
}

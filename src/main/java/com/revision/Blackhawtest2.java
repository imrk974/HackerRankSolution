package com.revision;

import java.util.ArrayList;
import java.util.List;

public class Blackhawtest2 {

	public static boolean OverlappingRanges(int[] arr) {
	    List<Integer> firstList = new ArrayList<Integer>();
	    List<Integer> secondList = new ArrayList<Integer>();
	      for (int i = arr[0]; i < arr[1]; i++) {
	        firstList.add(i);
	      }

	      for (int i = arr[2]; i < arr[3]; i++) {
	        secondList.add(i);
	      }
	      int intialSize = firstList.size();
	      firstList.removeAll(secondList);
	      int finalSize = firstList.size();
	      if (intialSize - finalSize >= arr[4]) {
	        return true;
	      }
	      return false;
	  }
	
	public static void main(String[] args) {
		
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		int[] arr = new int[] {5,11,1,5,1};
		System.out.println(OverlappingRanges(arr));
	}

}

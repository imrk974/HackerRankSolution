package com.revision;

import java.util.Arrays;

public class BlackHawktest1 {

	public static boolean checkLargestSuminArray(int[] arr) {

		Arrays.sort(arr);
		int largest = arr[arr.length - 1];
		System.out.println(largest);
		System.out.println(Arrays.toString(arr));
		int lp = 0, rp = 0;

		while (rp < arr.length-1) {
			rp = lp + 1;
			int sum = arr[lp];
			int temp = rp;
			while (rp < arr.length - 1) {
				
				sum += arr[temp];
				System.out.println(sum);
				if (sum == largest) {
					return true;
				} else if (sum > largest) {
					sum = arr[lp];
					rp++;
				} else if (sum < largest) {
					temp++;
				}

			}
			lp++;
			rp = lp+1;
		}

//		for (int i = 0; i < arr.length - 2; i++) {
//			int sum = arr[i];
//			for (int j = i + 1; j < arr.length - 1; j++) {
//				sum += arr[j];
//				if (sum == largest) {
//					return true;
//				} else if (sum > largest) {
//					break;
//				}
//			}
//		}

		return false;
	}

	public static boolean ArrayAdditionI(int[] arr) {
	    // code goes here  
	    Arrays.sort(arr);
	    int largest = arr[arr.length-1];
	    int lp =0; int rp= 0;

	    while (rp < arr.length -1) {
	      rp =lp+1;
	      int sum = arr[lp];

	      while (rp < arr.length -1) {
	        sum += arr[rp];
	        if(sum == largest) {
	          return true;
	        } else if (sum > largest) {
	          sum = arr[lp];
	        } else if (sum < largest) {
	          rp++;
	        }
	      }
	      lp++;
	      rp = lp+1;
	    }
	    

	    return false;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {5,7,16,1,2};
		System.out.println(checkLargestSuminArray(arr));
	}

}

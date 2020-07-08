package com.revision;

import java.util.Arrays;

public class Test {


	public static int[] process_queries(int[] A, int[] K_Array, int N, int K) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int[] res = new int[K];
            for (int i =0; i < K_Array.length;i++) {
                int count = 0;
                for (int j = A.length-1; j >= 0; j--) {
                    if (A[j] > K_Array[i]) {
                        count++;
                    } else {
                    	break;
                    }
                }
                res[i] = count;
            }
        return res;
    }
	
	public static void main(String[] args) {
		int[] A = new int[] {1,5,3,2,4};
		int[] K_Array = new int[] {2};
		System.out.println(Arrays.toString(process_queries(A, K_Array, 5, 1)));
	}

}

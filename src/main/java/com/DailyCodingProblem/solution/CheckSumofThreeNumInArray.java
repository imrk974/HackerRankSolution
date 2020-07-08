/**
 * 
 */
package com.DailyCodingProblem.solution;

/**
 * @author rakkumar
 *
 */
public class CheckSumofThreeNumInArray {

	
	private static boolean checkThreeSumExistinArray(int[] arr, int sum) {
			
		//Iterative Approach, complexity O(n^3) - Not recommended
		long startTime = System.nanoTime();
		long elapsedTime;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = j; k < arr.length; k++) {
					if (arr[i]+arr[j]+arr[k] == sum) {
						elapsedTime = System.nanoTime() - startTime;
						System.out.println("Total time taken to execute : " + elapsedTime);
						return true;
					}
					
				}
			}
		}
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("Total time taken to execute : " + elapsedTime);
		return false;
	}
	
/*	private static boolean checkThreeSumExistinArrayOptimal(int[] arr, int sum) {
		long startTime = System.nanoTime();
		long elapsedTime;
		for (int i = 0; i < arr.length-1; i++) {
			int reqSum = sum - arr[i];
			for (int j=i+1; j < arr.length-1 ; j++) {
				int reqnum = reqSum - arr[j];
				if (reqnum == arr[j + 1]) {
					elapsedTime = System.nanoTime() - startTime;
					System.out.println("Total time taken to execute : " + elapsedTime);
					return true;
				}
			}
		}
		
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("Total time taken to execute : " + elapsedTime);
		return false;
	}
	
*/	
	public static void main(String[] args) {
	//	int[] arr = { 4, 5, 7, 1, 9 };
		int[] arr = { 11, 15, 3, 7, 34, 6, 2, 8, 11, 3, 32, 45, 689, 32, 7, 50, 80, 73 };

	//	System.out.println(checkThreeSumExistinArrayOptimal(arr, 12));
		System.out.println("******************************");
		System.out.println(checkThreeSumExistinArray(arr, 12));
		
		

	}

}

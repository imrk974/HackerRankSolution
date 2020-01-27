package com.HackerRank.Solution;

public class BreakingTheRecords {

	static int[] recordsBroken(int n, int[] ar) {

		int[] res = new int[2];
		int score = ar[0];
		int highScore = ar[0];
		int lowScore = ar[0];
		int breakingMostPointsRecords = 0;
		int breakingLeastPointsRecords = 0;
		for (int i = 1; i < ar.length; i++) {
			score = ar[i];
			if (score > highScore) {
				highScore = score;
				breakingMostPointsRecords++;
			} else if (score < lowScore) {
				lowScore = score;
				breakingLeastPointsRecords++;
			}
		}
		res[0] = breakingMostPointsRecords;
		res[1] = breakingLeastPointsRecords;
		return res;
	}

	public static void main(String[] args) {
		int[] ar = {10, 5, 20, 20, 4, 5, 2, 25, 1};
		System.out.println(recordsBroken(9, ar)[0] + " " + recordsBroken(9, ar)[1]);

	}

}

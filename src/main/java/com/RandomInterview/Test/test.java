package com.RandomInterview.Test;

public class test {
	
	boolean checkPalindrome(String s, int firstIndex, int lastIndex) {
		System.out.println(s.substring(firstIndex, lastIndex));
        while(firstIndex < lastIndex) {
         if (s.charAt(firstIndex) != s.charAt(lastIndex)) {
             return false;
            } else {
                firstIndex++;
                lastIndex--;
            }
        }
		return true; 
    }
    
    public String solve(String A) {
        int leftPointer = 0;
        int rightPointer = A.length()-1;
            while (leftPointer < rightPointer) {
        
                if(A.charAt(leftPointer) == A.charAt(rightPointer)) {
                    leftPointer++;
                    rightPointer--;
                    
                } else {
                    if (checkPalindrome(A, leftPointer+1, rightPointer)) {
                        return A.substring(leftPointer+1, rightPointer);
                    }
                    else if (checkPalindrome(A, leftPointer, rightPointer-1)) {
                        return A.substring(leftPointer+1, rightPointer);
                    } else {
                    	break;
                    }
                }
            }
			return A;
    }

    
    public static void main(String[] args) {
    	test t = new test();
    	System.out.println(t.solve("cddfeffe"));
	}
}

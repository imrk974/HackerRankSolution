
public class Test {
	
	public static boolean checcArray(int[] arr) {
		
		int lp = 0, rp =0;
		while ( rp < arr.length) {
			
			if(arr[rp] > arr[lp]) {
				lp++;
				rp++;
			}
				
		}
		
						
//		
//		int firstElement = arr[0];
//		int curr = firstElement;
//		boolean res = false;
//		int maxindex = 0;
//		for (int i =1; i < arr.length; i++) {
//			if ( arr[i] > curr) {
//				curr = arr[i];
//				maxindex = i;
//				
//			} else {
//				break;
//			}
//		}
//		maxindex++;		
//		for (int i = maxindex; i < arr.length; i++) {
//			if (arr[i] < curr) {
//				curr = arr[i];
//				res = true;
//			} else {
//				res = false;
//			}
//		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1};
		System.out.println(checcArray(arr));
	}
}

/* [1,2,3,4]
 * [0,3,2,1]
 * 0 - curr
 * curr =3 
 * 
 * Input: [2,1]
Output: false



Example 2:

Input: [3,5,5]
Output: false


Example 3:

Input: [0,3,2,1]
Output: true

 */


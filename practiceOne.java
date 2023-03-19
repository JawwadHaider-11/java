package practice;

import java.util.Arrays;

public class practiceOne {
	
	public static void main(String args[]) {
		/*
		*** twoSum call in main *** 
		
		int[] arr_ = {2,6,4,9};
		System.out.println(Arrays.toString(twoSum(arr_, 13)));
		
		*/

		/*
		*** checkPallindrome call in main ***
		
		String test = "123321", test2 = "java&mysql", test3 = "Radar";
		checkPallindrome(test3);
		
		*/
		
		/*
		reverseInteger call in main
		*/

	}
	
	public static String checkPallindrome(String pTest) {
		String x = "";
		for (int i = (pTest.length() - 1); i >=0; --i) {
			x = x + pTest.charAt(i);
		}
		if (x.toLowerCase().equals(pTest.toLowerCase())) {
			System.out.println(x + " is a pallindrome!");
		} else {
			System.out.println(x + " is not a pallindrome!");
		}
		return x;
	}
	
	/*
	Reverse integer value
	*/
	public static int reverseInteger(int anInt) {
		int revInt = 0;
		
		return anInt;
	}
	
	
	
	
	/*
	twoSum LeetCode Problem
	*/
	public static int[] twoSum(int[] nums, int target) {
		if (nums.length < 2 || nums.equals(null) || nums == null) {
			return null;
		}
		// Copied
		// Brute force technique
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
	        for (int j = i + 1; j < nums.length; j++) {
	        	if (nums[j] == diff) {
	        		return new int[]{nums[i], nums[j]};
	            }
	        }
        }
	    return null;
	}
	
	public static int[] ArrayOfSameContent(){
		int[] a = {};
		// Create an array b[] of same size as a[]
        int b[] = new int[a.length];
  
        // Doesn't copy elements of a[] to b[],
        // only makes b refer to same location
        b = a;
  
        // Change to b[] will also reflect in a[]
        // as 'a' and 'b' refer to same location.
        b[0]++;
		return a;
	}

}

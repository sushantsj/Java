package com.sushant.algorithms.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 
 * @author Sushant
 *
 */
public class LinearSearch {
	
	//Integer can be null but int cannot
	
	/**
	 * We will use java stream to search, time complexity is O(n)
	 * @param arr
	 * @param item
	 * @return
	 */
	public static OptionalInt searchLinear(int[] arr, int item) {
		
		return Arrays.stream(arr).filter(x -> x == item).findFirst();
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		searchLinear(arr, 3).ifPresent(System.out::println);
		

	}

}

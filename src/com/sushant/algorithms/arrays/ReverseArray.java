package com.sushant.algorithms.arrays;

import java.util.Arrays;

/**
 * 
 * @author Sushant
 *
 */
public class ReverseArray {

	public static int[] reverse(int[] arr) {
		for(int i=0; i< arr.length /2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length -i -1];
			arr[arr.length -i -1] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		Arrays.stream(reverse(arr)).forEach(System.out::println);
		Arrays.stream(reverse(arr)).forEach(System.out::println);
	}

}

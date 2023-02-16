package com.sushant.algorithms.arrays;

import java.util.Arrays;

/**
 * 
 * @author Sushant
 *
 */
public class RotateArray {

	public static int[] rotateArrayLeft(int[] arr) {
		int temp = arr[0];
		for(int i=0; i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length -1] = temp;
		return arr;
	}
	
	public static int[] rotateArrayRight(int[] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Arrays.stream(rotateArrayLeft(arr)).forEach(System.out::println);
		Arrays.stream(rotateArrayRight(arr)).forEach(System.out::println);
	}

}

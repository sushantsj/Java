package com.sushant.algorithms.arrays;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

/**
 * 
 * @author Sushant
 *
 */
public class AggregateFilter {

	
	/**
	 * 
	 * We have two arrays and we need to keep only even numbers in a new array
	 * We will do by checking each element and only keep valid items
	 * Another approach could be Merge arrays and remove invalid items.
	 * Sort each array and take only valid items
	 */
	
	public static int[] findEvenNums(int[] arr1, int[] arr2) {
        IntPredicate isEven = num -> num % 2 ==0;
        return Stream.of(arr1, arr1)
				.flatMapToInt(Arrays::stream)
				.filter(isEven)
				.toArray();    }
	
	
	public static void main(String[] args) {
		
		int[] arr1 = { -9, 3, 2, -8, 12, -16 };
        int[] arr2 = { 0, -3, -8, -35, 40, 20, 7 };
		Arrays.stream(findEvenNums(arr1,arr2)).forEach(System.out::println);

	}

}

package com.sushant.algorithms.strings;

/**
 * 
 * @author Sushant
 *
 */
public class ReverseWord {
	
	public static String reverseWord(String s) {
		if( s ==null || s.isBlank()) {
			return s;
		}
		StringBuilder builder = new StringBuilder();
		String[] arr = s.split(" ");
		for (int i=0;i<arr.length;i++) {
			builder.append(reverse2(arr[i]));
			if(i !=arr.length - 1) {
				builder.append(" ");
			}
		}
		
		return builder.toString();
	}
	
	public static String reverse2(String s) {
		if( s ==null || s.isBlank()) {
			return s;
		}
		StringBuilder builder = new StringBuilder(s);
		return builder.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseWord("Hi! How are you"));
	}

}

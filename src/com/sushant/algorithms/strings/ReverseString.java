package com.sushant.algorithms.strings;

/**
 * 
 * @author Sushant
 *
 */
public class ReverseString {

	/**
	 * Reverse the string using stringbuilder as strings are immutable. 
	 * @param args
	 */
	public static String reverseStrings(String s) {
		if( s ==null || s.isBlank()) {
			return s;
		}
		StringBuilder reverseBuilder = new StringBuilder();
		for (int i=s.length()-1; i>=0 ; i--) {
			reverseBuilder.append(s.charAt(i));
		}
		return reverseBuilder.toString();
			
	}
	
	/**
	 * Better apporach using inbuilt libraries
	 * @param args
	 */
	public static String reverse2(String s) {
		if( s ==null || s.isBlank()) {
			return s;
		}
		StringBuilder builder = new StringBuilder(s);
		return builder.reverse().toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse2("Hello"));

	}

}

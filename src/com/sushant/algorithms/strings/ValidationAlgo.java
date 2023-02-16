package com.sushant.algorithms.strings;


/**
 * This is the validation algorithm to check
 *  whether the string follows a particualr order(alphbet, uppercase, etc)
 * @author Sushant
 *
 */
public class ValidationAlgo {
	
	/**
	 * Check the characters in the string are upper case or not
	 * @param args
	 */
	public static boolean isUpperCase(String s) {
		return s.chars().allMatch(Character::isUpperCase); // returns boolean
	}
	
	public static boolean isLowerCase(String s) {
		return s.chars().allMatch(Character::isLowerCase); // returns boolean
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isUpperCase("Sushant"));
		System.out.println(isUpperCase("SUSHANT"));
		System.out.println(isLowerCase("Sushant"));
		System.out.println(isLowerCase("sushant"));
	}

}

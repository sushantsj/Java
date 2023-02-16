package com.sushant.algorithms.strings;


/**
 * 
 * @author Sushant
 *
 */
public class PasswordAlgo {
	/**
	 * Check whether the password has atleast 1 digit, 1 uppercase and 1 lowercase
	 */
	public static boolean isPassworComplex(String s) {
		return s.chars().anyMatch(Character::isUpperCase) &&
				s.chars().anyMatch(Character::isLowerCase) &&
				s.chars().anyMatch(Character::isDigit);
		// Here it checks whether the string has all of these mentioned.
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPassworComplex("Sushant2"));
		System.out.println(isPassworComplex("sushant2"));
	}
}

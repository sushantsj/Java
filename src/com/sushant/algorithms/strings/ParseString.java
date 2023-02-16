package com.sushant.algorithms.strings;

/**
 * 
 * @author Sushant
 *
 */
public class ParseString {

	/**
	 * A common task is to search a piece of data within a string
	 * 
	 * @param args
	 */
	public static void parseString(String s) {
		System.out.println("Option 1");
		for (char c : s.toCharArray()) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println("option 2");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	/**
	 * Check where the character is at even number index
	 * 
	 * @param args
	 */
	public static boolean isEvenIndex(String s, char item) {
		if (s == null || s.isBlank()) {
			return false;
		}
		for (int i = 0; i < s.length() / 2 + 1; i = i + 2) { // i+2 because we are checking at even index
			if (s.charAt(i) == item) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEvenIndex("HeLLoZX", 'X'));
	}

}

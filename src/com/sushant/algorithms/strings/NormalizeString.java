package com.sushant.algorithms.strings;
/**
 * 
 * @author Sushant
 *
 */
public class NormalizeString {

	/**
	 * Suppose you want to search for  a letter in string which can be upper case or lower case 
	 * so we check by each condition instead we can normalize the string before searching . 
	 */
	public static String normalizeString(String s) {
		return s.toLowerCase().trim().replace(",", "");
	}
	
	public static void main(String[] args) {
		System.out.println(normalizeString("  Sushant, String"));
	}
}

package com.sushant.algorithms.queue;


/**
 * 
 * @author Sushant
 *
 */
public class StackParanthesis {

	/**
	 * 
	 * We will push each opening parantheis to stack and when we encounter closing paranthesis we pop one.
	 * Atlast is the stack is empty we find that it had exact opening and closing paranthesis.
	 * But the optimsed way would be by creating an integer and incrementing it by checking an '(' 
	 * and decrementing by checking ')'. Atlast verify if the integer is 0 then it is proper.
	 */
	
	public static boolean hasMatchingParentheses(String s) {
        int matchingSymbolTracker = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                matchingSymbolTracker++;
            } else if (current == ')') {
                if (matchingSymbolTracker > 0) {
                    matchingSymbolTracker--;
                } else {
                    return false;
                }
            }
        }

        return matchingSymbolTracker == 0;
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("((algorithm))"));
        System.out.println(hasMatchingParentheses("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParentheses("(algorithm("));
        System.out.println(hasMatchingParentheses(")algorithm)"));
        System.out.println(hasMatchingParentheses(")algorithm("));
        System.out.println(hasMatchingParentheses("algorithm(("));
        System.out.println(hasMatchingParentheses("(algorithm"));
        System.out.println(hasMatchingParentheses("((algorithm)"));
    }

}

package com.sushant.algorithms.queue;

import java.util.Stack;

/**
 * 
 * @author Sushant
 *
 */
public class StackAlgo {

	public static void printNextGreaterElement(int[] arr) {
        if (arr.length == 0) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);//16

        for (int i = 1; i < arr.length; i++) {
            int next = arr[i]; //7 //2
            if (!stack.isEmpty()) { //true//true
                int popped = stack.pop();//16//7
                while (popped < next) {//16 < 7 false //7<2 false
                    System.out.println(popped + " --> " + next);//7 -> 16
                    if (stack.isEmpty()) {//false
                        break;
                    }
                    popped = stack.pop(); //16
                }

                if (popped > next) { //16 >7 true //7>2
                    stack.push(popped); //16 //7
                }
            }
            stack.push(next); //7//2
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> " + -1);
        }
    }

    public static void main(String[] args) {

        printNextGreaterElement(new int[]{16, 7, 2, 15});
    }

}
